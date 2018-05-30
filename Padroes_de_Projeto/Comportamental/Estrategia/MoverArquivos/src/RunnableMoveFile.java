
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andre
 */
public class RunnableMoveFile implements Runnable {

    private File origem;
    private File destinationFile;
    private File listaFiles[];
    private String threadName;

    public RunnableMoveFile(File origem, File destinationFile) {
        this.origem = origem;
        this.destinationFile = destinationFile;
    }

    public RunnableMoveFile(File listaFiles[], String threadName) {
        this.listaFiles = listaFiles;
        this.threadName = threadName;
    }

    private static int indice;
    
    private static synchronized int getIndice(){
        Integer indiceReturn = new Integer(indice);
        indice++;
        return indiceReturn;
    }
    
    @Override
    public void run() {
        for(int i = getIndice(); i < listaFiles.length; i = getIndice()){
            File origem = new File(listaFiles[i].getAbsolutePath());
            String destinationFile = listaFiles[i].getAbsolutePath();
            destinationFile = destinationFile.replace("origem", "destino") + this.threadName;
             try {
                MoveFile.copyFile(origem, new File(destinationFile));
            } catch (IOException ex) {
                Logger.getLogger(RunnableMoveFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
