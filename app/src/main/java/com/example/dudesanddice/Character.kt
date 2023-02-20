package com.example.dudesanddice

data class Character(
    //Top Bar
    val charName: String,
    val charClass: String,
    val charLevel: Int,
    val charBackground: String,
    val charPlayerName: String,
    val charRace: String,
    val charAlignment: String,
    val charExperiencePoints: Int,

    //Stats
    val charStrength: Int,
    val charDexterity: Int,
    val charConstitution: Int,
    val charIntelligence: Int,
    val charWisdom: Int,
    val charCharisma: Int,

    //2nd Bar
    val charInspiration: Boolean,
    val charProficiencyBonus: Int,

    //Saving Throws
    val charStrSave: Int,
    val charDexSave: Int,
    val charConSave: Int,
    val charIntSave: Int,
    val charWisSave: Int,
    val charChaSave: Int,

    //Skills Proficiencies - We store 0, 1, or 2 in this for NOT PROF, PROF, EXPERTISE
    val charAcrobatics: Int,
    val charAnimalHandling: Int,
    val charArcana: Int,
    val charAthletics: Int,
    val charDeception: Int,
    val charHistory: Int,
    val charInsight: Int,
    val charIntimidation: Int,
    val charInvestigation: Int,
    val charMedicine: Int,
    val charNature: Int,
    val charPerception: Int,
    val charPerformance: Int,
    val charPersuasion: Int,
    val charReligion: Int,
    val charSleightOfHand: Int,
    val charStealth: Int,
    val charSurvival: Int,

    //Extra 2
    val charPassivePerception: Int,
    val charAC: Int,
    val charInitiative: Int,
    val charSpeed: Int,
    val charMaxHP: Int,
    val charCurrentHP: Int,
    val charTempHP: Int,
    val charHitDieTotal: Int,
    val charHitDieCurrent: Int,
    val charDeathSavesSuccess: Int,
    val charDeathSavesFails: Int,

    //Coins and Equipment
    val charCP: Int,
    val charSP: Int,
    val charEP: Int,
    val charGP: Int,
    val charPP: Int,

    val charEquipment: String,

    //Prof and Languages
    val charProficienciesAndLanguages: String,

    //Attacks and spellcasting
    val charAttacksAndSpellcasting: String,

    //RP Traits
    val charPersonalityTraits: String,
    val charIdeals: String,
    val charBonds: String,
    val charFlaws: String,
    val charFeaturesAndTraits: String,

    )