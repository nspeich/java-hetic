// package fr.hetic;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;

// public class ex2 {
//     public static void main(String[] args) {
//         if (args.length != 2) {
//             System.out.println("Usage: java ex2 <inputFilePath> <outputFilePath>");
//             System.exit(1);
//         }

//         String inputFilePath = args[0];
//         String outputFilePath = args[1];

//         try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
//              BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 String[] tokens = line.split(" ");
                
//                 try {
//                     int a = Integer.parseInt(tokens[0]);
//                     int b = Integer.parseInt(tokens[1]);
//                     String operationSymbol = tokens[2];

//                     int result = performOperation(a, b, operationSymbol);
//                     writer.write(String.valueOf(result));
//                     writer.newLine();
//                 } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
//                     writer.write("ERROR: Invalid line format");
//                     writer.newLine();
//                 } catch (UnsupportedOperationException e) {
//                     writer.write("ERROR: Unsupported operation");
//                     writer.newLine();
//                 }
//             }
//         } catch (IOException e) {
//             System.out.println("An error occurred: " + e.getMessage());
//             System.exit(1);
//         }
//     }

//     private static int performOperation(int a, int b, String operationSymbol) {
//         switch (operationSymbol) {
//             case "+":
//                 return a + b;
//             case "-":
//                 return a - b;
//             case "*":
//                 return a * b;
//             default:
//                 throw new UnsupportedOperationException("None operation: " + operationSymbol);
//         }
//     }
// }