package Personnages;

import Personnages.Entities;

public class Towers extends Entities {
    private int buildCost;
    private int buildTime;
    private int attackRange;
    private int speedRotation;
    private int attackSpeed;
    private int attackDamage;
    private int level;
    private int upgradeCost;
    private int upgradeTime;
    private int sellCost;

    public Towers(int buildCost, int buildTime, int attackRange, int speedRotation, int attackSpeed, int attackDamage, int level, int upgradeCost, int upgradeTime, int sellCost){
        this.buildCost = buildCost;
        this.buildTime = buildTime;
        this.attackRange = attackRange;
        this.attackSpeed = attackSpeed;
        this.speedRotation = speedRotation;
        this.attackSpeed = attackSpeed;
        this.attackDamage = attackDamage;
        this.level = level;
        this.upgradeCost = upgradeCost;
        this.upgradeTime = upgradeTime;
        this.sellCost = sellCost;
    }

    public void upgrade(int score){
        if (upgradeCost <= score){
            score -= upgradeCost;
            upgradeCost += 20;
            damage += 20;
            sellCost += 20;
            attackRange += 10;
            attackSpeed += 5;
            upgradeTime += 50;
        }
        else if{
            return ("Tu n'as pas les fonds nécessaires, retourne shooter des méchants")
        }
    }

    public void upgrade(){
    }

    public void shoot(float x, float y){
    }

}
