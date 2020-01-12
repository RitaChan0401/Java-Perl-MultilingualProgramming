public class G1_1 {
    public static void main(String[] args) {
      Integer[] list ={5,2,3,9,1};

        for (Integer v:sort(list)){
            System.out.println(v);
        }
    }

    public static Integer[] sort (Integer[] list){
        for (int i = 0; i < list.length-1; i++) {
            for (int j = 0; j < list.length-1-i; j++) {
                Integer v1=list[j];
                Integer v2=list[j+1];
                if (v1 - v2 > 0) {
                    Integer temp = list[j];
                    list[j] = list[j + 1];
                    list[j+1]=temp;
                }
            }
        }
        return list;
    }
}
