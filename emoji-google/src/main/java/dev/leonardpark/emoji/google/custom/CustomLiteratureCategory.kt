package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomLiteratureCategory : EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf0152, R.drawable.custom_emoji_f0152),
            Emoji(0xf0153, R.drawable.custom_emoji_f0153),
            Emoji(0xf0154, R.drawable.custom_emoji_f0154),
            Emoji(0xf0155, R.drawable.custom_emoji_f0155),
            Emoji(0xf0156, R.drawable.custom_emoji_f0156),
            Emoji(0xf0157, R.drawable.custom_emoji_f0157),
            Emoji(0xf0158, R.drawable.custom_emoji_f0158),
            Emoji(0xf0159, R.drawable.custom_emoji_f0159),
            Emoji(0xf015a, R.drawable.custom_emoji_f015a),
            Emoji(0xf015b, R.drawable.custom_emoji_f015b),
            Emoji(0xf015c, R.drawable.custom_emoji_f015c),
            Emoji(0xf015d, R.drawable.custom_emoji_f015d),
            Emoji(0xf015e, R.drawable.custom_emoji_f015e),
            Emoji(0xf015f, R.drawable.custom_emoji_f015f),
            Emoji(0xf0160, R.drawable.custom_emoji_f0160),
            Emoji(0xf0161, R.drawable.custom_emoji_f0161),
            Emoji(0xf0162, R.drawable.custom_emoji_f0162),
            Emoji(0xf0163, R.drawable.custom_emoji_f0163),
            Emoji(0xf0164, R.drawable.custom_emoji_f0164),
            Emoji(0xf0165, R.drawable.custom_emoji_f0165),
            Emoji(0xf0166, R.drawable.custom_emoji_f0166),
            Emoji(0xf0167, R.drawable.custom_emoji_f0167),
            Emoji(0xf0168, R.drawable.custom_emoji_f0168),
            Emoji(0xf0169, R.drawable.custom_emoji_f0169),
            Emoji(0xf016a, R.drawable.custom_emoji_f016a),
            Emoji(0xf016b, R.drawable.custom_emoji_f016b),
            Emoji(0xf016c, R.drawable.custom_emoji_f016c),
            Emoji(0xf016d, R.drawable.custom_emoji_f016d),
            Emoji(0xf016e, R.drawable.custom_emoji_f016e),
            Emoji(0xf016f, R.drawable.custom_emoji_f016f),
            Emoji(0xf0170, R.drawable.custom_emoji_f0170),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_literature
}