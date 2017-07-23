package com.designpattern.composite.main;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	
	String name;

	private List<Component> componentList = new ArrayList<>();;

	public void addComponent(Component component){
		componentList.add(component);
	}
	
	public void removeComponent(Component component){
		componentList.remove(component);
	}
	
	@Override
	public void showPrice() {
		System.out.println(name);
		for (Component component : componentList) {
				component.showPrice();
		}
	}

	/**
	 * @param name
	 */
	public Composite(String name) {
		super();
		this.name = name;
	}

}
