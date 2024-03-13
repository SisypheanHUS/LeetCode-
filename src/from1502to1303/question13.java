public class question13 {
    class Solution {
        public int romanToInt(String s) {
            int answer = 0;
            int currentNumber = 0;
            int previousNumber = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                switch (s.charAt(i)){
                    case 'M' :
                        currentNumber = 1000;
                        break;
                    case 'D' :
                        currentNumber = 500;
                        break;
                    case 'C' :
                        currentNumber = 100;
                        break;
                    case 'L' :
                        currentNumber = 50;
                        break;
                    case 'X' :
                        currentNumber = 10;
                        break;
                    case 'V' :
                        currentNumber = 5;
                        break;
                    case 'I' :
                        currentNumber =1;
                        break;
                }
                if(currentNumber<previousNumber){
                    answer -= currentNumber;
                }
                else {
                    answer+= currentNumber;
                }
                previousNumber = currentNumber;
            }
            return answer;
        }
    }
}
