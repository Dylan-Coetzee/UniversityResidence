/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.dylan.universityresidence.CorrectionPLK.E_blockCorrect;
import com.dylan.universityresidence.CorrectionPLK.G_blockCorrect;
import com.dylan.universityresidence.CorrectionPLK.H_blockCorrect;
import com.dylan.universityresidence.CorrectionPLK.K_blockCorrect;
import com.dylan.universityresidence.config.AppConfig;
import com.dylan.universityresidence.service.ResidenceService;
import junit.framework.Assert;
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
public class TestPLKCorrection {
    private static ResidenceService service;
   
    public TestPLKCorrection() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void checkMaleGenderCorrection(){
        E_blockCorrect ECorrect = new E_blockCorrect();
        H_blockCorrect HCorrect = new H_blockCorrect();
        
        Assert.assertEquals("male", ECorrect.getGender());
        Assert.assertEquals("male", HCorrect.getGender());
    }
    
    @Test
    public void checkFemaleGenderCorrection(){
        K_blockCorrect KCorrect = new K_blockCorrect();
        G_blockCorrect GCorrect = new G_blockCorrect();
        
        Assert.assertEquals("female", KCorrect.getGender());
        Assert.assertEquals("female", GCorrect.getGender());
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
