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

	public boolean estPremier(int n){
		int nbDiviseur = 0;
		boolean rtr=false;
		for(int i=1,i<=n;i++){
			if(n%i==0){
				nbDiviseur+=nbDiviseur;
			}
		}
		if(nbDiviseur==2){
			rtr=true;
		}
		return rtr;
	}

	public boolean estParfait(int n){
		int somDiviseur=0;
		boolean rtr=false;
		for(int i=1,i<=n;i++){
			if(n%i==0){
				somDiviseur+=i;
			}
		}
		if(somDiviseur==n){
			rtr=true;
		}
		return rtr;
	}
}
