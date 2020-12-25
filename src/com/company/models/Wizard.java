package com.company.models;

import java.util.Random;

public class Wizard extends Warrior {
    //region Properties
    private int armorPercentage;
    //endregion

    //region Constructors
    public Wizard() {
    }

    public Wizard(String name, int health, int damage) {
        super(name, health, damage);
    }
    //endregion

    //region Public methods
    @Override
    public void attack(Warrior opponent, Warrior activePlayer) {
        Random random = new Random();
        int chance = random.nextInt(30000);

        if (chance < 10000) {
            int temp = activePlayer.getDamage();
            activePlayer.setDamage(activePlayer.getDamage() * 2);
            opponent.setHealth(opponent.getHealth() - opponent.takeDamage(activePlayer));
            activePlayer.setDamage(temp);
        } else {
            opponent.setHealth(opponent.getHealth() - opponent.takeDamage(activePlayer));
        }
    }

    @Override
    public int takeDamage(Warrior activePlayer) {
        return (activePlayer.getDamage() * (100 - armorPercentage) / 100);
    }
    //endregion
}
