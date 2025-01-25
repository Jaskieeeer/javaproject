package javaproject;
/*
 * The deadline is the end of January(30th of January)

The farmers have a field of size NxN, where they grows carrots. Farmers move randomly and plant carrots if they are not already planted. Carrots grow for several rounds. Occasionally, rabbits appear on the field, damaging the crops and eating the carrots. Each rabbit spends a random number of turns eating carrots. Each farmer is assisted by a dog that eliminates rabbits. The dog moves randomly, unless a rabbit is spotted by the farmer, or if the dog detects a rabbit within a range of 5 tiles, in which case it starts moving towards the rabbit. After eating the carrots, the rabbit leaves behind damaged land that the farmer must repair. Repairing the land and replanting carrots also takes a certain amount of time.
 */


public class Main {
    private static Field field;
    
    public static void main(String[] args) {
        System.out.println("Enter field size");
        int N = Integer.parseInt(System.console().readLine());
        field = new Field(N);
    }
}