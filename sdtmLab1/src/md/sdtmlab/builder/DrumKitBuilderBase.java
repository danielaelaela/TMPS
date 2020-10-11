package md.sdtmlab.builder;

public abstract class DrumKitBuilderBase implements DrumKitBuilder {

    protected boolean hasSnare;
    protected boolean hasBass;
    protected int tomTomsCount;
    protected int cymbalsCount;

    @Override
    public DrumKitBuilder addSnare() {
        hasSnare = true;
        return this;
    }

    @Override
    public DrumKitBuilder addBass() {
        hasBass = true;
        return this;
    }

    @Override
    public DrumKitBuilder addCymbals(int count) {
        cymbalsCount += count;
        return this;
    }

    @Override
    public DrumKitBuilder addTomToms(int count) {
        tomTomsCount += count;
        return this;
    }
}
