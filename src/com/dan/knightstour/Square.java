package com.dan.knightstour;

import java.util.ArrayList;
import java.util.List;

public class Square {

	int x;
	int y;
	List<Square> adjList;
	
	public Square(int x, int y){
		this.x = x;
		this.y = y;
		adjList = new ArrayList<Square>();
	}
	
	public void addEdge(Square sq){
		if(sq != null){
			adjList.add(sq);
		}
		return;
	}
	
	public String toString(){
		return x + "," + y;
	}

	
}
