import java.util.ArrayList;
import java.util.Scanner;

public class MainBonus {
    private static String nom, unite;
    private static int quantite, position;
    private static Scanner sc = new Scanner(System.in);
    private static Ingredient monIngredient;
    public static void main(String[] args) {
        ArrayList<Ingredient> listIngredient = new ArrayList<Ingredient>();
        Scanner sc = new Scanner(System.in);
        int nvquantite;

        System.out.println("Quoi faire:\n\t1 - Créer un ingrédient et mettre dans la liste\n\t2 - Afficher la liste\n\t3 - Afficher un des ingrédients de la liste\n\t4 - Remplacer un ingrédient par un autre\n\t5 - Supprimer un ingrédient\n\t6 - Modifier la quantité d'un ingrédient");
        switch (sc.nextInt()) {
            case 1:
                monIngredient = creationIngredient();
                listIngredient.add(monIngredient);
                System.out.println("Ingrédient créer");
                break;
            case 2:
                if (listIngredient.isEmpty()) {
                    System.out.println("Vous n'avez pas les ingredients");
                    break;
                }else{
                    for (Ingredient i : listIngredient){
                        System.out.println(i.afficher());
                    }
                    break;
                }
            case 3:
                System.out.println("position");
                position(listIngredient);
                System.out.println(position + " : " + listIngredient.get(position - 1).afficher());
                break;
            case 4:
                System.out.println("ingredient à remplacer");
                monIngredient = creationIngredient();
                listIngredient.set((sc.nextInt()-1), monIngredient);
                break;
            case 5:
                System.out.println("sup position");
                position(listIngredient);
                listIngredient.remove(position-1);
                break;
            case 6:
                System.out.println("modif position");
                position(listIngredient);
                System.out.println("nv quantite");
                nvquantite = sc.nextInt();
                listIngredient.get(position-1).setQuantite(nvquantite);
                break;
            default:
                System.out.println("1,2,3,4,5 ou 6");/*
        }
        System.out.println("Voulez vous faire autre chose ? ( oui ou non )");
        //verif = sc.nextLine().toLowerCase();
        }
    }

    public static Ingredient creationIngredient(){
        Scanner sc = new Scanner(System.in);

        System.out.println("nom");
        nom = sc.nextLine();
        System.out.println("Quantité");
        quantite = sc.nextInt();
        sc.skip("\n");
        System.out.println("unité");
        unite = sc.nextLine();

        return new Ingredient(nom, quantite, unite);
    }

    public static void position(ArrayList listIngredient){
        do {
            position = sc.nextInt();
            if (position < 1 || position > listIngredient.size()) {
                System.out.println("Erreur recommencer");
            }
        }while(position < 1 || position > listIngredient.size());
    }


}
