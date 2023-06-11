package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomFruitsCategory : EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf00fd, R.drawable.custom_emoji_f00fd),
            Emoji(0xf00fe, R.drawable.custom_emoji_f00fe),
            Emoji(0xf00ff, R.drawable.custom_emoji_f00ff),
            Emoji(0xf0100, R.drawable.custom_emoji_f0100),
            Emoji(0xf0101, R.drawable.custom_emoji_f0101),
            Emoji(0xf0102, R.drawable.custom_emoji_f0102),
            Emoji(0xf0103, R.drawable.custom_emoji_f0103),
            Emoji(0xf0104, R.drawable.custom_emoji_f0104),
            Emoji(0xf0105, R.drawable.custom_emoji_f0105),
            Emoji(0xf0106, R.drawable.custom_emoji_f0106),
            Emoji(0xf0107, R.drawable.custom_emoji_f0107),
            Emoji(0xf0108, R.drawable.custom_emoji_f0108),
            Emoji(0xf0109, R.drawable.custom_emoji_f0109),
            Emoji(0xf010a, R.drawable.custom_emoji_f010a),
            Emoji(0xf010b, R.drawable.custom_emoji_f010b),
            Emoji(0xf010c, R.drawable.custom_emoji_f010c),
        )
    }

    override fun getEmojis(): List<Emoji>  = DATA

    override fun getIcon(): Int = R.drawable.custom_category_fruit
}