/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trycatch;

/**
 *
 * @author Hello World
 */
public class Fixed3 {
    public static void main(String [] args){
        byte[] b = new byte[5];
        System.out.println("input bilangan bulat = ");
        
        try{
            System.in.read(b);
        }catch(java.io.IOException e){
            System.out.println(e.getMessage());
        
        }
            String h = new String(b).trim();
            int n = Integer.valueOf(h);
            System.out.println("Out : "+(n+2));
        
    }
}
