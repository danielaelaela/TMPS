package md.sdtmlab.domain;

import java.util.*;

public class SoundMixer implements MusicalInstrument {

    private final MusicalInstrument musicalInstrument;
    private SoundMixerState state;

    private final Map<String, List<SoundMixerEventSubscriber>> subscribers = new HashMap<>();

    public SoundMixer(MusicalInstrument musicalInstrument) {
        this.musicalInstrument = musicalInstrument;
        this.state = new SoundMixerSpeakersState(musicalInstrument);
    }

    @Override
    public MusicalInstrument getCopy() {
        return musicalInstrument.getCopy();
    }

    @Override
    public String getModel() {
        return musicalInstrument.getModel();
    }

    @Override
    public void play() {
        state.play();
        fireEvent("play");
    }

    public void redirectSoundToSpeakers() {
        state = new SoundMixerSpeakersState(musicalInstrument);
        fireEvent("switch");
    }

    public void redirectSoundToHeadphones() {
        state = new SoundMixerHeadphonesState();
        fireEvent("switch");
    }

    public void subscribe(String eventName, SoundMixerEventSubscriber subscriber) {
        subscribers.putIfAbsent(eventName, new ArrayList<>());
        subscribers.get(eventName).add(subscriber);
    }

    private void fireEvent(String eventName) {
        var matchingSubscribers = subscribers.getOrDefault(eventName, Collections.emptyList());
        matchingSubscribers.forEach(sub -> sub.handleEvent(eventName));
    }
}
