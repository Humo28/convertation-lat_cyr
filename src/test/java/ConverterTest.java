import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

//    Type 0 if you want to convert cyrToLat, otherwise type 1

    @Test
    public void convert() {
        Converter converter = new Converter();
        assertEquals(converter.convert(TestProperties.CIRCUS_lAT_TO_CYR.value, 1), TestProperties.CIRCUS_lAT_TO_CYR.actual);
        assertEquals(converter.convert(TestProperties.HELLO_LAT_TO_CYR.value, 1), TestProperties.HELLO_LAT_TO_CYR.actual);
        assertEquals(converter.convert(TestProperties.WINTER_LAT_TO_CYR.value, 1), TestProperties.WINTER_LAT_TO_CYR.actual);
        assertEquals(converter.convert(TestProperties.LAND_LAT_TO_CYR.value, 1), TestProperties.LAND_LAT_TO_CYR.actual);
        assertEquals(converter.convert(TestProperties.ANNOUNCE_LAT_TO_CYR.value, 1), TestProperties.ANNOUNCE_LAT_TO_CYR.actual);
        assertEquals(converter.convert(TestProperties.CIRCUS_CYR_TO_LAT.value, 0), TestProperties.CIRCUS_CYR_TO_LAT.actual);
        assertEquals(converter.convert(TestProperties.HELLO_CYR_TO_LAT.value, 0), TestProperties.HELLO_CYR_TO_LAT.actual);
        assertEquals(converter.convert(TestProperties.WINTER_CYR_TO_LAT.value, 0), TestProperties.WINTER_CYR_TO_LAT.actual);
        assertEquals(converter.convert(TestProperties.LAND_CYR_TO_LAT.value, 0), TestProperties.LAND_CYR_TO_LAT.actual);
        assertEquals(converter.convert(TestProperties.ANNOUNCE_CYR_TO_LAT.value, 0), TestProperties.ANNOUNCE_CYR_TO_LAT.actual);
    }
}