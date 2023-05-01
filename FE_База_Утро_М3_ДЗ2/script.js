// for (let i = 0; i <= 10; i += 2) {
//     console.log(i);
//   }


// for (let i = 55; i >= 20; i--) {
//     console.log(i);
//   }
  
//   const numbers = [3, 5, 11, 2, 8, 1, 6];
//   const numbers_squared = [];
  
//   for (let i = 0; i < numbers.length; i++) {
//     const square = numbers[i] * numbers[i];
//     numbers_squared[i] = square;
//   }
  
//   console.log(numbers_squared);

  const numbers = [3, 5, 11, 2, 8, 1, 6];
const numbers_squared = [];
let last_elem;

for (let i = 0; i < numbers.length; i++) {
  const square = numbers[i] * numbers[i];
  numbers_squared[i] = square;
  last_elem = square;
}

console.log(last_elem);

const user = {
    first_name: 'Ivan',
    last_name: 'Ivanov',
    age: 20,
    salary: 500
  };
  
  const user_info = `User's name is ${user.first_name} ${user.last_name}. He is ${user.age} years old`;
  console.log(user_info);