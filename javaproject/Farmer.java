package javaproject;

public class Farmer implements Runnable{
    private int x;
    private int y;
    private Field field;
    private int moveTime = 1000;
    private int plantTime = 3000;
    public Farmer(int x, int y,Field field) {
        this.x = x;
        this.y = y;
        this.field = field;
        this.field.getCell(x, y).setFarmer();
    }
    public void run() {
        while (true) {
            try {

                if(!field.getCell(x, y).hasCarrot())
                {
                    Thread.sleep(plantTime);
                    plantCarrot();

                }else{
                    move();
                    Thread.sleep(moveTime);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void move() {
        int dx;
        int dy;
        if (Math.random() < 0.5) {
            dx = Math.random() < 0.5 ? -1 : 1;
            dy = 0;
        } else {
            dx = 0;
            dy = Math.random() < 0.5 ? -1 : 1;
        }
        if (x + dx < 0 || x + dx >= field.getN() || y + dy < 0 || y + dy >= field.getN()) {
            return;
        }
        field.getCell(x, y).removeFarmer();
        x += dx;
        y += dy;
        field.getCell(x, y).setFarmer();
    }
    private void plantCarrot() {
        field.getCell(x, y).setCarrot();
    }

    
}
