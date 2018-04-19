/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unal.edu.poo.fgiraldo.fgutierrez;

/**
 *
 * @author Estudiante
 */
public class Excepciones {
        
    public Excepciones() throws ExcepcionPersonalizada{
        //try{
            int a=0;
            this.divideByZero();
        //} catch (ArithmeticException error) {
        //    System.out.println("Está intentando: " + error.getMessage());
        //}
    }
    
    int divideByZero() throws ExcepcionPersonalizada{
        //try{
            //return 4/0;
        //} catch (ArithmeticException error) {
          //  System.out.println("Está intentando: " + error.getMessage());
        //}
        //return 0;
        
        int r=0;    
        int k=5;
        if (r==0) {
            throw new ExcepcionPersonalizada("R = 0");
        }        
        return 5/0;
        
    }
    
    public static void main(String[] args) {
        
        try {
            Excepciones e = new Excepciones();
        }  catch (ArithmeticException error){
            System.out.println("Aritmetica: "+ error.getMessage());
        } 
        catch (ExcepcionPersonalizada ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
