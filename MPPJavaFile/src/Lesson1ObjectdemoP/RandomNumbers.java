package Lesson1ObjectdemoP;

import java.util.*;

public class RandomNumbers {
	static Random random;

	public RandomNumbers() {
		random = new Random();
	}

	public static int getRandomInt() {
		if (random == null)
			new RandomNumbers();
		return random.nextInt();
	}

	public static int getRandomInt(int lower, int upper) {
		if (lower > upper)
			return 0;
		if (lower == upper)
			return lower;
		int diff = upper - lower;
		int start = getRandomInt();
		start = Math.abs(start) % (diff + 1);
		start += lower;
		return start;
	}

	public static void main(String[] args) {
		RandomNumbers rd = new RandomNumbers();
		System.out.println(rd.getRandomInt());
		System.out.println(rd.getRandomInt(10, 20));
	}
}
