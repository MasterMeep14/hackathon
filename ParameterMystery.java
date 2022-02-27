public class ParameterMystery {
    public static void main(String[] args) {
        String loki = "loki";
        String owen = "mobius";
        String tva = "miss minutes";
        String sylvie = "the variant";

        marvel(sylvie, owen, loki);
        marvel(tva, sylvie, loki);
        marvel(loki, "TVA", owen);
        marvel("sylvie", loki, "alligator");
    }

    public static void marvel(String loki, String tva, String agent) {
        System.out.println(tva + " and " + agent + " are tracking down " + loki);
    }
}