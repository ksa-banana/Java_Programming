## [팀 프로젝트]
<h4>날짜: 2020.06.30 | 작성자: 김주연 | Version: 1.0 </h4>
<hr>
<h3> 1. 요구사항 분석 (Requirement Analysis) </h3>
<ul>
 <li><h4>공학용 계산기 구현</h4></li>
 <li><h4>java swing 또는 안드로이드 애플리케이션으로 구현</h4></li>
 </ul>
<h4>∴ 안드로이드 애플리케이션을 선택하였다. (∵ java swing은 java 8 버전부터 deprecated 이다.) </h4>
<br>
<h3> 2. 구조 설계 (Structure Design)</h3>
<h4> 1) UML(Unified Modeling Language) Diagram </h4>
<h4> (1) Use Case Diagram</h4>
<img src="https://github.com/ksa-banana/Java_Programming/blob/master/UML_Diagram/Scientific_Calculator_Use_Case_Diagram.png?raw=true" width="70%" height="70%">
<h4> (2) Sequence Diagram</h4>
<img src="https://github.com/ksa-banana/Java_Programming/blob/master/UML_Diagram/Scientific_Calculator_Sequence_Diagram.png?raw=true" width="70%" height="70%">
<h4> (3) Class Diagram</h4>
<img src="https://github.com/ksa-banana/Java_Programming/blob/master/UML_Diagram/Scientific_Calculator_Class_Diagram.png?raw=true" width="70%" height="70%">
<br>
<h4> 2) 클래스 생성</h4>
<ul>
 <li><h5>InputOutput 클래스</h5></li>
   <ul>
    <li>
     <h5>수식의 연산 우선 순위의 HashMap, 연산자 Stack, 피연산자 Stack, 후위 연산 표기법으로 변환된 문자열의 ArrayList, 입력받은 수식 문자열 ArrayList의 자료구조를 필드로 갖고 있다.</h5>
    </li>
    <li>
     <h5>연산자의 우선순위를 결정해주기 위해 초기화 한다.</h5> </li>
    <li>
     <h5>입력된 수식의 연산자와 피연산자(숫자)를 분류하는 메서드(inputFunction)를 포함한다.</h5>
    </li>
    <li>
     <h5>후위 연산식으로 만드는 메서드(priorityFunction)을 포함한다.</h5>
    </li>
      <li>
       <h5>연산자에 따라서 연산식을 수행하는 메서드(calculatorFunction)를 포함한다.</h5> 
    </li>
    <li>
       <h5>올바른 연산자인지 아닌지 판별하는 메서드(isOperation)을 포함한다.</h5>
    </li>
   </ul>
 
 <li> <h5>Operation 클래스</h5> </li>
 <ul>
 <li><h5>입력으로 들어오는 연산자에 따라서 수식을 연산하는 기능들을 포함하고 있다.</h5></li>
  <li><h5>기본적인 사칙연산(덧셈, 뺄셈, 곱셈, 나눗셈)을 구현하는 메서드를 포함하고 있다. (plus, minus, multiplication, division)</h5></li>
  <li><h5>추가적으로 나머지 연산(mod), 자연로그(e) 지수연산(exp), 상용로그 연산(commonLogFunction), 거듭제곱 연산(involutionFunction), 팩토리얼 연산(factorialFunction)을 포함하고 있다.</h5></li>
 </ul>
 
 <li> <h5>History 클래스</h5></li>
 <ul>
 <li><h5>사용자가 입력한 수식을 연산한 결과값을 문자열(String)에 맨 마지막에 한 줄 띄어쓰기("\n")를 붙여 넣고 그 문자열을 반환하는 메서드를 포함하고 있다.</h5></li>
 </ul>
 <li> <h5>MainActivity 클래스</h5></li>
 <ul>
 <li><h5>필드: Button 위젯의 id들을 선언, TextView 위젯의 id들을 선언, ScrollView 위젯의 id들을 선언하고 있다.</h5></li>
 <li><h5>필드: InputOutput 클래스 선언, History 클래스 선언, 문자열 타입의 operExpression, input, historyData 선언, double(실수형)타입의 result 선언하고 있다.</h5></li>
 <li><h5>onCreate 메서드, init 메서드, setNumListener 메서드, onClick 메서드, setOperationListener 메서드를 포함하고 있다. </h5></li>
 </ul>
</ul>

<br>
<h4> 3) 기능(함수) </h4>
<ul>
 <li><h5>InputOutput 클래스 안에 있는 메서드</h5></li>
