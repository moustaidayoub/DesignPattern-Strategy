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
public class Employe{
private String cin;
private float salaireBrutMensuel;
private ICalculeIGR calculeIgr;

public Employe(String cin, float salaireBrutMensuel) {
this.cin= cin;
this.salaireBrutMensuel= salaireBrutMensuel;
}
//la methode qui va subir le changement
public float calculerIGR(){
return calculeIgr.calculerIGR(this.salaireBrutMensuel);
}

public float getSalaireNetMensuel(){
float igr=calculerIGR();
float salaireNetAnuel=salaireBrutMensuel*12-igr;
return salaireNetAnuel/12;
}
// Getters et Setters

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public void setCalculeIgr(ICalculeIGR calculeIgr) {
        this.calculeIgr = calculeIgr;
    }

    @Override
    public String toString() {
        return "Employe{" + "cin=" + cin + ", salaireBrutMensuel=" + salaireBrutMensuel + '}';
    }
    

}