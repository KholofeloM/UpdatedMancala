/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.fnb.mancalaFnb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import za.co.fnb.mancalaFnb.util.Constants;

/**
 *
 * @author S2026015
 */
@Controller
public class ViewController {

    @GetMapping("/")
    public String main(Model model) {
        return Constants.HOME_TEMPLATE;
    }

}
