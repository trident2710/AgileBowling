
package agilebowling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author trident
 */
public class AgileBowling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       String login;
       String pwd;
       
       System.out.println("Bonjour! Veuilllez créer un utilisateur");
  
       
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Login: ");
        login = br.readLine();
        System.out.print("Mot de passe: ");
        pwd=br.readLine();
        System.out.print("Bienvenu ! ");
        
        /////
        
        
        System.out.println("Veuillez choisir une option: ");
        System.out.println("1- Lancer le jeu");
        System.out.println("2- Voir les statistiques");
        System.out.println("3- Quitter");
        
        ////////
        Jeu J=new Jeu();
        Joueur JR=new Joueur();
        
        //////Menu mode de jeu
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String choix = br1.readLine();
        switch(choix)
        {
            case "1": 
            {
                System.out.println("Veuillez choisir le mode de jeu: ");
                System.out.println("1- 1 VS 1");
                System.out.println("2- En équipe");
                System.out.println("3- Mode tournoi");
                BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
                String mode = br2.readLine();
                switch (mode){
                    case "1": //Niveau de difficulté
                        {
                        System.out.println("Veuillez choisir le niveau de difficulté: ");                   
                        System.out.println("1- Facile (BOB)");
                        System.out.println("2- Difficile (John)");
                        BufferedReader br3= new BufferedReader(new InputStreamReader(System.in));
                        String niv = br3.readLine();
                        switch (niv){
                            case "1":JR.Jouer();break;
                            case "2":JR.Jouer();break;
                        }
                    }
                        break;
                    case "2": System.out.println("En cours de construction !");break;
                    case "3": System.out.println("En cours de construction !");break;
                    
                }
                
            } 
            break;
            case "2": J.afficherScore();break;
            case "3": System.out.println("A bientôt");break;
        }
                
       
    }
    
}
