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
public class K_block extends Block {
    private final String sex = "female";
    
    public String getGender(){
        return sex;
    }
    
    @Override
    public double getPaymentAmount() {
        return 25000;
    }
}
