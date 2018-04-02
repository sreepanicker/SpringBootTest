/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sree.springbootfirst;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sreep
 */
@RestController
public class ControllerLogic {
    @RequestMapping("/")
    
    public String getName(){
        return "Runing in openShift v4";
    }
    
}
