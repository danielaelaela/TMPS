package md.sdtmlab.domain.builder;

import md.sdtmlab.domain.DrumKit;
import md.sdtmlab.domain.TamaDrumKit;

public class TamaDrumKitBuilder extends DrumKitBuilderBase {

    @Override
    public DrumKit build() {
        return new TamaDrumKit(hasSnare, hasBass, tomTomsCount, cymbalsCount);
    }
}
