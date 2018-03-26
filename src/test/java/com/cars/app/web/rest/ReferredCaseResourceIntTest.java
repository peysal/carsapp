package com.cars.app.web.rest;

import com.cars.app.CarsappApp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Test class for the ReferredCase REST controller.
 *
 * @see ReferredCaseResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CarsappApp.class)
public class ReferredCaseResourceIntTest {

    private MockMvc restMockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        ReferredCaseResource referredCaseResource = new ReferredCaseResource();
        restMockMvc = MockMvcBuilders
            .standaloneSetup(referredCaseResource)
            .build();
    }

    /**
     * Test notifyByEMail
     */
    @Test
    public void testNotifyByEMail() throws Exception {
        restMockMvc.perform(post("/api/referred-case/notify-by-e-mail"))
            .andExpect(status().isOk());
    }

}
