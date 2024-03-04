import java.util.ArrayList;
import java.util.List;

public class question412 {
    public List<String> fizzBuzz(int n) {
        List<String> fredDo = new ArrayList<>();
        int i = 1;
        while(i<=n){
            if(i%3==0&&i%5==0) fredDo.add("FizzBuzz");
            else if(i%3==0) fredDo.add("Fizz");
            else if(i%5==0) fredDo.add("Buzz");
            else{
                fredDo.add(String.valueOf(i));
            }
            i++;
        }
        return fredDo;
    }
}
