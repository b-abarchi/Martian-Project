package prob2;
import java.util.ArrayList;
import java.util.Collections;


public class MartianManager extends Object implements Comparable<Martian> {
	protected ArrayList<Martian> martians = new ArrayList<>();
	protected ArrayList<Teleporter> teleporters = new ArrayList<>();
	public MartianManager() {
	}
	
	public int getNumMartians() {
		return martians.size();
	}

	public int getNumTeleporters() {
		return teleporters.size();
		
	}

	public boolean addMartian(Martian m) {
		if (!this.martians.contains(m)) {
			martians.add(m);
			if(m instanceof Teleporter) {
				teleporters.add((Teleporter)m);}
			return true;
		}
		return false;
	}
	public boolean contains(int id) {
		Martian m = new GreenMartian(id);
		if(martians.contains(m)) {
			return true;
		}
		return false;
	}
	public Martian getMartianAt(int i) {
		if(i>= 0 && i < martians.size()) {
			return martians.get(i);
		}
		return null;
	}
	public Martian getMartianClosestTo(int id) {
		Martian m = new GreenMartian(id);
		ArrayList<Integer> test = new ArrayList<>();
		int pos = 0;
		if(martians.contains(m)) {
			pos = martians.indexOf(m);
		return martians.get(pos);	
		};
		if(!martians.contains(m)) {
			for(Martian t: martians) {
				int diff = Math.abs(t.id - m.id);
				test.add(diff);
			}
			Collections.sort(test);
			for(Martian v: martians){
			if(Math.abs(v.id - m.id) == test.get(0)) {
				return v;
			}}
		}
		return null;
	}
	public Martian getMartianClosestTo(Martian m) {
		return getMartianClosestTo(m.id);
		
	}
	public Martian getMartianWithId(int id) {
		Martian m = new GreenMartian(id);
		int pos = 0;
		if(martians.contains(m)) {
			pos = martians.indexOf(m);
		return martians.get(pos);	
	}
	return null;	
	}
	public ArrayList<Martian> getSortedMartians(){
		ArrayList<Martian> list = new ArrayList<>();
		list.addAll(martians);
		Collections.sort(list);
		return list;
	}
	public Teleporter getTeleporterAt(int i) {
		if(i>= 0 && i < teleporters.size()) {
			return teleporters.get(i);
		}
		return null;
	}
	public String groupSpeak() {
		String speak = "";
		for(Martian m : martians) {
			speak += m.speak() + "\n       ";
	}
		return speak;}
	public String groupTeleport(String dest) {
		String teleport = "";
		for(Teleporter t: teleporters) {
			teleport += t.teleport(dest) + "\n       "; 
		}
		return teleport;
	}
	public void obliterateTeleporters() {

	 	for(Teleporter t: teleporters) {
	 		if (t instanceof GreenMartian) {
	 			martians.remove(t);
	 		}
	 	}
	  	teleporters.clear();
	}
	public Martian removeMartian(int id) {
		Martian m = new GreenMartian(id);
		if(martians.contains(m)) {
			martians.remove(m);
	 		if (m instanceof GreenMartian) {
	 			teleporters.remove(m);
	 		}
	 		return m;}
	return null;}
	private int getPower(Martian m) {
		int power = 0;
		if(m instanceof RedMartian) {
			power = m.getVolume()+ ((RedMartian)m).getTenacity();
		
		}
		return power;
	}
	public ArrayList<Martian> battle(ArrayList<Martian> invaders){
		ArrayList<Martian> killed = new ArrayList<>();
		ArrayList<Martian> list = new ArrayList<>();
		list.addAll(martians);
		int pos=0;
				for(Martian i: invaders) {
  innerLoop:	 for(Martian m: list) {		
					if(m instanceof GreenMartian) {
						if(i.getVolume()> m.getVolume()  && martians.contains(m)) {
							pos = martians.indexOf(m);
							killed.add(martians.get(pos));
							martians.remove(pos);
							teleporters.remove(m);
							break innerLoop;
			}
					
			}
					if(m instanceof RedMartian) {
						if(i.getVolume()> getPower(m) && martians.contains(m)) {
							pos = martians.indexOf(m);
							killed.add(martians.get(pos));
							martians.remove(pos);
							break innerLoop;
					}
				}
				}
			
		}
		return killed;}
	@Override
	public String toString() {
		String msg = "Martians:";
			msg +=  martians.toString();
		
		String msg2 = "\n\nTeleporters:";
			msg2 += teleporters.toString();
	
		return msg+msg2;
	} 

	@Override
	public int compareTo(Martian o) {
		return 0;
	}
	}
