Feature: RPNCalc

Scenario Outline: Calculator
	Given the inputs <input1>
	Then the result should be <result>
	
	Examples:
	|input1	|result	|
	|"3 2 +"|"5.0"	|
	|"6 2 * 3 /"|"4.0"|
	|"2 3 ^ 4 5 + +"|"17.0"|
	|"50 % 2 *"|"1.0"|
	|"3 ! 4 5 * +"|"26.0"|
	|"12 3 / !"|"24.0"|
	|"5 1 2 + 4 * + 3 -"|"14.0"|