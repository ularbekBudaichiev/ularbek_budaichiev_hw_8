package kg.geeks.game.players;

import java.util.Random;

public class Hacker extends Hero {
    public Hacker(int health, int damage, String name) {
        super(health, damage, name);

    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int HP;
        Random random = new Random();
        HP = random.nextInt(100);
        for (int i = 0; i < heroes.length; i++) {


            boss.setHealth(boss.getHealth() - HP);
            heroes[i].setHealth(heroes[i].getHealth() + HP);

            System.out.println("Хакер отнимает " + HP + " здоровья у босса и передает его " + heroes[i].getName());
        }
    }
}
