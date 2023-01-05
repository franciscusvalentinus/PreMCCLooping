/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uc.technospire.premcclooping;

/**
 *
 * @author franciscusvalentinus
 */
public class PreMCCLooping {

    public static void main(String[] args) {
        forLoop();
        doWhile();
    }
    
    static void forLoop(){
        // form 1
         System.out.println("Form 1");
         for (int i = 0; i < 100; i++){
             System.out.println(i);
         }
        
        // form 2
         System.out.println("Form 2");
         for (int i = 1; i < 100; i += 2){
             System.out.println(i);
         }
        
        // form 3
         System.out.println("Form 3");
         for (int i = 1; i > -100; i += 2){
             System.out.println(i);
         }
        
        // form 4
         System.out.println("Form 4");
         for (int i = 0; true; i++){
             if (i == 97){
                 break;
             }
             System.out.println(i);
         }
        
        // form 5
         System.out.println("Form 5");
         for (int i = 0; true; i += 2){
             if (i == 97){
                 break;
             }
             System.out.println(i);
         }
    }
    
    static void doWhile(){
        // form 1
        int i = 0;
        System.out.println("Form 1");
        do{
            System.out.println(i++);
        } while (i < 10);
        
        // form 2
        int j = 0;
        System.out.println("Form 2");
        while (j < 0){
            System.out.println(j++);
        }
        
        // form 3
        int k = 0;
        System.out.println("Form 3");
        while (k < 100){
            k += 2;
            System.out.println(k);
        }
        
        // form 4
        int l = 0;
        System.out.println("Form 4");
        while (true){
            l += 2;
            if (l == 97){
                break;
            }
            System.out.println(l);
        }
        
        // form 5
        int m = 0;
        System.out.println("Form 5");
        while (true){
            m += 2;
            System.out.println(m);
        }
    }
}
