package com.example.dudesanddice.model

data class Character(
    //Top Bar
    var charName: String = "",
    var charClass: String = "",
    var charBackground: String = "",
    var charPlayerName: String = "",
    var charRace: String = "",
    var charAlignment: String = "",
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
    var charSkillsBox: String = "",
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

    var charEquipment: String = "",

    //Prof and Languages
    var charProficienciesAndLanguages: String = "",

    //Attacks and spellcasting
    var charAttacksAndSpellcasting: String = "",

    //RP Traits
    var charPersonalityTraits: String = "",
    var charIdeals: String = "",
    var charBonds: String = "",
    var charFlaws: String = "",
    var charFeaturesAndTraits: String = "",

    //Character description
    var charAge: Int = 0,
    var charHeight: Int = 0,
    var charWeight: Int = 0,
    var charEyes: String = "",
    var charSkin: String = "",
    var charHair: String = "",

    //Character appearance (image)
    var charAppearance: String = "",

    //Allies and Organizations
    var charAllies: String = "",

    //character backstory
    var charBackstory: String = "",

    //Additional features
    var charAdditionalFeatures: String = "",

    //Treasure (I don't know what else you expected)
    var charTreasure: String = "",

    //Spell casting stuff
    var charSpellCastingClass: String = "",
    var charSpellCastingAbility: String = "",
    var charSpellAttackBonus: String = "",

    //Magic Spell Stuff (I was told don't worry about it, it will happen eventually)
)