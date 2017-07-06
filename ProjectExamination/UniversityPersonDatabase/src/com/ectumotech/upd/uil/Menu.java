package com.ectumotech.upd.uil;

public class Menu{
	MenuOption[] options;
	
	public Menu(MenuOption ...op){
		options = new MenuOption[op.length];
		int j = 0;
		for(MenuOption i : op) {
			options[j] = i;
			j++;
		}
	}
	
	public void show() {
		for(MenuOption i: options) {
			i.showOption();
		}	
	}
	
	public void add(MenuOption option) {
		int length = options.length+1;
		int j = 0;
		MenuOption [] add = new MenuOption[length];
		for(MenuOption i: options) {
			add[j] =i;
			j++;
 		}
		add[length-1] = option;
		options = add;
	}
}
