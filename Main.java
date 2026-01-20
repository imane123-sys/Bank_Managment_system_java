import java.util.Scanner;

public class Main {
    public static void main(String args[]){
//        Client client1 = new Client(1,"imaneRm","imane@gmail.com","2345678889");
//        System.out.println(client1);
//        Bank b1 = new Bank();
//        System.out.println("=====================ajouter Client: =============");
//        b1.ajouterClient();
//        System.out.println("=====================Creer Compte :=============");
//
//        b1.creerCompte();
//        System.out.println("=====================Consulter  Solde: =============");
//
//        b1.consulterSolde();
////       b1.supprimerCompte();
//        b1.afficherComptes();
        Scanner scanner = new Scanner(System.in);
        Bank b1 = new Bank();
        int choix;
        do{
            System.out.println("========================================Menu Console ========================");
            System.out.println("Entrez un numéro entre 1 et 8 ");

            System.out.println("1.ajouter Client");
            System.out.println("2.Créer Compte");
            System.out.println("3.supprimer Compte");
            System.out.println("4.Consulter Solde");
            System.out.println("5.diposer d'argent");
            System.out.println("6.retirer un montant ");
            System.out.println("7.afficher tous les comptes ");
            System.out.println("8.quitter ");
            choix=scanner.nextInt();
            scanner.nextLine();
            switch(choix){
                case 1:
                    b1.ajouterClient();
                    break;
                case 2:
                    b1.creerCompte();
                    break;
                case 3:
                    b1.supprimerCompte();
                    break;
                case 4:
                    b1.consulterSolde();
                    break;
                case 5:
                    b1.deposer();
                    break;
                case 6:
                    b1.retirer();
                    break;
                case 7:
                    b1.afficherComptes();
                    break;

                case 8:
                    System.out.println("le programme est terminé au revoir");

                default:
                    System.out.println("choix invalide entrez un numéro entre 1 et 8");





            }


        }while(choix!=0);












    }
}
