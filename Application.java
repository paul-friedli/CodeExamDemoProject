public class Application {

    public final static int MIN = 1;
    public final static int MAX = 100;

    public final static int TAILLE = 1000;

    public final static String[] LANGUAGES = { "C++", "Java", "C#", "Javascript", "Assembleur", "C", "Perl", "Ada",
            "Modula", "Pascal", "Rust", "Cobol" };

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        System.out.println("Génération du tableau en cours...");
        int[] nombres = new int[TAILLE];
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = genererNombreAleatoire(MIN, MAX);
        }

        System.out.println("Génération du tableau terminé !");
        System.out.println();
        System.out.println("Voici la liste des languages de programmation cool :");
        for (int i = 0; i < LANGUAGES.length; i++) {
            System.out.println(" - " + LANGUAGES[i]);
        }

        System.out.println("Fin !");
    }

    public static int genererNombreAleatoire(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

}
