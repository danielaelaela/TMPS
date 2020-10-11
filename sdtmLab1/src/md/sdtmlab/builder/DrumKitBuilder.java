package md.sdtmlab.builder;

import md.sdtmlab.model.DrumKit;

public interface DrumKitBuilder {
    DrumKitBuilder addSnare();
    DrumKitBuilder addBass();
    DrumKitBuilder addCymbals(int count);
    DrumKitBuilder addTomToms(int count);
    DrumKit build();
}
