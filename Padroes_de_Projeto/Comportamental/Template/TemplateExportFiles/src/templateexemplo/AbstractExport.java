/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templateexemplo;

/**
 *
 * @author andre
 */
public abstract class AbstractExport {
    
    private String txt;
    
    public AbstractExport(String txt){
        this.txt = txt;
        start();
        export(txt);
        save();
    }
    
    public abstract void start();
    public abstract void export(String txt);
    public abstract void save();
    public abstract void printLine(String linhas);
}
