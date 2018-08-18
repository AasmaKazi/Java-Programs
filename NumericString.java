public class NumericString {
    public static void main(String[] args) {
        String str="jhkn";

        boolean numeric=true;

        try {
            Integer num=Integer.parseInt(str);

        }catch (NumberFormatException nm){

           numeric=false;
        }

        if(numeric){
            System.out.println("String is numeric:"+str);
        }
        else {
            System.out.println("not numeric:"+str);
        }

    }
}
