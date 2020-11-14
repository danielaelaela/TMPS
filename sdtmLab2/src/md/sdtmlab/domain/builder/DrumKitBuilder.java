package md.sdtmlab.domain.builder;

import md.sdtmlab.domain.DrumKit;

public interface DrumKitBuilder {
    DrumKitBuilder addSnare();
    DrumKitBuilder addBass();
    DrumKitBuilder addCymbals(int count);
    DrumKitBuilder addTomToms(int count);
    DrumKit build();
}
