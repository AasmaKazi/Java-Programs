public class DuplicateChar {
    public static void main(String[] args) {
        int count=0;
        String str="Aasma";

        char[] input=str.toCharArray();
        System.out.println("Duplicate character:");

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){

                if(input[i]==input[j]){
                    System.out.println(input[j]);
                    count++;
                    break;
                }
            }
        }
    }

}
