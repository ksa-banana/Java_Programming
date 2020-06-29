package inputOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class InputOutput {

	HashMap<Character, Integer> opPriority;
	Stack<Character> opStack;
	Stack<String> numStack;
	List<Character> output = new ArrayList<>();

    {
        /** 우선순위 **/
        opPriority = new HashMap<>();
        opPriority.put('(', 0);
        opPriority.put('+',1);
        opPriority.put('-', 1);
        opPriority.put('*', 2);
        opPriority.put('/', 2);
        opPriority.put('m', 2);
        opPriority.put('^', 2);
        opPriority.put('l', 3);
        opPriority.put('e', 3);
        opPriority.put('!', 3);

        opStack = new Stack<>();
    }
    
    
    void operation() {
    	Double num1, num2 = 0.0;
    	Operation operation = new Operation();
    	
    	
    	
    	for(int i=0; i<output.size(); i++ ){
    		char c = output.get(i);
    		
    		if(isOperation(c)) {
    			num1 = Double.parseDouble(numStack.get(i-2));
    			num2 = Double.parseDouble(numStack.get(i-1));
    			
    			
    			
    			switch(c) {
					case '+':
						num1 = operation.plus(num1, num2);
						numStack.add(num1+"");
						break;
					case '-':
						num1 = operation.minus(num1, num2);
						numStack.add(num1+"");
						break;
					case '*':
						num1 = operation.multiplication(num1, num2);
						numStack.add(num1+"");
						break;
					case '/':
						num1 = operation.division(num1, num2);
						numStack.add(num1+"");
						break;
					case 'm':
						num1 = operation.mod(num1, num2);
						numStack.add(num1+"");
						break;
					case '^':
						num1 = operation.involutionFunction(num1, num2);
						numStack.add(num1+"");
						break;
					case 'l':
						num1 = operation.commonLogFunction(num2);
						numStack.add(num1+"");
						break;
					case 'e':
						num1 = operation.expFunction(num2);
						numStack.add(num1+"");
						break;
					case '!':
						num1 = operation.factorialFunction(num2);
						numStack.add(num1+"");
						break;
						
    			}
    			
    		}
    		else {
    			numStack.push(c+"");
    		}
    	}
    	
    	
    	
    }
    
    
    
    void inputOutput() {
    	
    	//입력받은 수식
        String input = "2*(2+3!)-6/2*(3*2!+1)";
        char[] inputChar = input.toCharArray();


        for (int i=0; i<inputChar.length; i++){
            char c = inputChar[i];
            

            //연산자일 경우
            if (isOperation(c)){
            	
                //여는 괄호일 경우
                //push
                if (c == '('){
                    opStack.push(c);
                }
                //닫는 괄호일 경우
                //여는 괄호가 나올때까지 pop
                else if (c == ')'){
                    char top = opStack.pop();
                    while (top != '('){
                        output.add(top);
                        top = opStack.pop();
                    }
                }
                //그 외 연산자일 경우
                else{
                	
                    //우선순위가 높거나 같으면 pop                                    
                    while(!opStack.isEmpty() && opPriority.get(opStack.peek()) >= opPriority.get(c)) {
                    	output.add(opStack.pop());
                    } 
                    
                    //우선순위가 낮거나 스택이 비어있으면 push
                    opStack.push(c);
                 
                }
            }
            else{
            	
            	//피연산자일 경우
                output.add(c);
                
                
                
                   
            }

        }
      //stack에 남아있는 연산자 출력
        while (!opStack.isEmpty()){
            output.add(opStack.pop());
        }
        System.out.print(output);


    }

    
  //연산자 여부
    boolean isOperation(char c){
        if(')' == c){
            return true;
        }
        return opPriority.containsKey(c);
    }
    
    
	
}


