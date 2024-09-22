package com.systex.hw3;

import java.util.Random;

public class GuessGame {
	 private int remains;
	 private int luckyNumber;
	 private int range;
	 
	 public GuessGame(int range, int remains) {
	        this.range = range;
	        this.remains = remains;
	        this.luckyNumber = new Random().nextInt(range) + 1;
	    }

	    public boolean guess(int number) {
	        remains--;
	        if(number==luckyNumber) {
	        	return true;
	        }else {
	        	return false;
	        }
	    }

	    public int getRemains() {
	        return remains;
	    }

	    public int getLuckyNumber() {
	        return luckyNumber;
	    }
}	
