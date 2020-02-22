/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueapp;

import abiturklassen.listenklassen.Queue;

/**
 *
 * @author Paintdog
 */
public class QueueLabor {
    
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();
        
        System.out.println(queue.isEmpty());
        queue.enqueue("Test 1");
        System.out.println(queue.isEmpty());
        System.out.println("Oben: " + queue.front());
        queue.enqueue("Test 2");
        System.out.println("Oben: " + queue.front());
        queue.dequeue();
        System.out.println("Oben: " + queue.front());
        queue.dequeue();
        System.out.println("Raus: " + queue.front());
    }   
}