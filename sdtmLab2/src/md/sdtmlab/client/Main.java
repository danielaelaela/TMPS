package md.sdtmlab.client;

import md.sdtmlab.domain.*;
import md.sdtmlab.domain.factory.MusicalInstrumentFactory;
import md.sdtmlab.domain.factory.ProfessionalMusicalInstrumentFactory;

import java.util.List;

public class Main {

    /**
     * This client code represents usage of music-related domain classes.
     *
     * The following patterns were implemented:
     *   1. Composite - MusicPlayer allows us to play the same song using only one
     *      musician or an orchestra composed of hundreds of musicians and exclusive
     *      guests like rock-star bands.
     *   2. Decorator - Xylophone is optionally mounted on the drum kit. The domain
     *      model represents this type of relationship through the xylophone drum kit
     *      extension.
     *   3. Proxy - some instruments are quite noisy and it might be beneficial to play
     *      them in a way so no one hears you. Sound mixer produces noise only when it
     *      is connected to the speakers and is silent otherwise.
     */
    public static void main(String[] args) {
        MusicalInstrumentFactory instrumentFactory = new ProfessionalMusicalInstrumentFactory();

        /* Solo performance of a drummer */
        DrumKit drumKit = instrumentFactory.createDrumKit();
        MusicalInstrument extendedDrumKit = new XylophoneDrumKitExtension(drumKit);
        SoundMixer drumsWithASoundMixer = new SoundMixer(extendedDrumKit);
        Musician drummer = new Musician(drumsWithASoundMixer);
        /* Prepare before the action */
        drumsWithASoundMixer.redirectSoundToHeadphones();
        drummer.playSong();
        /* Play the solo */
        drumsWithASoundMixer.redirectSoundToSpeakers();
        drummer.playSong();

        /* Invite other members of the band he makes part of */
        Musician guitarist = new Musician(instrumentFactory.createGuitar());
        Musician bassist = new Musician(instrumentFactory.createGuitar());
        MusicBand rockBand = new MusicBand(List.of(guitarist, bassist, drummer));
        /* Play together */
        rockBand.playSong();

        /* Invite a symphonic orchestra on the scene */
        Musician acousticGuitarist = new Musician(instrumentFactory.createGuitar());
        Musician pianist = new Musician(instrumentFactory.createPiano());
        Musician percussionist = new Musician(instrumentFactory.createDrumKit());
        Orchestra symphonicOrchestraWithSpecialGuests = new Orchestra(
                List.of(acousticGuitarist, pianist, percussionist, rockBand));
        /* Play the final song */
        symphonicOrchestraWithSpecialGuests.playSong();
    }
}
