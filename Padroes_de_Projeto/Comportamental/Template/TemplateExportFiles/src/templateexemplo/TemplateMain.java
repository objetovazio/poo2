
package templateexemplo;


public class TemplateMain {

   
    public static void main(String[] args) {
        String texto = "linha 1\n" 
                + "linha2\n" + "teste1\n"
                + "fim\n";
        
      new ExportWord(texto);
      new ExportHtml(texto);
      //export.exportWord(texto);
    }
    
}
