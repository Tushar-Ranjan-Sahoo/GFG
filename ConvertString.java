public class ConvertString {
    public static void main(String[] args) {
        String s = "Hello Bonu ";
        System.out.print(convartString(s));
    }
    public static  String convartString(String s){
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        int i = 0 ;
        while(i< words[0].length() || i< words[1].length()){
            if(i<words[0].length()){ result.append(words[0].charAt(i));}
            if(i<words[1].length()){ result.append(words[1].charAt(i));}
            result.append('_');
            i++;
        }
        return result.toString().substring(0,result.length()-1);
    }
}
