package cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.revature.car.Car;

public class carSelectionOption {

		private static Scanner sc = new Scanner(System.in);
		private static List<Sport> carList= new ArrayList<Sport>();
		
		public static void main(String[] args) {

			
			menu();
		}

		private static void menu() {
			System.out.println("---------------------------------------");
			System.out.println("---------------------------------------");
			System.out.println("Select what option would you like:");
			System.out.println("1:Sport Cars, 2:Luxury Cars, 3:MPG, 4:new Sport Car, 5:exit");
			System.out.println("---------------------------------------");
			int userOption = sc.nextInt();
			switch(userOption) {
			case 1:
				carExample(new Sport());
				break;
			case 2:
				carExample(new Luxury());
				break;
			case 3:
				milePerGalon();
				break;
			case 4:
				addCar();
				break;
			case 5:
				System.exit(0);
				break;
			}
			menu();
		}
		


		private static void milePerGalon() {
			// TODO Auto-generated method stub
			
		}

		private static void addCar() {
			try {
				System.out.println("Enter Make:");
				String name = sc.next();
				System.out.println("Enter color:");
				String color = sc.next();
				System.out.println("Enter MPG:");
				int mpg = sc.nextInt();
				
				carList.add(new Sport(name, color, true));
			} catch (NegativeSpeedException e) {
				System.out.println("Cannot have negative MPG!");
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println("Mysterious problems -- exiting!");
				System.exit(1);
			}
			System.out.println("Success! ");
			
		}

		private static void carExample(Sport sport) {
			// TODO Auto-generated method stub
			
		}

		private static void carExample(Luxury luxury) {
			// TODO Auto-generated method stub
			
		}

	
		private static void addNewCar() {
			
		} 

	}
