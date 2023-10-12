//Numbers
const numbers = [5, 1, 3, 2, 4];

numbers.sort((a, b) => b - a);

console.log(numbers);


//Strings
const words = ["banana", "apple", "cherry", "date"];

words.sort((a, b) => b.localeCompare(a));

console.log(words);
