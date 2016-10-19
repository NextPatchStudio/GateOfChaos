package com.test.game;

import java.util.ArrayList;
import java.util.List;

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
	/*
	TypingText text1, text2, text3, text4, text5;
	BitmapFont font1, font2;
	List<TypingText> list;
	
	int hight = 50, width = 50,upside = 0, numOfText, num = 0, num2 = 0;
	*/
	float elapsedTime;
	//private TextureAtlas textureAtlas;
	TextureRegion[] animationFrame1, animationFrame2;
	private Animation animation1, animation2;
	
	@Override
	public void create () {
		//textureAtlas = new TextureAtlas(Gdx.files.internal("nong_tai.png"));
		//animation = new Animation(1f/30f, textureAtlas.getRegions());
		/*
		list = new ArrayList<TypingText>();
		text1 = new TypingText();
		text1.randomNewText();
		text2 = new TypingText();
		text2.randomNewText();
		text3 = new TypingText();
		text3.randomNewText();
		text4 = new TypingText();
		text4.randomNewText();
		text5 = new TypingText();
		text5.randomNewText();
		list.add(text1);list.add(text2);list.add(text3);list.add(text4);list.add(text5);
		*/
		batch = new SpriteBatch();
		/*
		font1 = new BitmapFont();
		font2 = new BitmapFont();
	    font1.setColor(Color.ORANGE);
	    font2.setColor(Color.WHITE);
	    img = new Texture(Gdx.files.internal("zombie-0.png"));
	    */
	    imgTest1 = new Texture(Gdx.files.internal("Charactor.png"));
	    imgTest2 = new Texture(Gdx.files.internal("monster.png"));
	    
	    TextureRegion[][] tmpFrames1 = TextureRegion.split(imgTest1, 180, 186);
	    TextureRegion[][] tmpFrames2 = TextureRegion.split(imgTest2, 300, 300);
	    
	    animationFrame1 = new TextureRegion[5];
	    animationFrame2 = new TextureRegion[25];
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
	    for (int i=0;i<5;i++){
	    	for (int j=0;j<5;j++) {
	    		animationFrame2[index++] = tmpFrames2[i][j];
	    	}
	    }
	    		
	    
	    animation1 = new Animation(1f/5f, animationFrame1);
	    animation2 = new Animation(1f/10f, animationFrame2);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		/*
		for (int i=0;i<list.size();i++) {
			if ((Gdx.input.isKeyJustPressed(Keys.A) && list.get(i).getFirstChar() == 'A') || 
					(Gdx.input.isKeyJustPressed(Keys.B) && list.get(i).getFirstChar() == 'B') ||
					(Gdx.input.isKeyJustPressed(Keys.C) && list.get(i).getFirstChar() == 'C') ||
					(Gdx.input.isKeyJustPressed(Keys.D) && list.get(i).getFirstChar() == 'D') ||
					(Gdx.input.isKeyJustPressed(Keys.E) && list.get(i).getFirstChar() == 'E') ||
					(Gdx.input.isKeyJustPressed(Keys.F) && list.get(i).getFirstChar() == 'F') ||
					(Gdx.input.isKeyJustPressed(Keys.G) && list.get(i).getFirstChar() == 'G') ||
					(Gdx.input.isKeyJustPressed(Keys.H) && list.get(i).getFirstChar() == 'H') ||
					(Gdx.input.isKeyJustPressed(Keys.I) && list.get(i).getFirstChar() == 'I') ||
					(Gdx.input.isKeyJustPressed(Keys.J) && list.get(i).getFirstChar() == 'J') ||
					(Gdx.input.isKeyJustPressed(Keys.K) && list.get(i).getFirstChar() == 'K') ||
					(Gdx.input.isKeyJustPressed(Keys.L) && list.get(i).getFirstChar() == 'L') ||
					(Gdx.input.isKeyJustPressed(Keys.M) && list.get(i).getFirstChar() == 'M') ||
					(Gdx.input.isKeyJustPressed(Keys.N) && list.get(i).getFirstChar() == 'N') ||
					(Gdx.input.isKeyJustPressed(Keys.O) && list.get(i).getFirstChar() == 'O') ||
					(Gdx.input.isKeyJustPressed(Keys.P) && list.get(i).getFirstChar() == 'P') ||
					(Gdx.input.isKeyJustPressed(Keys.Q) && list.get(i).getFirstChar() == 'Q') ||
					(Gdx.input.isKeyJustPressed(Keys.R) && list.get(i).getFirstChar() == 'R') ||
					(Gdx.input.isKeyJustPressed(Keys.S) && list.get(i).getFirstChar() == 'S') ||
					(Gdx.input.isKeyJustPressed(Keys.T) && list.get(i).getFirstChar() == 'T') ||
					(Gdx.input.isKeyJustPressed(Keys.U) && list.get(i).getFirstChar() == 'U') ||
					(Gdx.input.isKeyJustPressed(Keys.V) && list.get(i).getFirstChar() == 'V') ||
					(Gdx.input.isKeyJustPressed(Keys.W) && list.get(i).getFirstChar() == 'W') ||
					(Gdx.input.isKeyJustPressed(Keys.X) && list.get(i).getFirstChar() == 'X') ||
					(Gdx.input.isKeyJustPressed(Keys.Y) && list.get(i).getFirstChar() == 'Y') ||
					(Gdx.input.isKeyJustPressed(Keys.Z) && list.get(i).getFirstChar() == 'Z')) {
				list.get(i).correctType();
			} else if ((Gdx.input.isKeyJustPressed(Keys.A) && list.get(i).getFirstChar() != 'A') || 
					(Gdx.input.isKeyJustPressed(Keys.B) && list.get(i).getFirstChar() != 'B') ||
					(Gdx.input.isKeyJustPressed(Keys.C) && list.get(i).getFirstChar() != 'C') ||
					(Gdx.input.isKeyJustPressed(Keys.D) && list.get(i).getFirstChar() != 'D') ||
					(Gdx.input.isKeyJustPressed(Keys.E) && list.get(i).getFirstChar() != 'E') ||
					(Gdx.input.isKeyJustPressed(Keys.F) && list.get(i).getFirstChar() != 'F') ||
					(Gdx.input.isKeyJustPressed(Keys.G) && list.get(i).getFirstChar() != 'G') ||
					(Gdx.input.isKeyJustPressed(Keys.H) && list.get(i).getFirstChar() != 'H') ||
					(Gdx.input.isKeyJustPressed(Keys.I) && list.get(i).getFirstChar() != 'I') ||
					(Gdx.input.isKeyJustPressed(Keys.J) && list.get(i).getFirstChar() != 'J') ||
					(Gdx.input.isKeyJustPressed(Keys.K) && list.get(i).getFirstChar() != 'K') ||
					(Gdx.input.isKeyJustPressed(Keys.L) && list.get(i).getFirstChar() != 'L') ||
					(Gdx.input.isKeyJustPressed(Keys.M) && list.get(i).getFirstChar() != 'M') ||
					(Gdx.input.isKeyJustPressed(Keys.N) && list.get(i).getFirstChar() != 'N') ||
					(Gdx.input.isKeyJustPressed(Keys.O) && list.get(i).getFirstChar() != 'O') ||
					(Gdx.input.isKeyJustPressed(Keys.P) && list.get(i).getFirstChar() != 'P') ||
					(Gdx.input.isKeyJustPressed(Keys.Q) && list.get(i).getFirstChar() != 'Q') ||
					(Gdx.input.isKeyJustPressed(Keys.R) && list.get(i).getFirstChar() != 'R') ||
					(Gdx.input.isKeyJustPressed(Keys.S) && list.get(i).getFirstChar() != 'S') ||
					(Gdx.input.isKeyJustPressed(Keys.T) && list.get(i).getFirstChar() != 'T') ||
					(Gdx.input.isKeyJustPressed(Keys.U) && list.get(i).getFirstChar() != 'U') ||
					(Gdx.input.isKeyJustPressed(Keys.V) && list.get(i).getFirstChar() != 'V') ||
					(Gdx.input.isKeyJustPressed(Keys.W) && list.get(i).getFirstChar() != 'W') ||
					(Gdx.input.isKeyJustPressed(Keys.X) && list.get(i).getFirstChar() != 'X') ||
					(Gdx.input.isKeyJustPressed(Keys.Y) && list.get(i).getFirstChar() != 'Y') ||
					(Gdx.input.isKeyJustPressed(Keys.Z) && list.get(i).getFirstChar() != 'Z')) {
				list.get(i).incorrectType();
			}
			list.get(i).movingX(-1);
			int hhhhh1 = 605, hhhhh2 = 494, hhhhh3 = 383, hhhhh4 = 272, hhhhh5 = 161;
			list.get(0).setTextYPosition(hhhhh1);
			list.get(0).setImgYPosition(hhhhh1-120);
			list.get(1).setTextYPosition(hhhhh2);
			list.get(1).setImgYPosition(hhhhh2-120);
			list.get(2).setTextYPosition(hhhhh3);
			list.get(2).setImgYPosition(hhhhh3-120);
			list.get(3).setTextYPosition(hhhhh4);
			list.get(3).setImgYPosition(hhhhh4-120);
			list.get(4).setTextYPosition(hhhhh5);
			list.get(4).setImgYPosition(hhhhh5-120);
			//batch.draw(img, list.get(i).getImgXPosition(), list.get(i).getImgYPosition());
			//font1.draw(batch, list.get(i).getTypedText(), list.get(i).getTextXPosition(), list.get(i).getTextYPosition());
			//font2.draw(batch, list.get(i).getText(), list.get(i).getTextXPosition()+list.get(i).getTypedTextLarge(), list.get(i).getTextYPosition());
			if (list.get(i).isFinish() || list.get(i).getTextXPosition() <= 0) {
				list.get(i).randomNewText();
			}
		}
		*/
		//batch.draw(img2, 30, 324);
		elapsedTime += Gdx.graphics.getDeltaTime();
		batch.draw(animation1.getKeyFrame(elapsedTime, true), 200, 200);
		batch.draw(animation2.getKeyFrame(elapsedTime, true), 400, 200);
		batch.end();
		/*
		num++;
		if (num == 10) {
			num = 0;
			num2++;
			if (num2 > 7) {
				num2 = 0;
			}
		}
		img = new Texture(Gdx.files.internal("zombie-" + Integer.toString(num2) + ".png"));
		*/
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
