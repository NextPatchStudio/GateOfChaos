package com.test.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TestGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	TypingText text1;
	BitmapFont font1;
	BitmapFont font2;
	int hight = 50, width = 50,upside = 0;
	
	@Override
	public void create () {
		text1 = new TypingText();
		text1.randomNewText();
		//text1.setText("ABCDEFGHIJKLMNOPQRSTUVWXYZZ");
		batch = new SpriteBatch();
		font1 = new BitmapFont();
		font2 = new BitmapFont();
	    font1.setColor(Color.ORANGE);
	    font2.setColor(Color.WHITE);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		if ((Gdx.input.isKeyJustPressed(Keys.A) && text1.getFirstChar() == 'A') || 
				(Gdx.input.isKeyJustPressed(Keys.B) && text1.getFirstChar() == 'B') ||
				(Gdx.input.isKeyJustPressed(Keys.C) && text1.getFirstChar() == 'C') ||
				(Gdx.input.isKeyJustPressed(Keys.D) && text1.getFirstChar() == 'D') ||
				(Gdx.input.isKeyJustPressed(Keys.E) && text1.getFirstChar() == 'E') ||
				(Gdx.input.isKeyJustPressed(Keys.F) && text1.getFirstChar() == 'F') ||
				(Gdx.input.isKeyJustPressed(Keys.G) && text1.getFirstChar() == 'G') ||
				(Gdx.input.isKeyJustPressed(Keys.H) && text1.getFirstChar() == 'H') ||
				(Gdx.input.isKeyJustPressed(Keys.I) && text1.getFirstChar() == 'I') ||
				(Gdx.input.isKeyJustPressed(Keys.J) && text1.getFirstChar() == 'J') ||
				(Gdx.input.isKeyJustPressed(Keys.K) && text1.getFirstChar() == 'K') ||
				(Gdx.input.isKeyJustPressed(Keys.L) && text1.getFirstChar() == 'L') ||
				(Gdx.input.isKeyJustPressed(Keys.M) && text1.getFirstChar() == 'M') ||
				(Gdx.input.isKeyJustPressed(Keys.N) && text1.getFirstChar() == 'N') ||
				(Gdx.input.isKeyJustPressed(Keys.O) && text1.getFirstChar() == 'O') ||
				(Gdx.input.isKeyJustPressed(Keys.P) && text1.getFirstChar() == 'P') ||
				(Gdx.input.isKeyJustPressed(Keys.Q) && text1.getFirstChar() == 'Q') ||
				(Gdx.input.isKeyJustPressed(Keys.R) && text1.getFirstChar() == 'R') ||
				(Gdx.input.isKeyJustPressed(Keys.S) && text1.getFirstChar() == 'S') ||
				(Gdx.input.isKeyJustPressed(Keys.T) && text1.getFirstChar() == 'T') ||
				(Gdx.input.isKeyJustPressed(Keys.U) && text1.getFirstChar() == 'U') ||
				(Gdx.input.isKeyJustPressed(Keys.V) && text1.getFirstChar() == 'V') ||
				(Gdx.input.isKeyJustPressed(Keys.W) && text1.getFirstChar() == 'W') ||
				(Gdx.input.isKeyJustPressed(Keys.X) && text1.getFirstChar() == 'X') ||
				(Gdx.input.isKeyJustPressed(Keys.Y) && text1.getFirstChar() == 'Y') ||
				(Gdx.input.isKeyJustPressed(Keys.Z) && text1.getFirstChar() == 'Z')) {
			text1.correctType();
		} else if ((Gdx.input.isKeyJustPressed(Keys.A) && text1.getFirstChar() != 'A') || 
				(Gdx.input.isKeyJustPressed(Keys.B) && text1.getFirstChar() != 'B') ||
				(Gdx.input.isKeyJustPressed(Keys.C) && text1.getFirstChar() != 'C') ||
				(Gdx.input.isKeyJustPressed(Keys.D) && text1.getFirstChar() != 'D') ||
				(Gdx.input.isKeyJustPressed(Keys.E) && text1.getFirstChar() != 'E') ||
				(Gdx.input.isKeyJustPressed(Keys.F) && text1.getFirstChar() != 'F') ||
				(Gdx.input.isKeyJustPressed(Keys.G) && text1.getFirstChar() != 'G') ||
				(Gdx.input.isKeyJustPressed(Keys.H) && text1.getFirstChar() != 'H') ||
				(Gdx.input.isKeyJustPressed(Keys.I) && text1.getFirstChar() != 'I') ||
				(Gdx.input.isKeyJustPressed(Keys.J) && text1.getFirstChar() != 'J') ||
				(Gdx.input.isKeyJustPressed(Keys.K) && text1.getFirstChar() != 'K') ||
				(Gdx.input.isKeyJustPressed(Keys.L) && text1.getFirstChar() != 'L') ||
				(Gdx.input.isKeyJustPressed(Keys.M) && text1.getFirstChar() != 'M') ||
				(Gdx.input.isKeyJustPressed(Keys.N) && text1.getFirstChar() != 'N') ||
				(Gdx.input.isKeyJustPressed(Keys.O) && text1.getFirstChar() != 'O') ||
				(Gdx.input.isKeyJustPressed(Keys.P) && text1.getFirstChar() != 'P') ||
				(Gdx.input.isKeyJustPressed(Keys.Q) && text1.getFirstChar() != 'Q') ||
				(Gdx.input.isKeyJustPressed(Keys.R) && text1.getFirstChar() != 'R') ||
				(Gdx.input.isKeyJustPressed(Keys.S) && text1.getFirstChar() != 'S') ||
				(Gdx.input.isKeyJustPressed(Keys.T) && text1.getFirstChar() != 'T') ||
				(Gdx.input.isKeyJustPressed(Keys.U) && text1.getFirstChar() != 'U') ||
				(Gdx.input.isKeyJustPressed(Keys.V) && text1.getFirstChar() != 'V') ||
				(Gdx.input.isKeyJustPressed(Keys.W) && text1.getFirstChar() != 'W') ||
				(Gdx.input.isKeyJustPressed(Keys.X) && text1.getFirstChar() != 'X') ||
				(Gdx.input.isKeyJustPressed(Keys.Y) && text1.getFirstChar() != 'Y') ||
				(Gdx.input.isKeyJustPressed(Keys.Z) && text1.getFirstChar() != 'Z')) {
			text1.incorrectType();
		}
		text1.movingY(1);
		font1.draw(batch, text1.getTypedText(), text1.getxPosition(), text1.getyPosition());
		font2.draw(batch, text1.getText(), text1.getxPosition()+text1.getTypedTextLarge(), text1.getyPosition());
		batch.end();
		if (text1.isFinish()) {
			text1.randomNewText();
		}
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
