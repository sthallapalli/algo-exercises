package com.stallapp.algo.geometry;

import java.util.function.BiFunction;


public class RectanglesArea {

	public static void main(String[] args) {

	}

	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {

		int areaOfSqrA = (C - A) * (D - B);
		int areaOfSqrB = (G - E) * (H - F);

		int left = calc(Math::max, A, E);
		int right = calc(Math::min, G, C);
		int bottom = calc(Math::max, F, B);
		int top = calc(Math::min, D, H);

		int overlap = (right > left && top > bottom) ? (right - left) * (top - bottom) : 0;

		return areaOfSqrA + areaOfSqrB - overlap;
	}

	private static Integer calc(BiFunction<Integer, Integer, Integer> func, Integer x, Integer y) {
		return func.apply(x, y);
	}

	private static class Point {

		private final int x;
		private final int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}
	}
}
