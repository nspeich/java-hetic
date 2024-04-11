package fr.hetic.exo3;


public class Multiplication implements Operation {
    @Override
    public int execute(int num1, int num2) {
        return num1 * num2;
    }
}