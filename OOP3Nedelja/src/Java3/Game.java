package Java3;

class Player {
	 
    private int x;
    private int y;
    private int width;
    private int height;
    private int health;
    
public Player(int x, int y, int width, int height, int health) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.health = health;
	}



public int getX() {
	return x;
}



public void setX(int x) {
    if (x >= 0 && x <= 100) {
        this.x = x;
    } else {
        System.out.println("Player: x mora biti izmedju 0 i 100.");
    }
}



public int getY() {
	return y;
}



public void setY(int y) {
    if (y >= 0 && y <= 100) {
        this.y = y;
    } else {
        System.out.println("Player: y mora biti izmedju 0 i 100.");
    }
}





public int getWidth() {
	return width;
}





public void setWidth(int width) {
    if (width > 0) {
        this.width = width;
    } else {
        System.out.println("Player: width mora biti veci od 0.");
    } }





public int getHeight() {
	return height;
}





public void setHeight(int height) {
    if (height > 0) {
        this.height = height;
    } else {
        System.out.println("Player: height mora biti veci od 0.");
    }
}





public int getHealth() {
	return health;
}





public void setHealth(int health) {
    if (health >= 0 && health <= 100) {
        this.health = health;
    } else {
        System.out.println("Player: health mora biti izmedju 0 i 100.");
    }
}
}

class Enemy {
	 
    private int x;
    private int y;
    private int width;
    private int height;
    private int damage;

    



public Enemy(int x, int y, int width, int height, int damage) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.damage = damage;
	}





public int getX() {
	return x;
}





public void setX(int x) {
	this.x = x;
}





public int getY() {
	return y;
}





public void setY(int y) {
	this.y = y;
}





public int getWidth() {
	return width;
}



public void setWidth(int width) {
    if (width > 0) {
        this.width = width;
    } else {
        System.out.println("Enemy: width mora biti veci od 0.");
    }
}








public int getHeight() {
	return height;
}





public void setHeight(int height) {
    if (height > 0) {
        this.height = height;
    } else {
        System.out.println("Enemy: height mora biti veci od 0.");
    }
}





public int getDamage() {
	return damage;
}





public void setDamage(int damage) {
    if (damage >= 0) {
        this.damage = damage;
    } else {
        System.out.println("Enemy: damage ne smije biti negativan.");
    }
}
}



public class Game {
	
	public static void checkCollision(Player p, Enemy e) {
        boolean sudar = p.getX() < e.getX() + e.getWidth()
                && p.getX() + p.getWidth() > e.getX()
                && p.getY() < e.getY() + e.getHeight()
                && p.getY() + p.getHeight() > e.getY();
 
        if (sudar) {
            System.out.println("Sudar!");
            decreaseHealth(p, e);
        } else {
            System.out.println("Nema sudara.");
        }
    }
	public static void decreaseHealth(Player p, Enemy e) {
        int novoZdravlje = p.getHealth() - e.getDamage();
        if (novoZdravlje < 0) {
            novoZdravlje = 0;
        }
        p.setHealth(novoZdravlje);
    }
	
	public static void main(String[] args) {
        Player player = new Player(10, 10, 20, 20, 100);
        Enemy enemy1 = new Enemy(20, 20, 20, 20, 60); 
        Enemy enemy2 = new Enemy(70, 70, 10, 10, 30); 
 
        System.out.println("Health na pocetku: " + player.getHealth());
 
        checkCollision(player, enemy2);
        System.out.println("Health: " + player.getHealth()); 
 
        checkCollision(player, enemy1);
        System.out.println("Health: " + player.getHealth()); 
 
        checkCollision(player, enemy1);
        System.out.println("Health: " + player.getHealth()); 
    }
	
}


