package com.test.game;

import java.util.ArrayList;
import java.util.Random;

public class TypingText {
	
	private String[] textList = {"ANT", "BOOK", "CARD", "HOTDOG", "GUN", "POKER", "FISH", "CHAIR"};
	private String text = "", typedText = "", backUpText = "";
	private final int[] chaLarge = {9, 10, 11, 11, 10, 9, 11, 11, 3, 7, 10,
			8, 12, 11, 11, 10, 11, 11, 10, 9, 11, 9, 15, 9, 9, 9};
	private int xPosition = 0, yPosition = 0, typedTextLarge = 0;
	
	public int getTypedTextLarge() {
		return typedTextLarge;
	}
	public void setTypedTextLarge(int typeTextLarge) {
		this.typedTextLarge = typeTextLarge;
	}
	public String getBackUpText() {
		return backUpText;
	}
	public void setBackUpText(String backUpText) {
		this.backUpText = backUpText;
	}
	public int getxPosition() {
		return xPosition;
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}
	public int getyPosition() {
		return yPosition;
	}
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	public String getTypedText() {
		return typedText;
	}
	public void setTypedText(String typedText) {
		this.typedText = typedText;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String[] getTextList() {
		return textList;
	}
	public void setTextList(String[] textList) {
		this.textList = textList;
	}
	public void randomNewText() {
		Random ran = new Random();
		do {
			int index = ran.nextInt(textList.length), xPos = ran.nextInt(850);
			text = textList[index];
			xPosition =  xPos + 50;
		} while (text == backUpText);
		backUpText = text;
		typedText = "";
		typedTextLarge = 0;
		
		yPosition = 20;
	}
	public void correctType() {
		ArrayList<String> list = new ArrayList<String>();
		for (char cha: text.toCharArray()){
			String s = "" + cha;
			list.add(s);
		}
		typedText += list.get(0);
		typedTextLarge += chaLarge[(int) list.get(0).charAt(0) - 65];
		list.remove(0);
		String remainingText = "";
		for (String s : list)
		{
			remainingText += s;
		}
		text = remainingText;
	}
	public void incorrectType() {
		text = backUpText;
		typedText = "";
		typedTextLarge = 0;
	}
	public char getFirstChar() {
		char[] cha = text.toCharArray();
		return cha[0];
	}
	public Boolean isFinish() {
		if (text == "") {
			return true;
		} else {
			return false;
		}
	}
	public void movingY(int num) {
		yPosition += num;
	}
}
