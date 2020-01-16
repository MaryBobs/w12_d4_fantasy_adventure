package enemies;

import behaviours.IHealth;
import player.Player;

public class Enemy implements IHealth {

    private int health;
    private int damage;
    private EnemyType enemyType;

    public Enemy(int health, int damage, EnemyType enemyType) {
        this.health = health;
        this.damage = damage;
        this.enemyType = enemyType;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Player player) {
        player.defend(damage);
    }
}
