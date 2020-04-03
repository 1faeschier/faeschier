package sample;

import Personnages.Towers;

public class buyTower{

    private int score;


    public boolean haveScore(){
        return score != 0;
    }

    public int getScore() {
        return score;
    }

    public void buyTower(Towers a){
        if (haveScore()){
            score -= a.getCost;
        }
    }

}

