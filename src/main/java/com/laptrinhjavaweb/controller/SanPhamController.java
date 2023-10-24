package com.laptrinhjavaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SanPhamController {

    @GetMapping("/assgiment-products")
    public String assgimentProducts(){
        return "product-has-attribute";
    }
}
