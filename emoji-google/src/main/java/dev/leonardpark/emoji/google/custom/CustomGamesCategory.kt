package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomGamesCategory : EmojiCategory{
    companion object {
        private val DATA = listOf(
            Emoji(0xf010d, R.drawable.custom_emoji_f010d),
            Emoji(0xf010e, R.drawable.custom_emoji_f010e),
            Emoji(0xf010f, R.drawable.custom_emoji_f010f),
            Emoji(0xf0110, R.drawable.custom_emoji_f0110),
            Emoji(0xf0111, R.drawable.custom_emoji_f0111),
            Emoji(0xf0112, R.drawable.custom_emoji_f0112),
            Emoji(0xf0113, R.drawable.custom_emoji_f0113),
            Emoji(0xf0114, R.drawable.custom_emoji_f0114),
            Emoji(0xf0115, R.drawable.custom_emoji_f0115),
            Emoji(0xf0116, R.drawable.custom_emoji_f0116),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_games
}