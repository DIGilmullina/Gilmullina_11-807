package objects;


public class Main {
    public static void main(String[] args) {
        ObjectArrayList oal = new ObjectArrayList();
        oal.add("abc");
        oal.add("ha-ha");
        oal.add("qwerty");
        oal.add("0987");
        String s = (String) oal.get(2);

        for(Object o : oal) {
            String str = (String) o;
            System.out.println(str.toUpperCase());
        }

    }
}