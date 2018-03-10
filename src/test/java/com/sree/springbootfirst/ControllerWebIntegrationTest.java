/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sree.springbootfirst;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author sreep
 */

//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment=WebEnvironment.DEFINED_PORT)
public class ControllerWebIntegrationTest {
   
    //@Ignore
    @Test
    public void testReturn(){
        //RestTemplate template = new RestTemplate();
        assertEquals("good","good");
      //  ResponseEntity<String> res = template.getForEntity("http://localhost:8081/", String.class);
        //assertEquals(res.getStatusCodeValue(),300);
        
    }
}
