package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomFamilyCategory : EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf00a1, R.drawable.custom_emoji_f00a1),
            Emoji(0xf00a2, R.drawable.custom_emoji_f00a2),
            Emoji(0xf00a3, R.drawable.custom_emoji_f00a3),
            Emoji(0xf00a4, R.drawable.custom_emoji_f00a4),
            Emoji(0xf00a5, R.drawable.custom_emoji_f00a5),
            Emoji(0xf00a6, R.drawable.custom_emoji_f00a6),
            Emoji(0xf00a7, R.drawable.custom_emoji_f00a7),
            Emoji(0xf00a8, R.drawable.custom_emoji_f00a8),
            Emoji(0xf00a9, R.drawable.custom_emoji_f00a9),
            Emoji(0xf00aa, R.drawable.custom_emoji_f00aa),
            Emoji(0xf00ab, R.drawable.custom_emoji_f00ab),
            Emoji(0xf00ac, R.drawable.custom_emoji_f00ac),
            Emoji(0xf00ad, R.drawable.custom_emoji_f00ad),
            Emoji(0xf00ae, R.drawable.custom_emoji_f00ae),
            Emoji(0xf00af, R.drawable.custom_emoji_f00af),
            Emoji(0xf00b0, R.drawable.custom_emoji_f00b0),
            Emoji(0xf00b1, R.drawable.custom_emoji_f00b1),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_family

}