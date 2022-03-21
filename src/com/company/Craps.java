package com.company;/* Play a game of craps 10000 times and compute
 * the probability of winning.
 */

public class Craps {

	public static void main(String[] args) {

		int win = 0, loss = 0;
		int ran1, ran2, sum, point;

		// main loop
		for (int i = 0; i < 10000; i++) {

			// comeout roll
			ran1 = (int) (6 * Math.random()) + 1;
			ran2 = (int) (6 * Math.random()) + 1;
			sum = ran1 + ran2;
			if (sum == 7 || sum == 11)
				win = win + 1;

			else if (sum == 2 || sum == 3 || sum == 12)
				loss = loss + 1;

			else { // try to make your point
				point = sum;

				do { // keep rolling until 7 or point
					ran1 = (int) (6 * Math.random()) + 1;
					ran2 = (int) (6 * Math.random()) + 1;
					sum = ran1 + ran2;
					if (sum == 7)
						loss = loss + 1;

					else if (sum == point)
						win = win + 1;

				} while (sum != 7 && sum != point);
			}

		}

		System.out.println("Wins = " + win);
		System.out.println("Losses = " + loss);
		System.out.printf("Probability to win = %.3f", (double) win / (win + loss));
	}
}
