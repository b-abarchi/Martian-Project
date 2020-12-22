package prob2;

public class GreenMartian extends Martian implements Teleporter{

	public GreenMartian(int id) {
		super(id, 1);
	}
	public GreenMartian(int id, int volume) {
		super(id, volume);
	
	}
	@Override
	public String teleport(String dest) {
		return "id = " + super.getId() + " teleporting to " + dest;
	}
	@Override
	public String speak() {
		return "id = " + super.getId() + " Valar morgulis";
	}
	@Override
	public String toString() {
		return "\nGreen Martian - id = " +  getId() + " vol=" + getVolume();
	}
}
