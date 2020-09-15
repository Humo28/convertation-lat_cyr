public enum TestProperties {

    CIRCUS_lAT_TO_CYR("sirk", "цирк"),
    CIRCUS_CYR_TO_LAT("цирк", "sirk"),
    HELLO_LAT_TO_CYR("salom", "салом"),
    HELLO_CYR_TO_LAT("салом", "salom"),
    WINTER_LAT_TO_CYR("qish", "қиш"),
    WINTER_CYR_TO_LAT("қиш", "qish"),
    LAND_LAT_TO_CYR("yer", "ер"),
    LAND_CYR_TO_LAT("ер", "yer"),
    ANNOUNCE_LAT_TO_CYR("e'lon", "эълон"),
    ANNOUNCE_CYR_TO_LAT("эълон", "e'lon");


    public String value;
    public String actual;

    TestProperties(String value, String actual) {
        this.value = value;
        this.actual = actual;
    }
}
