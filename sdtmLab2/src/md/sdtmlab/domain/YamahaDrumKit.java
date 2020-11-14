package md.sdtmlab.domain;

public class YamahaDrumKit extends DrumKit {

    public YamahaDrumKit(boolean hasSnare, boolean hasBass, int tomTomsCount, int cymbalsCount) {
        super(hasSnare, hasBass, tomTomsCount, cymbalsCount);
    }

    @Override
    public MusicalInstrument getCopy() {
        return new YamahaDrumKit(hasSnare, hasBass, tomTomsCount, cymbalsCount);
    }

    @Override
    public String getModel() {
        return "Acoustic YAMAHA drum kit";
    }
}
