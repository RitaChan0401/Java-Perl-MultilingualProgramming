public class G1_3{
    public static void main(String[] args) {
        String[] list = {"1","2", "11", "20", "7"};

        for(String v: sort(list)) {
            System.out.println(v);
        }
    }

    public static String[] sort (String[] list) {
        for(int i = 0; i < list.length - 1; i++) {
            for(int j = 0; j < list.length - 1 - i; j++) {
                String v1 = list[j];
                String v2 = list[j + 1];
                System.out.println("v1:"+v1+" v2:"+v2+" comp:"+v1.compareTo(v2));
                if (v1.compareTo(v2) > 0) {
                    String temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }
}

