package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomArtCategory: EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf000a, R.drawable.custom_emoji_f000a),
            Emoji(0xf000b, R.drawable.custom_emoji_f000b),
            Emoji(0xf000c, R.drawable.custom_emoji_f000c),
            Emoji(0xf000d, R.drawable.custom_emoji_f000d),
            Emoji(0xf000e, R.drawable.custom_emoji_f000e),
            Emoji(0xf000f, R.drawable.custom_emoji_f000f),
            Emoji(0xf0010, R.drawable.custom_emoji_f0010),
            Emoji(0xf0011, R.drawable.custom_emoji_f0011),
            Emoji(0xf0012, R.drawable.custom_emoji_f0012),
            Emoji(0xf0013, R.drawable.custom_emoji_f0013),
            Emoji(0xf0014, R.drawable.custom_emoji_f0014),
            Emoji(0xf0015, R.drawable.custom_emoji_f0015),
            Emoji(0xf0016, R.drawable.custom_emoji_f0016),
            Emoji(0xf0017, R.drawable.custom_emoji_f0017),
            Emoji(0xf0018, R.drawable.custom_emoji_f0018),
            Emoji(0xf0019, R.drawable.custom_emoji_f0019),
            Emoji(0xf001a, R.drawable.custom_emoji_f001a),
            Emoji(0xf001b, R.drawable.custom_emoji_f001b),
            Emoji(0xf001c, R.drawable.custom_emoji_f001c),
            Emoji(0xf001d, R.drawable.custom_emoji_f001d),
            Emoji(0xf001e, R.drawable.custom_emoji_f001e),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_art
}