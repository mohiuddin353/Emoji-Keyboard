package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomTravelCategory : EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf0183, R.drawable.custom_emoji_f0183),
            Emoji(0xf0184, R.drawable.custom_emoji_f0184),
            Emoji(0xf0185, R.drawable.custom_emoji_f0185),
            Emoji(0xf0186, R.drawable.custom_emoji_f0186),
            Emoji(0xf0187, R.drawable.custom_emoji_f0187),
            Emoji(0xf0188, R.drawable.custom_emoji_f0188),
            Emoji(0xf0189, R.drawable.custom_emoji_f0189),
            Emoji(0xf018a, R.drawable.custom_emoji_f018a),
            Emoji(0xf018b, R.drawable.custom_emoji_f018b),
            Emoji(0xf018c, R.drawable.custom_emoji_f018c),
            Emoji(0xf018d, R.drawable.custom_emoji_f018d),
            Emoji(0xf018e, R.drawable.custom_emoji_f018e),
            Emoji(0xf018f, R.drawable.custom_emoji_f018f),
            Emoji(0xf0190, R.drawable.custom_emoji_f0190),
            Emoji(0xf0191, R.drawable.custom_emoji_f0191),
            Emoji(0xf0192, R.drawable.custom_emoji_f0192),
            Emoji(0xf0193, R.drawable.custom_emoji_f0193),
            Emoji(0xf0194, R.drawable.custom_emoji_f0194),
            Emoji(0xf0195, R.drawable.custom_emoji_f0195),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_travel

}