package com.test.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class TestGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, imgTest1, imgTest2;
	TypingText text;
	BitmapFont font1, font2;
	List<TypingText> wave;
	
	float elapsedTime;
	TextureRegion[] animationFrame1, animationFrame2;
	private Animation animation1, animation2;
	
	int monNum = 0, freezeCheck = 0, slowCheck;
	
	@Override
	public void create () {
		wave = new ArrayList<TypingText>();
		batch = new SpriteBatch();
		font1 = new BitmapFont();
		font2 = new BitmapFont();
	    font1.setColor(Color.ORANGE);
	    font2.setColor(Color.WHITE);
	    
	    imgTest1 = new Texture(Gdx.files.internal("Charactor.png"));
	    imgTest2 = new Texture(Gdx.files.internal("zombie_animation.png"));
	    
	    TextureRegion[][] tmpFrames1 = TextureRegion.split(imgTest1, 180, 186);
	    TextureRegion[][] tmpFrames2 = TextureRegion.split(imgTest2, 122, 180);
	    
	    animationFrame1 = new TextureRegion[5];
	    animationFrame2 = new TextureRegion[8];
	    int index = 0;
	    
	    for (int i=0;i<3;i++){
	    	for (int j=0;j<2;j++) {
	    		if (i == 2 && j == 1) {
	    		} else {
	    			animationFrame1[index++] = tmpFrames1[i][j];
	    		}
	    	}
	    }
	    index = 0;
	    for (int i=0;i<2;i++){
	    	for (int j=0;j<4;j++) {
	    		animationFrame2[index++] = tmpFrames2[i][j];
	    	}
	    }
	    
	    animation1 = new Animation(1f/5f, animationFrame1);
	    animation2 = new Animation(1f/1f, animationFrame2);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		int[] laneCheck = {1, 1, 1, 1, 1}, lane = {700, 575, 450, 325, 200};
		for (int i=0;i<wave.size();i++) {
			for (int j=0;j<5;j++) {
				if (wave.get(i).getTextXPosition() > 1200 && wave.get(i).getTextYPosition() == lane[j]) {
					laneCheck[j] = 0;
				}else if (wave.get(i).getTextXPosition() <= 1200 && laneCheck[0] != 0) {
					laneCheck[j] = 1;
				}
			}
		}
		if (wave.isEmpty()) {
			for (int i=0;i<5;i++) {
				text = new TypingText();
				text.randomNewText(lane[i]);
				wave.add(text);
			}
		} else {
			for (int i=0;i<5;i++) {
				if (laneCheck[i] == 1) {
					Random ran = new Random();
					int ranNum = ran.nextInt(100);
					if (ranNum < 50) {
						text = new SkillText();
					} else {
						text = new TypingText();
					}
					text.randomNewText(lane[i]);
					wave.add(text);
				}
			}
		}
		for (int i=0;i<wave.size();i++) {
			if ((Gdx.input.isKeyJustPressed(Keys.A) && wave.get(i).getFirstChar() == 'A') || 
					(Gdx.input.isKeyJustPressed(Keys.B) && wave.get(i).getFirstChar() == 'B') ||
					(Gdx.input.isKeyJustPressed(Keys.C) && wave.get(i).getFirstChar() == 'C') ||
					(Gdx.input.isKeyJustPressed(Keys.D) && wave.get(i).getFirstChar() == 'D') ||
					(Gdx.input.isKeyJustPressed(Keys.E) && wave.get(i).getFirstChar() == 'E') ||
					(Gdx.input.isKeyJustPressed(Keys.F) && wave.get(i).getFirstChar() == 'F') ||
					(Gdx.input.isKeyJustPressed(Keys.G) && wave.get(i).getFirstChar() == 'G') ||
					(Gdx.input.isKeyJustPressed(Keys.H) && wave.get(i).getFirstChar() == 'H') ||
					(Gdx.input.isKeyJustPressed(Keys.I) && wave.get(i).getFirstChar() == 'I') ||
					(Gdx.input.isKeyJustPressed(Keys.J) && wave.get(i).getFirstChar() == 'J') ||
					(Gdx.input.isKeyJustPressed(Keys.K) && wave.get(i).getFirstChar() == 'K') ||
					(Gdx.input.isKeyJustPressed(Keys.L) && wave.get(i).getFirstChar() == 'L') ||
					(Gdx.input.isKeyJustPressed(Keys.M) && wave.get(i).getFirstChar() == 'M') ||
					(Gdx.input.isKeyJustPressed(Keys.N) && wave.get(i).getFirstChar() == 'N') ||
					(Gdx.input.isKeyJustPressed(Keys.O) && wave.get(i).getFirstChar() == 'O') ||
					(Gdx.input.isKeyJustPressed(Keys.P) && wave.get(i).getFirstChar() == 'P') ||
					(Gdx.input.isKeyJustPressed(Keys.Q) && wave.get(i).getFirstChar() == 'Q') ||
					(Gdx.input.isKeyJustPressed(Keys.R) && wave.get(i).getFirstChar() == 'R') ||
					(Gdx.input.isKeyJustPressed(Keys.S) && wave.get(i).getFirstChar() == 'S') ||
					(Gdx.input.isKeyJustPressed(Keys.T) && wave.get(i).getFirstChar() == 'T') ||
					(Gdx.input.isKeyJustPressed(Keys.U) && wave.get(i).getFirstChar() == 'U') ||
					(Gdx.input.isKeyJustPressed(Keys.V) && wave.get(i).getFirstChar() == 'V') ||
					(Gdx.input.isKeyJustPressed(Keys.W) && wave.get(i).getFirstChar() == 'W') ||
					(Gdx.input.isKeyJustPressed(Keys.X) && wave.get(i).getFirstChar() == 'X') ||
					(Gdx.input.isKeyJustPressed(Keys.Y) && wave.get(i).getFirstChar() == 'Y') ||
					(Gdx.input.isKeyJustPressed(Keys.Z) && wave.get(i).getFirstChar() == 'Z')) {
				wave.get(i).correctType();
			} else if ((Gdx.input.isKeyJustPressed(Keys.A) && wave.get(i).getFirstChar() != 'A') || 
					(Gdx.input.isKeyJustPressed(Keys.B) && wave.get(i).getFirstChar() != 'B') ||
					(Gdx.input.isKeyJustPressed(Keys.C) && wave.get(i).getFirstChar() != 'C') ||
					(Gdx.input.isKeyJustPressed(Keys.D) && wave.get(i).getFirstChar() != 'D') ||
					(Gdx.input.isKeyJustPressed(Keys.E) && wave.get(i).getFirstChar() != 'E') ||
					(Gdx.input.isKeyJustPressed(Keys.F) && wave.get(i).getFirstChar() != 'F') ||
					(Gdx.input.isKeyJustPressed(Keys.G) && wave.get(i).getFirstChar() != 'G') ||
					(Gdx.input.isKeyJustPressed(Keys.H) && wave.get(i).getFirstChar() != 'H') ||
					(Gdx.input.isKeyJustPressed(Keys.I) && wave.get(i).getFirstChar() != 'I') ||
					(Gdx.input.isKeyJustPressed(Keys.J) && wave.get(i).getFirstChar() != 'J') ||
					(Gdx.input.isKeyJustPressed(Keys.K) && wave.get(i).getFirstChar() != 'K') ||
					(Gdx.input.isKeyJustPressed(Keys.L) && wave.get(i).getFirstChar() != 'L') ||
					(Gdx.input.isKeyJustPressed(Keys.M) && wave.get(i).getFirstChar() != 'M') ||
					(Gdx.input.isKeyJustPressed(Keys.N) && wave.get(i).getFirstChar() != 'N') ||
					(Gdx.input.isKeyJustPressed(Keys.O) && wave.get(i).getFirstChar() != 'O') ||
					(Gdx.input.isKeyJustPressed(Keys.P) && wave.get(i).getFirstChar() != 'P') ||
					(Gdx.input.isKeyJustPressed(Keys.Q) && wave.get(i).getFirstChar() != 'Q') ||
					(Gdx.input.isKeyJustPressed(Keys.R) && wave.get(i).getFirstChar() != 'R') ||
					(Gdx.input.isKeyJustPressed(Keys.S) && wave.get(i).getFirstChar() != 'S') ||
					(Gdx.input.isKeyJustPressed(Keys.T) && wave.get(i).getFirstChar() != 'T') ||
					(Gdx.input.isKeyJustPressed(Keys.U) && wave.get(i).getFirstChar() != 'U') ||
					(Gdx.input.isKeyJustPressed(Keys.V) && wave.get(i).getFirstChar() != 'V') ||
					(Gdx.input.isKeyJustPressed(Keys.W) && wave.get(i).getFirstChar() != 'W') ||
					(Gdx.input.isKeyJustPressed(Keys.X) && wave.get(i).getFirstChar() != 'X') ||
					(Gdx.input.isKeyJustPressed(Keys.Y) && wave.get(i).getFirstChar() != 'Y') ||
					(Gdx.input.isKeyJustPressed(Keys.Z) && wave.get(i).getFirstChar() != 'Z')) {
				wave.get(i).incorrectType();
			}
			if (freezeCheck == 0 && slowCheck == 0) {
				wave.get(i).movingX(50);
			} else if (slowCheck > 0) {
				wave.get(i).movingX(25);
			}
			batch.draw(animation2.getKeyFrame(wave.get(i).getAniFrame(), true), wave.get(i).getImgXPosition(), wave.get(i).getImgYPosition());
			font1.draw(batch, wave.get(i).getTypedText(), wave.get(i).getTextXPosition(), wave.get(i).getTextYPosition());
			font2.draw(batch, wave.get(i).getText(), wave.get(i).getTextXPosition()+wave.get(i).getTypedTextLarge(), wave.get(i).getTextYPosition());
			font2.draw(batch, Float.toString(elapsedTime), 20, 600);
			if (wave.get(0).isFinish()) {
				if (wave.get(0).getBackUpText() == "THUNDER") {
					for (int j=1;j<wave.size();j++) {
						wave.remove(j);
					}
				} else if (wave.get(0).getBackUpText() == "FREEZE") {
					freezeCheck = 2000;
				} else if (wave.get(0).getBackUpText() == "BOMB") {
					for (int j=1;j<wave.size();j++) {
						double xResult = wave.get(0).getTextXPosition() - wave.get(j).getTextXPosition(), 
								yResult = wave.get(0).getTextYPosition() - wave.get(j).getTextYPosition();
						
						if (Math.pow(Math.pow(xResult, 2) + Math.pow(yResult, 2), 0.5) <= 100) {
							wave.remove(j);
						}
					}
				}else if  (wave.get(0).getBackUpText() == "SLOW") {
					slowCheck = 2000;
				}
			}
			if (wave.get(i).isFinish()) {
				wave.remove(i);
				for (int j=0;j<wave.size();j++) {
					wave.get(j).incorrectType();
				}
			} else if (wave.get(i).getTextXPosition() <= 0) {
				wave.remove(i);
			}
			if (freezeCheck > 0) {
				freezeCheck -= Gdx.graphics.getDeltaTime();
				slowCheck = 0;
			}else if (slowCheck > 0) {
				slowCheck -= Gdx.graphics.getDeltaTime();
				wave.get(i).changeAniFrame(0.125/2);
			}else {
				wave.get(i).changeAniFrame(0.125);
			}
		}
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
