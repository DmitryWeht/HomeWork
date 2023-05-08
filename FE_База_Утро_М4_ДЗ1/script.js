// 1 Задание
//   function printEvenNumbers(num1, num2) {
//       const maxNum = Math.max(num1, num2);
//       const minNum = Math.min(num1, num2);
    
//      for (let num = maxNum; num >= minNum; num--) {
//        if (num % 2 === 0) {
//           console.log(num);
//         }
//      }
//    }
//    printEvenNumbers(1, 10)  

// Задание 2
//      function power(base, exponent = 2) {
//        return Math.pow(base, exponent);
      
//      }
     
    

// Задание 3
//   function sumNumbers(n) {
//      let sum = 0;
//       for (let i = 1; i <= n; i++) {
//         sum += i;
//      }
//       return sum;
//    }
//     sumNumbers(5);

// Задание 4
//    function sumEvenOdd(n, m) {
//      let sumEven = 0;
//      let sumOdd = 0;
//      for (let i = n; i <= m; i++) {
//        if (i % 2 === 0) {
//          sumEven += i;
//        } else {
//          sumOdd += i;
//        }
//      }
//      console.log(`Сумма четных чисел: ${sumEven}`);
//      console.log(`Сумма нечетных чисел: ${sumOdd}`);
//      }
//      sumEvenOdd(1, 10);
//      sumEvenOdd(0, 5);


// Задание 5
// function findLongestString(strings) {
//     if (strings.length === 0) {
//       return null; 
//     }
    
//     let longestString = strings[0];
//     for (let i = 1; i < strings.length; i++) {
//       if (strings[i].length > longestString.length) {
//         longestString = strings[i];
//       }
//     }
    
//     return longestString;
//   }
//   findLongestString(['one', 'two', 'three']);
//   const strings = ['one', 'two', 'three'];
// console.log(findLongestString(strings));