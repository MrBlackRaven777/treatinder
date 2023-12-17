package com.treat.treatinder;

import com.treat.treatinder.service.ITreatinder;
import com.treat.treatinder.service.TreatinderSrv;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
@ContextConfiguration(classes = {TreatinderApplication.class})
@Slf4j
public class WebControllersTests {

    @Autowired
    private ITreatinder service;

    @Autowired
    private MockMvc mvc;

    @Test
    public void getDogsByEmptyFilter() throws Exception {
        mvc.perform(get("/api/v1/dogs").header("X-user-id", "123456"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.dogs[0].id", is(70031486)));
    }
}
