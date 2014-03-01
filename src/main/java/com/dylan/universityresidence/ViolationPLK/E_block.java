/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dylan.universityresidence.ViolationPLK;

import com.dylan.universityresidence.CorrectionPLK.*;

/**
 *
 * @author dylan
 */
public class E_block extends Block {

    H_block gender = new H_block();
    
    public String getGender(){
        return gender.getGender();
    }
    
    @Override
    public double getPaymentAmount() {
        return 25000;
    }
    
    
}
