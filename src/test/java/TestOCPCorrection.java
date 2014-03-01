/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.dylan.universityresidence.CorrectionPLK.BlockCorrect;
import com.dylan.universityresidence.CorrectionPLK.H_blockCorrect;
import com.dylan.universityresidence.config.AppConfig;
import com.dylan.universityresidence.service.ResidenceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author dylan
 */
public class TestOCPCorrection {
    private static ResidenceService service;
    public TestOCPCorrection() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    
    @Test
    public void checkAmount(){
        H_blockCorrect checkAmount = new H_blockCorrect();
        
        assertEquals(service.getPaymentAmount(checkAmount, "single"),24450, 24450);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (ResidenceService)ctx.getBean("stuff");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
