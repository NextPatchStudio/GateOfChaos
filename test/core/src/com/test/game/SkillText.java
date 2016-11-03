package com.test.game;

import java.util.Random;

public class SkillText extends TypingText {
	private String[] textList = {"THUNDER", "FREEZE", "BOMB", "SLOW"};
	
	public void randomNewText() {
		Random ran = new Random();
		do {
			int index = ran.nextInt(textList.length), yPos = ran.nextInt(668);
			text = textList[index];
			textYPosition =  500;
			imgYPosition = textYPosition - 120;
		} while (text == backUpText);
		backUpText = text;
		typedText = "";
		typedTextLarge = 0;
		
		textXPosition = 1366;
		imgXPosition = textXPosition;
	}
}
