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
class pakjm{
    public void soal1(){
        int a=5,b=0,c=0;
        try{
            c = a/b;
        }catch(ArithmeticException e){
            System.err.println("HASIL : "+a+b+c);
        }
    }
    
    public void soal2(){
        System.out.println("Sebelum Pembagian");
        try{
            System.out.println(5/0);
        }catch(Throwable t){
            System.err.println("Terjadi kesalahan Dengan nol");
            System.err.println(t.getMessage());
        }
        System.out.println("sesudah Pembagian");
    }
    public void soal3(){
        try{
           
        }catch(ArithmeticException e){
            System.out.println("arar");
        }catch(RuntimeException r){
            System.err.println("pembagian dengan nol");
        }catch(Exception e){
            System.out.println("exception ");
        }catch(Throwable t){
            System.err.println("throwable");
            System.out.println(t.getMessage());
        }
    }
}
public class Tugas {
    public static void main(String[] args){
        pakjm ichsan = new pakjm();
        ichsan.soal1();
    }
    
}
