public class MaxNO {

    public void add(int[] arr){

        int maxOne=0;
        int maxTwo=0;



        for(int i : arr){

            if (maxOne<i){
                maxTwo=maxOne;
                maxOne=i;
            }else if (maxTwo<i){
                maxTwo =i;
            }
        }

        System.out.println("1st max number:"+maxOne);
        System.out.println("2nd max number:"+maxTwo);

    }


    public static void main(String[] args) {

        int num[]={11,20,4,15,10};
        MaxNO sum=new MaxNO();
        sum.add(num);

    }

}
