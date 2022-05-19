package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Hero hero = new Hero(100, 20, "Warrior");
        Boss boss = new Boss(300, 30, "Warrior");
        System.out.println("Boss health : " + boss.getHealth() + "\nBoss damage : " + boss.getDamage() + "\nBoss DefenceType is : " + boss.getDefenceType());
    }
}
