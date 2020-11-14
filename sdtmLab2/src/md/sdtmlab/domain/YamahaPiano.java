package md.sdtmlab.domain;

public class YamahaPiano extends Piano {

    @Override
    public MusicalInstrument getCopy() {
        return new YamahaPiano();
    }

    @Override
    public String getModel() {
        return "Electronic YAMAHA piano";
    }
}
