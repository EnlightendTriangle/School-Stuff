var rs = require("readline-sync");

var num1 = rs.question("First number: ");
var num2 = rs.question("Second number: ");
var num3 = rs.question("Third number: ");
var num4 = rs.question("Fourth number: ");

var result1 = factorial(num1);
process.stdout.write("The factorial of the first number is: " + result1);
var result2 = addUp(num2);
process.stdout.write("The sum of all digits in the second number is: " + result2);
var result3 = reverseNum(num3);
process.stdout.write("The reverse of the third number is: " + result3);
var testBackwards = reverseNum(num4);
var isPalindrome = checkPalindrome(num4, testBackwards);

if(isPalindrome == true){
	process.stdout.write("The fourth number is a palindrome");
}
else{
	process.stdout.write("The fourth number is not a palindrome");
}

function factorial(num1){
	var result = 1;
	
	for(var i = 2; i <= num1; i++){
		result *= i;
	}
	
	return result;
}

function addUp(num2){
	var str = num2.toString();
	var sum = 0;
	
	for(var i = 0; i < s.length; i++){
		sum += parseInt(s.charAt(i));
	}
	return sum;
}

function reversenum(num3){
	var str = num3.toString();
	var rev = str.split("").reverse().join("");
	return rev;
}

function checkPalindrome(num4, rev){
	var forward = num4.toString();
	
	if(forward === reverse){
		return true;
	}
	else{
		return false;
	}
}
	