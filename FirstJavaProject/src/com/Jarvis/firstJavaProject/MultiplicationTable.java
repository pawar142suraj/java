package com.Jarvis.firstJavaProject;

public class MultiplicationTable {
	
	void print() {
	for(int i=1; i<=10; i++) {
		System.out.printf("%d *%d = %d\n", 5, i, 5*i);
	}
	}
	void print(int table) {
	for(int i=1; i<=10; i++) {
		System.out.printf("%d *%d = %d", table, i, table*i).println();
	}
	}
}
