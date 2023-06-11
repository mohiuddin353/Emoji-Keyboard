$srcEmojiRootFolder = "D:\Personal\EmojiProject\Emoji"
$destinationFolder = "D:\Personal\EmojiProject\ProcessedEmoji"
$drawableFolder = "D:\Personal\EmojiProject\DrawableEmoji"
$nConvert = "C:\Users\user\Tools\NConvert\nconvert.exe"

$srcEmojiFolders = Get-ChildItem -Path $srcEmojiRootFolder -Directory

foreach ($folder in $srcEmojiFolders) {
    $folderName = $folder.Name -replace '^\d+ ', ''
    $destinationPath = Join-Path -Path $destinationFolder -ChildPath $folderName'/'
    if (Test-Path $destinationPath) {
        Remove-Item $destinationPath'*.*' -Recurse -Force
    }
    else {
        New-Item $destinationPath -ItemType Directory
    }
    Get-ChildItem -Path $folder.FullName -Filter *.png -Recurse | Copy-Item -Destination $destinationPath
}

$unicodeCounter = 983040
$emojiCategoryFolders = Get-ChildItem -Path $destinationFolder -Directory
foreach ($folder in $emojiCategoryFolders) {
    $emojiFiles = Get-ChildItem -Path $folder.FullName -Recurse -Filter *.png
    $arr = @();
    foreach ($file in $emojiFiles) {
        $newName = "custom_emoji_{0:x}.png" -f $unicodeCounter
        $newFilePath = Join-Path -Path $drawableFolder -ChildPath $newName
        $text = "Emoji(0x{0:x}, R.drawable.{1})," -f $unicodeCounter, $newName.Replace(".png", "")
        $arr += $text
        $unicodeCounter++
        & $nConvert -overwrite -resize fill 120 120 $file.FullName
        Copy-Item -Path $file.FullName -Destination $newFilePath
    }
    $folderName = '{0}.txt' -f $folder.Name
    $categoryFilePath = Join-Path -Path $destinationFolder -ChildPath $folderName
    New-Item -Path $categoryFilePath -ItemType File -Force
    Out-File -Path $categoryFilePath -InputObject $arr -Encoding utf8
}

