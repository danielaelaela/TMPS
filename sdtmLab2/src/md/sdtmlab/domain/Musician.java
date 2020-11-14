package md.sdtmlab.domain;

public class Musician implements MusicPlayer {

    private final MusicalInstrument instrument;

    public Musician(MusicalInstrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void playSong() {
        instrument.play();
    }
}
