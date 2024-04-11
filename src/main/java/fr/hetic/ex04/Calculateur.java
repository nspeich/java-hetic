package fr.hetic.exo4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Calculateur {
    public static void main(String[] args) {
        try {
            double result = calculate(args);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double calculate(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException("Il faut 3 arguments : deux nombres et un opérateur (+, - ou *)");
        }

        double a, b;
        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Les deux premiers arguments doivent être des nombres");
        }

        String operator = args[2];

        Map<String, BinaryOperator<Double>> operations = new HashMap<>();
        operations.put("+", (x, y) -> x + y);
        operations.put("-", (x, y) -> x - y);
        // Ajoutez d'autres opérateurs si nécessaire

        BinaryOperator<Double> operation = operations.get(operator);
        if (operation == null) {
            throw new IllegalArgumentException("L'opérateur doit être + ou -");
        }

        return operation.apply(a, b);
    }
}
