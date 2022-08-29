package dev.sonnyjon.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by Sonny on 8/29/2022.
 */
public class LocalDateDeserializer extends StdDeserializer<LocalDate>
{
    public LocalDateDeserializer()
    {
        super(LocalDate.class);
    }

    @Override
    public LocalDate deserialize(JsonParser parser, DeserializationContext ctxt) throws IOException, JsonProcessingException
    {
        return LocalDate.parse( parser.readValueAs(String.class), DateTimeFormatter.BASIC_ISO_DATE) ;
    }
}