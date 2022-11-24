//alert("Welcome to JS ");


console.log("Welcome to Tutor JS");
console.log(123456);
console.log(12.34);
console.log(true);
console.log([1,5,6,9,7,3,2]);
console.log({fanme: 'JS', age:21});
console.table({fanme: 'JS', age:21});
console.error("This is required to fill");
console.warn("Field required");
console.clear();

/*
console.time("Timer");
for(i=0;i<100;i++)
{
    console.log(i);
}
console.timeEnd("Timer");
*/


/*
var a=23;
var b=70;
console.log(a+b);
*/


//1. Scope


/*
if(true)
{
    //var msg="Welcome to tutor js"; (global scope)
    //let msg="Welcome to tutor js";
    const msg="Welcome to tutor js";
    console.log(msg);
}
//console.log(msg);
*/


//2.Variable redeclaration

/*
var a=23;
console.log(a);

var a=78;
console.log(a);
*/

/*
let a=23;
console.log(a);
                    (dont allow for  redeclaration)
let a=78;
console.log(a);
*/

/*
const a=23;
console.log(a);
                    (dont allow for  redeclaration)
const a=78;
console.log(a);
*/

//3. Value assignment

/*
var a=23;
console.log(a);
a=78;
console.log(a);
*/

/*
let a=23;
console.log(a);
a=78;
console.log(a);
*/

/*
const a=23;
console.log(a);
a=78;
console.log(a);
*/

/*const student={'name':"pavi","age":21};
console.table(student);
console.table(student.name);
student.name="Pavithra";
console.table(student);

// can change the values

*/

//DATA TYPES IN JAVASCRIPT

/* js dynamic programming 

numbers
String
boolen
null
undefined
symbols E6

// reference type

Arrays
objects
date & time
*/

/*var a=25.986;
var fname="Pavi";
var isMarried=true;
var phone=null;
let b;

console.log(typeof b);
*/

//symbols

/*
const s=Symbol() //unqiue value will be stored
console.log(s);

const s2=Symbol() //unqiue value will be stored
console.log(s2);

console.log(s==s2);
*/


// reference type

/*
var courses=['c','c++','java'];
var d=new Date();
console.log(d);
console.log(typeof courses);
*/

//type conversion

/*
let a;
a=99;
console.log(a,typeof a);
a=String(a);
console.log(a,typeof a);

a=true;
console.log(a,typeof a);
a=String(a);
console.log(a,typeof a);

a=new Date();
console.log(a,typeof a);
a=String(a);
console.log(a,typeof a);

a=[9,8,7,6,5,4,3,2];
console.log(a,typeof a);
a=String(a);
console.log(a,typeof a);

a=99;
console.log(a,typeof a);
a=a.toString();
console.log(a,typeof a);
*/


//String to number

/*
a="123";
console.log(a,typeof a);
a=Number(a);
console.log(a,typeof a);

a=false;
console.log(a,typeof a);
a=Number(a);
console.log(a,typeof a);

a=[1,2,3,4,5,6,7];
console.log(a,typeof a);
a=Number(a);
console.log(a,typeof a);

a="123";
console.log(a,typeof a);
a=parseInt(a);
console.log(a,typeof a);

a="339.999";
console.log(a,typeof a);
a=parseFloat(a);
console.log(a,typeof a);
*/

//Type conversion

/*
let a="35";
let b=90;
console.log(a+b);

a=Number(a);
console.log(a+b);
*/

//Arithmetic operation

/*
let a=100;
let b=20;
let c;
c=a+b;
c=a-b;
c=a*b;
c=a/b;
c=a%b;
c=2**2;
c=++a;
c=--b;

console.log(c);
*/

//Assignment operators

/*
let a=10;

a=a+5;
a=a-5;
a*=5;
a/=5;
a%=5;

console.log(a);
*/

//Math function

/*
let c;
c=Math.PI;
c=Math.E;
c=Math.round(5.9);
c=Math.floor(5.9);
c=Math.ceil(5.9);
c=Math.sqrt(5);
c=Math.abs(-5);
c=Math.trunc(2.58);
c=Math.pow(2,4);
c=Math.max(2,3,4,9);
c=Math.min(2,3,4,9);
c=Math.random();
c=Math.floor((Math.random()*50+1));
c=Math.sign(0);
c=Math.sin(45);
c=Math.cos(45);
c=Math.log(45);

console.log(c);
*/

