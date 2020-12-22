package prob2;

public class GreenMartianTest {
	public static void main(String[] args) {
		testSpeakAndToString();
		testEquals_Success();
		testEquals_false();
		testEqualsRedAndGreen_Success();
		testCompareToRedAndGreen_Success();
	}
	//create a green martian and let it speak and display toString
		public static void testSpeakAndToString() {
			System.out.println("-->testSpeakAndToString()");
			GreenMartian r = new GreenMartian(1,3);
			System.out.println("expected: id = 1 Valar morgulis Green Martian - id = 1, vol=3 \nactual:" + r.speak() + " " + r.toString());
			System.out.println("---------------------------------------------------------------");
		}
		//Create two green that have the same id and make sure the return is true. 
		public static void testEquals_Success() {
			System.out.println("-->testEquals_Success()");
			GreenMartian r = new GreenMartian(1,5);
			GreenMartian v = new GreenMartian(1,7);
			boolean e = r.equals(v);
			System.out.println(e);
			System.out.println("-----------------------");
			}
		//Create two green that do not have the same id and make sure the return is false. 
		public static void testEquals_false() {
			System.out.println("-->testEquals_false()");
			GreenMartian r = new GreenMartian(3,5);
			GreenMartian v = new GreenMartian(1,7);
			boolean e = r.equals(v);
			System.out.println(e);
			System.out.println("-----------------------");
			}
		//Create 1 red and 1 green such that the first is “equal” the second and thus you expect the return to be true
		public static void testEqualsRedAndGreen_Success() {
			System.out.println("-->testEqualsRedAndGreen_Success()");
			RedMartian r = new RedMartian(2,5,5);
			GreenMartian v = new GreenMartian(2,7);
			boolean e = r.equals(v);
			System.out.println(e);
			System.out.println("--------------------------------------");
							}
		//Create 1 red and 1 green such that the first is “greater than” the second and thus you expect the return to be positive
		public static void testCompareToRedAndGreen_Success() {
			System.out.println("-->testCompareToRedAndGreen_Success()");
			RedMartian r = new RedMartian(2,5,5);
			GreenMartian v = new GreenMartian(1,7);
			int e = r.compareTo(v);
			System.out.println(e);
			System.out.println("--------------------------------------");
					}
}
