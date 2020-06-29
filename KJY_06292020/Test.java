package team.project;


// String 문자열 수식을 문자배열로 저장할때, 숫자와 연산자를 구분하여 배열방에 저장하는 알고리즘 (1자리 숫자 이상 가능, 소수점일때 같은 배열 방에 넣도록 저장 가능)
public class Test {
	
	public static void main(String[] args) {
		
		//소수점도 같이
		
        String input = "2.5*(20+3!)-6/2*(3*2!+1)";
        
        String[] inputChar = new String[input.length()];
        
        int j = 0;
        
        for(int i=0; i<input.length(); i++) {
      	          	
        	if(i>0) {
        		
      	  if(((Character.isDigit(input.charAt(i)) && Character.isDigit(input.charAt(i-1))))|| (input.charAt(i)=='.') || (input.charAt(i-1)=='.')) {
      		  inputChar[j] += input.charAt(i);
      	  }else {
      		  j++;
      		 inputChar[j] =  Character.toString(input.charAt(i));
      	  }
        	}else if(i==0) {
        		
          	  if(Character.isDigit(input.charAt(i))){
          		
        		  inputChar[j] = Character.toString(input.charAt(i));
        	  
        	  }else {
        		  j++;
           		 inputChar[j] =  Character.toString(input.charAt(i));
        	  }
        		
        		
        	}
        }
        
        
        
        
        
        for(String str: inputChar ) {
        	System.out.println(str);
        }
        
		
	}

}
