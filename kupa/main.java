public class Main {
    public static void main(String[] args) {
        final int K = 29;
        Kupa elimdekiKupa = new Kupa("Mavi", K);
        Kupa masadakiKupa = new Kupa("Kırmızı", 300);
        Kupa arkadasimdakiKupa = elimdekiKupa;
        elimdekiKupa = masadakiKupa;
        masadakiKupa = null;
        arkadasimdakiKupa.boya("Yeşil");
        Kupa yeniAldigimKupa = new Kupa("Sarı", 500);
        yeniAldigimKupa = arkadasimdakiKupa;
        System.out.println("elimdekiKupa".getRenk());
        System.out.println("arkadasimdakiKupa".getRenk());
        System.out.println("yeniAldigimKupa".getRenk() + " " + yeniAldigimKupa.getHacimMl());
         System.out.println(masadakiKupa.getRenk());
    }
}