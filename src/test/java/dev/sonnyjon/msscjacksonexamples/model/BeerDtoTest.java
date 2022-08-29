package dev.sonnyjon.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

/**
 * Created by Sonny on 8/28/2022.
 */
@JsonTest
class BeerDtoTest extends BaseTest
{
    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testSerializeDto() throws JsonProcessingException
    {
        BeerDto testBeer = getTestBeer();
        String jsonString = objectMapper.writeValueAsString( testBeer );

        System.out.println( jsonString );
    }

    @Test
    void testJsonDeserialization() throws IOException
    {
        String jsonString = "{\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":\"12.99\",\"createdDate\":\"2022-08-29T15:11:51-0700\",\"lastUpdatedDate\":\"2022-08-29T15:11:51.3809776-07:00\",\"myLocalDate\":\"20220829\",\"beerId\":\"f0521ff3-52f7-496e-827e-de015f1b3698\"}";
        BeerDto dto = objectMapper.readValue( jsonString, BeerDto.class );

        System.out.println( dto );
    }
}