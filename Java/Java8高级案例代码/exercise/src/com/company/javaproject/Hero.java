package com.company.javaproject;

public class Hero {

    private int hp;
    public Hero(){};
    public Hero(int hp){
        this.hp=hp;
    }
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isDead(){
        if(hp<=0) return true;
        else return false;
    }

    public void attackHero(Hero h1){
        int h = h1.getHp();
        h--;
        h1.setHp(h);
    }

}
