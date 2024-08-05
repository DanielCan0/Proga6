import java.util.Scanner;

public class Cano_Daniel_Progra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Imprimir palabra en diagonal");
            System.out.println("2. Imprimir piramide de numeros");
            System.out.println("3. Listar palindromos y no palíndromos");
            System.out.println("4. Salir");
            System.out.print("Elija una opcion: ");
            option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (option == 1) {
                System.out.print("Ingrese una palabra: ");
                String word = scanner.nextLine();
                for (int i = 0; i < word.length(); i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println(word.charAt(i));
                }
            } else if (option == 2) {
                System.out.print("Ingrese un número: ");
                int num = scanner.nextInt();
                for (int i = 1; i <= num; i++) {
                    for (int j = 0; j < num - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print(i);
                    }
                    System.out.println();
                }
            } else if (option == 3) {
                System.out.print("Ingrese una lista de palabras separadas por espacios: ");
                String[] words = scanner.nextLine().split(" ");
                
                System.out.println("Palíndromos:");
                for (String word : words) {
                    if (isPalindrome(word)) {
                        System.out.println(word);
                    }
                }
                
                System.out.println("No Palíndromos:");
                for (String word : words) {
                    if (!isPalindrome(word)) {
                        System.out.println(word);
                    }
                }
            } else if (option == 4) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (option != 4);

        scanner.close();
    }

    public static boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
