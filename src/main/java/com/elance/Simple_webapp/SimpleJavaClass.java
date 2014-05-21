/**
 * 
 */
package com.Simple_webapp;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class SimpleJavaClass.
 * 
 * @author Manoj
 */
public class SimpleJavaClass {

	/**
	 * The Constructor.
	 */
	public SimpleJavaClass() {
		// TODO Auto-generated constructor stub

	}

	/**
	 * Adds the.
	 * 
	 * @param i
	 *            the i
	 * @param j
	 *            the j
	 * @return the int
	 */
	public int add(int i, int j) {
		display("Adding : \t" + i + ",\t" + j);
		return i + j;
	}

	/**
	 * Subtract.
	 * 
	 * @param i
	 *            the i
	 * @param j
	 *            the j
	 * @return the int
	 */
	public int subtract(int i, int j) {
		display("Subtracting : \t" + i + ",\t" + j);
		return i - j;
	}

	/**
	 * Display.
	 * 
	 * @param o
	 *            the o
	 */
	public void display(Object o) {
		System.out.println(new Date() + "\t " + o);
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleJavaClass();
	}

}
