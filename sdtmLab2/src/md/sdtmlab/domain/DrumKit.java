package md.sdtmlab.domain;

public abstract class DrumKit implements MusicalInstrument {

    protected boolean hasSnare;
    protected boolean hasBass;
    protected int tomTomsCount;
    protected int cymbalsCount;

    protected DrumKit(boolean hasSnare, boolean hasBass, int tomTomsCount, int cymbalsCount) {
        this.hasSnare = hasSnare;
        this.hasBass = hasBass;
        this.tomTomsCount = tomTomsCount;
        this.cymbalsCount = cymbalsCount;
    }

    @Override
    public void play() {
        System.out.println("boom");
    }
}
