package md.sdtmlab.domain;

public abstract class DrumKit implements MusicalInstrument {

    protected boolean hasSnare;
    protected boolean hasBass;
    protected int tomTomsCount;
    protected int cymbalsCount;
    protected HiHatState hiHatState;

    protected DrumKit(boolean hasSnare, boolean hasBass, int tomTomsCount, int cymbalsCount) {
        this.hasSnare = hasSnare;
        this.hasBass = hasBass;
        this.tomTomsCount = tomTomsCount;
        this.cymbalsCount = cymbalsCount;
        this.hiHatState = new HiHatOpenedState();
    }

    @Override
    public void play() {
        System.out.println("boom");
        hiHatState.play();
    }

    public void closeHiHat() {
        hiHatState = new HiHatClosedState();
    }

    public void openHiHat() {
        hiHatState = new HiHatOpenedState();
    }
}
