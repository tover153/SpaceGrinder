package com.spcgrndr.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.spcgrndr.game.SpaceGrinder;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.y = config.y + 1280;
		new LwjglApplication(new SpaceGrinder(), config);
	}
}
