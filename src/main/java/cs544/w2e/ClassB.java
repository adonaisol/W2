/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.w2e;

import java.util.List;

/**
 *
 * @author mzijlstra
 */
public class ClassB {
    private List<ClassA> items;
    
    public ClassB() { System.out.println("ClassB Constructor"); }
    public void setItems(List<ClassA> items) { this.items = items; }
    public void printItems() {
        System.out.println("Items: " + items.size());
        for (ClassA a : items) {
            System.out.println(a.getText());
        }
    }
}