//Comparison operators

/*
let a=10;
b="10";
console.log(a==b);
console.log(a===b);
console.log(a!=b);
*/

//relational operators 

/*
let a=10;
b=80;

console.log("Greater : ",a>b);
console.log("Lesser : ",a<b);
console.log("Greater Than Equal : ",a>=b);
console.log("Lesser Than Equal : ",a<=b);
*/

//Logical operators

//and , or , not

/*
let mark=4;

console.log(mark>=35 && mark<=100);

let a=5;
console.log(a==2 || a==5);

 a=true;
console.log(!a);
*/

// String methods

/*

let f_name="Pavithra";
let l_name="Sundaram ";

//CONCATENATION
let c=f_name+" "+l_name;
console.log(c);

//concat
c=f_name.concat('',l_name);
console.log(c);

//append
c="Tutor ";
c+="js";
console.log(c);

//escaping
c='she can\'t run';
console.log(c);

//length
c=f_name.length;
console.log(c);

//upper & lowercase
c=f_name.toLocaleLowerCase();
console.log(c);

//indexOf
c=f_name.indexOf('t');
console.log(c);

c=f_name.lastIndexOf('a');
console.log(c);

c=f_name.charAt(1);
console.log(c);

c=f_name.charCodeAt(1);
console.log(c);

c=f_name.substr(0,3);
console.log(c);

//substring
let txt="1234567890";
c=txt.substring(0,4);
console.log(c);

c=txt.substring(4);
console.log(c);

c=txt.slice(-5);
console.log(c);


//slice
c=txt.slice(2,5);
console.log(c);

c=txt.slice(20,50);
console.log(c);

c=txt.slice(-3);
console.log(c);

//split
let a="JavaScript Complete Basic Tutorial";
c=a.split(" ");
console.log(c);
console.table(c);

//replace
a="my name is pavi";
console.log(c);
c=a.replace('pavi','pavithra');
console.log(c);

//includes 
const pets=['dog','cat','meow'];
console.log(pets.includes('rate'));
console.log(pets.includes('cat'));

//trim
a="  pavi  ";
console.log(a.length);
a=a.trim();
console.log(a.length);

//padstart padend
a="5";
a=a.padStart(4,0);
console.log(a);

a="5";
a=a.padEnd(4,'&');
console.log(a);

//long literals //concatenation ||  \\
let longString="We create simplified and interactive learning experiences \
Learning web development should be easy to understand and available for everyone, everywhere!\
W3Schools is a school for web developers, covering all the aspects of web development";
console.log(longString);

//string fromCharCode()
console.log(String.fromCharCode(65,66,67,68,69,70));

*/

//TEMPLATE STRING

/*
let full_name="kasthuri";
let age="21";
city="erode";
role="ceo";

let output="";

//output="<table border='1'><tr><th>Name</th><td>"+full_name+"</td></tr><tr><th>Age</th><td>"+age+"</td></tr><tr><th>City</th><td>"+city+"</td></tr><tr><th>Role</th><td>"+role+"</td></tr></table>";

output+="<hr><table border='1'>"+
"<tr><th>Name</th><td>"+full_name+"</td></tr>"+
"<tr><th>Age</th><td>"+age+"</td></tr>"+
"<tr><th>City</th><td>"+city+"</td></tr>"+
"<tr><th>Role</th><td>"+role+"</td></tr>"+
"</table>";


output+=`<hr><table border='1'>
<tr><th>Name</th><td>${full_name}</td></tr>
<tr><th>Age</th><td>${age>=25?"Allow":"Bad"}</td></tr>
<tr><th>City</th><td>${city}</td></tr>
<tr><th>Role</th><td>${role}</td></tr>
</table>`;

document.body.innerHTML=output;
*/

//ARRAY

