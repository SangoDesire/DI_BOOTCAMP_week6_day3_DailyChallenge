import java.util.Scanner;

public class TableMultiplication {
    public static void execute() {
        System.out.println("Quel est le nombre ?");
        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();

        tableMultiplcation(nombre);
        System.out.println("Le factoriel: " + factoriel(nombre));
        System.out.println("La suite de fibonacci est: " + fibbonaci(nombre));
    }

    private static void tableMultiplcation(int nombre) {
        System.out.println("=============== Table de multiplication ===================");
        for (int i = 0; i <= 10; i++) {
            System.out.println(nombre + " * " + i + " = " + (nombre * i));
        }
    }

    private static int factoriel(int nombre) {
        int fact = 1;
        int cpt = 1;
        while (cpt < nombre) {
            fact += fact * cpt;
            cpt++;
        }
        return fact;
    }

    private static String fibbonaci(int nombre) {
        int cpt = 0;
        StringBuilder suite = new StringBuilder();
        int prec = 1, suc = 1;
        do {
            if (cpt < 3) {
                if (cpt == 0) {
                    suite.append(cpt).append(" ");
                } else {
                    suite.append(prec).append(" ");
                }
            } else {
                int stockSuc = suc;
                suc += prec;
                prec = stockSuc;

                if (suc <= nombre) {
                    suite.append(suc).append(" ");
                }
            }

            cpt++;
        } while (suc <= nombre );

        return suite.toString();
    }
}
