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
public class ClassA {
    protected String text;
    
    public ClassA() { System.out.println("ClassA Constructor"); }
    public void setText(String text) { this.text = text; }
    public String getText() { return text; }
}
