package md.sdtmlab.domain;

public class YamahaGuitar extends Guitar {

    @Override
    public MusicalInstrument getCopy() {
        return new YamahaGuitar();
    }

    @Override
    public String getModel() {
        return "Acoustic YAMAHA guitar";
    }
}
