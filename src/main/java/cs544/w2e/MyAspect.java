/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.w2e;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 *
 * @author mzijlstra
 */
@Aspect
public class MyAspect {
    private int number;
    public void setNumber(int number) { this.number = number; }
    @After("execution(* cs544.w2e.*.*Text(..))")
    public void doSomething(JoinPoint jp) {
        System.out.println("Number:" + number);
        number -= 1;
    }
}
