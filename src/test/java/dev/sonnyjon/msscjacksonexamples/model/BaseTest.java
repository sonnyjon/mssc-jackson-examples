package dev.sonnyjon.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by Sonny on 8/28/2022.
 */
public class BaseTest
{
    BeerDto getTestBeer()
    {
        return BeerDto.builder()
                .beerName( "BeerName" )
                .beerStyle( "Ale" )
                .id( UUID.randomUUID() )
                .createdDate( OffsetDateTime.now() )
                .lastUpdatedDate( OffsetDateTime.now() )
                .price(new BigDecimal( "12.99" ))
                .upc( 123123123123L )
                .build();
    }
}
