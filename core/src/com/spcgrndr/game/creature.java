package com.spcgrndr.game;

import java.io.Serializable;

/**
 * Created by thad on 4/27/17.
 */

public class creature implements Serializable{

    private Integer idNO;
    private Integer crace;
    private Integer cclass;
    private String name;
    private Integer level;
    private Integer speed;
    private Integer hp;

    private Integer strength;
    private Integer maxStrength;
    private Integer athletics;
    private Integer maxAthlectics;
    private Integer dexterity;
    private Integer maxDexterity;
    private Integer acrobatics;
    private Integer maxAcrobatics;
    private Integer stealth;
    private Integer maxStealth;
    private Integer intelligence;
    private Integer maxIntelligence;
    private Integer arcana;
    private Integer maxArcana;
    private Integer history;
    private Integer maxHistory;
    private Integer investigation;
    private Integer maxInvestigation;
    private Integer nature;
    private Integer maxNature;
    private Integer religion;
    private Integer maxReligion;
    private Integer wisdom;
    private Integer maxWisdom;
    private Integer animalHandling;
    private Integer maxAnimalHandling;
    private Integer insight;
    private Integer maxInsight;
    private Integer medicine;
    private Integer maxMedicine;
    private Integer perception;
    private Integer maxPerception;
    private Integer survival;
    private Integer maxSurvival;
    private Integer charisma;
    private Integer maxCharisma;
    private Integer deception;
    private Integer maxDeception;
    private Integer intimidation;
    private Integer maxIntimidation;
    private Integer performance;
    private Integer maxPerformance;
    private Integer persuassion;
    private Integer maxPersuasion;

    public creature() {
        setIdNO(0);
        setCrace(0);
        setCclass(0);
        setName("");
        setLevel(0);
        setSpeed(0);
        setHp(0);

        setStrength(0);
        setMaxStrength(0);
        setAthletics(0);
        setMaxAthlectics(0);
        setDexterity(0);
        setMaxDexterity(0);
        setAcrobatics(0);
        setMaxAcrobatics(0);
        setStealth(0);
        setMaxStealth(0);
        setIntelligence(0);
        setMaxIntelligence(0);
        setArcana(0);
        setMaxArcana(0);
        setHistory(0);
        setMaxHistory(0);
        setInvestigation(0);
        setMaxInvestigation(0);
        setNature(0);
        setMaxNature(0);
        setReligion(0);
        setMaxReligion(0);
        setWisdom(0);
        setMaxWisdom(0);
        setAnimalHandling(0);
        setMaxAnimalHandling(0);
        setInsight(0);
        setMaxInsight(0);
        setMedicine(0);
        setMaxMedicine(0);
        setPerception(0);
        setMaxPerception(0);
        setSurvival(0);
        setMaxSurvival(0);
        setCharisma(0);
        setMaxCharisma(0);
        setDeception(0);
        setMaxDeception(0);
        setIntimidation(0);
        setMaxIntimidation(0);
        setPerformance(0);
        setMaxPerformance(0);
        setPersuassion(0);
        setMaxPersuasion(0);

    }

    public creature Breed(creature inCreature) {
        creature newC = new creature();
        return newC;
    }

    public Integer getIdNO() {
        return idNO;
    }

    public void setIdNO(Integer idNO) {
        this.idNO = idNO;
    }

    public Integer getCrace() {
        return crace;
    }

    public void setCrace(Integer crace) {
        this.crace = crace;
    }

    public Integer getCclass() {
        return cclass;
    }

