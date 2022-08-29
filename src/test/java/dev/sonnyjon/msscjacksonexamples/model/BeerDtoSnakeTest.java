package dev.sonnyjon.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Created by Sonny on 8/28/2022.
 */
@JsonTest
@ActiveProfiles("snake")
public class BeerDtoSnakeTest extends BaseTest
{
    @Test
    void testSnake() throws JsonProcessingException
    {
        BeerDto testBeer = getTestBeer();
        String jsonString = objectMapper.writeValueAsString( testBeer );

        System.out.println( jsonString );
    }
}
