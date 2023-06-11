package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomFoodCategory : EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf00e1, R.drawable.custom_emoji_f00e1),
            Emoji(0xf00e2, R.drawable.custom_emoji_f00e2),
            Emoji(0xf00e3, R.drawable.custom_emoji_f00e3),
            Emoji(0xf00e4, R.drawable.custom_emoji_f00e4),
            Emoji(0xf00e5, R.drawable.custom_emoji_f00e5),
            Emoji(0xf00e6, R.drawable.custom_emoji_f00e6),
            Emoji(0xf00e7, R.drawable.custom_emoji_f00e7),
            Emoji(0xf00e8, R.drawable.custom_emoji_f00e8),
            Emoji(0xf00e9, R.drawable.custom_emoji_f00e9),
            Emoji(0xf00ea, R.drawable.custom_emoji_f00ea),
            Emoji(0xf00eb, R.drawable.custom_emoji_f00eb),
            Emoji(0xf00ec, R.drawable.custom_emoji_f00ec),
            Emoji(0xf00ed, R.drawable.custom_emoji_f00ed),
            Emoji(0xf00ee, R.drawable.custom_emoji_f00ee),
            Emoji(0xf00ef, R.drawable.custom_emoji_f00ef),
            Emoji(0xf00f0, R.drawable.custom_emoji_f00f0),
            Emoji(0xf00f1, R.drawable.custom_emoji_f00f1),
            Emoji(0xf00f2, R.drawable.custom_emoji_f00f2),
            Emoji(0xf00f3, R.drawable.custom_emoji_f00f3),
            Emoji(0xf00f4, R.drawable.custom_emoji_f00f4),
            Emoji(0xf00f5, R.drawable.custom_emoji_f00f5),
            Emoji(0xf00f6, R.drawable.custom_emoji_f00f6),
            Emoji(0xf00f7, R.drawable.custom_emoji_f00f7),
            Emoji(0xf00f8, R.drawable.custom_emoji_f00f8),
            Emoji(0xf00f9, R.drawable.custom_emoji_f00f9),
            Emoji(0xf00fa, R.drawable.custom_emoji_f00fa),
            Emoji(0xf00fb, R.drawable.custom_emoji_f00fb),
            Emoji(0xf00fc, R.drawable.custom_emoji_f00fc),
        )
    }

    override fun getEmojis(): List<Emoji>  = DATA

    override fun getIcon(): Int = R.drawable.custom_category_food
}