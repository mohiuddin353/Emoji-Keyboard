package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomHolidayCategory : EmojiCategory {

    companion object {
        private val DATA = listOf(
            Emoji(0xf0144, R.drawable.custom_emoji_f0144),
            Emoji(0xf0145, R.drawable.custom_emoji_f0145),
            Emoji(0xf0146, R.drawable.custom_emoji_f0146),
            Emoji(0xf0147, R.drawable.custom_emoji_f0147),
            Emoji(0xf0148, R.drawable.custom_emoji_f0148),
            Emoji(0xf0149, R.drawable.custom_emoji_f0149),
            Emoji(0xf014a, R.drawable.custom_emoji_f014a),
            Emoji(0xf014b, R.drawable.custom_emoji_f014b),
            Emoji(0xf014c, R.drawable.custom_emoji_f014c),
            Emoji(0xf014d, R.drawable.custom_emoji_f014d),
            Emoji(0xf014e, R.drawable.custom_emoji_f014e),
            Emoji(0xf014f, R.drawable.custom_emoji_f014f),
            Emoji(0xf0150, R.drawable.custom_emoji_f0150),
            Emoji(0xf0151, R.drawable.custom_emoji_f0151),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_holiday
}