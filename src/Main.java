public class Main {
    public static void main(String[] args) {

        MusicStyles[] groups = {new RockMusic(), new ClassicMusic(), new PopMusic()};
        for (MusicStyles musicStyles : groups) {
            musicStyles.playMusic();
        }
    }
}