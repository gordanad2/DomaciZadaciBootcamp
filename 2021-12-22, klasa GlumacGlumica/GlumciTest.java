package domaci.nedelja5.domaci2112;

public class GlumciTest {
    public static void main(String[] args) {
        GlumacGlumica glumac1 = new GlumacGlumica("Nikola", "Djuricko", 'M', 45, 10, true);
        GlumacGlumica glumica1 = new GlumacGlumica("Meril", "Strip", 'Z', 65, 10, false);

        System.out.println(glumac1);
        System.out.println(glumica1);
    }
}
