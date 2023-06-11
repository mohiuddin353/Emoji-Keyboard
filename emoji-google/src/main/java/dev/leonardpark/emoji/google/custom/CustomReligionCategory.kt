package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomReligionCategory : EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf0171, R.drawable.custom_emoji_f0171),
            Emoji(0xf0172, R.drawable.custom_emoji_f0172),
            Emoji(0xf0173, R.drawable.custom_emoji_f0173),
            Emoji(0xf0174, R.drawable.custom_emoji_f0174),
            Emoji(0xf0175, R.drawable.custom_emoji_f0175),
            Emoji(0xf0176, R.drawable.custom_emoji_f0176),
            Emoji(0xf0177, R.drawable.custom_emoji_f0177),
            Emoji(0xf0178, R.drawable.custom_emoji_f0178),
            Emoji(0xf0179, R.drawable.custom_emoji_f0179),
            Emoji(0xf017a, R.drawable.custom_emoji_f017a),
            Emoji(0xf017b, R.drawable.custom_emoji_f017b),
            Emoji(0xf017c, R.drawable.custom_emoji_f017c),
            Emoji(0xf017d, R.drawable.custom_emoji_f017d),
            Emoji(0xf017e, R.drawable.custom_emoji_f017e),
            Emoji(0xf017f, R.drawable.custom_emoji_f017f),
            Emoji(0xf0180, R.drawable.custom_emoji_f0180),
            Emoji(0xf0181, R.drawable.custom_emoji_f0181),
            Emoji(0xf0182, R.drawable.custom_emoji_f0182),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_religion
}