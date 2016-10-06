/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part
public void run(){
	fillOddColumn();
	while(frontIsClear()){
		move();
		fillEvenColumn();
		if(frontIsClear()){
			move();
			fillOddColumn();
		}
	}
}

//Pre-condition: facing East on 1st Street
//Post-condition: facing East on 1st Street with every odd avenue above filled with beeper.
private void fillOddColumn(){
	turnLeft();
	putBeeper();
	while(frontIsClear()){
		move();
		if(frontIsClear()){
			move();
			putBeeper();
		}
	}
	turnAround();
	while(frontIsClear())
		move();
	turnLeft();
}

//Pre-condition: facing East on 1st Street
//Post-condition: facing East on 1st Street with every even avenue above filled with beeper.
private void fillEvenColumn(){
	turnLeft();
	while(frontIsClear()){
		move();
		putBeeper();
		if(frontIsClear()){
			move();
		}
	}
	turnAround();
	while(frontIsClear())
		move();
	turnLeft();
}

}