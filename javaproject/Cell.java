package javaproject;
public class Cell {
    private int x;
    private int y;
    private boolean hasFarmer;
    private boolean hasDog;
    private boolean hasRabbit;
    private boolean hasCarrot;
    private boolean isDamaged;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        hasFarmer = false;
        hasDog = false;
        hasRabbit = false;
        hasCarrot = false;
        isDamaged = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setFarmer() {
        hasFarmer = true;
    }
    public void removeFarmer() {
        hasFarmer = false;
    }

    public boolean hasFarmer() {
        return hasFarmer;
    }

    public void setDog() {
        hasDog = true;
    }
    public void removeDog() {
        hasDog = false;
    }

    public boolean hasDog() {
        return hasDog;
    }

    public void setRabbit() {
        hasRabbit = true;
    }

    public void removeRabbit() {
        hasRabbit = false;
    }

    public boolean hasRabbit() {
        return hasRabbit;
    }

    public void setCarrot() {
        hasCarrot = true;
    }

    public void removeCarrot() {
        hasCarrot = false;
    }

    public boolean hasCarrot() {
        return hasCarrot;
    }

    public void setDamaged() {
        isDamaged = true;
    }

    public void removeDamaged() {
        isDamaged = false;
    }

    public boolean isDamaged() {
        return isDamaged;
    }
}