/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.awt.image.ByteLookupTable;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.LookupOp;
import static strategy.SaveImage.BLUR3x3;
import static strategy.SaveImage.SHARPEN3x3;

/**
 *
 * @author ewerson
 */
public class LookupFilter extends StrategyFilterImage {

    @Override
    public void applyFilter() {
        byte lut[] = new byte[256];
        for (int j=0; j<256; j++) {
            lut[j] = (byte)(256-j);
        }
        ByteLookupTable blut = new ByteLookupTable(0, lut);
        op = new LookupOp(blut, null);
    }
}