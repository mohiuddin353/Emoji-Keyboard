package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomDressCategory : EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf006e, R.drawable.custom_emoji_f006e),
            Emoji(0xf006f, R.drawable.custom_emoji_f006f),
            Emoji(0xf0070, R.drawable.custom_emoji_f0070),
            Emoji(0xf0071, R.drawable.custom_emoji_f0071),
            Emoji(0xf0072, R.drawable.custom_emoji_f0072),
            Emoji(0xf0073, R.drawable.custom_emoji_f0073),
            Emoji(0xf0074, R.drawable.custom_emoji_f0074),
            Emoji(0xf0075, R.drawable.custom_emoji_f0075),
            Emoji(0xf0076, R.drawable.custom_emoji_f0076),
            Emoji(0xf0077, R.drawable.custom_emoji_f0077),
            Emoji(0xf0078, R.drawable.custom_emoji_f0078),
            Emoji(0xf0079, R.drawable.custom_emoji_f0079),
            Emoji(0xf007a, R.drawable.custom_emoji_f007a),
            Emoji(0xf007b, R.drawable.custom_emoji_f007b),
            Emoji(0xf007c, R.drawable.custom_emoji_f007c),
            Emoji(0xf007d, R.drawable.custom_emoji_f007d),
            Emoji(0xf007e, R.drawable.custom_emoji_f007e),
            Emoji(0xf007f, R.drawable.custom_emoji_f007f),
            Emoji(0xf0080, R.drawable.custom_emoji_f0080),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_dress
}