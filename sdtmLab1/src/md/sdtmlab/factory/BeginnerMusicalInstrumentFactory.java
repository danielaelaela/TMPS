package md.sdtmlab.factory;

import md.sdtmlab.builder.TamaDrumKitBuilder;
import md.sdtmlab.model.*;

public class BeginnerMusicalInstrumentFactory implements MusicalInstrumentFactory {

    @Override
    public Guitar createGuitar() {
        return new YamahaGuitar();
    }

    @Override
    public DrumKit createDrumKit() {
        return new TamaDrumKitBuilder()
                .addSnare()
                .addBass()
                .addCymbals(1)
                .build();
    }

    @Override
    public Piano createPiano() {
        return new YamahaPiano();
    }
}
