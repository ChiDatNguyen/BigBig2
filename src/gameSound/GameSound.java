package gameSound;

import java.applet.Applet;
import java.applet.AudioClip;
import java.util.HashMap;

public class GameSound {
    public static final String MENU = "menu.wav";
    public static final String PLAYGAME = "playgame.mid";
    public static final String BOMB = "newbomb.wav";
    public static final String BOMBER_DIE = "bomber_die.wav";
    public static final String MONSTER_DIE = "monsterDied.wav";
    public static final String BONG_BANG = "bomb_bang.wav";
    public static final String ITEM = "item.wav";
    public static final String WIN = "win.wav";
    public static final String LOSE = "lose.mid";
    public static GameSound instance;
    private HashMap<String, AudioClip> audioMap;

    public GameSound() {
        audioMap = new HashMap<>();
        loadSound();
    }

    public static GameSound getIstance() {
        if (instance == null) {
            instance = new GameSound();
        }

        return instance;
    }

    public void loadSound() {
        putSound(MENU);
        putSound(PLAYGAME);
        putSound(BOMB);
        putSound(MONSTER_DIE);
        putSound(BOMBER_DIE);
        putSound(BONG_BANG);
        putSound(ITEM);
        putSound(WIN);
        putSound(LOSE);
    }

    public void stop() {
        getSound(MENU).stop();
        ;
        getSound(PLAYGAME).stop();
        getSound(BOMB).stop();
        getSound(BONG_BANG).stop();
        getSound(WIN).stop();
        getSound(LOSE).stop();
    }

    public void putSound(String name) {
        AudioClip auClip = Applet.newAudioClip(GameSound.class.getResource(name));
        audioMap.put(name, auClip);
    }

    public AudioClip getSound(String name) {
        return audioMap.get(name);
    }
}
