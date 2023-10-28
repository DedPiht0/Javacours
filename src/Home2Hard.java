public class Home2Hard {
    public static void main(String[] args) {
        int yers = 1992;
        if (yers%100==0 && yers%400!=0 ){
            System.out.println("Не високосный");
        }else if(yers%4==0){
            System.out.println("Високосный");
        }else {
            System.out.println("Не високосный");
        }

    }
}
