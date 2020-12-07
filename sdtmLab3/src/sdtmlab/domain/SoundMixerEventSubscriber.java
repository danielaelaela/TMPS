package md.sdtmlab.domain;

public interface SoundMixerEventSubscriber {
    void handleEvent(String eventName);
}
