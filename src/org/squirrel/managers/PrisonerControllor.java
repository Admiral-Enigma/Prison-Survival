package org.squirrel.managers;

import java.awt.Graphics2D;
import java.util.LinkedList;
import java.util.Random;

import org.squirrel.ai.Prisoner;

public class PrisonerControllor {
		static LinkedList<Prisoner> inmates = new LinkedList<Prisoner>();
		Prisoner TempPrisoner;
		Random generator = new Random(); 
		int dotX = generator.nextInt(200) - 32;
		int dotY = generator.nextInt(100) - 32;
		
		public PrisonerControllor(){
			addInmatet(new Prisoner(generator.nextInt(700) - 40 , generator.nextInt(500) - 40, "Bob Marly", false));
			addInmatet(new Prisoner(generator.nextInt(700) - 40 , generator.nextInt(500) - 40, "Sild", false));
			addInmatet(new Prisoner(generator.nextInt(700) - 40 , generator.nextInt(500) - 40, "Bob", false));
			addInmatet(new Prisoner(generator.nextInt(700) - 40 , generator.nextInt(500) - 40, "Bo", false));
			addInmatet(new Prisoner(generator.nextInt(700) - 40 , generator.nextInt(500) - 40, "John", false));
			addInmatet(new Prisoner(generator.nextInt(700) - 40 , generator.nextInt(500) - 40, "DeezNutz", false)); 

		}
		
		public void draw(Graphics2D g2d){
			try {
				for (int i = 1; i < inmates.size(); i ++){
					TempPrisoner = inmates.get(i);
					
					TempPrisoner.draw(g2d);
				}
			} catch (Exception e) {
				e.printStackTrace();			}
			
		}
		
		public void update(){
			try {
				for(int i = 0; i < inmates.size(); i++){
					TempPrisoner = inmates.get(i);
					
					TempPrisoner.update();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
		public void addInmatet(Prisoner inmate){
			inmates.add(inmate);
		}
		
		
		public void removeInmate(Prisoner inmate){
			inmates.remove(inmate);
		}
}
