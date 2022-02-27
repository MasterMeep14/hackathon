// Zarak Tareen
// 8.15.21
// CSE 142 Section AC
// TA: Drew Nguyen
// A class to represent a Husky (my own critter)
//The husky is always black, and always eats
//if the opponent is a %, it roars, otherwise it pounces, else it scratches
// the movement and toString are similar to bird/vulture, but 
// the circle is smaller, and the toString characters are different
// and my original ones.
import java.util.*;
import java.awt.*;

public class Husky extends Critter{
	int count; // I decleare an int count for my movement and toString

	public Husky(){	
		count = 0; //Set it to 0
    }

	//The husky is always BLACK
	//you return the color black no matter what
	public Color getColor() {
		return Color.BLACK;
	}

	//you always eat, so you always return tru
	public boolean eat() {
		return true;
	}

	//If the opponent is a %, then you return Attack.roar
	//else, you return attack.SCRATCH
	//You take in the parameter String opponent
	public Attack fight(String opponent) {
		if(opponent.equals("%")){
			return Attack.ROAR;
		}
		return Attack.SCRATCH;
	}

	// similar to how bird and vulture move, this goes in a circle
	// the circle is only a 2X2 circle, which is smaller than the bird
	//here, you make the husky move in a circle, and go in a direction depending
	//on what part of the circle it's at (ex: east if it's at count = 3)
	//It resets count once the circle is completed
	public Direction getMove() {
		count++;
		if(count <=2){
			return Direction.NORTH;
		}else if(count>2 && count <=4){
			return Direction.EAST;
		}else if(count>4 && count <=6){
			return Direction.SOUTH;
		}else if(count>6 && count <=8){
			return Direction.WEST;
		}
		if(count > 8){

			count = 1;
		}
		return Direction.NORTH;
	}
	
	//similar to how movement works, this toString returns something different
	//depending on what part of the circle it's at
	//you must use an escape character for \
	//the toString it returns lines up with the movement it's at
	// Ex: if it's going north, it returns !
	public String toString(){
		if(count <=2){
			return "!";
		}else if(count>2 && count <=4){
			return "I";
		}else if(count>4 && count <=6){
			return "\\";
		}else if(count>6 && count <=8){
			return "/";
		}
		return "";
    }
}