package com.zone.innovation.activityfeed;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ActivityfeedApplicationMockTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() {
        //assertThat(controller).isNotNull();
    }


    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/activityfeed/1")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string
                        (containsString("{\"id\":null,\"description\":null,\"customerId\":null,\"transactions\"")));
    }

    @Test
    public void shouldReturnCtivityList() throws Exception {
        this.mockMvc.perform(get("/api/activity-feeds")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string
                        (containsString("{\"id\":1,\"timestamp\":null,\"category\":\"category\",\"title\":\"title\",\"alert-type\":\"alert type\"")));
    }


}