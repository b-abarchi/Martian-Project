package prob2;

	public class RedMartian extends Martian implements Comparable<Martian>{
		private int tenacity;
		public RedMartian(int id, int tenacity) {
			this(id, 1, tenacity);
	
		}
		public RedMartian(int id, int volume,int tenacity) {
			super(id, volume);
			this.tenacity = tenacity;
		}
		
		public int getTenacity() {
			return tenacity;
		}
		@Override
		public String speak() {
			return "id = " + super.getId() + " Bartle doo";
		}
		@Override
		public String toString() {
			return "\nRed Martian - id=" +  getId() + " vol=" + getVolume() + " ten=" + tenacity ;
		}
		
 
}