<ul>
 <li><h5>init 메서드: ArrayList로 선언된 output과 inputString을 초기화하고 객체를 생성한다.</h5></li>
 <li><h5>inputFunction 메서드: 입력된 수식(문자열)을 연산자와 피연산자(숫자)로 분류하는 메서드</h5></li>
 <li><h5>priorityFunction 메서드: 입력된 수식(문자열)을 inputFunction메서드를 통해 연산자와 피연산자로 분류된 후, 후위 연산식으로 만드는 메서드</h5></li>
 <li><h5>calculatorFunction 메서드: 입력된 수식(문자열)에서 연산자에 따라 연산을 진행하는 메서드</h5></li>
 <li><h5>isOperation 메서드: HashMap에 저장되어 있는 올바른 연산자인지 아닌지 판별하는 메서드</h5></li>
</ul>
 <li><h5>Operation 클래스 안에 있는 메서드</h5></li>
<ul>
 <li><h5>plus 메서드: 입력된 숫자(피연산자) 2개를 사용하여 덧셈한다.</h5></li>
 <li><h5>minus 메서드: 입력된 숫자(피연산자) 2개를 사용하여 뺄샘하는 메서드(빼고자 하는 숫자에 -1을 곱하여 덧셈을 한다.)</h5></li>
 <li><h5>multiplication 메서드: 입력된 숫자(피연산자) 2개를 사용하여 곱한다.</h5></li>
 <li><h5>division 메서드: 입력된 숫자(피연산자) 2개를 사용하여 나눈다.</h5></li>
 <li><h5>mod 메서드: 입력된 숫자(피연산자) 2개를 사용하여 나머지 값을 구한다.</h5></li>
 <li><h5>expFunction 메서드: 입력된 숫자(피연산자) 1개를 사용하여 자연로그(e)의 지수 함수값을 구한다.</h5></li>
 <li><h5>commonLogFunction 메서드: 입력된 숫자(피연산자) 1개를 사용하여 상용로그(10을 밑으로 하는 로그함수)함수값을 구한다.</h5></li>
 <li><h5>involutionFunction 메서드: 입력된 숫자(피연산자) 2개를 사용하여 거듭제곱 값을 구한다.</h5></li>
 <li><h5>factorialFunction 메서드: 입력된 숫자(피연산자) 1개를 사용하여 팩토리얼 값을 구한다.</h5></li>
</ul>
  <li><h5>History 클래스 안에 있는 메서드</h5></li>
<ul>
 <li><h5>historyFunction 메서드</h5></li>
</ul> 
 <li><h5>MainActivity 클래스 안에 있는 메서드</h5></li>
<ul>
 <li><h5>@Override OnCreate 메서드: Button 리소스를 연결하기 위한 초기화(init), Button 리스너(setNumListener, setOperationListener)를 호출하고 있다.</h5></li>
 <li><h5>init 메서드: Button을 각각의 기능과 연결해주고 하고 있다. 또한 InputOutput 객체와 History 객체를 생성하고 operExpression, input, result 변수를 초기화한다.</h5></li>
 <li><h5>setNumListener 메서드: 리스너 정의를 한다.</h5></li>
 <li><h5>@Override onClick 메서드: 숫자 버튼이 눌렸을 때, Button의 id 값에 따라서 수식을 저장하는 변수(operExpression)에 숫자 문자열(0~9)을 저장한다. 저장된 연산식이 화면에 출력되도록 한다. 각 Button 객체의 setOnClickListener 함수를 통해 이벤트 리스너를 등록한다.</h5></li>
 <li><h5>setOperationListener 메서드: 리스너 정의를 한다.</h5></li>
 <li><h5>@Override onClick 메서드: 연산자 버튼이 눌렸을 때, Button의 id값에 따라서 수식을 저장하는 변수(operExpression)에 연산자, 괄호, 소수점(+, -, *, /, mod, ^,log, exp, !, (,), ., =)을 저장한다. '=' 연산자를 누르면 History에 저장되도록 한다. 'del'버튼을 누르면 해당 수식에서 가장 마지막에 들어간 것이 지워진다. 'reset' 버튼을 누르면 해당 수식이 모두 없어지도록 한다. 저장된 연산식이 화면에 출력되도록 한다. 각 Button 객체의 setOnClickListener 함수를 통해 이벤트 리스너를 등록한다.</h5></li>
</ul>
</ul>

<br>
<h4> 4) 레이아웃 </h4>
<ul>
 <li><h5>activity_main.xml: 사용자가 보는 화면으로 출력되는 UI를 나타낸다. ScrollView 위젯, TextView 위젯, Button 위젯들을 포함하고 있다.</h5></li>
</ul>
<br>
<hr>

