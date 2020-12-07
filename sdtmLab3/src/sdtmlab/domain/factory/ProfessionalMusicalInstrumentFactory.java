package md.sdtmlab.domain.factory;

import md.sdtmlab.domain.builder.YamahaDrumKitBuilder;
import md.sdtmlab.domain.*;

public class ProfessionalMusicalInstrumentFactory implements MusicalInstrumentFactory {

    @Override
    public Guitar createGuitar() {
        return new YamahaGuitar();
    }

    @Override
    public DrumKit createDrumKit() {
        return new YamahaDrumKitBuilder()
                .addSnare()
                .addBass()
                .addCymbals(5)
                .addTomToms(3)
                .build();
    }

    @Override
    public Piano createPiano() {
        return new YamahaPiano();
    }
}
