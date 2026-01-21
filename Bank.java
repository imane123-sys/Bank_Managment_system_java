import java.util.ArrayList;
import java.util.Iterator;
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


        System.out.println("entrez type de compte (normal/epargne)");
        String typeCompte = scanner.nextLine();
        boolean isSavingAccount = false;
        if(typeCompte.equals("epargne")){
            isSavingAccount = true;
        }

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
        if (isSavingAccount){

            SavingsAccount savingAccount =new SavingsAccount(numroCompte,solde,typeCompte,clientRe);
            clientRe.setComptes(savingAccount);
            comptes.add(savingAccount);

            System.out.println("le compte d'épargne est crée avec succés!");

        }else {
            Account account =new Account(numroCompte,solde,typeCompte,clientRe);
            clientRe.setComptes(account);
            comptes.add(account);

            System.out.println("le compte  normal est crée avec succés!");

        }







    }

    public void deposer(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("entrez numero compte");
        String numroCompte = scanner.nextLine();
        System.out.println("entrez montant à déposer");
        double montant = scanner.nextDouble();
        scanner.nextLine();

        for(Account a :comptes){
            if(a.getNumeroCompte().equals(numroCompte)){
                a.deposer(montant);
                System.out.println("votre solde maintenat  après diposition:"+a.getSolde());




            }
        }



    }


    public void retirer(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("entrez numero compte");
        String numroCompte = scanner.nextLine();
        System.out.println("entrez montant à déposer");
        double montant = scanner.nextDouble();
        scanner.nextLine();

        for(Account a :comptes){
            if(a.getNumeroCompte().equals(numroCompte)){
                if(a.getSolde()>montant) {

                    a.retirer(montant);
                    System.out.println("votre solde  après retrait est :" + a.getSolde());

                }else{
                        System.out.println("votre solde n'est pas suffifant!!");
                    }




            }
        }



    }


    public void consulterSolde(){
        for(Account a:comptes){
            System.out.println(a);
                                                                                            ²

        }
        Scanner sc= new Scanner(System.in);
        System.out.println("entrez le numéro de compte:");
        String numeroCompteRec = sc.nextLine();
        Account account=null;

        for(Account a:comptes){
            if(a.getNumeroCompte().equals(numeroCompteRec)){
                account=a;

            };

        }
        if(account.getType().equals("normal")){
            System.out.println("le numéro de compte de ce client est:"+numeroCompteRec+"et le solde est:"+account.getSolde());


        }else{
            SavingsAccount sa =(SavingsAccount) account;
            sa.appliquerInterets();

        }








    }
    public void supprimerCompte(){
       Scanner sc= new Scanner(System.in);
       System.out.println("entrez le numéro de compte:");
        String numeroCompteRemove = sc.nextLine();
        Account account = null;
         for(Account a : comptes){
             if(a.getNumeroCompte().equals(numeroCompteRemove)){
                 account = a;
             }
        }
         if (account == null){
             System.out.println("Compte n'existe pas !!!!!!!!");
         }else{
             comptes.remove(account);
             System.out.println("le compte est supprimé avec succés!");
         }


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
