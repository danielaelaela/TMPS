package md.sdtmlab.domain;

public class DelayedPlaySongCommand implements Command {

    private final MusicPlayer player;
    private final int delaySeconds;

    public DelayedPlaySongCommand(MusicPlayer player, int delaySeconds) {
        this.player = player;
        this.delaySeconds = delaySeconds;
    }

    @Override
    public void execute() {
        sleep(seconds(delaySeconds));
        player.playSong();
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /** Convert seconds to millis */
    private static int seconds(int seconds) {
        return seconds * 1000;
    }
}
