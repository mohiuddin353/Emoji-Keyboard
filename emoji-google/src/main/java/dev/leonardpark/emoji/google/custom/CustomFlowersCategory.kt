package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomFlowersCategory: EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf00d6, R.drawable.custom_emoji_f00d6),
            Emoji(0xf00d7, R.drawable.custom_emoji_f00d7),
            Emoji(0xf00d8, R.drawable.custom_emoji_f00d8),
            Emoji(0xf00d9, R.drawable.custom_emoji_f00d9),
            Emoji(0xf00da, R.drawable.custom_emoji_f00da),
            Emoji(0xf00db, R.drawable.custom_emoji_f00db),
            Emoji(0xf00dc, R.drawable.custom_emoji_f00dc),
            Emoji(0xf00dd, R.drawable.custom_emoji_f00dd),
            Emoji(0xf00de, R.drawable.custom_emoji_f00de),
            Emoji(0xf00df, R.drawable.custom_emoji_f00df),
            Emoji(0xf00e0, R.drawable.custom_emoji_f00e0),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_flower
}