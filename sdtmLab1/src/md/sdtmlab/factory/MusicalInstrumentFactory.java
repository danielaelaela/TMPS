package md.sdtmlab.factory;

import md.sdtmlab.model.DrumKit;
import md.sdtmlab.model.Guitar;
import md.sdtmlab.model.Piano;

public interface MusicalInstrumentFactory {
    Guitar createGuitar();
    DrumKit createDrumKit();
    Piano createPiano();
}
