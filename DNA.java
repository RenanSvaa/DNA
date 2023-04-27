public class DNA {
    public static void main(String[] args) {
        String dna1 = "ATGCGATACGTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna1;

        int length = dna.length();
        System.out.println(dna1.length());
        System.out.println(dna2.length());
        System.out.println(dna3.length());

        int startCodonIndex = dna.indexOf("ATG");

        int stopCodonIndex = dna.indexOf("TGA");

        if (startCodonIndex != -1 && stopCodonIndex != -1 && (stopCodonIndex - startCodonIndex) % 3 == 0) {
            String protein = dna.substring(startCodonIndex, stopCodonIndex + 3);

            System.out.println("Contém uma proteína: " + protein);
        } else {
            System.out.println("Sem proteína");
        }
    }
}
