package com.example.crud;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

//    @Test
//    public void testRegister() throws Exception {
//        String json = """
//                {
//                    "name": "Hoan",
//                    "email": "hoan@example.com",
//                    "password": "123456",
//                    "phone": "0123456789",
//                    "address": "Hanoi"
//                }
//                """;
//
//        mockMvc.perform(post("/register")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(json))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.email").value("hoan@example.com"));
//    }

    @Test
    public void testLogin() throws Exception {
        String json = """
                {
                    "email": "nmh03@gmail.com",
                    "password": "201103"
                }
                """;

        mockMvc.perform(post("/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Hoan"));
    }
}