    public void setCclass(Integer cclass) {
        this.cclass = cclass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getMaxStrength() {
        return maxStrength;
    }

    public void setMaxStrength(Integer maxStrength) {
        this.maxStrength = maxStrength;
    }

    public Integer getAthletics() {
        return athletics;
    }

    public void setAthletics(Integer athletics) {
        this.athletics = athletics;
    }

    public Integer getMaxAthlectics() {
        return maxAthlectics;
    }

    public void setMaxAthlectics(Integer maxAthlectics) {
        this.maxAthlectics = maxAthlectics;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getMaxDexterity() {
        return maxDexterity;
    }

    public void setMaxDexterity(Integer maxDexterity) {
        this.maxDexterity = maxDexterity;
    }

    public Integer getAcrobatics() {
        return acrobatics;
    }

    public void setAcrobatics(Integer acrobatics) {
        this.acrobatics = acrobatics;
    }

    public Integer getMaxAcrobatics() {
        return maxAcrobatics;
    }

    public void setMaxAcrobatics(Integer maxAcrobatics) {
        this.maxAcrobatics = maxAcrobatics;
    }

    public Integer getStealth() {
        return stealth;
    }

    public void setStealth(Integer stealth) {
        this.stealth = stealth;
    }

    public Integer getMaxStealth() {
        return maxStealth;
    }

    public void setMaxStealth(Integer maxStealth) {
        this.maxStealth = maxStealth;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getMaxIntelligence() {
        return maxIntelligence;
    }

    public void setMaxIntelligence(Integer maxIntelligence) {
        this.maxIntelligence = maxIntelligence;
    }

    public Integer getArcana() {
        return arcana;
    }

    public void setArcana(Integer arcana) {
        this.arcana = arcana;
    }

    public Integer getMaxArcana() {
        return maxArcana;
    }

    public void setMaxArcana(Integer maxArcana) {
        this.maxArcana = maxArcana;
    }

    public Integer getHistory() {
        return history;
    }

    public void setHistory(Integer history) {
        this.history = history;
    }

    public Integer getMaxHistory() {
        return maxHistory;
    }

    public void setMaxHistory(Integer maxHistory) {
        this.maxHistory = maxHistory;
    }

    public Integer getInvestigation() {
        return investigation;
    }

    public void setInvestigation(Integer investigation) {
        this.investigation = investigation;
    }

    public Integer getMaxInvestigation() {
        return maxInvestigation;
    }

    public void setMaxInvestigation(Integer maxInvestigation) {
        this.maxInvestigation = maxInvestigation;
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
    }

    public Integer getMaxNature() {
        return maxNature;
    }

    public void setMaxNature(Integer maxNature) {
        this.maxNature = maxNature;
    }

    public Integer getReligion() {
        return religion;
    }

    public void setReligion(Integer religion) {
        this.religion = religion;
    }

    public Integer getMaxReligion() {
        return maxReligion;
    }

    public void setMaxReligion(Integer maxReligion) {
        this.maxReligion = maxReligion;
    }

    public Integer getWisdom() {
        return wisdom;
    }

    public void setWisdom(Integer wisdom) {
        this.wisdom = wisdom;
    }

    public Integer getMaxWisdom() {
        return maxWisdom;
    }

    public void setMaxWisdom(Integer maxWisdom) {
        this.maxWisdom = maxWisdom;
    }

    public Integer getAnimalHandling() {
        return animalHandling;
    }

    public void setAnimalHandling(Integer animalHandling) {
        this.animalHandling = animalHandling;
    }

    public Integer getMaxAnimalHandling() {
        return maxAnimalHandling;
    }

    public void setMaxAnimalHandling(Integer maxAnimalHandling) {
        this.maxAnimalHandling = maxAnimalHandling;
    }

    public Integer getInsight() {
        return insight;
    }

    public void setInsight(Integer insight) {
        this.insight = insight;
    }

    public Integer getMaxInsight() {
        return maxInsight;
    }

    public void setMaxInsight(Integer maxInsight) {
        this.maxInsight = maxInsight;
    }

    public Integer getMedicine() {
        return medicine;
    }

    public void setMedicine(Integer medicine) {
        this.medicine = medicine;
    }

    public Integer getMaxMedicine() {
        return maxMedicine;
    }

    public void setMaxMedicine(Integer maxMedicine) {
        this.maxMedicine = maxMedicine;
    }

    public Integer getPerception() {
        return perception;
    }

    public void setPerception(Integer perception) {
        this.perception = perception;
    }

    public Integer getMaxPerception() {
        return maxPerception;
    }

    public void setMaxPerception(Integer maxPerception) {
        this.maxPerception = maxPerception;
    }

    public Integer getSurvival() {
        return survival;
    }

    public void setSurvival(Integer survival) {
        this.survival = survival;
    }

    public Integer getMaxSurvival() {
        return maxSurvival;
    }

    public void setMaxSurvival(Integer maxSurvival) {
        this.maxSurvival = maxSurvival;
    }

    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public Integer getMaxCharisma() {
        return maxCharisma;
    }

    public void setMaxCharisma(Integer maxCharisma) {
        this.maxCharisma = maxCharisma;
    }

    public Integer getDeception() {
        return deception;
    }

    public void setDeception(Integer deception) {
        this.deception = deception;
    }

    public Integer getMaxDeception() {
        return maxDeception;
    }

    public void setMaxDeception(Integer maxDeception) {
        this.maxDeception = maxDeception;
    }

    public Integer getIntimidation() {
        return intimidation;
    }

    public void setIntimidation(Integer intimidation) {
        this.intimidation = intimidation;
    }

    public Integer getMaxIntimidation() {
        return maxIntimidation;
    }

    public void setMaxIntimidation(Integer maxIntimidation) {
        this.maxIntimidation = maxIntimidation;
    }

    public Integer getPerformance() {
        return performance;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }

    public Integer getMaxPerformance() {
        return maxPerformance;
    }

    public void setMaxPerformance(Integer maxPerformance) {
        this.maxPerformance = maxPerformance;
    }

    public Integer getPersuassion() {
        return persuassion;
    }

    public void setPersuassion(Integer persuassion) {
        this.persuassion = persuassion;
    }

    public Integer getMaxPersuasion() {
        return maxPersuasion;
    }

    public void setMaxPersuasion(Integer maxPersuasion) {
        this.maxPersuasion = maxPersuasion;
    }
}