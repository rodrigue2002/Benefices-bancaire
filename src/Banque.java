import java.util.*;
public class Banque{
    double x = 0.01;
    double y = 0.02;
    String nom;
    String ville;
    char sexe;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("entrez votre nom : ");
        String nom = sc.nextLine();
        System.out.print("entrez votre ville : ");
        String ville = sc.nextLine();
        System.out.print("entrez votre sexe (F ou M): ");
        char sexe = sc.nextLine().charAt(0);
        while (sexe != 'M' && sexe != 'F'){
         System.out.print("entrez un sexe valide : ");
         sexe = sc.nextLine().charAt(0);
        }
        System.out.print("entrez le solde de votre compte privé : ");
        double b = sc.nextDouble();
        System.out.print("entrez le solde de votre compte épargne : ");
        double c = sc.nextDouble();
        System.out.println("\n Données avant le bouclement de comptes : " );
        Banque a = new Banque(nom , ville , sexe);
        a.comptePriveAvantBouclement(b);
        a.compteEpargneAvantBouclement(c);
       System.out.println("Données après le bouclement de comptes : " );
       a.comptePriveApres(b);
       a.compteEpargneApres(c);
 }

    public Banque(String nom, String ville, char sexe){
            assert (sexe == 'M' || sexe == 'F');
           this.nom = nom;
           this.ville = ville;
           this.sexe = sexe;
           if(sexe == 'M') System.out.println("client "+ nom + " de " + ville );
           else System.out.println("cliente "+ nom + " de " + ville );         
    }
    public void comptePriveAvantBouclement(double a){
            System.out.println("compte privé : " + a + " euros");     
    }
    public void compteEpargneAvantBouclement(double a){
            System.out.println("compte épargne : " + a + " euros");     
    }
    public void comptePriveApres(double a){
           a = a + a*x ;
            System.out.println("compte privé : " + a + " euros");     
    }
    public void compteEpargneApres(double a){
           a = a + a*y ;
            System.out.println("compte épargne : " + a + " euros");     
    }

}