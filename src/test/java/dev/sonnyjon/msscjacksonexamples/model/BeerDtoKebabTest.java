package dev.sonnyjon.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Created by Sonny on 8/29/2022.
 */
@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BaseTest
{
    @Test
    void testKabab() throws JsonProcessingException
    {
        BeerDto dto = getTestBeer();
        String json = objectMapper.writeValueAsString( dto );

        System.out.println( json );
    }
}