package fr.hetic;

public class calculateur {
    // Constantes
    private static final String ADDITION = "+";
    private static final String SOUSTRACTION = "-";
    private static final String MULTIPLICATION = "*";

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculateur <nombre1> <nombre2> <opérateur>");
            return;
        }

        double nombre1, nombre2;
        try {
            nombre1 = Double.parseDouble(args[0]);
            nombre2 = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Les deux premiers paramètres doivent être des nombres.");
            return;
        }

        String operateur = args[2];
        if (!(operateur.equals(ADDITION) || operateur.equals(SOUSTRACTION) || operateur.equals(MULTIPLICATION))) {
            System.out.println("L'opérateur doit être '+', '-' ou '*'.");
            return;
        }

        // Le calcul 
        try {
            double resultat = calculer(nombre1, nombre2, operateur);
            // Affichage 
            System.out.println("Résultat : " + resultat);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
    
    private static double calculer(double nombre1, double nombre2, String operateur) {
        switch (operateur) {
            case ADDITION:
                return nombre1 + nombre2;
            case SOUSTRACTION:
                return nombre1 - nombre2;
            case MULTIPLICATION:
                return nombre1 * nombre2;
            default:
                throw new IllegalArgumentException("Opérateur invalide.");
        }
    }
}