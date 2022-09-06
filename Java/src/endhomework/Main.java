package endhomework;

public class Main {

    public static void main(String[] args)
    {
              String[] array = new String[] { "hello", "-2", "world", ":-)" };
              String result = "";
              for(String arr : array) {
            	  if(arr.length() <= 3) {
            		  result += ",\"" + arr + "\"";
            	  }
              }
              result = result.replaceFirst(",", "[") + "]";
              System.out.println(result);
    }
}
