package javaproject;
import java.util.Random;

public class Rabbit implements Runnable{
    

    private int x;
    private int y;
    private Field field;
    private int moveTime = 1000;
    private boolean alive = true;

    private int eatTime = (new Random().nextInt(3) + 1) * 1000;
    public Rabbit(int x, int y,Field field) {
        this.x = x;
        this.y = y;
        this.field = field;
        this.field.getCell(x, y).setRabbit();
    }
    public void run() {
        while (alive) {
            try {
                if(field.getCell(x, y).hasCarrot())
                {
                    eatCarrot();
                    Thread.sleep(eatTime);
                    damage();
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
        field.getCell(x, y).removeRabbit();
        x += dx;
        y += dy;
        field.getCell(x, y).setRabbit();
    }
    
    private void die() {
        alive = false;
        field.getCell(x, y).removeRabbit();
    }
    
    private void eatCarrot() {
        field.getCell(x, y).removeCarrot();
    }
    
    
    private void damage() {
        field.getCell(x, y).setDamaged();
    }
}
