package md.sdtmlab.domain;

public class XylophoneDrumKitExtension implements MusicalInstrument {

    private final DrumKit drumKit;

    public XylophoneDrumKitExtension(DrumKit drumKit) {
        this.drumKit = drumKit;
    }

    @Override
    public MusicalInstrument getCopy() {
        return new XylophoneDrumKitExtension((DrumKit) drumKit.getCopy());
    }

    @Override
    public String getModel() {
        return drumKit.getModel();
    }

    @Override
    public void play() {
        drumKit.play();
        System.out.println("dziiin");
    }
}
