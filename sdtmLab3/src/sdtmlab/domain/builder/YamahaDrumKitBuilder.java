package md.sdtmlab.domain.builder;

import md.sdtmlab.domain.DrumKit;
import md.sdtmlab.domain.YamahaDrumKit;

public class YamahaDrumKitBuilder extends DrumKitBuilderBase {

    @Override
    public DrumKit build() {
        return new YamahaDrumKit(hasSnare, hasBass, tomTomsCount, cymbalsCount);
    }
}
