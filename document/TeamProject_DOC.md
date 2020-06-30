## [팀 프로젝트]
<h4>날짜: 2020.06.30 | 작성자: 김주연 | Version: 1.0 </h4>
<hr>
<h3> 1. 요구사항 분석 (Requirement Analysis) </h3>
<h4>- 공학용 계산기 구현</h4>
<h4>- java swing 또는 안드로이드 애플리케이션으로 구현</h4>
<h4> ∴ 안드로이드 애플리케이션을 선택하였다. (∵ java swing은 java 8 버전부터 deprecated 이다.) </h4>
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
 <li> <h5>InputOutput 클래스</h5> </li>
 <li> <h5>Operation 클래스</h5> </li>
 <li> <h5>History 클래스</h5></li>
 <li> <h5>MainActivity 클래스</h5></li>
</ul>
<h4> 3) 기능(함수) </h4>
<ul>
 <li><h5>InputOutput 클래스 안에 있는 메서드</h5></li>
<ul>
 <li><h5>inputFunction 메서드</h5></li>
 <li><h5>priorityFunction 메서드</h5></li>
 <li><h5>calculatorFunction 메서드</h5></li>
 <li><h5>isOperation 메서드</h5></li>
</ul>
 <li><h5>Operation 클래스 안에 있는 메서드</h5></li>
<ul>
 <li><h5>plus 메서드</h5></li>
 <li><h5>minus 메서드</h5></li>
 <li><h5>multiplication 메서드</h5></li>
 <li><h5>division 메서드</h5></li>
 <li><h5>mod 메서드</h5></li>
 <li><h5>expFunction 메서드</h5></li>
 <li><h5>commonLogFunction 메서드</h5></li>
 <li><h5>involutionFunction 메서드</h5></li>
 <li><h5>factorialFunction 메서드</h5></li>
</ul>
  <li><h5>History 클래스 안에 있는 메서드</h5></li>
<ul>
 <li><h5>historyFunction 메서드</h5></li>
</ul> 
 <li><h5>MainActivity 클래스 안에 있는 메서드</h5></li>
<ul>
 <li><h5>OnCreate 메서드</h5></li>
 <li><h5>init 메서드</h5></li>
 <li><h5>setNumListener 메서드</h5></li>
 <li><h5>onClick 메서드</h5></li>
 <li><h5>setOperationListener 메서드</h5></li>
</ul>
</ul>

<h4> 4) 레이아웃 </h4>
<ul>
 <li><h5>activity_main.xml</h5></li>
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
<h4>1) InputOutput 클래스</h4>
<ul>
<li>
<h4>inputFunction 알고리즘</h4>
 </li>
<img src="" width="20%" height="20%">
  <li>
<h4>priorityFunction 알고리즘</h4>
 </li>
<img src="" width="20%" height="20%">
  <li>
<h4>calculatorFunction 알고리즘</h4>
 </li>
<img src="" width="20%" height="20%">
   <li>
<h4>isOperation 알고리즘</h4>
 </li>
<img src="" width="20%" height="20%">
 </ul>
 
 <h4>2) Operation 클래스</h4>
 <ul>
 <li><h4>plus, minus, multiplication, division, mod, expFunction, commonLogFunction, involutionFunction, factorialFunction 알고리즘</h4></li>
 <img src="https://github.com/ksa-banana/Java_Programming/blob/master/image/Operation_FlowChart.png?raw=true" width="70%" height="70%">
</ul>
<h4>3) MainActivity 클래스</h4>
<ul>
 <li><h4>onCreate 알고리즘</h4></li>
 <img src="" width="20%" height="20%">
 
  <li><h4>init 알고리즘</h4></li>
 <img src="" width="20%" height="20%">
 
  <li><h4>setNumListener 알고리즘</h4></li>
 <img src="" width="20%" height="20%">
 
  <li><h4>onClick 알고리즘</h4></li>
 <img src="" width="20%" height="20%">
 
  <li><h4>setOperationListener 알고리즘</h4></li>
 <img src="" width="20%" height="20%">
</ul>
<br>
<br>
<hr>

<h3> 5. 코딩 및 테스트 (Coding and Test) </h3>
<ul>
 <li><h4>애플리케이션 첫번째 출력화면</h4></li>
  <img src="" width="50%" height="50%">
 </ul>
