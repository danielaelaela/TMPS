package md.sdtmlab.builder;

import md.sdtmlab.model.DrumKit;
import md.sdtmlab.model.YamahaDrumKit;

public class YamahaDrumKitBuilder extends DrumKitBuilderBase {

    @Override
    public DrumKit build() {
        return new YamahaDrumKit(hasSnare, hasBass, tomTomsCount, cymbalsCount);
    }
}
