package dev.leonardpark.emoji.google;

import dev.leonardpark.emoji.EmojiProvider
import dev.leonardpark.emoji.emoji.EmojiCategory
import dev.leonardpark.emoji.google.category.ActivityCategory;
import dev.leonardpark.emoji.google.category.FlagsCategory;
import dev.leonardpark.emoji.google.category.FoodCategory;
import dev.leonardpark.emoji.google.category.NatureCategory;
import dev.leonardpark.emoji.google.category.ObjectsCategory;
import dev.leonardpark.emoji.google.category.PeopleCategory;
import dev.leonardpark.emoji.google.category.SymbolsCategory;
import dev.leonardpark.emoji.google.category.TravelCategory;
import dev.leonardpark.emoji.google.custom.*

class GoogleEmojiProvider : EmojiProvider {
  override fun getCategories(): Array<EmojiCategory> = arrayOf(
    CustomLifeCategory(),
    CustomFoodCategory(),
    CustomDressCategory(),
    CustomFamilyCategory(),
    CustomCountryCategory(),
    CustomFruitsCategory(),
    CustomFlowersCategory(),
    CustomFishesCategory(),
    CustomBirdsCategory(),
    CustomAnimalCategory(),
    CustomTreesCategory(),
    CustomGamesCategory(),
    CustomEduCategory(),
    CustomHolidayCategory(),
    CustomTravelCategory(),
    CustomFamilyValueCategory(),
    CustomReligionCategory(),
    CustomArtCategory(),
    CustomGovtCategory(),
    CustomLiteratureCategory(),
    CustomHistoryCategory(),
    PeopleCategory(),
    NatureCategory(),
    FoodCategory(),
    ActivityCategory(),
    TravelCategory(),
    ObjectsCategory(),
    SymbolsCategory(),
    FlagsCategory()
  )
}
