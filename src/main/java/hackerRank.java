import java.util.List;

public class hackerRank {
    //Jumping on the clouds
    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        Integer countJump=0;
        Integer i=0;
        //0,1,0,0,1,0,0
        while (i<c.size()-1){
            if (!(i==c.size()-2) && c.get(i+2).equals(0)) {
                i=i+2;
                countJump++;
            } else {
                i=i+1;
                countJump++;
            }
        }
        return countJump;
    }

    public static long repeatedString(String s, long n) {
        // Write your code here
        Long a=0L;
        String[] split;
        String x = "";

        if (s.equals("a")) {
            return n;
        }

        while (x.length()<n) {
            x=x+s;
        }

        x = x.substring(0, Math.toIntExact(n));
        split=x.split("");
        //long count = x.chars().filter(ch -> ch == 'a').count();
        for (String i: split){
            if (i.equals("a")) {
                a++;
            }
        }
        return a;
    }

    public static void main(String[] args) {

        System.out.println(repeatedString("abca",10L));

    }
}
