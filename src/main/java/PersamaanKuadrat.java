import java.util.HashMap;
import java.util.Map;
import java.lang.Math;


public class PersamaanKuadrat {

    //Method disini
    public double[] cari (String inputPersamaan) {

        Map<String, Integer> tempPersamaan = pecahPersamaan(inputPersamaan);
        Double x1 = rumusABC(tempPersamaan.get("a"),
                tempPersamaan.get("b"),
                tempPersamaan.get("c"),
                "+");
        Double x2 = rumusABC(tempPersamaan.get("a"),
                tempPersamaan.get("b"),
                tempPersamaan.get("c"),
                "-");
        double[] jawaban = new double[2];
        jawaban[0] = x1;
        jawaban[1] = x2;
        return jawaban;
    }

    public Double rumusABC (int a, int b, int c, String operator) {
        Double x;
        if (operator.equalsIgnoreCase("+")) {
            x = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        } else if (operator.equalsIgnoreCase("-")) {
            x = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        } else {
            System.out.println("Anying lu masukin apa itu asw");
            x = 0.0;
        }
        return x;
    }


    public Map<String, Integer> pecahPersamaan (String persamaan) {
        Map<String, Integer> returnMap = new HashMap<>();
        String[] pecahan =persamaan.split("x");
        returnMap.put("a", Integer.parseInt(
                pecahan[0].equalsIgnoreCase("") ? "1" : pecahan[0]
        ));
        returnMap.put("b", Integer.parseInt(pecahan[1].substring(1)));
        returnMap.put("c", Integer.parseInt(String.valueOf(pecahan[2])));

        return returnMap;
    }

    public static void main(String[] args) {
        String persamaanKuadrat = "x2+9x+14";
        PersamaanKuadrat main = new PersamaanKuadrat();

        double[] Hasil = main.cari(persamaanKuadrat);
        System.out.println(Hasil[0]);
        System.out.println(Hasil[1]);
    }
}
