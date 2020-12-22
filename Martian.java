package prob2;

public  abstract class Martian extends Object implements Comparable<Martian> {
	 int id;
	private int volume;
	public Martian(int id, int volume) {
		super();
		this.id = id;
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getId() {
		return id;
	}
	public int compareTo(Martian m) {
		double diff = this.id - m.id;
		if(diff < 0) {
			return -1;
		}
		else if(diff > 0) {
		
			return 1;
		}
		
		else {
			return 0;
		}

	}
	@Override
	public boolean equals(Object o) {
		if(o instanceof Martian) {
			Martian m = (Martian)o;
			return this.id == m.id;
		}
		return false;
	}
	
	public abstract String speak();
	}
