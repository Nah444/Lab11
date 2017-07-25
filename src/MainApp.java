
public class MainApp {

        public static void main(String[] args) {

                Building build = new Building( "1017 Jefferson", 7000);
            House nickHouse = new House("124 Sesame Street", 900, "Young's");

            System.out.println(build.getLocation());

            //adding 300 sq ft

            System.out.println(nickHouse.getSqFt());
            nickHouse.setSqFt(1200);
            System.out.println("I added 300 ft addition");
            System.out.println(nickHouse.getSqFt());

            System.out.println("Selling house to new family: ");
            nickHouse.setFamilyName("Smith's");
            System.out.println(nickHouse.getFamilyName());

        }
}
