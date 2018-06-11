/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateexemplo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author andre
 */
public class ExportWord extends AbstractExport {

    XWPFDocument document;
    FileOutputStream out = null;
    
    public ExportWord(String txt) {
        super(txt);
    }

    
    @Override
    public void start() {
        String current = null;
        try {
            current = new java.io.File(".").getCanonicalPath();
            out = new FileOutputStream(new File(current + "\\src\\" + "word.docx"));
            document = new XWPFDocument();
            //Blank Document
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void export(String txt) {
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            printLine((String)linhas);
        }
    }

    @Override
    public void save() {
        try {
            document.write(out);
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ExportFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void printLine(String linhas) {
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(linhas);
    }

}
