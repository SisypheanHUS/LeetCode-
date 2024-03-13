import java.util.ArrayList;
import java.util.List;

public class question2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indices = new ArrayList<>();
        int i = 0;
        for(String word : words){
            if(word.indexOf(x) >= 0) indices.add(i);
            i++;
        }
        return indices;
    }
}
