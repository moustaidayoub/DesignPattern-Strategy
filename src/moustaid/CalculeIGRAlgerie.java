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
public class CalculeIGRAlgerie implements ICalculeIGR{

    @Override
    public float calculerIGR(float salaireBrutMensuel) {  
    return salaireBrutMensuel*12*35/100;
    }
    
}
