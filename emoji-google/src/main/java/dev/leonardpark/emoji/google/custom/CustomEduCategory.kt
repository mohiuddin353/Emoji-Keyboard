package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomEduCategory : EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf0081, R.drawable.custom_emoji_f0081),
            Emoji(0xf0082, R.drawable.custom_emoji_f0082),
            Emoji(0xf0083, R.drawable.custom_emoji_f0083),
            Emoji(0xf0084, R.drawable.custom_emoji_f0084),
            Emoji(0xf0085, R.drawable.custom_emoji_f0085),
            Emoji(0xf0086, R.drawable.custom_emoji_f0086),
            Emoji(0xf0087, R.drawable.custom_emoji_f0087),
            Emoji(0xf0088, R.drawable.custom_emoji_f0088),
            Emoji(0xf0089, R.drawable.custom_emoji_f0089),
            Emoji(0xf008a, R.drawable.custom_emoji_f008a),
            Emoji(0xf008b, R.drawable.custom_emoji_f008b),
            Emoji(0xf008c, R.drawable.custom_emoji_f008c),
            Emoji(0xf008d, R.drawable.custom_emoji_f008d),
            Emoji(0xf008e, R.drawable.custom_emoji_f008e),
            Emoji(0xf008f, R.drawable.custom_emoji_f008f),
            Emoji(0xf0090, R.drawable.custom_emoji_f0090),
            Emoji(0xf0091, R.drawable.custom_emoji_f0091),
            Emoji(0xf0092, R.drawable.custom_emoji_f0092),
            Emoji(0xf0093, R.drawable.custom_emoji_f0093),
            Emoji(0xf0094, R.drawable.custom_emoji_f0094),
            Emoji(0xf0095, R.drawable.custom_emoji_f0095),
            Emoji(0xf0096, R.drawable.custom_emoji_f0096),
            Emoji(0xf0097, R.drawable.custom_emoji_f0097),
            Emoji(0xf0098, R.drawable.custom_emoji_f0098),
            Emoji(0xf0099, R.drawable.custom_emoji_f0099),
            Emoji(0xf009a, R.drawable.custom_emoji_f009a),
            Emoji(0xf009b, R.drawable.custom_emoji_f009b),
            Emoji(0xf009c, R.drawable.custom_emoji_f009c),
            Emoji(0xf009d, R.drawable.custom_emoji_f009d),
            Emoji(0xf009e, R.drawable.custom_emoji_f009e),
            Emoji(0xf009f, R.drawable.custom_emoji_f009f),
            Emoji(0xf00a0, R.drawable.custom_emoji_f00a0),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_edu
}