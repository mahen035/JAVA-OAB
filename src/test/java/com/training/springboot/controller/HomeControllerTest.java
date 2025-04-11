//package com.training.springboot.controller;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.web.servlet.MockMvc;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@WebMvcTest(HomeController.class)
//public class HomeControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    void testGreetEndpoint() throws Exception {
//        mockMvc.perform(get("/api/v1/product/greet"))
//                .andExpect(status().isOk())
//                .andExpect(content().string("Hello from spring boot!"));
//    }
//}
