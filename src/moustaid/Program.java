/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moustaid;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class Program {
    public static void main(String[] args) {

        Employe emp1=new Employe("QB2223", 5000);
        emp1.setCalculeIgr(new CalculeIGRMaroc());
        System.out.println(emp1+", SalaireNetMensuel = "+emp1.getSalaireNetMensuel());
        
        Employe emp2=new Employe("EM399", 1500);
        emp2.setCalculeIgr(new CalculeIGRAlgerie());
        System.out.println(emp2+", SalaireNetMensuel = "+emp2.getSalaireNetMensuel());

        
        
    }
}
