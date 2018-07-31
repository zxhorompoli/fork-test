package com.west.cnet.pcfintroservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@RunWith(SpringRunner.class)
@WebMvcTest(CarController.class)
public class CarsControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getCars_ShouldReturnListOfCars() throws Exception {
        String carByMake = "$[?(@.make == '%s')]";

        mockMvc.perform(MockMvcRequestBuilders.get("/cars"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0]").exists())
                .andExpect(MockMvcResultMatchers.jsonPath(carByMake, "Toyota").exists())
                .andExpect(MockMvcResultMatchers.jsonPath(carByMake, "Toyota").exists())
                .andExpect(MockMvcResultMatchers.jsonPath(carByMake, "Volkswagen").exists())
                .andExpect(MockMvcResultMatchers.jsonPath(carByMake, "Honda").exists());
    }
}
