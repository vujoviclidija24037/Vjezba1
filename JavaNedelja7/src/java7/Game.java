package java7;

import java.util.ArrayList;

public class Game {
    private Player player;
    private ArrayList<Enemy> enemies;
    private ArrayList<String> eventLog;

    public Game(Player player) {
        this.player = player;
        this.enemies = new ArrayList<>();
        this.eventLog = new ArrayList<>();
    }

    // provjerava da li se igrac i neprijatelj preklapaju (koristi intersects)
    public boolean checkCollision(Player p, Enemy e) {
        return p.intersects(e);
    }

    // smanjuje health igraca za damage neprijatelja (ako je boss steta je x2) i biljezi u log
    public void decreaseHealth(Player p, Enemy e) {
        int steta = e.izracunajStetu();
        int stariHp = p.getHealth();
        int noviHp = stariHp - steta;

        if (noviHp < 0) {
            noviHp = 0;
        }

        p.setHealth(noviHp);

        String poruka = "HIT: Player by " + e.getType() + " for " + steta + " -> HP " + stariHp + " -> " + noviHp;
        eventLog.add(poruka);
    }

    // dodaje neprijatelja u listu i upisuje dogadjaj u eventLog
    public void addEnemy(Enemy e) {
        enemies.add(e);
        eventLog.add("ADDED: " + e.getType());
    }

    // vraca sve neprijatelje ciji type sadrzi zadati tekst (ne razlikuje velika i mala slova)
    public ArrayList<Enemy> findByType(String query) {
        ArrayList<Enemy> rezultat = new ArrayList<>();
        String trazeno = query.trim().toLowerCase();

        for (Enemy e : enemies) {
            if (e.getType().toLowerCase().contains(trazeno)) {
                rezultat.add(e);
            }
        }
        return rezultat;
    }

    // vraca listu svih neprijatelja koji se trenutno sudaraju sa igracem
    public ArrayList<Enemy> collidingWithPlayer() {
        ArrayList<Enemy> sudari = new ArrayList<>();
        for (Enemy e : enemies) {
            if (checkCollision(player, e)) {
                sudari.add(e);
            }
        }
        return sudari;
    }

    // prolazi kroz sve neprijatelje, provjerava sudar sa igracem i poziva decreaseHealth
    public void resolveCollisions() {
        for (Enemy e : enemies) {
            if (checkCollision(player, e)) {
                decreaseHealth(player, e);
            }
        }
    }

    // pomocna metoda za citanje neprijatelja iz string formata: "Goblin;12,5;16x16;20;boss"
    public static Enemy kreirajIzTeksta(String tekst) {
        String[] djelovi = tekst.split(";");
        String tip = djelovi[0];

        String[] poz = djelovi[1].split(",");
        int x = Integer.parseInt(poz[0]);
        int y = Integer.parseInt(poz[1]);

        String[] dim = djelovi[2].split("x");
        int w = Integer.parseInt(dim[0]);
        int h = Integer.parseInt(dim[1]);

        int steta = Integer.parseInt(djelovi[3]);
        String uloga = djelovi[4].trim();

        if (uloga.equalsIgnoreCase("boss")) {
            return new BossEnemy(tip, x, y, w, h, steta, 100);
        } else {
            return new MeleeEnemy(tip, x, y, w, h, steta, 60);
        }
    }

    public static void main(String[] args) {
        Player igrac = new Player("  peTar  petrović ", 10, 5, 32, 32, 85);
        Game igra = new Game(igrac);

        // Dodavanje: jedan rucno, drugi iz stringa
        MeleeEnemy e1 = new MeleeEnemy("Goblin", 12, 5, 16, 16, 20, 60);
        Enemy e2 = kreirajIzTeksta("Goblin;12,5;16x16;20;boss");

        igra.addEnemy(e1);
        igra.addEnemy(e2);

        // 1. Ispisati sve neprijatelje
        System.out.println("Svi neprijatelji:");
        for (Enemy e : igra.enemies) {
            System.out.println(e);
        }

        // 2. Pronaci one koji u imenu sadrze rijec "gob"
        System.out.println("\nNeprijatelji koji sadrze 'gob':");
        for (Enemy e : igra.findByType("gob")) {
            System.out.println(e);
        }

        // 3. Prikazati stanje igraca prije kolizije
        System.out.println("\nStanje igraca prije kolizije:");
        System.out.println(igrac);

        // 4. Provjeriti kolizije i rijesiti ih
        igra.resolveCollisions();

        // 5. Prikazati stanje igraca poslije kolizije
        System.out.println("\nStanje igraca poslije kolizije:");
        System.out.println(igrac);

        // 6. Ispisati kompletan eventLog
        System.out.println("\nKompletan eventLog:");
        for (String log : igra.eventLog) {
            System.out.println(log);
        }
    }
}
