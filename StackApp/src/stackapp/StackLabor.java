/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackapp;

import abiturklassen.listenklassen.Stack;

/**
 *
 * @author Paintdog
 */
public class StackLabor {
    
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        System.out.println(stack.isEmpty());
        stack.push("Test 1");
        System.out.println(stack.isEmpty());
        System.out.println("Oben: " + stack.top());
        stack.push("Test 2");
        System.out.println("Oben: " + stack.top());
        stack.push("Test 3");
        System.out.println("Oben: " + stack.top());
        stack.pop();
        System.out.println("Raus: " + stack.top());
    }   
}