package java7;

public class Enemy extends GameObject {
    private String type;
    private int damage;
    private int health;

    public Enemy(String type, int x, int y, int width, int height, int damage, int health) {
        super(x, y, width, height);
        setType(type);
        setDamage(damage);
        setHealth(health);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            System.out.println("Tip neprijatelja ne smije biti prazan!");
            this.type = "Nepoznat";
        } else {
            this.type = type.trim();
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage >= 0 && damage <= 100) {
            this.damage = damage;
        } else {
            System.out.println("Damage mora biti u opsegu 0-100!");
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= 100) {
            this.health = health;
        } else {
            System.out.println("Health mora biti u opsegu 0-100!");
        }
    }

    public int izracunajStetu() {
        return damage;
    }

    @Override
    public String toString() {
        return "Enemy[" + type + "] @ (" + getX() + "," + getY() + ") " + getWidth() + "x" + getHeight() + " DMG=" + damage + " HP=" + health;
    }
}

// MeleeEnemy 
class MeleeEnemy extends Enemy {

    public MeleeEnemy(String type, int x, int y, int width, int height, int damage, int health) {
        super(type, x, y, width, height, damage, health);
    }

    @Override
    public int izracunajStetu() {
        return getDamage();
    }
}

// BossEnemy 
class BossEnemy extends Enemy {

    public BossEnemy(String type, int x, int y, int width, int height, int damage, int health) {
        super(type, x, y, width, height, damage, health);
    }

    @Override
    public int izracunajStetu() {
        return getDamage() * 2;
    }

    @Override
    public String toString() {
        return "BossEnemy[" + getType() + "] @ (" + getX() + "," + getY() + ") " + getWidth() + "x" + getHeight() + " DMG=" + getDamage() + "x2 HP=" + getHealth();
    }
}
