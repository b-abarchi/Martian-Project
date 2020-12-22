package prob2;

import java.util.ArrayList;

public class MartianManagerTest {

	public static void main(String[] args) {
		addMartian_Red_Success();
		addMartian_Green_Success();
		addMartian_RedGreen_Failure();
	    addMartian_GreenRed_Failure();
	    testContains_Success();
	    testContains_Failure();
	    testGetMartianAt_ValidIndex();
	    testGetMartianAt_InvalidIndex_Low();
	    testGetMartianAt_InvalidIndex_High();
	    testGetMartianClosestTo_Index_LowerMatch();
	    testGetMartianClosestTo_Index_HigherMatch();
	    testGetMartianClosestTo_Martian_LowerMatch();
	    testGetMartianWithId_Success();
	    testGetMartianWithId_Failure();
	    testGetSortedMartians();
	    testGetTeleporterAt_ValidIndex();
	    testGetTeleporterAt_InvalidIndex_Low();
	    testGetTeleporterAt_InvalidIndex_high();
	    testGroupSpeak();
	    testGroupTeleport() ;
	    testObliterateTeleporters_One();
	    testObliterateTeleporters_Many();
	    testRemoveMartianWithId_Success_Red();
	    testRemoveMartianWithId_Success_Green();
	    testRemoveMartianWithId_Success_Failure();
	    testToString();
	    testBattle_Small();
	    testBattle_Larger();
	}
	//add a red and verify only one martian, and no teleporters.
	public static void addMartian_Red_Success() {
		MartianManager manager = new MartianManager();
		System.out.println("-->addMartian_Red_Success()");
		RedMartian r = new RedMartian(1,3,2);
		boolean t = manager.addMartian(r);
		System.out.println("expected= true, size Martian= 1\nactual=" + t + ", size Martian: " + manager.getNumMartians());
		System.out.println("---------------------------");
	}
	//add a green and verify only one martian, and one teleporter.
		public static void addMartian_Green_Success() {
			MartianManager manager = new MartianManager();
			System.out.println("-->addMartian_Green_Success())");
			GreenMartian r = new GreenMartian(2,3);
			boolean t = manager.addMartian(r);
			System.out.println("expected= true, size Martian= 1 , size Teleporters= 1\nactual=" + t + ", size Martian: " + manager.getNumMartians() + ", size Teleporters=" + manager.getNumTeleporters());
			System.out.println("---------------------------");
		}
		//add a red, add a green with same id,  and verify only one martian, and no teleporters.
		public static void addMartian_RedGreen_Failure() {
			MartianManager manager = new MartianManager();
			System.out.println("-->addMartian_RedGreen_Failure()");
			RedMartian r = new RedMartian(2,3,2);
			GreenMartian g = new GreenMartian(2,3);
			boolean r1 = manager.addMartian(r);
			boolean g1 = manager.addMartian(g);
			System.out.println("expected= true (for Red Martian), false(for Green Martian), size Martian= 1 , size Teleporters= 0\nactual=" + r1 + ", " + g1 + ", size Martian: " + manager.getNumMartians() + ", size Teleporters=" + manager.getNumTeleporters());
			System.out.println("--------------------------------------------------------------------------------------------------");
		}
		//add a red, add a green with same id,  and verify only one martian, and no teleporters.
		public static void addMartian_GreenRed_Failure() {
			MartianManager manager = new MartianManager();
			System.out.println("-->addMartian_GreenRed_Failure()");
			RedMartian r = new RedMartian(2,3,2);
			GreenMartian g = new GreenMartian(2,3);
			boolean g1 = manager.addMartian(g);
			boolean r1 = manager.addMartian(r);
			System.out.println("expected= true (for Green Martian), false(for Red Martian), size Martian= 1 , size Teleporters= 1\nactual=" + g1 + ", " + r1 + ", size Martian: " + manager.getNumMartians() + ", size Teleporters=" + manager.getNumTeleporters());
			System.out.println("--------------------------------------------------------------------------------------------------");
				}		
		//add a few, then ask if it contains a martian (red or green) with an id that exists id = 1.
		public static void testContains_Success(){
			MartianManager manager = new MartianManager();
			System.out.println("-->testContains_Success()");
			RedMartian r = new RedMartian(1,3,9);
			GreenMartian g = new GreenMartian(2,78);
			manager.addMartian(r);
		    manager.addMartian(g);
			boolean c = manager.contains(1);
			System.out.println("expected= true \nactual=" + c);
			System.out.println("-----------------------------");
		}
		//add a few, then ask if it contains a martian (red or green) with an id that does not exists id = 0.
		public static void testContains_Failure(){
			MartianManager manager = new MartianManager();
			System.out.println("-->testContains_Failure()");
			RedMartian r = new RedMartian(1,3,9);
			GreenMartian g = new GreenMartian(2,7);
			manager.addMartian(r);
		    manager.addMartian(g);
			boolean c = manager.contains(0);
			System.out.println("expected= false \nactual=" + c);
			System.out.println("-----------------------------");
				}
		//adding 4 martians, the call method with a valid index.
		public static void testGetMartianAt_ValidIndex() {
			MartianManager manager = new MartianManager();
			System.out.println("-->testGetMartianAt_ValidIndex()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(2,3,9);
			GreenMartian g = new GreenMartian(3,7);
			GreenMartian g2 = new GreenMartian(4,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
			Martian c = manager.getMartianAt(2);
			System.out.println("expected= GreenMartian - id = 3, vol=7 \nactual=" + c);
			System.out.println("-----------------------------");
				}
		//adding 4 martians, the call method with a invalid index negative.
		public static void testGetMartianAt_InvalidIndex_Low() {
			MartianManager manager = new MartianManager();
			System.out.println("-->testGetMartianAt_InvalidIndex_Low()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(2,3,9);
			GreenMartian g = new GreenMartian(3,7);
			GreenMartian g2 = new GreenMartian(4,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
			Martian c = manager.getMartianAt(-1);
			System.out.println("expected= null\nactual=" + c);
			System.out.println("-----------------------------");
						}
        //adding 4 martians, the call method with a invalid index high out of bound (4).
		public static void testGetMartianAt_InvalidIndex_High() {
			MartianManager manager = new MartianManager();
			System.out.println("-->testGetMartianAt_InvalidIndex_High()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(2,3,9);
			GreenMartian g = new GreenMartian(3,7);
			GreenMartian g2 = new GreenMartian(4,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
			Martian c = manager.getMartianAt(4);
			System.out.println("expected= null\nactual=" + c);
			System.out.println("-----------------------------");
						}		
        //add 2 reds and 2 greens with id’s like: 1, 3, 8, 13. 
		//Then call method with id=4, expect to find martian with id=3
		public static void testGetMartianClosestTo_Index_LowerMatch()  {
			MartianManager manager = new MartianManager();
			System.out.println("-->testGetMartianClosestTo_Index_LowerMatch()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(3,3,9);
			GreenMartian g = new GreenMartian(8,7);
			GreenMartian g2 = new GreenMartian(13,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
			Martian c = manager.getMartianClosestTo(4);
			System.out.println("expected= Red Martian - id=3, vol=3, ten=9\nactual=" + c);
			System.out.println("-----------------------------");
								}		
		//add 2 reds and 2 greens with id’s like: 1, 3, 8, 13. 
		//Then call method with id=6, expect to find martian with id=8
		public static void testGetMartianClosestTo_Index_HigherMatch()  {
			MartianManager manager = new MartianManager();
			System.out.println("-->testGetMartianClosestTo_Index_HigherMatch()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(3,3,9);
			GreenMartian g = new GreenMartian(8,7);
			GreenMartian g2 = new GreenMartian(13,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
			Martian c = manager.getMartianClosestTo(6);
			System.out.println("expected=Green Martian - id = 8, vol=7\nactual=" + c);
			System.out.println("------------------------------");
								}		
		
		 //add 2 reds and 2 greens with id’s like: 1, 3, 8, 13.
		//Then call method with a martian with id=6, expect to find martian with id=8. 
		public static void testGetMartianClosestTo_Martian_LowerMatch()  {
			MartianManager manager = new MartianManager();
			System.out.println("-->testGetMartianClosestTo_Martian_LowerMatch()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(3,3,9);
			GreenMartian g = new GreenMartian(8,7);
			GreenMartian g2 = new GreenMartian(13,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
			Martian c = manager.getMartianClosestTo(6);
			System.out.println("expected= Green Martian - id = 8, vol=7\nactual=" + c);
			System.out.println("-------------------------------");
								}	
		//Add 4 martians, then call with an id that exists (8).
		public static void testGetMartianWithId_Success()   {
			MartianManager manager = new MartianManager();
			System.out.println("-->testGetMartianWithId_Success()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(3,3,9);
			GreenMartian g = new GreenMartian(8,7);
			GreenMartian g2 = new GreenMartian(13,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
			Martian c = manager.getMartianWithId(8);
			System.out.println("expected= Green Martian - id = 8, vol=7\nactual=" + c);
			System.out.println("------------------------------------");
								}		
		//Add 4 martians, then call with an id that exists (5).
		public static void testGetMartianWithId_Failure()   {
			MartianManager manager = new MartianManager();
			System.out.println("-->testGetMartianWithId_Failure()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(3,3,9);
			GreenMartian g = new GreenMartian(8,7);
			GreenMartian g2 = new GreenMartian(13,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
			Martian c = manager.getMartianWithId(5);
			System.out.println("expected= Green Martian - id = 8, vol=7\nactual=" + c);
			System.out.println("------------------------------------");
								}		
		//Add 4 martians, then call with an id that exists (5).
		public static void testGetSortedMartians()   {
			MartianManager manager = new MartianManager();
			System.out.println("-->testGetSortedMartians() ");
			RedMartian r = new RedMartian(4,3,9);
			RedMartian r2 = new RedMartian(8,3,9);
			GreenMartian g = new GreenMartian(1,7);
			GreenMartian g2 = new GreenMartian(2,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
		    String msg = "Red Martian - id=4, vol=3, ten=9, Red Martian - id=8, vol=3, ten=9, Green Martian - id = 1, vol=7, Green Martian - id = 2, vol=7";
		    String msg2 = "Green Martian - id = 1, vol=7, Green Martian - id = 2, vol=7, Red Martian - id=4, vol=3, ten=9, Red Martian - id=8, vol=3, ten=9"; 
		    ArrayList<Martian> c = manager.getSortedMartians();
			System.out.println("expected martians=" +  msg  + "\n          actual=" + manager.martians);
			System.out.println("************************************");
			System.out.println("expected sorted list=" +  msg2 + "\n             actual=" + c);
			System.out.println("------------------------------------");
								}		
		
		//adding 4 Teleporters, the call method with a valid index(2).
		public static void testGetTeleporterAt_ValidIndex() {
			MartianManager manager = new MartianManager();
			System.out.println("-->testGetTeleporterAt_ValidIndex()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(2,3,9);
			GreenMartian g = new GreenMartian(3,7);
			GreenMartian g2 = new GreenMartian(4,7);
			GreenMartian g3 = new GreenMartian(7,7);
			GreenMartian g4 = new GreenMartian(9,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
		    manager.addMartian(g3);
			manager.addMartian(g4);
			Teleporter c = manager.getTeleporterAt(2);
			System.out.println("expected= GreenMartian - id = 7, vol=7 \nactual=" + c);
			System.out.println("------------------------------------");
				}
		//adding 4 Teleporters, the call method with a invalid index negative(-4).
		public static void testGetTeleporterAt_InvalidIndex_Low() {
			MartianManager manager = new MartianManager();
			System.out.println("-->testGetTeleporterAt_InvalidIndex_Low()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(2,3,9);
			GreenMartian g = new GreenMartian(3,7);
			GreenMartian g2 = new GreenMartian(4,7);
			GreenMartian g3 = new GreenMartian(7,7);
			GreenMartian g4 = new GreenMartian(9,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
		    manager.addMartian(g3);
			manager.addMartian(g4);
			Teleporter c = manager.getTeleporterAt(-2);
			System.out.println("expected= null\nactual=" + c);
			System.out.println("------------------------------------");
				}
		//adding 6 Teleporters, the call method with a invalid index out of bound(5).
		public static void testGetTeleporterAt_InvalidIndex_high() {
			MartianManager manager = new MartianManager();
			System.out.println("-->testGetTeleporterAt_InvalidIndex_high()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(2,3,9);
			GreenMartian g = new GreenMartian(3,7);
			GreenMartian g2 = new GreenMartian(4,7);
			GreenMartian g3 = new GreenMartian(7,7);
			GreenMartian g4 = new GreenMartian(9,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
		    manager.addMartian(g3);
			manager.addMartian(g4);
			Teleporter c = manager.getTeleporterAt(5);
			System.out.println("expected= null\nactual=" + c);
			System.out.println("------------------------------------");
				}
		//add 2 reds and a green and verify format of output is correct.
		public static void testGroupSpeak(){
			MartianManager manager = new MartianManager();
			System.out.println("-->testGroupSpeak()");
			RedMartian r = new RedMartian(1,3,9);
			GreenMartian g = new GreenMartian(2,78);
			manager.addMartian(r);
		    manager.addMartian(g);
			String c = manager.groupSpeak();
			System.out.println("expected= id = 1 Bartle doo\r\n" + 
					"          id = 2 Valar morgulis\n"+ " ********************" + "\nactual=" + c);
			System.out.println("-----------------------------");
		}
		//add 1 reds and and 3 greens and verify format of output is correct.
		public static void testGroupTeleport()    {
			MartianManager manager = new MartianManager();
			System.out.println("-->testGroupTeleport()");
			RedMartian r = new RedMartian(1,3,9);
			GreenMartian g1 = new GreenMartian(3,7);
			GreenMartian g = new GreenMartian(8,7);
			GreenMartian g2 = new GreenMartian(13,7);
			manager.addMartian(r);
		    manager.addMartian(g);
		    manager.addMartian(g1);
		    manager.addMartian(g2);
		    String c = manager.groupTeleport("Andromeda Galaxy");
			System.out.println("expected= id = 8 teleporting to Andromeda Galaxy\r\n" + 
					"       id = 3 teleporting to Andromeda Galaxy\r\n" + 
					"       id = 13 teleporting to Andromeda Galaxy\n" + "********************"+ "\nactual=" + c);
			System.out.println("------------------------------------");
								}		
		//add 3 including exactly 1 green
		public static void testObliterateTeleporters_One()  {
			MartianManager manager = new MartianManager();
			System.out.println("-->testObliterateTeleporters_One()");
			RedMartian r = new RedMartian(1,3,2);
			RedMartian r1= new RedMartian(4,3,9);
			RedMartian r2 = new RedMartian(2,3,9);
			GreenMartian g = new GreenMartian(8,7);
			manager.addMartian(r);
		    manager.addMartian(r1);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    System.out.println("size martians before obliterate = " + manager.getNumMartians()+ " size teleporters before obliterate = " + manager.getNumTeleporters());
			manager.obliterateTeleporters();
			System.out.println("size martians after obliterate = " + manager.getNumMartians() + " size teleporters after obliterate = " + manager.getNumTeleporters());
			System.out.println("---------------------------");
			
		}
		//add 6 including exactly 3 greens. 
		public static void testObliterateTeleporters_Many()  {
			MartianManager manager = new MartianManager();
			System.out.println("-->testObliterateTeleporters_Many()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(2,3,9);
			RedMartian r1= new RedMartian(4,3,9);
			GreenMartian g2 = new GreenMartian(8,7);
			GreenMartian g3 = new GreenMartian(7,7);
			GreenMartian g4 = new GreenMartian(9,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(r1);
		    manager.addMartian(g2);
		    manager.addMartian(g3);
			manager.addMartian(g4);
			System.out.println("size martians before obliterate = " + manager.getNumMartians()+ " size teleporters before obliterate = " + manager.getNumTeleporters());
			manager.obliterateTeleporters();
			System.out.println("size martians after obliterate = " + manager.getNumMartians() + " size teleporters after obliterate = " + manager.getNumTeleporters());
			System.out.println("---------------------------");
						}
		//Add 2 reds and 2 greens, then call with an id that exists in a red
		public static void testRemoveMartianWithId_Success_Red()   {
			MartianManager manager = new MartianManager();
			System.out.println("-->testRemoveMartianWithId_Success_Red()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(3,3,9);
			GreenMartian g = new GreenMartian(8,7);
			GreenMartian g2 = new GreenMartian(13,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
			Martian c = manager.getMartianWithId(3);
			System.out.println("expected=Red Martian - id=3, vol=3, ten=9\nactual=" + c);
			System.out.println("------------------------------------");}
		//Add 2 reds and 2 greens, then call with an id that exists in a green
		public static void testRemoveMartianWithId_Success_Green()   {
			MartianManager manager = new MartianManager();
			System.out.println("-->testRemoveMartianWithId_Success_Green()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(3,3,9);
			GreenMartian g = new GreenMartian(8,7);
			GreenMartian g2 = new GreenMartian(13,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
			Martian c = manager.getMartianWithId(13);
			System.out.println("expected=Green Martian - id = 13, vol=7\nactual=" + c);
			System.out.println("------------------------------------");}
		//Add 2 reds and 2 greens, then call with an id that exists in a green
		public static void testRemoveMartianWithId_Success_Failure()   {
			MartianManager manager = new MartianManager();
			System.out.println("-->testRemoveMartianWithId_Success_Failure()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(3,3,9);
			GreenMartian g = new GreenMartian(8,7);
			GreenMartian g2 = new GreenMartian(13,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
			Martian c = manager.getMartianWithId(47);
			System.out.println("expected=null\nactual=" + c);
			System.out.println("------------------------------------");}
		//Add 2 reds and 2 greens, then call with an id that exists in a green
		public static void testToString()  {
			MartianManager manager = new MartianManager();
			System.out.println("-->testToString()");
			RedMartian r = new RedMartian(1,3,9);
			RedMartian r2 = new RedMartian(3,3,9);
			GreenMartian g = new GreenMartian(8,7);
			GreenMartian g2 = new GreenMartian(13,7);
			manager.addMartian(r);
		    manager.addMartian(r2);
		    manager.addMartian(g);
		    manager.addMartian(g2);
			System.out.println(manager);
			System.out.println("------------------------------------");}
		//g3 kills r2 but not r
		public static void testBattle_Small()  {
			MartianManager manager = new MartianManager();
			ArrayList<Martian> invaders = new ArrayList<>();
			ArrayList<Martian> kill = new ArrayList<>();
			System.out.println("-->testBattle_Small()");
			RedMartian r = new RedMartian(1,5,6);// power 11
			RedMartian r2 = new RedMartian(4,3,2);// power 5
			GreenMartian g3 = new GreenMartian(5,10);// power 10
			manager.addMartian(r);
			manager.addMartian(r2);
		    invaders.add(g3);
		    kill = manager.battle(invaders);
		    System.out.println("Martian killed");
			System.out.println(kill);
			System.out.println("------------------------------------");}
		// g kills r, g2 does not kill r2, but g2 kills g3
		public static void testBattle_Larger()  {
			MartianManager manager = new MartianManager();
			ArrayList<Martian> invaders = new ArrayList<>();
			ArrayList<Martian> kill = new ArrayList<>();
			System.out.println("-->testBattle_Larger()");
			RedMartian r = new RedMartian(1,1,9);//power 10
			RedMartian r2 = new RedMartian(3,20,2);//power 22
			GreenMartian g3 = new GreenMartian(5,3); //power 3
			GreenMartian g = new GreenMartian(1,19);// power 19
     		GreenMartian g2 = new GreenMartian(2,20);//power 20
			manager.addMartian(r);
			manager.addMartian(r2);
			manager.addMartian(g3);
		    invaders.add(g);
		    invaders.add(g2);

		    kill = manager.battle(invaders);
		    System.out.println("Martian killed");
			System.out.println(kill);
			System.out.println("------------------------------------");}
		
		

}
