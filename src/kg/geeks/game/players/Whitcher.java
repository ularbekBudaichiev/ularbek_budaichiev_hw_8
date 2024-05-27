package kg.geeks.game.players;

public class Whitcher extends Hero{

        public Whitcher(int health, int damage, String name) {
            super(health, damage, name);
        }
    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(this.getName() + " получил " + damage + " урона.");
    }
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0 && this != heroes[i]) {
                this.setHealth(0);
                heroes[i].setHealth(100);
            }

        }
    }
}
