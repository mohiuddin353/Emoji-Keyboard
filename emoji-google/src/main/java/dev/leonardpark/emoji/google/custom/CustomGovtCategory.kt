package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomGovtCategory : EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf0117, R.drawable.custom_emoji_f0117),
            Emoji(0xf0118, R.drawable.custom_emoji_f0118),
            Emoji(0xf0119, R.drawable.custom_emoji_f0119),
            Emoji(0xf011a, R.drawable.custom_emoji_f011a),
            Emoji(0xf011b, R.drawable.custom_emoji_f011b),
            Emoji(0xf011c, R.drawable.custom_emoji_f011c),
            Emoji(0xf011d, R.drawable.custom_emoji_f011d),
            Emoji(0xf011e, R.drawable.custom_emoji_f011e),
            Emoji(0xf011f, R.drawable.custom_emoji_f011f),
            Emoji(0xf0120, R.drawable.custom_emoji_f0120),
            Emoji(0xf0121, R.drawable.custom_emoji_f0121),
            Emoji(0xf0122, R.drawable.custom_emoji_f0122),
            Emoji(0xf0123, R.drawable.custom_emoji_f0123),
            Emoji(0xf0124, R.drawable.custom_emoji_f0124),
            Emoji(0xf0125, R.drawable.custom_emoji_f0125),
            Emoji(0xf0126, R.drawable.custom_emoji_f0126),
            Emoji(0xf0127, R.drawable.custom_emoji_f0127),
            Emoji(0xf0128, R.drawable.custom_emoji_f0128),
            Emoji(0xf0129, R.drawable.custom_emoji_f0129),
            Emoji(0xf012a, R.drawable.custom_emoji_f012a),
            Emoji(0xf012b, R.drawable.custom_emoji_f012b),
        )
    }

    override fun getEmojis(): List<Emoji>  = DATA

    override fun getIcon(): Int = R.drawable.custom_category_govt

}