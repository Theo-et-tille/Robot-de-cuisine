import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nom");
        String nom = sc.nextLine();
        System.out.println("Quantité");
        int quantite = sc.nextInt();
        sc.skip("\n");
        System.out.println("unité");
        String unite = sc.nextLine();

        Ingredient monIngredient = new Ingredient(nom, quantite, unite);

        System.out.println(monIngredient.getQuantite());
        System.out.println(monIngredient.getNom());
        System.out.println(monIngredient.getUnite());
        System.out.println(monIngredient.afficher());

        System.out.println("reecrire quantité");
        int reQuantity = sc.nextInt();
        monIngredient.setQuantite(reQuantity);
        System.out.println(monIngredient.afficher());
    }
}