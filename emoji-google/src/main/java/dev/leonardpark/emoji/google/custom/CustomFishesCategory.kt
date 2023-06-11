package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomFishesCategory: EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf00bc, R.drawable.custom_emoji_f00bc),
            Emoji(0xf00bd, R.drawable.custom_emoji_f00bd),
            Emoji(0xf00be, R.drawable.custom_emoji_f00be),
            Emoji(0xf00bf, R.drawable.custom_emoji_f00bf),
            Emoji(0xf00c0, R.drawable.custom_emoji_f00c0),
            Emoji(0xf00c1, R.drawable.custom_emoji_f00c1),
            Emoji(0xf00c2, R.drawable.custom_emoji_f00c2),
            Emoji(0xf00c3, R.drawable.custom_emoji_f00c3),
            Emoji(0xf00c4, R.drawable.custom_emoji_f00c4),
            Emoji(0xf00c5, R.drawable.custom_emoji_f00c5),
            Emoji(0xf00c6, R.drawable.custom_emoji_f00c6),
            Emoji(0xf00c7, R.drawable.custom_emoji_f00c7),
            Emoji(0xf00c8, R.drawable.custom_emoji_f00c8),
            Emoji(0xf00c9, R.drawable.custom_emoji_f00c9),
            Emoji(0xf00ca, R.drawable.custom_emoji_f00ca),
            Emoji(0xf00cb, R.drawable.custom_emoji_f00cb),
            Emoji(0xf00cc, R.drawable.custom_emoji_f00cc),
            Emoji(0xf00cd, R.drawable.custom_emoji_f00cd),
            Emoji(0xf00ce, R.drawable.custom_emoji_f00ce),
            Emoji(0xf00cf, R.drawable.custom_emoji_f00cf),
            Emoji(0xf00d0, R.drawable.custom_emoji_f00d0),
            Emoji(0xf00d1, R.drawable.custom_emoji_f00d1),
            Emoji(0xf00d2, R.drawable.custom_emoji_f00d2),
            Emoji(0xf00d3, R.drawable.custom_emoji_f00d3),
            Emoji(0xf00d4, R.drawable.custom_emoji_f00d4),
            Emoji(0xf00d5, R.drawable.custom_emoji_f00d5),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_fish
}