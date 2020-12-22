package prob2;

public class RedMartianTest {

	public static void main(String[] args) {
		testSpeakAndToString();
		testEquals_Success();
		testEquals_false();
		testCompareTo_Negative();
		testCompareTo_Positive();
		testCompareTo_Zero();
	}
	//create a red martian and let it speak and display toString
	public static void testSpeakAndToString() {
		System.out.println("-->testSpeakAndToString()");
		RedMartian r = new RedMartian(1,3,2);
		System.out.println("expected= id = 1 Bartle doo Red Martian - id=1, vol=3, ten=2, \nactual=" + r.speak() + " " + r.toString());
		System.out.println("---------------------------------------------------------------");
	}
	//Create two reds that have the same id and make sure the return is true. 
	public static void testEquals_Success() {
		System.out.println("-->testEquals_Success()");
		RedMartian r = new RedMartian(1,5,5);
		RedMartian v = new RedMartian(1,7,3);
		boolean e = r.equals(v);
		System.out.println(e);
		System.out.println("-----------------------");
		}
	//Create two reds that do not have the same id and make sure the return is false. 
	public static void testEquals_false() {
		System.out.println("-->testEquals_false()");
		RedMartian r = new RedMartian(3,5,5);
		RedMartian v = new RedMartian(1,7,3);
		boolean e = r.equals(v);
		System.out.println(e);
		System.out.println("-----------------------");
		}
		//Create two reds such that the first is “less than” the second and thus you expect the return to be negative
	public static void testCompareTo_Negative() {
		System.out.println("-->testCompareTo_Negative()");
		RedMartian r = new RedMartian(1,5,5);
		RedMartian v = new RedMartian(2,7,3);
		int e = r.compareTo(v);
		System.out.println(e);
		System.out.println("-----------------------");
				}
	//Create two reds such that the first is “greater than” the second and thus you expect the return to be positve
	public static void testCompareTo_Positive() {
		System.out.println("-->testCompareTo_Positive()");
		RedMartian r = new RedMartian(3,5,5);
		RedMartian v = new RedMartian(1,7,3);
		int e = r.compareTo(v);
		System.out.println(e);
		System.out.println("-----------------------");
				}
	//Create two reds such that the first is “equal” the second and thus you expect the return to be 0
	public static void testCompareTo_Zero() {
		System.out.println("-->testCompareTo_Positive()");
		RedMartian r = new RedMartian(1,5,5);
		RedMartian v = new RedMartian(1,7,3);
		int e = r.compareTo(v);
		System.out.println(e);
		System.out.println("-----------------------");
					}
		}

