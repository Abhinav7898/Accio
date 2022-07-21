//1. Ways to write in console
// console.log("Hello World");
// alert ("Hii");
// document.write("This is document write");

//2. JS console API
// console.log("Hello World");
// console.warn("This is a Warning");
// console.error("This is an error");

//3. JS variables
// What are variables?- Containers to store data variables
// var num1 = 34;
// var num2 = 56;
// console.log(num1,num2);


//4. Data Types in JavaScript
    //Number
// var n1 = 50;
// var n2 = 50;
// console.log(n1+n2);
    
    // String
// var str1 = "This is a string 1"
// var str2 = "This is a string 2"
// console.log(str1+str2);

    //Boolean
// var a = true;
// var b = false;
// console.log(a,b);

    // Undefined and Null
// var und = undefined;
// var und;
// console.log(und);

// var n = null;
// console.log(n);

    // Objects
// var marks = {
//     Abhinav: 90,
//     Raj: 89,
//     Shivam: 80,
//     KK: 91
// }
    // console.log(marks);

    // Arrays
// var arr = [1,2,3,4,5,"String"];
// console.log(arr);
// console.log(arr[0]);
// console.log(arr[5]);
/*
At a very high level, there are two types of data types in JS
1. Primitive data types: Undefined, Null, Number, String, Boolean, Symbol
2. Reference data types: Arrays and Objects
*/

    // Operators in JS
    // 1. Arithmetic Operators
// var c = 34;
// var d = 2;
// console.log("The value of c + d is : ",c+d);
// console.log("The value of c - d is : ",c-d);
// console.log("The value of c * d is : ",c*d);
// console.log("The value of c / d is : ",c/d);

    // 2. Assignment Operators
//  var e = c;
//  e+=2;
//  console.log(e);
//  e-=2;
//  console.log(e);

    // 3. Comparision Operator
// var x = 5;
// var y = 6;
// console.log(x == y);
// console.log(x >= y);
// console.log(x <= y);

    // 4. Logical Operators
// console.log(true && true); // Logical And
// console.log(true && false);
// console.log(true || true);// Logical Or
// console.log(true || false);
// console.log(!true);// Logical Not

    // Functions in JS
// function avg(a,b){
//     return(a+b)/2;
// }
// var c1 = avg(4,6);
// var c2 = avg(14,16);
// console.log(c1,c2);

    // Conditonals in JS
// var age = 0;
// age = 15; // Override age
// if(age==0){
//     console.log("Invalid")
// }
// else if(age>=18){
//     console.log("You are eligible")
// }
// else{
//     console.log("You are not eligible");
// }

    // Loops in JS
// 1st way using for loop
// var arr = [1,2,3,4,5,6];
// var n = arr.length;
// for(var i=0;i<n;i++){
//     console.log(arr[i]);
// }

// 2nd way using for each loop
// arr.forEach(function(element){
//     console.log(element);
// })

// 3rd way using while loop

