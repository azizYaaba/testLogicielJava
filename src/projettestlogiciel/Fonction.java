
package projettestlogiciel;


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
		for(int i=1;i<=n;i++){
			if(n%i==0){
				nbDiviseur++;
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
		for(int i=1;i<n;i++){
			if(n%i==0){
				somDiviseur=somDiviseur+i;
			}
		}
		if(somDiviseur==n){
			rtr=true;
		}
		return rtr;
	}
        
	public int somPremierNombre(int n){
		int somme=0;
		for(int i=1;i<=n;i++){
			somme=somme+i;
		}
		return somme;
	}
}
