import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private int idBanque;
    private String nomBanque;
    private String addresseBanque;
    private ArrayList<Account> comptes = new ArrayList<>();
    private ArrayList<Client> clients= new ArrayList<>();
    static  int idClient=0;

    //    public void ajouterCompte(Account account){
//         comptes.add(account);
//
//    }
    public void ajouterClient(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom  du client que vous voulez ajouter:");
        String nom =scanner.nextLine();
        System.out.println("Entrez email  du client :");
        String email =scanner.nextLine();
        System.out.println("Entrez le numero   du client :");
        String numeroClient =scanner.nextLine();

        idClient++;
        Client c1 = new Client(idClient,nom,email,numeroClient);
        clients.add(c1);
        System.out.println("client est ajoute"+idClient);


    }
    public void creerCompte(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("entrez numero compte");
        String numroCompte = scanner.nextLine();

        System.out.println("entrez solde");
        double solde = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("entrez type de compte");
        String typeCompte = scanner.nextLine();

//        recuperer client
        for(Client c:clients){
            System.out.println(c);
        }
//        //recuperer numero compte de client
        System.out.println("entrez numeroClient");
        String numeroClient = scanner.nextLine();

        Client clientRe =null;
        for(Client c:clients){
            if(c.getNumeroClient().equals(numeroClient)){
                clientRe =c;
            }

        }
        Account account =new Account(numroCompte,solde,typeCompte,clientRe);
        clientRe.setComptes(account);
        System.out.println("le compte est crée avec succés!");






    }
    public void supprimerCompte(){
        Scanner sc= new Scanner(System.in);
        System.out.println("entrez le numéro de compte:");
         String numeroCompteRemove = sc.nextLine();
         for(Account a :comptes){
             if(a.getNumeroCompte().equals(numeroCompteRemove)){
                 comptes.remove(a);

             }


         }

        System.out.println("le compte est supprimé avec succés!");

    }
    public void afficherComptes(){
//        if(comptes.isEmpty()){
//            System.out.println("aucun compte trouvé");
//            return;
//        }
        for(Account a :comptes){
            System.out.println("les comptes existés sont :"+a);


            }


    }

}
