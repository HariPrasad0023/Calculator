console.log('Hello World!');

// Learning Variable
let age = 29;
let name = 'Hari Prasad';

console.log("Name : " + name + "\nAge : " + age);

// Learning Operators
if (29 == '29') {
    console.log('== is evaluating to true part');
}
else {
    console.log('=== is evaluating to false part');
}

if (29 === '29') {
    console.log('== is evaluating to true part');
}
else {
    console.log('=== is evaluating to false part');
}

// Learning Array

let array = ['RCS', 'Malliga', 'Hari', 'Siva'];

console.log(array[2] + " is son of " + array[0] + " and " + array[1]);

greet(array[2]);

function greet(name) {
    console.log('Hello ' + name + ', How are you doing?');
}

// Learning Objects

let person = {
    name: 'Hari',
    age: 29,
    mobileNo: 9108888993
};

console.log(person);
console.log(person.name + " " + person.mobileNo);

// Learning Events

//importing events module
const EventEmitter = require('events');

// Creating an instance of EventEmitter
const myEmitter = new EventEmitter();

// Event handler function 
const eventHandler = () => {
    console.log('something happened!');
};

// Attach the event handler to 'myEvent' event
myEmitter.on('Hello', eventHandler);

myEmitter.emit('Hello');

// Ternary Operator
const message = person.age > 18 ? 'Your an adult' : 'Your not an adult';
console.log(message);