<br>
<h3> 3. 입력/출력 데이터 정의 (Data Structure Design) </h3>
<ul>
 <li> <h4> 데이터 종류: 피연산자(실수, double), 연산자(Character), Button 위젯 기능(0~9 정수, 소수점, 연산자(+,-,*,/,%,mod,log10,exp,pow,factorial), reset, delete), 수식(문자열, String)</h4> </li>
 <li> <h4> 입력: Button 위젯(피연산자, 연산자, reset, delete)</h4> </li>
 <li> <h4> 출력: Textview 위젯(수식 계산한 결과값(문자열, String), 이전 계산 결과값(문자열, String)), ScrollView 위젯(history 기능으로 이전 계산 결과값이 쌓일 때 출력)</h4></li>
</ul>
<br>
<br>
<hr>

<h3> 4. 알고리즘 설계 및 구현 (Algorithm Design and Implementation) </h3>
<h4> 1) InputOutput 클래스</h4>
<ul>
<li><h4>init 알고리즘</h4></li>
<img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/init_FlowChart.png?raw=true" width="70%" height="70%">
 
<li><h4>inputFunction 알고리즘</h4></li>
<img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/inputFunction_FlowChart.png?raw=true" width="70%" height="70%">
 
<li><h4>priorityFunction 알고리즘</h4></li>
<img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/priorityFunction_FlowChart.png?raw=true" width="70%" height="70%">
 
<li><h4>calculatorFunction 알고리즘</h4></li>
<img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/calculatorFunction_FlowChart_01.png?raw=true" width="70%" height="70%">

<li><h4>isOperation 알고리즘</h4></li>
<img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/isOperation_FlowChart.png?raw=true" width="50%" height="50%">
</ul>
 
 <h4>2) Operation 클래스</h4>
 <ul>
 <li><h4>plus, minus, multiplication, division, mod, expFunction, commonLogFunction, involutionFunction, factorialFunction 알고리즘</h4></li>
 <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/Operation_FlowChart.png?raw=true" width="70%" height="70%">
</ul>
<h4>3) MainActivity 클래스</h4>
<ul>
 <li><h4>onCreate 알고리즘</h4></li>
 <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/onCreate_FlowChart.png?raw=true" width="20%" height="20%">
 
  <li><h4>init 알고리즘</h4></li>
 <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/init_MainActivity_FlowChart.png?raw=true" width="20%" height="20%">
 
  <li><h4>setNumListener 알고리즘</h4></li>
 <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/setNumListener_FlowChart.png?raw=true" width="70%" height="70%">
 
  <li><h4>setOperationListener 알고리즘</h4></li>
 <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/setOperationListener_FlowChart.png?raw=true" width="70%" height="70%">
</ul>
<br>
<br>

<hr>
<h3> 5. 코딩 및 테스트 (Coding and Test) </h3>
<ul>
 <li><h4>애플리케이션 run</h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App.PNG?raw=true" width="70%" height="70%">
  <li><h4>애플리케이션 숫자 입력</h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_number.PNG?raw=true" width="70%" height="70%">
  <li><h4>애플리케이션 덧셈 연산</h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_plus.PNG?raw=true" width="70%" height="70%">
  <li><h4>애플리케이션 뺄셈 연산 </h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_minus.PNG?raw=true" width="70%" height="70%">
   <li><h4>애플리케이션 곱셈 연산 </h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_multiplication.PNG?raw=true" width="70%" height="70%">
   <li><h4>애플리케이션 나눗셈 연산 </h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_division.PNG?raw=true" width="70%" height="70%">
    <li><h4>애플리케이션 나머지 연산 </h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_mod.PNG?raw=true" width="70%" height="70%">
   <li><h4>애플리케이션 자연로그 지수 연산(exp()) </h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_expFunction.PNG?raw=true" width="70%" height="70%">
    <li><h4>애플리케이션 상용로그 연산 (log) </h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_commonLogFunction.PNG?raw=true" width="70%" height="70%">
     <li><h4>애플리케이션 거듭제곱 연산 </h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_involutionFunction.PNG?raw=true" width="70%" height="70%">
      <li><h4>애플리케이션 팩토리얼 연산 </h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_factorialFunction.PNG?raw=true" width="70%" height="70%">
        <li><h4>애플리케이션 소수점 연산 </h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_dot.PNG?raw=true" width="70%" height="70%">
       <li><h4>애플리케이션 괄호 연산 </h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_Parenthesis.PNG?raw=true" width="70%" height="70%">
        <li><h4>애플리케이션 Delete 기능 </h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_deleteFunction.PNG?raw=true" width="70%" height="70%">
  <li><h4>애플리케이션 Reset 기능 </h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_resetFunction.PNG?raw=true" width="70%" height="70%">
   <li><h4>애플리케이션 History 기능 </h4></li>
  <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/App_History.PNG?raw=true" width="70%" height="70%">
 </ul>
