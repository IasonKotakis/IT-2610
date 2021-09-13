public class WordLongException extends Exception{
    String str1;
    public WordLongException(String s){
        this.str1 = s;
    }
    public String toString(){
        return ("Output String = "+str1) ;
    }
}

StringD.java


public class StringD {

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Please Enter the word (otherwise press, DONE for stop)");
        String s = "";
        while(true){
            try{
                s = in.next();
                if(s.equalsIgnoreCase("DONE")){
                    break;
                }
                if(s.length() > 20){
                    throw new WordLongException("String is entered that has too many characters");
                }
            }
            catch(WordLongException exp){
                System.out.println(exp) ;
            }
        }
    }

}
