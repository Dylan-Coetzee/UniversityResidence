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
public abstract class Block implements Residence  {

    @Override
    public double getPaymentAmount() {
        return 25000;
    }
    
}
