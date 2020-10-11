package md.sdtmlab.builder;

import md.sdtmlab.model.DrumKit;
import md.sdtmlab.model.TamaDrumKit;

public class TamaDrumKitBuilder extends DrumKitBuilderBase {

    @Override
    public DrumKit build() {
        return new TamaDrumKit(hasSnare, hasBass, tomTomsCount, cymbalsCount);
    }
}
