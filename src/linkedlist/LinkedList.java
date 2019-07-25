/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Pangling
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          LinkedListN link = new LinkedListN();
        link.addFirst(5);
        link.addFirst(7);
        link.addLast(9);
        link.addLast(10);
        link.tampilkan();
        link.deleteLast();
        link.tampilkan();
    }
    
}
