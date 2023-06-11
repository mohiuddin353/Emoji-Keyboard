package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomAnimalCategory: EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf0000, R.drawable.custom_emoji_f0000),
            Emoji(0xf0001, R.drawable.custom_emoji_f0001),
            Emoji(0xf0002, R.drawable.custom_emoji_f0002),
            Emoji(0xf0003, R.drawable.custom_emoji_f0003),
            Emoji(0xf0004, R.drawable.custom_emoji_f0004),
            Emoji(0xf0005, R.drawable.custom_emoji_f0005),
            Emoji(0xf0006, R.drawable.custom_emoji_f0006),
            Emoji(0xf0007, R.drawable.custom_emoji_f0007),
            Emoji(0xf0008, R.drawable.custom_emoji_f0008),
            Emoji(0xf0009, R.drawable.custom_emoji_f0009),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_animal
}