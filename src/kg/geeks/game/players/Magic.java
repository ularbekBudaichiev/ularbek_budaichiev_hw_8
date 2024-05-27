package kg.geeks.game.players;

import java.util.Random;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int increaseAmount;
        Random random = new Random();
        increaseAmount = random.nextInt(20);
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + increaseAmount);
            System.out.println(heroes[i].getName() + " получает увеличение атаки на " + increaseAmount);
        }



        }




    }

