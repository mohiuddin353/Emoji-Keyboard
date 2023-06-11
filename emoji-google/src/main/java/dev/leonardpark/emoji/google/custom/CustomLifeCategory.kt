package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomLifeCategory : EmojiCategory{
    companion object {
        private val DATA = listOf(
            Emoji(0xf005f, R.drawable.custom_emoji_f005f),
            Emoji(0xf0060, R.drawable.custom_emoji_f0060),
            Emoji(0xf0061, R.drawable.custom_emoji_f0061),
            Emoji(0xf0062, R.drawable.custom_emoji_f0062),
            Emoji(0xf0063, R.drawable.custom_emoji_f0063),
//            Emoji(0xf0064, R.drawable.custom_emoji_f0064),
            Emoji(0xf0065, R.drawable.custom_emoji_f0065),
            Emoji(0xf0066, R.drawable.custom_emoji_f0066),
            Emoji(0xf0067, R.drawable.custom_emoji_f0067),
            Emoji(0xf0068, R.drawable.custom_emoji_f0068),
//            Emoji(0xf0069, R.drawable.custom_emoji_f0069),
            Emoji(0xf006a, R.drawable.custom_emoji_f006a),
            Emoji(0xf006b, R.drawable.custom_emoji_f006b),
            Emoji(0xf006c, R.drawable.custom_emoji_f006c),
            Emoji(0xf006d, R.drawable.custom_emoji_f006d),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_life
}