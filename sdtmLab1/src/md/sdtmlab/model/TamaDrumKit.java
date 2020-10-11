package md.sdtmlab.model;

public class TamaDrumKit extends DrumKit {

    public TamaDrumKit(boolean hasSnare, boolean hasBass, int tomTomsCount, int cymbalsCount) {
        super(hasSnare, hasBass, tomTomsCount, cymbalsCount);
    }

    @Override
    public MusicalInstrument getCopy() {
        return new TamaDrumKit(hasSnare, hasBass, tomTomsCount, cymbalsCount);
    }

    @Override
    public String getModel() {
        return "Electronic TAMA drum kit";
    }
}
