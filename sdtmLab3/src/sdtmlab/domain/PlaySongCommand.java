package md.sdtmlab.domain;

public class PlaySongCommand implements Command {

    private final MusicPlayer player;

    public PlaySongCommand(MusicPlayer player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.playSong();
    }
}
