package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomBirdsCategory: EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf001f, R.drawable.custom_emoji_f001f),
            Emoji(0xf0020, R.drawable.custom_emoji_f0020),
            Emoji(0xf0021, R.drawable.custom_emoji_f0021),
            Emoji(0xf0022, R.drawable.custom_emoji_f0022),
            Emoji(0xf0023, R.drawable.custom_emoji_f0023),
            Emoji(0xf0024, R.drawable.custom_emoji_f0024),
            Emoji(0xf0025, R.drawable.custom_emoji_f0025),
            Emoji(0xf0026, R.drawable.custom_emoji_f0026),
            Emoji(0xf0027, R.drawable.custom_emoji_f0027),
            Emoji(0xf0028, R.drawable.custom_emoji_f0028),
            Emoji(0xf0029, R.drawable.custom_emoji_f0029),
            Emoji(0xf002a, R.drawable.custom_emoji_f002a),
            Emoji(0xf002b, R.drawable.custom_emoji_f002b),
            Emoji(0xf002c, R.drawable.custom_emoji_f002c),
            Emoji(0xf002d, R.drawable.custom_emoji_f002d),
            Emoji(0xf002e, R.drawable.custom_emoji_f002e),
            Emoji(0xf002f, R.drawable.custom_emoji_f002f),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_birds
}