package java7;

public class Player extends GameObject {
    private String name;
    private int health;

    public Player(String name, int x, int y, int width, int height, int health) {
        super(x, y, width, height);
        setName(name);
        setHealth(health);
    }

    public static String formatirajTekst(String s) {
        String[] rijeci = s.trim().split("\\s+");
        String rezultat = "";

        for (String rijec : rijeci) {
            String prvoSlovo = rijec.substring(0, 1).toUpperCase();
            String ostatak = rijec.substring(1).toLowerCase();
            rezultat = rezultat + prvoSlovo + ostatak + " ";
        }

        return rezultat.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Ime ne smije biti prazno!");
            this.name = "Player";
        } else {
            this.name = formatirajTekst(name);
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

    @Override
    public String toString() {
        return "Player[" + name + "] @ (" + getX() + "," + getY() + ") " + getWidth() + "x" + getHeight() + " HP=" + health;
    }
}