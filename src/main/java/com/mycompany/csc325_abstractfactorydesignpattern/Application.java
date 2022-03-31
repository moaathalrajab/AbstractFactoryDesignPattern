/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_abstractfactorydesignpattern;

import java.awt.print.Paper;

/**
 *
 * @author MoaathAlrajab
 */
public class Application {
    //Application to describe a publication
    
    private WrittenPiece paper ;
    private Illustration drawing;

    public Application(WritingFactory factory) {
        drawing = factory.drawSomething();
        paper = factory.writeSomething();
    }
    
    public void revealContent(){
        paper.typeOfPiece();
        drawing.depictInfo();
    }
    
    
}