/*

let a=[10,20,30,40];
console.table(a);
console.log(a[2]);

let b=new Array(10,20,30,40);
console.table(b);

let c=new Array("Pavi",21,true,{m1:99,m2:78,m3:89});
console.table(c);

//for each
//value , index, array

const number=[1,2,3,4,5,6,7,8];
number.forEach((value,index)=>{
    console.log(value,index);
});

const users =[

    {full_name: "Ram", age:12, city: "Salem",
    
    salary:10000},
    
    {full_name: "Sam", age:15, city: "Chennai",
    
    salary:10500},
    
    {full_name: "Ravi", age: 22, city: "Namakkal", salary: 12000},
    
    {full_name: "Joes", age:18, city: "Hosur",
    
    salary:6000},
    
    {full_name: "Aureen", age:47, city: "Dharmapuri", salary: 10000},
    
    {full_name: "Stanley", age:10, city: "Salem", salary: 8000},
    
    ];

    users.forEach((value)=>{
        console.log(value.full_name);
    })
//console.table(users);

*/

//Map

/*
const number=[1,2,3,4,5,6,7,8];

//value,index,array
let sqrt=number.map((value)=>{
    return Math.sqrt(value).toFixed(2);
});
console.table(sqrt);


const users =[

    {full_name: "Ram", age:12, city: "Salem",
    
    salary:10000},
    
    {full_name: "Sam", age:15, city: "Chennai",
    
    salary:10500},
    
    {full_name: "Ravi", age: 22, city: "Namakkal", salary: 12000},
    
    {full_name: "Joes", age:18, city: "Hosur",
    
    salary:6000},
    
    {full_name: "Aureen", age:47, city: "Dharmapuri", salary: 10000},
    
    {full_name: "Stanley", age:10, city: "Salem", salary: 8000},
    
    ];

    console.table(users);

let eligible_status=users.map((user) => ({
/*name:user.name,
age:user.age,
city:user.city,
salary:user.salary,*/
/*
...user,
status: user.age>=18? "Eligible":"Not Eligible"

}));

console.table(eligible_status); 

*/


/*splice
to remove the elements in array
*/


//sort

/*
const users =[

    {full_name: "Ram", age:12, city: "Salem",
    
    salary:10000},
    
    {full_name: "Sam", age:15, city: "Chennai",
    
    salary:10500},
    
    {full_name: "Ravi", age: 22, city: "Namakkal", salary: 12000},
    
    {full_name: "Joes", age:18, city: "Hosur",
    
    salary:6000},
    
    {full_name: "Aureen", age:47, city: "Dharmapuri", salary: 10000},
    
    {full_name: "Stanley", age:10, city: "Salem", salary: 8000},
    
    ];

    console.table(users);

    users.sort((a,b)=>{
        return a.age-b.age;

    });
    console.table(users);
    */

    //fill (value,start,end)

    /*
    let n=[1,2,3,4,5,6,7,8];
    console.log(n);
    n.fill(77,1,3);
    console.log(n);
    */

    //includes

    /*
    const n=[1,2,3,4,5,6,7,8,9];
    let result=n.includes(7);
    console.log(result);
    result=n.includes(7,0);
    console.log(result);
    */

    //ARRAY JOINS

    /*
    const n=[1,2,3,4,5,6,7,8,9];
    console.log(n);

    console.log(n.join());
    console.log(n.join('|'));
*/

//reverse

/*
const n=[1,2,3,4,5,6,7,8,9];
console.log(n);
n.reverse();
console.log(n);
*/

//  PUSH

/*
const n=[1,2,3,4,5];
console.log(n);
console.log(n.push(6,7,8,9,0));
console.log(n);

//merging 2 arr
let u1=["pavi","kas"];
let u2=["rohu","pranesh"];
u1.push(...u2);
console.log(u1);

*/

//POP

/*
const n=["pavi","kas","rohu","pranesh"];
console.log(n);
console.log(n.pop());
console.log(n);
*/

//SHIFT

/*
const n=["pavi","kas","rohu","pranesh"];
console.log(n);
console.log(n.shift());
console.log(n);
*/

//UNSHIFT

/*
const n=["pavi","kas","rohu","pranesh"];
console.log(n);
 console.log(n.length);
 let length=n.unshift("rahul");
 console.log(n);
 console.log(n.length);
 */

 //spread

 /*
 const n=["pavi","kas","rohu","pranesh"];
 updated=[...n,"rahul"];
 console.log(updated);
*/

//REST

let pavi={
    f_name:'Pavithra',
    age:21
}
let {f_name,...rest}=pavi;

console.log(rest);
 
