var a = 5;
var b = 10;
var name = 'James'

function myTagFunction(strings, ...values) {
    console.log(strings);
    console.log(values);
}

myTagFunction`Hello ${ a + b } world ${ a * b} my name is ${name}`;
