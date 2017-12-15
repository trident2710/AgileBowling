
package agilebowling;

import agilebowling.data.DatabaseReader;
import agilebowling.data.User;
import ai.GameFabric;
import ai.GameFabricImpl;
import ai.settings.GameDifficulty;
import ai.settings.GameType;
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
        
        GameFabric gf = new GameFabricImpl();
        GameDifficulty difficulty;
        GameType type;

        System.out.println("Bonjour! Veuilllez connecter. Inserez votre login et mot de passe ou inserez nouveau pour s'enregistrer");
  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Login: ");
        login = br.readLine();
        System.out.println("Mot de passe: ");
        pwd=br.readLine();

        User u = DatabaseReader.getInstance().findByName(login);
        if(u!=null){
            if(u.getPassword().equals(pwd))
                System.out.println("Bienvenu, "+login+"!");     
            else {
                System.out.println("Mauvais mot de passe!");   
                return;
            }         
        } else{
            DatabaseReader.getInstance().addUser(login, pwd);
            System.out.println("Nouvel utilisateur est enregistré");    
        }
        /////
        
        while (true) {            
            System.out.println("Veuillez choisir une option: ");
            System.out.println("1- Lancer le jeu");
            System.out.println("2- Voir les statistiques");
            System.out.println("3- Quitter");

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
                            type = GameType.VERSUS;
                            System.out.println("Veuillez choisir le niveau de difficulté: ");                   
                            System.out.println("1- Facile (BOB)");
                            System.out.println("2- Difficile (John)");
                            BufferedReader br3= new BufferedReader(new InputStreamReader(System.in));
                            String niv = br3.readLine();
                            switch(niv){
                                case "1":
                                    difficulty = GameDifficulty.EASY;
                                    break;
                                case "2":
                                    difficulty = GameDifficulty.HARD;
                                    break;
                                default:
                                   System.out.println("Erreur!");
                                   return;       
                            }
                            System.out.println(gf.createVersusGame(u, difficulty));
                            break;
                        case "2": 
                            System.out.println("En cours de construction !");
                            break;
                        case "3": 
                            System.out.println("En cours de construction !");
                            break;
                        default:
                            System.out.println("Erreur!");
                            return;

                    }

                } 
                break;
                case "2": 
                    System.out.println(u.getScoreReport());
                    break;
                case "3": 
                    System.out.println("A bientôt");
                    return;
                default:
                    System.out.println("Erreur!");
                    return;
            }
        }
        
        
                
       
    }
    
}
