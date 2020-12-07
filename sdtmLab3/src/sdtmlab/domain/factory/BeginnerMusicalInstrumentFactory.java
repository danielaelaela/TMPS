package md.sdtmlab.domain.factory;

import md.sdtmlab.domain.builder.TamaDrumKitBuilder;
import md.sdtmlab.domain.*;

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
