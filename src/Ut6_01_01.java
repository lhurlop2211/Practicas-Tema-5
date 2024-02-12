import java.util.Scanner;

public class Ut6_01_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line;
        while (true) {
            line = scanner.nextLine().trim();
            if (line.equalsIgnoreCase("FIN")) {
                break;
            }

            String lowerCaseLine = line.toLowerCase();
            System.out.println("a) Línea en minúscula: " + lowerCaseLine);


            StringBuilder reversedLine = new StringBuilder(line).reverse();
            System.out.println("b) Línea en orden inverso: " + reversedLine);


            StringBuilder modifiedLine = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (i % 2 == 0) {
                    modifiedLine.append(Character.toLowerCase(c));
                } else {
                    modifiedLine.append(Character.toUpperCase(c));
                }
            }
            System.out.println("c) Línea con posición impar mayúsculas y posición par minúsculas: " + modifiedLine);


            String replacedLine = line.replaceAll("[Aa]", "@");
            System.out.println("d) Línea con 'A' reemplazadas por '@': " + replacedLine);


            int[] vowelsCount = new int[5];
            for (char c : line.toLowerCase().toCharArray()) {
                switch (c) {
                    case 'a':
                        vowelsCount[0]++;
                        break;
                    case 'e':
                        vowelsCount[1]++;
                        break;
                    case 'i':
                        vowelsCount[2]++;
                        break;
                    case 'o':
                        vowelsCount[3]++;
                        break;
                    case 'u':
                        vowelsCount[4]++;
                        break;
                }
            }
            System.out.println("e) Número de veces que aparece cada vocal:");
            System.out.println("   A: " + vowelsCount[0]);
            System.out.println("   E: " + vowelsCount[1]);
            System.out.println("   I: " + vowelsCount[2]);
            System.out.println("   O: " + vowelsCount[3]);
            System.out.println("   U: " + vowelsCount[4]);
        }
    }
}
