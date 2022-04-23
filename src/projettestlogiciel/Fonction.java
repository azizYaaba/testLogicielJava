/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projettestlogiciel;

/**
 *
 * @author abdoulaziz
 */
public class Fonction {
    
    public int pgdc(int m,int n){
        
        while(n !=0 ){
            int r = m%n;
            m = n;
            n = r ;
        }
        
        return m;
    }
    
public boolean estPalindrome(String ch){
	String original = ch;
	String reverse = "";
	int taille = original.length();
	for(int i = taille-1;i>=0;i--)
		{
		  reverse = reverse + original.charAt(i); 
		}
	return  original.equals(reverse);
   	}
}
