package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomHistoryCategory : EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf012c, R.drawable.custom_emoji_f012c),
            Emoji(0xf012d, R.drawable.custom_emoji_f012d),
            Emoji(0xf012e, R.drawable.custom_emoji_f012e),
            Emoji(0xf012f, R.drawable.custom_emoji_f012f),
            Emoji(0xf0130, R.drawable.custom_emoji_f0130),
            Emoji(0xf0131, R.drawable.custom_emoji_f0131),
            Emoji(0xf0132, R.drawable.custom_emoji_f0132),
            Emoji(0xf0133, R.drawable.custom_emoji_f0133),
            Emoji(0xf0134, R.drawable.custom_emoji_f0134),
            Emoji(0xf0135, R.drawable.custom_emoji_f0135),
            Emoji(0xf0136, R.drawable.custom_emoji_f0136),
            Emoji(0xf0137, R.drawable.custom_emoji_f0137),
            Emoji(0xf0138, R.drawable.custom_emoji_f0138),
            Emoji(0xf0139, R.drawable.custom_emoji_f0139),
            Emoji(0xf013a, R.drawable.custom_emoji_f013a),
            Emoji(0xf013b, R.drawable.custom_emoji_f013b),
            Emoji(0xf013c, R.drawable.custom_emoji_f013c),
            Emoji(0xf013d, R.drawable.custom_emoji_f013d),
            Emoji(0xf013e, R.drawable.custom_emoji_f013e),
            Emoji(0xf013f, R.drawable.custom_emoji_f013f),
            Emoji(0xf0140, R.drawable.custom_emoji_f0140),
            Emoji(0xf0141, R.drawable.custom_emoji_f0141),
            Emoji(0xf0142, R.drawable.custom_emoji_f0142),
            Emoji(0xf0143, R.drawable.custom_emoji_f0143),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_history

}