package with_encapsulation;

public class TestingClass {
	public static void main(String[] args) {
		EncapsulationDemo ed = new EncapsulationDemo(10);
        System.out.println(ed.getValue());
        ed.setValue(20);
        System.out.println(ed.getValue());
        ed.setValue(50);
        System.out.println(ed.getValue());
	}
}
