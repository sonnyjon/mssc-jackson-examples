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
        String jsonString = "{\"id\":\"3ddc29a9-837b-43d9-8444-40d605fd9bc6\",\"beerName\":\"BeerName\",\"beerStyle\":\"Ale\",\"upc\":123123123123,\"price\":12.99,\"createdDate\":\"2022-08-28T13:02:35.6268103-07:00\",\"lastUpdatedDate\":\"2022-08-28T13:02:35.632818-07:00\"}";
        BeerDto dto = objectMapper.readValue( jsonString, BeerDto.class );

        System.out.println( dto );
    }
}