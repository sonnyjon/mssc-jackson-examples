package dev.sonnyjon.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by Sonny on 8/29/2022.
 */
public class LocalDateSerializer extends JsonSerializer<LocalDate>
{
    @Override
    public void serialize(LocalDate localDate,
                          JsonGenerator jsonGenerator,
                          SerializerProvider serializerProvider) throws IOException
    {
        jsonGenerator.writeObject(localDate.format( DateTimeFormatter.BASIC_ISO_DATE ));
    }
}
