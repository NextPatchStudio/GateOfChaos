package com.test.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.test.game.TestGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Test: Gate of Chaos ";
		config.width = 1366;
		config.height = 768;
		///config.fullscreen = true;
		new LwjglApplication(new TestGame(), config);
	}
}
