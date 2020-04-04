package Personnages;

import Personnages.Entities;

public class Tower extends Entities implements Runnable {
    private Position position = new Position(500, 130);
    private int attackRange = 100;
    private int attackDamage = 5;
    private int attackSpeed = 100;
    private Thread t;
    private int buildCost;
    private int buildTime;
    private int speedRotation;
    private int level;
    private int upgradeCost;
    private int upgradeTime;
    private int sellCost;
    private Ennemie ennemie;

    public void Towers(int buildCost, int buildTime, int attackRange, int speedRotation, int attackSpeed, int attackDamage, int level, int upgradeCost, int upgradeTime, int sellCost){
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
        t = new Thread(this);
        t.start();
    }

    public String upgrade(int score){
        String res = "";
        if (upgradeCost <= score){
            score -= upgradeCost;
            upgradeCost += 20;
            attackDamage += 20;
            sellCost += 20;
            attackRange += 10;
            attackSpeed += 5;
            upgradeTime += 50;
            res = "amérlioratioin réalisé avec succès !";
        }
        else {
            res =  "Tu n'as pas les fonds nécessaires, retourne shooter des méchants";
        }
        return res;
    }

    public Tower createnew() {
        Tower b = new Tower();
        return b;
    }

    public void shoot(float x, float y){
    }

    @Override
    public void run() {
            while (position.distance(position, ennemie.getPosition()) < attackRange){
                ennemie.looseHealth(attackDamage);
                try {
                    Thread.sleep(attackSpeed);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

}
