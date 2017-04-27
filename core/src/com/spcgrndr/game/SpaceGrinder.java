package com.spcgrndr.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.glutils.IndexArray;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class SpaceGrinder extends ApplicationAdapter {
	Stage stage;
	SpriteBatch batch;
	Texture img;
	BitmapFont font;
	Integer[][] x = new Integer[3125][5];
	TextButton button, button2, button3, button4;
	TextButton.TextButtonStyle tbs;
	TextureAtlas buttonAtlas;
	Skin skin;
	Integer room = 1;
	Table table;
	Label newLabel;

	@Override
	public void create () {
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);

		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		font = new BitmapFont();
		skin = new Skin();

		buttonAtlas = new TextureAtlas(Gdx.files.internal("ui-blue.atlas"));
		table = new Table();
		table.setFillParent(true);

		skin.addRegions(buttonAtlas);
		tbs = new TextButton.TextButtonStyle();
		tbs.font = font;
		tbs.up = skin.getDrawable("button_04");
		tbs.down = skin.getDrawable("button_02");
		button = new TextButton("List", tbs);
		button2 = new TextButton("Breed", tbs);
		button3 = new TextButton("Catch", tbs);
		button4 = new TextButton("Sell", tbs);
		table.add(button);
		table.add().width(50);
		table.add(button2);
		table.row().padTop(50);
		table.add(button3);
		table.add().width(50);
		table.add(button4);
		stage.addActor(table);


		button.addListener(new ChangeListener() {
			@Override
			public void changed (ChangeEvent event, Actor actor) {
				System.out.println("Button Pressed");
			}
		});

		button2.addListener(new ChangeListener() {
			@Override
			public void changed (ChangeEvent event, Actor actor) {
				System.out.println("Button2 Pressed");
			}
		});

		button3.addListener(new ChangeListener() {
			@Override
			public void changed (ChangeEvent event, Actor actor) {
				System.out.println("Button3 Pressed");
			}
		});

		button4.addListener(new ChangeListener() {
			@Override
			public void changed (ChangeEvent event, Actor actor) {
				System.out.println("Button4 Pressed");
			}
		});


		Random g = new Random(room);

		for (int t = 0; t < 3125; t++) {
			Integer s = t;
			x[t][0] = t;
			x[t][1] = (int)Math.abs((Math.sin(s)*94))+1;
			x[t][2] = t;
			x[t][3] = t;
			x[t][4] = t;


		}

		FileHandle file = Gdx.files.local("world.dat");
		//for (int t = 0; t<3125;t++) {
		//	file.writeString(x[t][0].toString() + "," + x[t][1] + "," + x[t][2] + "," + x[t][3] + "," + x[t][4] + "\n", true);
		//}
		for (int t = 1;t<95;t++) {
			Integer T = t;
			file.writeString(T.toString() + ":",true);
			for (int s = 0;s<3125;s++) {
				Integer S = s;
				if (x[s][1] == t) {
					file.writeString(S + " ", true);
				}
			}
			file.writeString("\n", true);
		}


	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//font.draw(batch, room.toString(), 200, 400);
		/*
		for (int t = 0;t<10;t++) {
			Integer R = t;
			font.draw(batch, R.toString(),10, 400-(t*20));
			font.draw(batch, x[t][0].toString(), 50, 400-(t*20));
			font.draw(batch, x[t][1].toString(), 100, 400-(t*20));
			font.draw(batch, x[t][2].toString(), 150, 400-(t*20));
			font.draw(batch, x[t][3].toString(), 200, 400-(t*20));
			font.draw(batch, x[t][4].toString(), 250, 400-(t*20));
		}

		font.draw(batch, "XXXXX", 100, 460);
		for (int t = 0;t<3125;t++) {
			Integer r = t;
			if (x[t][3] == x[t][4]) {
				font.draw(batch, r.toString(), 100, 460);
			}
		}
		*/
		//batch.draw(img, 0, 0);
		batch.end();
		stage.draw();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
