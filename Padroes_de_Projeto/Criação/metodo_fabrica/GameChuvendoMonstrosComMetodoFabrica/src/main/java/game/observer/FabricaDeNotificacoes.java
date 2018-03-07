package game.observer;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class FabricaDeNotificacoes {
    String filePath;
    FabricaDeNotificacoes() {
        try {
            File file = new File(".");
            filePath = file.getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FabricaDeNotificacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Image criarImagensNotificacao(String tipo) {
        Image image = null;
        
        try{
            File file = new File(".");
            String filePath = file.getCanonicalPath() + "\\src\\main\\java\\";
            
            if(tipo.equals("ganhou")) image = new Image(filePath + "ganhou.png");   
            else if(tipo.equals("gameover")) image = new Image(filePath + "gameover.png");
        }
        catch(SlickException | IOException e){
            e.printStackTrace();
        }
        
        return image;
    }

   

}
