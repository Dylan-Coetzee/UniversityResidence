/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dylan.universityresidence.CorrectionPLK;

/**
 *
 * @author dylan
 */
public class E_blockCorrect extends BlockCorrect {

    public final String sex;

    public E_blockCorrect() {
        this.sex = "male";
    }
    
    public String getGender(){
        return sex;
    }
    
    @Override
    public double getPaymentAmount() {
        return 25000;
    }
    
    
}
