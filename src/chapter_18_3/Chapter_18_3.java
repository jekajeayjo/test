/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_18_3;

/**
 *
 * @author User
 */import java.util.*;
public class Chapter_18_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("f");
        ll.add("b");
                ll.add("d");
                ll.add("e");
                ll.add("c");
                ll.addLast("z");
                ll.addFirst("a");
                ll.add(1,"a2");
                System.out.println("counter of linkedlist ll "+ll);
                ll.remove("f");
                ll.remove(2);
                System.out.println("after remove"+ll);
                ll.removeFirst();
                ll.removeLast();
                System.out.println("after remove first and lastelements"+ll);
                String val=ll.get(2);
                ll.set(2,val+"change");
                System.out.println("vounter linked "+ll);
        
    }
    
}
