package com.tbh.demo.yss.converter;

import org.springframework.core.convert.converter.Converter;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StringConverterDate implements Converter<String,Date> {

    String dateFormat;

    public  StringConverterDate(String dateFormat){
        this.dateFormat = dateFormat;
    }


    @Override
    public Date convert(String source) {
        System.out.println(1);
        LocalDateTime parse = LocalDateTime.parse(source, DateTimeFormatter.ofPattern(dateFormat));
        ZoneId zoneId = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = parse.atZone(zoneId);
        return Date.from(zonedDateTime.toInstant());
    }
}
