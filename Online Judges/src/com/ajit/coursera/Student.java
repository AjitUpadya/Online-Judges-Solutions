package com.ajit.coursera;

import java.util.Comparator;

public class Student {
	public static final Comparator<Student> BY_NAME = new ByName();
	public static final Comparator<Student> BY_SECTION = new BySection();
	
	private String name;
	private int section;
	
	private static class ByName implements Comparator<Student> {
		public int compare(Student v, Student w) {
			return v.name.compareTo(w.name);
		}
	}
	
	private static class BySection implements Comparator<Student> {
		public int compare(Student v, Student w) {
			return v.section - w.section;
		}
	}
}
