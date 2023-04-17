package com.example.dudesanddice.model

data class Character(
    //Top Bar
    var charName: String = "Enter Text",
    var charClass: String = "Enter Text",
    var charBackground: String = "Enter Text",
    var charPlayerName: String = "Enter Text",
    var charRace: String = "Enter Text",
    var charAlignment: String = "Enter Text",
    var charExperiencePoints: Int = 0,

    //Stats
    var charStrength: Int = 0,
    var charDexterity: Int = 0,
    var charConstitution: Int = 0,
    var charIntelligence: Int = 0,
    var charWisdom: Int = 0,
    var charCharisma: Int = 0,

    //2nd Bar
    var charInspiration: Boolean = false,
    var charProficiencyBonus: Int = 0,

    //Saving Throws
    var charStrSave: Int = 0,
    var charDexSave: Int = 0,
    var charConSave: Int = 0,
    var charIntSave: Int = 0,
    var charWisSave: Int = 0,
    var charChaSave: Int = 0,

    //Skills Proficiencies - We store 0, 1, or 2 in this for NOT PROF, PROF, EXPERTISE
    var charAcrobatics: Int = 0,
    var charAnimalHandling: Int = 0,
    var charArcana: Int = 0,
    var charAthletics: Int = 0,
    var charDeception: Int = 0,
    var charHistory: Int = 0,
    var charInsight: Int = 0,
    var charIntimidation: Int = 0,
    var charInvestigation: Int = 0,
    var charMedicine: Int = 0,
    var charNature: Int = 0,
    var charPerception: Int = 0,
    var charPerformance: Int = 0,
    var charPersuasion: Int = 0,
    var charReligion: Int = 0,
    var charSleightOfHand: Int = 0,
    var charStealth: Int = 0,
    var charSurvivar: Int = 0,
    var charSkillsBox: String = "Enter Text",
    //Extra 2
    var charPassivePerception: Int = 0,
    var charAC: Int = 0,
    var charInitiative: Int = 0,
    var charSpeed: Int = 0,
    var charMaxHP: Int = 0,
    var charCurrentHP: Int = 0,
    var charTempHP: Int = 0,
    var charHitDieTotal: Int = 0,
    var charHitDieCurrent: Int = 0,
    var charDeathSavesSuccess: Int = 0,
    var charDeathSavesFails: Int = 0,

    //Coins and Equipment
    var charCP: Int = 0,
    var charSP: Int = 0,
    var charEP: Int = 0,
    var charGP: Int = 0,
    var charPP: Int = 0,

    var charEquipment: String = "Enter Text",

    //Prof and Languages
    var charProficienciesAndLanguages: String = "Enter Text",

    //Attacks and spellcasting
    var charAttacksAndSpellcasting: String = "Enter Text",

    //RP Traits
    var charPersonalityTraits: String = "Enter Text",
    var charIdeals: String = "",
    var charBonds: String = "",
    var charFlaws: String = "",
    var charFeaturesAndTraits: String = "Enter Text",

    //Character description
    var charAge: Int = 0,
    var charHeight: Int = 0,
    var charWeight: Int = 0,
    var charEyes: String = "Enter Text",
    var charSkin: String = "Enter Text",
    var charHair: String = "Enter Text",

    //Character appearance (image)
    var charAppearance: String = "Enter Text",

    //Allies and Organizations
    var charAllies: String = "Enter Text",

    //character backstory
    var charBackstory: String = "Enter Text",

    //Additional features
    var charAdditionalFeatures: String = "Enter Text",

    //Treasure (I don't know what else you expected)
    var charTreasure: String = "Enter Text",

    //Spell casting stuff
    var charSpellCastingClass: String = "Enter Text",
    var charSpellCastingAbility: String = "Enter Text",
    var charSpellAttackBonus: String = "Enter Text",

    //Magic Spell Stuff (I was told don't worry about it, it will happen eventually)
)