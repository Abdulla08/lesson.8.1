package kg.geektech.game.players;

import java.util.Random;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int a = random.nextInt(4)+2;
        if (a == 2) {
            setDamage(getDamage() * a);
        } else if (a == 3) {
setDamage(getDamage() * a);
        }
        if (a == 4) {
            setDamage(getDamage() * a);
            {

            }

        }
    }
}

