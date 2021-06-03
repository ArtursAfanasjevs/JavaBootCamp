package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List list = new ArrayList();
		//2 - Call print method to print the list passed as its parameter.
		list.add("Odin");
		list.add("Tri");
		list.add("Dva");
		list.add("5");
		list.add("4");
		list.add("6");

		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

	{
		//3 - Type code to print this list
		Iterator i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		//Notice the order in which elements get printed.
	
	}
}
