/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projettestlogiciel;

import java.util.Scanner;

/**
 *
 * @author abdoulaziz
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fonction fonction = new Fonction();
        Scanner sc=new Scanner(System.in);
        int continu=0;
        
        do{
        System.out.println("***Bienvenue dans l'application de TEST LOGICIEL AVEC JUNIT***");
        System.out.println("Taper 1 pour la fonction palindrome \t 2 pour la fonction pgcd");

        int choix=sc.nextInt();
        switch(choix){
            
            case 1:
                System.out.println("Entrer le mot");
                String ch=sc.next();
                if(fonction.estPalindrome(ch)) System.out.println("Le mot est un palindrome");
                else System.out.println("Le mot n'est pas un palindrome");
                break;
                
            case 2:
                System.out.println("Entrer les deux nombres");
                int m=sc.nextInt();
                int n = sc.nextInt();
                System.out.println("Le PGCD de "+m+" et "+n+" est:"+fonction.pgdc(m, n));
                break;
            
        
             }
        System.out.println("\n Voulez vous continuer ?\t Taper 1 pour continuer et tout tout autre chiffre pour quitter");
        continu=sc.nextInt();
        }while(continu == 1);
    }
    
}
