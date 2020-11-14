package md.sdtmlab.domain;

import java.util.ArrayList;
import java.util.List;

public class MusicBand implements MusicPlayer {

    private final List<Musician> musicians;

    public MusicBand() {
        this.musicians = new ArrayList<>();
    }

    public MusicBand(List<Musician> musicians) {
        this.musicians = musicians;
    }

    public void addMusician(Musician musician) {
        this.musicians.add(musician);
    }

    @Override
    public void playSong() {
        for (Musician musician : musicians) {
            musician.playSong();
        }
    }
}
