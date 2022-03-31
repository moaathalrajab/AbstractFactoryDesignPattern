/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_abstractfactorydesignpattern;

/**
 *
 * @author MoaathAlrajab
 */
public class ComicBookFactory implements WritingFactory {

    @Override
    public Illustration drawSomething() {
        return new HandDrawing();
    }

    @Override
    public WrittenPiece writeSomething() {
        return new Book();
    }
    
}
