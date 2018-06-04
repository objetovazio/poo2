/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import static strategy.SaveImage.BLUR3x3;

/**
 *
 * @author andre
 */
public class LowPass extends Strategy {

    @Override
    public BufferedImageOp filter() {
        BufferedImageOp op = null;

        float[] data = BLUR3x3;
        op = new ConvolveOp(new Kernel(3, 3, data),
                ConvolveOp.EDGE_NO_OP,
                null);

        return op;
    }

}
