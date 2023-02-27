package com.example.dudesanddice.model

data class Character(
    //Top Bar
    val charName: String = "",
    val charClass: String = "",
    val charLevel: Int = 0,
    val charBackground: String = "",
    val charPlayerName: String = "",
    val charRace: String = "",
    val charAlignment: String = "",
    val charExperiencePoints: Int = 0,

    //Stats
    val charStrength: Int = 0,
    val charDexterity: Int = 0,
    val charConstitution: Int = 0,
    val charIntelligence: Int = 0,
    val charWisdom: Int = 0,
    val charCharisma: Int = 0,

    //2nd Bar
    val charInspiration: Boolean = false,
    val charProficiencyBonus: Int = 0,

    //Saving Throws
    val charStrSave: Int = 0,
    val charDexSave: Int = 0,
    val charConSave: Int = 0,
    val charIntSave: Int = 0,
    val charWisSave: Int = 0,
    val charChaSave: Int = 0,

    //Skills Proficiencies - We store 0, 1, or 2 in this for NOT PROF, PROF, EXPERTISE
    val charAcrobatics: Int = 0,
    val charAnimalHandling: Int = 0,
    val charArcana: Int = 0,
    val charAthletics: Int = 0,
    val charDeception: Int = 0,
    val charHistory: Int = 0,
    val charInsight: Int = 0,
    val charIntimidation: Int = 0,
    val charInvestigation: Int = 0,
    val charMedicine: Int = 0,
    val charNature: Int = 0,
    val charPerception: Int = 0,
    val charPerformance: Int = 0,
    val charPersuasion: Int = 0,
    val charReligion: Int = 0,
    val charSleightOfHand: Int = 0,
    val charStealth: Int = 0,
    val charSurvival: Int = 0,

    //Extra 2
    val charPassivePerception: Int = 0,
    val charAC: Int = 0,
    val charInitiative: Int = 0,
    val charSpeed: Int = 0,
    val charMaxHP: Int = 0,
    val charCurrentHP: Int = 0,
    val charTempHP: Int = 0,
    val charHitDieTotal: Int = 0,
    val charHitDieCurrent: Int = 0,
    val charDeathSavesSuccess: Int = 0,
    val charDeathSavesFails: Int = 0,

    //Coins and Equipment
    val charCP: Int = 0,
    val charSP: Int = 0,
    val charEP: Int = 0,
    val charGP: Int = 0,
    val charPP: Int = 0,

    val charEquipment: String = "",

    //Prof and Languages
    val charProficienciesAndLanguages: String = "",

    //Attacks and spellcasting
    val charAttacksAndSpellcasting: String = "",

    //RP Traits
    val charPersonalityTraits: String = "",
    val charIdeals: String = "",
    val charBonds: String = "",
    val charFlaws: String = "",
    val charFeaturesAndTraits: String = "",

    //Character description
    val charAge: Int = 0,
    val charHeight: Int = 0,
    val charWeight: Int = 0,
    val charEyes: String = "",
    val charSkin: String = "",
    val charHair: String = "",

    //Character appearance (image)
    val charAppearance: String = "",

    //Allies and Organizations
    val charAllies: String = "",

    //character backstory
    val charBackstory: String = "",

    //Additional features
    val charAdditionalFeatures: String = "",

    //Treasure (I don't know what else you expected)
    val charTreasure: String = "",

    //Spell casting stuff
    val charSpellCastingClass: String = "",
    val charSpellCastingAbility: String = "",
    val charSpellAttackBonus: String = "",

    //Magic Spell Stuff (I was told don't worry about it, it will happen eventually)
)