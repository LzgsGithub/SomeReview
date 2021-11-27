package com.qst.chapter05.exercise02;

public class BoxDemo {
	public static void main(String[] args) {
		Box box = new Box();
		Fruit apple = new Apple(0.5, "红色");
		Orange orange = new Orange(0.1, "橘黄色");
		Fruit pear = new Fruit();
		pear = new Pear(0.3, "白色");
		box.addFruit(apple);
		box.addFruit(orange);
		box.addFruit(pear);
		System.out.println("水果入箱后，箱子中的水果情况：");
		box.showBox();
		
		if(box.getFruit(apple)!=null){
			System.out.println("取出水果："+apple);
		}else{
			System.out.println("取不到你要的水果！");
		}
		System.out.println("----------------------------------------");
		System.out.println("取完水果后，水果箱子中剩余情况：");
		box.showBox();
	}
}
