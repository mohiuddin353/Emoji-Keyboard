package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomTreesCategory : EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf0196, R.drawable.custom_emoji_f0196),
            Emoji(0xf0197, R.drawable.custom_emoji_f0197),
            Emoji(0xf0198, R.drawable.custom_emoji_f0198),
            Emoji(0xf0199, R.drawable.custom_emoji_f0199),
            Emoji(0xf019a, R.drawable.custom_emoji_f019a),
            Emoji(0xf019b, R.drawable.custom_emoji_f019b),
            Emoji(0xf019c, R.drawable.custom_emoji_f019c),
            Emoji(0xf019d, R.drawable.custom_emoji_f019d),
            Emoji(0xf019e, R.drawable.custom_emoji_f019e),
            Emoji(0xf019f, R.drawable.custom_emoji_f019f),
            Emoji(0xf01a0, R.drawable.custom_emoji_f01a0),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_tree

}