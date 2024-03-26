public class Lab04JPA06 {
    public static void main(String[] args) {
        int [] hours = new int[]{2,3,5,8};
        for(int i =0 ; i < hours.length ; i++){
            if (hours[i] <= 2) {
                System.out.println("停車時數"+hours[i]+"小時");
                System.out.println("應繳費用:"+hours[i]*30+"元整");
                System.out.println("------------------------------");
            }else if (hours[i] <= 4 && hours[i] > 2) {
                System.out.println("停車時數"+hours[i]+"小時");
                System.out.println("應繳費用:"+(50*(hours[i]-2)+60)+"元整");
                System.out.println("------------------------------");
            }else if (hours[i] <= 6 && hours[i] > 4) {
                System.out.println("停車時數"+hours[i]+"小時");
                System.out.println("應繳費用:"+(80*(hours[i]-4)+160)+"元整");
                System.out.println("------------------------------");
            }else{
                System.out.println("停車時數"+hours[i]+"小時");
                System.out.println("應繳費用:"+(100*(hours[i]-6)+320)+"元整");
                System.out.println("------------------------------");
            }
        }
    }
}
