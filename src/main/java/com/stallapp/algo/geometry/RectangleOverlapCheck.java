package com.stallapp.algo.geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * Programming Challenge Description:
Define and implement a function which takes an input of two rectangles A and B and 
returns a boolean value which indicates if the two rectangles overlap or not 
(i.e. it should return 'true' if they overlap and ‘false’ otherwise).
Both input rectangles should be defined as 4 integers 
each where the first two integers are representing the 'x' and 'y' coordinates of the lower
 left point followed by two integers which represent the 'width' and 'height' of the rectangle. 
The rectangles are considered overlapping if they have at least one common point.


Input:
Wrap your function defined and implemented above into a program which should read 
a line from standard input and write the result on the standard output. 
Your program should read from standard input 8 integers separated by spaces. 
The first four will be the definition of rectangle A and the second four will 
be the definition of rectangle B (both as per the definition in the 
description - i.e. 'x', 'y', 'width' and 'height').


Output:
For each line in the input parse the inputs into the rectangles, invoke the function defined in
the description and then print a line to standard output with the result as a string
 (i.e. print 'true' if A and B intersect and 'false' otherwise)
 
 
 1 1 1 1 -1 -1 3 3  true
 
 1 1 1 1 -1 -1 3 1  false
 
 1 1 1 1 -1 -1 2 1  false
 
 0 0 1 1 -1 -1 1 1  true
 
 
 */



//SOLUTION is based on http://www.geeksforgeeks.org/find-two-rectangles-overlap/
public class RectangleOverlapCheck {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		try {
			while ((s = in.readLine()) != null) {
				String[] input = s.trim().split("\\s");
				if (input.length != 8) {
					throw new RuntimeException("Invalid input format.");
				}

				int rect1X = Integer.valueOf(input[0]);
				int rect1Y = Integer.valueOf(input[1]);
				int rect1Width = Integer.valueOf(input[2]);
				int rect1Height = Integer.valueOf(input[3]);
				
				
				Point rect1LowerLeftPoint = new Point(rect1X, rect1Y);
				
				Point rect1UpperLeftPoint = getUpperLeftCornerPoint(rect1LowerLeftPoint,rect1Height);
				Point rect1LowerRightPoint = getLowerRightCornerPoint(rect1LowerLeftPoint, rect1Width);
				
				int rect2X = Integer.valueOf(input[4]);
				int rect2Y = Integer.valueOf(input[5]);
				int rect2Width = Integer.valueOf(input[6]);
				int rect2Height = Integer.valueOf(input[7]);
				
				Point rect2LowerLeftPoint = new Point(rect2X, rect2Y);
				
				Point rect2UpperLeftPoint = getUpperLeftCornerPoint(rect2LowerLeftPoint,rect2Height);
				Point rect2LowerRightPoint = getLowerRightCornerPoint(rect2LowerLeftPoint, rect2Width);

				System.out.println(isOverlap(rect1UpperLeftPoint, rect1LowerRightPoint, rect2UpperLeftPoint, rect2LowerRightPoint));
				
			}
		} catch (IOException ex) {
			throw new RuntimeException("Exception while reading the input", ex);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Throwable th) {
				}
			}
		}
	}

	/*
	 * Two rectangles do not overlap if one of the following conditions is true.
			1) One rectangle is above top edge of other rectangle.
			2) One rectangle is on left side of left edge of other rectangle.
	 */
	private static boolean isOverlap(Point rect1UpperLeftPoint, Point rect1LowerRightPoint,
			Point rect2UpperLeftPoint, Point rect2LowerRightPoint) {
		
		// Check if one rectangle is left side of the other rectangle, if any pne is true then there is no overlap
		if (rect1UpperLeftPoint.getX() > rect2LowerRightPoint.getX() || rect2UpperLeftPoint.getX() > rect1LowerRightPoint.getX())
			return false;
		
		// Check if one rectangle is above top edge of the other rectangle. if any pne is true then there is no overlap
		if (rect1UpperLeftPoint.getY() < rect2LowerRightPoint.getY() || rect2UpperLeftPoint.getY() < rect1LowerRightPoint.getY()) 
			return false;
			
		// So it overlaps	
		return true;
	}
	
/*	
	private static boolean isIntersects(Point rect1UpperLeftPoint, int rect1Width, int rect1Height,
			Point rect2UpperLeftPoint, int rect2Width, int rect2Height) {
		Rectangle rect1 = new Rectangle(rect1UpperLeftPoint.getX(), rect1UpperLeftPoint.getY(), rect1Width, rect1Height);
		Rectangle rect2 = new Rectangle(rect2UpperLeftPoint.getX(), rect2UpperLeftPoint.getY(), rect2Width, rect2Height);
		
		return rect1.intersects(rect2);
	}*/
	
	
	private static Point getUpperLeftCornerPoint(Point lowerLeftPoint, int height) {
		Point point = new Point();
		point.setX(lowerLeftPoint.getX());
		point.setY(lowerLeftPoint.getY() + height);  
		return point;
	}
	
	private static Point getLowerRightCornerPoint(Point lowerLeftPoint, int width) {
		Point point = new Point();
		point.setX(lowerLeftPoint.getX() + width);
		point.setY(lowerLeftPoint.getY());
		return point;
	}
	
	private static class Point {

		private int x;
		private int y;

		public Point() {}
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

	}

	
}
