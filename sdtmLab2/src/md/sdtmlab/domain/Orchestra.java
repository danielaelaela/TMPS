package md.sdtmlab.domain;

import java.util.ArrayList;
import java.util.List;

public class Orchestra implements MusicPlayer {

    private final List<MusicPlayer> players;

    public Orchestra(List<MusicPlayer> players) {
        this.players = players;
    }

    public Orchestra() {
        this.players = new ArrayList<>();
    }

    public void addPlayer(MusicPlayer player) {
        this.players.add(player);
    }

    @Override
    public void playSong() {
        for (MusicPlayer player : players) {
            player.playSong();
        }
    }
}
