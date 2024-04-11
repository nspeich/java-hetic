package fr.hetic.exo4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Calculateur {
    public static void main(String[] args) {
        
        if (args.length != 3) {
            System.out.println("Il faut 3 arguments : deux nombres et un opérateur (+, - ou *)");
            return;
        }

        
        double a = 0;
        double b = 0;
        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Les deux premiers arguments doivent être des nombres");
            return;
        }

        
        String operator = args[2];

        
        Map<String, BinaryOperator<Double>> operations = new HashMap<>();
        operations.put("+", (x, y) -> x + y);
        operations.put("-", (x, y) -> x - y); 

        
        BinaryOperator<Double> operation = operations.get(operator);
        if (operation == null) {
            System.out.println("L'opérateur doit être + ou -");
            return;
        }

        
        double result = operation.apply(a, b);
        System.out.println(result);
    }
}