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
var arr = [1,2,3,4,5,6];
// var n = arr.length;
// for(var i=0;i<n;i++){
//     console.log(arr[i]);
// }

// 2nd way using for each loop
// arr.forEach(function(element){
//     console.log(element);
// })

// 3rd way using while loop
    // let j = 0;
    // while(j<arr.length){
    //     console.log(arr[j]);
    //     j++;
    // }
// 4th way using do while loop
// let j = 0;
// do{
//     console.log(arr[j]);
//     j++;
// }
//     while(j<arr.length);

// break and continue
// for(var i=0;i<arr.length;i++){
//     if(i==2){
//         // break;
//         continue;
//     }
//     console.log(arr[i]);
// }

// Array Methods
let myArr = ["Fan","Camera",34,null,true];
// console.log(myArr.length);
// myArr.pop();
// myArr.push("Abhinav");
// myArr.shift();
// myArr.unshift("Abhinav");
// const newLen = myArr.unshift("Abhinav");
// console.log(newLen);
// console.log(myArr.toString);
// let arr1 = [5,4,3,2,1];
// console.log(arr1.sort);
// console.log(myArr);

// String Methods
// let str = "Abhinav is a good boy good";
// console.log(str.length);
// console.log(str.indexOf("is"));
// console.log(str.lastIndexOf("good"));
// console.log(str.slice(0,7));
// d = str.replace("Abhinav","Abhi");
// console.log(d);
// console.log(str, d);

// Dates in js
let myDate = new Date();
// console.log(myDate.getTime());
// console.log(myDate.getFullYear());
// console.log(myDate.getDay()); // 0 means sun, 1 means mon and so on...
// console.log(myDate.getDate());
// console.log(myDate.getMonth());
// console.log(myDate.getHours());
// console.log(myDate.getMinutes());

// DOM Manipulation - Document Object Model
// (img)
let elem = document.getElementById('click');
// console.log(elem);
let elemClass = document.getElementsByClassName("container");
// console.log(elemClass);
// elemClass[0].style.background = "yellow";
// elemClass[0].classList.add("bg-primary")
// elemClass[0].classList.add("text-success")
// elemClass[0].classList.remove("text-success")
// console.log(elem.innerHTML);
// console.log(elem.innerText);
// console.log(elemClass[0].innerHTML);
// console.log(elemClass[0].innerText);
// tn = document.getElementsByTagName('button');
// tn = document.getElementsByTagName('div');
// console.log(tn);
// create
// createdElement = document.createElement('p');
// createdElement.innerText = "This is a created para"
// tn[0].appendChild(createdElement);
// replace
// createdElement2 = document.createElement('b');
// createdElement2.innerText = "This is a created bold"
// tn[0].replaceChild(createdElement2,createdElement);
// query selector
// sel = document.querySelector('.container');
// console.log(sel);
// sel = document.querySelectorAll('.container');
// console.log(sel);

// Events in JS
// function clicked(){
//     console.log('The button was clicked');
// }
// window.onload = function(){
//     console.log('The document was loded');
// }
// Events in JS on click
// firstContainer.addEventListener('click',function(){
//     console.log("Button Clicked");
// })
// Events in JS on Mouse
// firstContainer.addEventListener('mouseover',function(){
//     console.log("Mouse on container");
// })
// firstContainer.addEventListener('mouseout',function(){
//     console.log("Mouse on container");
// })
// firstContainer.addEventListener('mouseup',function(){
//     console.log("Mouse up when clicked on container");
// })
// firstContainer.addEventListener('mousedown',function(){
//     console.log("Mouse down when clicked container");
// })
// let preHTML = document.querySelectorAll('.container')[1].innerHTML;
// firstContainer.addEventListener('mouseup',function(){
//     document.querySelectorAll('.container')[1].innerHTML = preHTML;
//     console.log("Mouse up when clicked on container");
// })
// firstContainer.addEventListener('mousedown',function(){
//     document.querySelectorAll('.container')[1].innerHTML = "<b> we have clicked </b>"
//     console.log("Mouse down when clicked container");
// })

// Arrow Function
// function sum(a,b){
//     return a+b;
// }
// sum = (a,b)=>{
//     return a+b;
// }
// SetTimeout and setIntervals
// logKaro =()=>{
    // console.log("I am your log");
    // document.querySelectorAll('.container')[1].innerHTML = "<b> we have clicked </b>"
// }
// clr = setTimeout(logKaro,2000); // 2000milisecond
// clr = setInterval(logKaro,2000); // this will schedule the time
// clearTimeout(clr);
// clearInterval(clr); // to break the condition of interval or timeout

// local storage
// (img)
// localStorage.setItem('name','Abhinav'); // key,value
// localStorage
// localStorage.getItem('name');
// localStorage.clear();

// JSON
// obj = {name:"Abhinav",length:1,a:{this:'tha"t'}}
// jso = JSON.stringify(obj);
// console.log(typeof jso);
// console.log(jso);
// parsed = JSON.parse(`{"name":"Abhinav","length":1,"a":{"this":"that"}}`);
// console.log(parsed);

// Template literals - Backticks
a = 34;
console.log(`this is my ${a}`);

