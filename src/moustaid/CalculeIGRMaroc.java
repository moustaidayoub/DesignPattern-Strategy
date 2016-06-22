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
public class CalculeIGRMaroc implements ICalculeIGR{

    @Override
    public float calculerIGR(float salaireBrutMensuel) {  
      float salaireBrutAnnuel=salaireBrutMensuel*12;
      float taux=42;
      
    if(salaireBrutAnnuel<40000)
        taux=5;
    else if (salaireBrutAnnuel>=40000 && salaireBrutAnnuel<12000) 
       taux=20;
    
    return salaireBrutAnnuel*taux/100;
        
    }
    
}
