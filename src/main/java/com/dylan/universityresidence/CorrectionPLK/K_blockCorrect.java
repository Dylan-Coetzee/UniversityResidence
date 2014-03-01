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
public class K_blockCorrect extends BlockCorrect {
    public final String sex;

    public K_blockCorrect() {
        this.sex = "female";
    }
    
    public String getGender(){
        return sex;
    }
    
    @Override
    public double getPaymentAmount() {
        return 25000;
    }
}
