/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import static strategy.SaveImage.BLUR3x3;
import static strategy.SaveImage.SHARPEN3x3;

/**
 *
 * @author ewerson
 */
public class LowPassFilter extends StrategyFilterImage {

    @Override
    public void applyFilter() {
        float[] data = BLUR3x3;
        op = new ConvolveOp(new Kernel(3, 3, data), ConvolveOp.EDGE_NO_OP, null);
    }
}
