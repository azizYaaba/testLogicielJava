
package projettestlogiciel;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        
        Fonction fonction = new Fonction();
        Scanner sc=new Scanner(System.in);
        int continu=0;
        int choix;
        
        do{
        System.out.println("***Bienvenue dans l'application de TEST LOGICIEL AVEC JUNIT***");
        System.out.println(" ");
        System.out.println("Faites votre choix");
        System.out.println("1. Fonction pgcd");
        System.out.println("2. Fonction palindrome");
        System.out.println("3. Fonction estPremier");
        System.out.println("4. Fonction estParfait");
        System.out.println("5. Fonction somPremierNombre");
        choix=sc.nextInt();
        switch(choix){
            
            case 1:
                System.out.println("Entrer le mot");
                String ch=sc.next();
                if(fonction.estPalindrome(ch)) System.out.println("Le mot" + ch +  "est un palindrome");
                else System.out.println("Le mot" + ch + "n'est pas un palindrome");
                break;
                
            case 2:
                System.out.println("Entrer les deux nombres");
                int m=sc.nextInt();
                int n = sc.nextInt();
                System.out.println("Le PGCD de "+m+" et "+n+" est:"+fonction.pgdc(m, n));
                break;
                
            case 3:
                System.out.println("Entrer le nombre a tester");
                int nombre= sc.nextInt();
                boolean f=fonction.estPremier(nombre);
                if(f==true){
                    System.out.println("Le nombre" + nombre+ "est un nombre premier");
                }
                else{
                    System.out.println("Le nombre" + nombre+ " n'est pas un nombre premier");
                }
             
          break;
            
            case 4:
                System.out.println("Entrer le nombre a tester");
                    int nombr = sc.nextInt();
                    boolean fi=fonction.estParfait(nombr);
                    if(fi==true){
                        System.out.println("Le nombre" + nombr + "est un nombre parfait");
                    }
                    else{
                        System.out.println("Le nombre" + nombr + " n'est pas un nombre parfait");
                    }
                 
                break;
           case 5:
                System.out.println("Entrer le nombre plafond");
                    int nomb = sc.nextInt();
                    int fii=fonction.somPremierNombre(nomb);
                    System.out.println("la somme des" + nomb + "premiers nombre est" + fii );
                break;
        default:
           System.out.println("Mauvais choix ");
           //system.exit;
            

        }
        System.out.println("\n Voulez vous continuer ?\t Taper 1 pour continuer et tout tout autre chiffre pour quitter");
        continu=sc.nextInt();
    }while(continu == 1);
         
}
}
