
/*
     Copia arquivos de uma pasta para outra pasta
 */
import java.io.*;
import java.nio.channels.FileChannel;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @author felipe
 */
public class MoveFile {

    private static File listaFiles[] = null;
    
    public static void main(String args[]) throws IOException, InterruptedException {
        
        final long startTime = System.currentTimeMillis();// tempo incial
        listaFiles = MoveFile.getSingleTonListaFiles(); //le arquivos do diretorio e coloca na listaFiles         
        
        System.out.println("Iniciando copiar de arquivos");        
        
        RunnableMoveFile rmf1 = new RunnableMoveFile(listaFiles, "T1");
        RunnableMoveFile rmf2 = new RunnableMoveFile(listaFiles, "T2");
        
        Thread thread1;
        Thread thread2;
        
        thread1 = new Thread(rmf1);
        thread1.start();
        
        thread2 = new Thread(rmf2);
        thread2.start();
        
        final long elapsedTimeMillis = System.currentTimeMillis() - startTime; //tempo total de execução do programa
        System.out.println("Time:" + elapsedTimeMillis);
        
        
    }
    
    public static synchronized File[] getSingleTonListaFiles() throws IOException
    {        
        if(listaFiles == null){
            String current = new java.io.File(".").getCanonicalPath();
            File file = new File(current + "\\src\\origem");
            listaFiles = file.listFiles();                      
        }
        return listaFiles;        
    }
    
   
    public static void copyFile(File sourceFile, File destFile) throws IOException {

        if (!sourceFile.exists()) {
            return;
        }
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        source = new FileInputStream(sourceFile).getChannel();
        destination = new FileOutputStream(destFile).getChannel();
        if (destination != null && source != null) {
            destination.transferFrom(source, 0, source.size());
        }
        if (source != null) {
            source.close();
        }
        if (destination != null) {
            destination.close();
        }
    }

   
}
