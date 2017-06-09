/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.w2e;

/**
 *
 * @author mzijlstra
 */
public class ClassC extends ClassA {
    public ClassC(String text) { 
        System.out.println("ClassC Constructor text: " + getText());
        setText(text);
    }
}
