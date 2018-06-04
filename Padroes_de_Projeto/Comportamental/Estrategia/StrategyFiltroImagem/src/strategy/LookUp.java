/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.awt.image.BufferedImageOp;
import java.awt.image.ByteLookupTable;
import java.awt.image.LookupOp;

/**
 *
 * @author andre
 */
public class LookUp extends Strategy {

    @Override
    public BufferedImageOp filter() {
        BufferedImageOp op = null;

        byte lut[] = new byte[256];
        for (int j = 0; j < 256; j++) {
            lut[j] = (byte) (256 - j);
        }
        ByteLookupTable blut = new ByteLookupTable(0, lut);
        op = new LookupOp(blut, null);
        
        return op;
    }

}
