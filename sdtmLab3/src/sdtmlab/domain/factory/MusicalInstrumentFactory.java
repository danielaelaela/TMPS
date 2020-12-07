package md.sdtmlab.domain.factory;

import md.sdtmlab.domain.DrumKit;
import md.sdtmlab.domain.Guitar;
import md.sdtmlab.domain.Piano;

public interface MusicalInstrumentFactory {
    Guitar createGuitar();
    DrumKit createDrumKit();
    Piano createPiano();
}
