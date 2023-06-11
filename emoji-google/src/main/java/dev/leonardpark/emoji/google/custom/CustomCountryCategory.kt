package dev.leonardpark.emoji.google.custom

import dev.leonardpark.emoji.emoji.Emoji
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.R

class CustomCountryCategory : EmojiCategory {
    companion object {
        private val DATA = listOf(
            Emoji(0xf0030, R.drawable.custom_emoji_f0030),
            Emoji(0xf0031, R.drawable.custom_emoji_f0031),
            Emoji(0xf0032, R.drawable.custom_emoji_f0032),
            Emoji(0xf0033, R.drawable.custom_emoji_f0033),
            Emoji(0xf0034, R.drawable.custom_emoji_f0034),
            Emoji(0xf0035, R.drawable.custom_emoji_f0035),
            Emoji(0xf0036, R.drawable.custom_emoji_f0036),
            Emoji(0xf0037, R.drawable.custom_emoji_f0037),
            Emoji(0xf0038, R.drawable.custom_emoji_f0038),
            Emoji(0xf0039, R.drawable.custom_emoji_f0039),
            Emoji(0xf003a, R.drawable.custom_emoji_f003a),
            Emoji(0xf003b, R.drawable.custom_emoji_f003b),
            Emoji(0xf003c, R.drawable.custom_emoji_f003c),
            Emoji(0xf003d, R.drawable.custom_emoji_f003d),
            Emoji(0xf003e, R.drawable.custom_emoji_f003e),
            Emoji(0xf003f, R.drawable.custom_emoji_f003f),
            Emoji(0xf0040, R.drawable.custom_emoji_f0040),
            Emoji(0xf0041, R.drawable.custom_emoji_f0041),
            Emoji(0xf0042, R.drawable.custom_emoji_f0042),
            Emoji(0xf0043, R.drawable.custom_emoji_f0043),
            Emoji(0xf0044, R.drawable.custom_emoji_f0044),
            Emoji(0xf0045, R.drawable.custom_emoji_f0045),
            Emoji(0xf0046, R.drawable.custom_emoji_f0046),
            Emoji(0xf0047, R.drawable.custom_emoji_f0047),
            Emoji(0xf0048, R.drawable.custom_emoji_f0048),
            Emoji(0xf0049, R.drawable.custom_emoji_f0049),
            Emoji(0xf004a, R.drawable.custom_emoji_f004a),
            Emoji(0xf004b, R.drawable.custom_emoji_f004b),
            Emoji(0xf004c, R.drawable.custom_emoji_f004c),
            Emoji(0xf004d, R.drawable.custom_emoji_f004d),
            Emoji(0xf004e, R.drawable.custom_emoji_f004e),
            Emoji(0xf004f, R.drawable.custom_emoji_f004f),
            Emoji(0xf0050, R.drawable.custom_emoji_f0050),
            Emoji(0xf0051, R.drawable.custom_emoji_f0051),
            Emoji(0xf0052, R.drawable.custom_emoji_f0052),
            Emoji(0xf0053, R.drawable.custom_emoji_f0053),
            Emoji(0xf0054, R.drawable.custom_emoji_f0054),
            Emoji(0xf0055, R.drawable.custom_emoji_f0055),
            Emoji(0xf0056, R.drawable.custom_emoji_f0056),
            Emoji(0xf0057, R.drawable.custom_emoji_f0057),
            Emoji(0xf0058, R.drawable.custom_emoji_f0058),
            Emoji(0xf0059, R.drawable.custom_emoji_f0059),
            Emoji(0xf005a, R.drawable.custom_emoji_f005a),
            Emoji(0xf005b, R.drawable.custom_emoji_f005b),
            Emoji(0xf005c, R.drawable.custom_emoji_f005c),
            Emoji(0xf005d, R.drawable.custom_emoji_f005d),
            Emoji(0xf005e, R.drawable.custom_emoji_f005e),
        )
    }

    override fun getEmojis(): List<Emoji> = DATA

    override fun getIcon(): Int = R.drawable.custom_category_country
}