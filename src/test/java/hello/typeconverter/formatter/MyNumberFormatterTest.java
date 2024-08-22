package hello.typeconverter.formatter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Locale;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MyNumberFormatterTest {

    MyNumberFormatter formatter = new MyNumberFormatter();

    @Test
    void parse() throws ParseException {
        Number result = formatter.parse("1,000", Locale.KOREA);
        System.out.println(result);
        assertThat(result).isEqualTo(new Long(1000));
        assertThat(result).isEqualTo(1000L);
        long ark = 100L;
        Long skr = 100l;
    }

    @Test
    void print() {
        String result = formatter.print(1000L, Locale.US);
        assertThat(result).isEqualTo("1,000");
    }
}