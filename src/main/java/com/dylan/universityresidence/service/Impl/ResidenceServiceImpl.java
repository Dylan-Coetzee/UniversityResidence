/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dylan.universityresidence.service.Impl;

import com.dylan.universityresidence.CorrectionPLK.BlockCorrect;
import com.dylan.universityresidence.service.ResidenceService;

/**
 *
 * @author dylan
 */
public class ResidenceServiceImpl implements ResidenceService {
    
    @Override
    public double getPaymentAmount(BlockCorrect blocks, String roomType) {
        if (roomType == "single") {
            return 24450;
        } else {
            return 22450;
        }
    }
}
