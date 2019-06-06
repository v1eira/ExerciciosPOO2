/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.awt.image.BufferedImageOp;

/**
 *
 * @author ewerson
 */
public abstract class StrategyFilterImage {
    public BufferedImageOp op;
    
    public abstract void applyFilter();
}
