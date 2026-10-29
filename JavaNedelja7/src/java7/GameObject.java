package java7;

public class GameObject {
    private int x;
    private int y;
    private int width;
    private int height;

    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        setWidth(width);
        setHeight(height);
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
            System.out.println("Sirina mora biti veca od nule!");
        }
    }

    public int getHeight() { 
        return height; 
    }
    
    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Visina mora biti veca od nule!");
        }
    }

    public boolean intersects(GameObject drugi) {
        return (this.x < drugi.getX() + drugi.getWidth() &&
                this.x + this.width > drugi.getX() &&
                this.y < drugi.getY() + drugi.getHeight() &&
                this.y + this.height > drugi.getY());
    }

    @Override
    public String toString() {
        return "GameObject @ (" + x + "," + y + ") " + width + "x" + height;
    }
}