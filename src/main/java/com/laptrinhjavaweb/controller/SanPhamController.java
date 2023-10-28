package com.laptrinhjavaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SanPhamController {

    @GetMapping("/assgiment-products")
    public String assgimentProducts(){
        return "product-has-attribute";
    }

    @GetMapping("/sanphams/{slug}")
    public String detail(@PathVariable("slug") String slug){
        return "detail";
    }
}
