package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomFamilyValueCategory : EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf00b2, R.drawable.custom_emoji_f00b2),
            Emoji(0xf00b3, R.drawable.custom_emoji_f00b3),
            Emoji(0xf00b4, R.drawable.custom_emoji_f00b4),
            Emoji(0xf00b5, R.drawable.custom_emoji_f00b5),
            Emoji(0xf00b6, R.drawable.custom_emoji_f00b6),
            Emoji(0xf00b7, R.drawable.custom_emoji_f00b7),
            Emoji(0xf00b8, R.drawable.custom_emoji_f00b8),
            Emoji(0xf00b9, R.drawable.custom_emoji_f00b9),
            Emoji(0xf00ba, R.drawable.custom_emoji_f00ba),
            Emoji(0xf00bb, R.drawable.custom_emoji_f00bb),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_family_value

}