package guru.sfg.brewery.web.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.support.WithMockUser;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by jt on 6/12/20.
 */
@WebMvcTest
public class BeerRestControllerIT extends BaseIT{

    @Test
    void findBeers() throws Exception{
        mockMvc.perform(get("/api/v1/beer/"))
                .andExpect(status().isOk());
    }


    @Test
    void findBeersById() throws Exception{
        mockMvc.perform(get("/api/v1/beer/c863df25-b516-4de8-8b73-818bae7becc7"))
                .andExpect(status().isOk());
    }

    @Test
    void findBeersByUpc() throws Exception{
        mockMvc.perform(get("/api/v1/beerUpc/0631234200036")).andExpect(status().isOk());
    }




}
