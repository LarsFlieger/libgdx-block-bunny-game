package com.michael.blockbunny.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.michael.blockbunny.BlockBunny;

public class DesktopLauncher {
	public static final String TITLE = "Block Bunny";
	public static final int V_WIDTH = 320;
	public static final int V_HEIGHT = 240;
	public static final int SCALE = 5;

	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = TITLE;
		config.width = V_WIDTH * SCALE;
		config.height = V_HEIGHT * SCALE;
		new LwjglApplication(new BlockBunny(), config);
	}
}
