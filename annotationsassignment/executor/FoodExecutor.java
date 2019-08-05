package executor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import annotations.Food;
import annotations.Time;
import fooditem.Pizza;
import fooditem.Burger;
import fooditem.FoodInterface;

public class FoodExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<FoodInterface> foods = new ArrayList<FoodInterface>();

		Pizza p = new Pizza();
		Burger b = new Burger();
		foods.add(p);
		foods.add(b);
		performAction(foods);
	}

	// method for displaying annotations
	public static void performAction(List<FoodInterface> food) {
		for (FoodInterface p : food) {
			// get the class type
			Class c = p.getClass();

			// Create the annotations object
			Annotation annotation = c.getAnnotation(Food.class);
			Food foods = (Food) annotation;
			System.out.println("Food Name : " + foods.name());
			System.out.println("Price : " + foods.price());

			Method m = null;
			try {
				m = c.getMethod("getPrepareTime");
			} catch (NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			annotation = m.getAnnotation(Time.class);
			Time t1 = (Time) annotation;

			System.out.println("Prepare time:" + t1.time());

			try {
				m = c.getMethod("getCookTime");
			} catch (NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			annotation = m.getAnnotation(Time.class);
			t1 = (Time) annotation;

			System.out.println("Cook time:" + t1.time());

			try {
				m = c.getMethod("getSendTime");
			} catch (NoSuchMethodException | SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			annotation = m.getAnnotation(Time.class);
			t1 = (Time) annotation;

			System.out.println("Send time:" + t1.time());
			// TODO Auto-generated method stub
			System.out.println();
			System.out.println();
		}

	}

}
