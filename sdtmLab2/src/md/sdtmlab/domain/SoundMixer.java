package md.sdtmlab.domain;

public class SoundMixer implements MusicalInstrument {

    private final MusicalInstrument musicalInstrument;
    private boolean connectedToSpeakers;

    public SoundMixer(MusicalInstrument musicalInstrument) {
        this.musicalInstrument = musicalInstrument;
        this.connectedToSpeakers = true;
    }

    @Override
    public MusicalInstrument getCopy() {
        return musicalInstrument.getCopy();
    }

    @Override
    public String getModel() {
        return musicalInstrument.getModel();
    }

    @Override
    public void play() {
        if (connectedToSpeakers) {
            musicalInstrument.play();
        }
    }

    public void redirectSoundToSpeakers() {
        connectedToSpeakers = true;
    }

    public void redirectSoundToHeadphones() {
        connectedToSpeakers = false;
    }
}
