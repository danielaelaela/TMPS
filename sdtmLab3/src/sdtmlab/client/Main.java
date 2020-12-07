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
     *   1. State - sound mixer's internal state is managed by using this pattern to remove additional branching. Also
     *      drum kits implement this pattern to remember current configuration of cymbals.
     *   2. Command - used to allow independent management of song playing.
     *   3. Observer - used to react on changes inside the sound mixer.
     */
    public static void main(String[] args) {
        MusicalInstrumentFactory instrumentFactory = new ProfessionalMusicalInstrumentFactory();

        /* Solo performance of a drummer */
        DrumKit drumKit = instrumentFactory.createDrumKit();
        MusicalInstrument extendedDrumKit = new XylophoneDrumKitExtension(drumKit);
        SoundMixer drumsWithASoundMixer = new SoundMixer(extendedDrumKit);
        drumsWithASoundMixer.subscribe("switch",
                eventName -> System.out.println("[MIXER] Output source switched"));
        Musician drummer = new Musician(drumsWithASoundMixer);
        Command playSongCommand = new PlaySongCommand(drummer);
        /* Prepare before the action */
        drumsWithASoundMixer.redirectSoundToHeadphones();
        drumKit.openHiHat();
        playSongCommand.execute();
        /* Play the solo */
        drumsWithASoundMixer.redirectSoundToSpeakers();
        drumKit.closeHiHat();
        playSongCommand.execute();

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
        Command playWithOrchestraCommand = new DelayedPlaySongCommand(symphonicOrchestraWithSpecialGuests, 10);
        /* Play the final song */
        playWithOrchestraCommand.execute();
    }
}
