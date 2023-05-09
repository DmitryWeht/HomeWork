
// const numbersDiv = document.querySelector('.numbers');
// for (let i = 100; i >= 50; i -= 10) {
//  const p = document.createElement('p');
//   p.textContent = i;
//   numbersDiv.appendChild(p);
// }

// const strings = ["Первая строка", "Ввторая строка", "Третья строка"];
// const container = document.querySelector('.strings_container');
// for (let i = 0; i < strings.length; i++) {
//   const paragraph = document.createElement('p');
//   paragraph.textContent = strings[i];
//   container.appendChild(paragraph);
// }


 const users = [
   {first_name: 'Иван', last_name: 'Иванов', age: 25},
   {first_name: 'Петр', last_name: 'Петров', age: 17},
   {first_name: 'Анна', last_name: 'Аннова', age: 18},
   {first_name: 'Сергей', last_name: 'Сергеев', age: 30},
   {first_name: 'Степан', last_name: 'Ефремов', age: 14},

 ];

 const container = document.querySelector('.users_container');
for (let i = 0; i < users.length; i++) {
  if (users[i].age >= 18) {
   const card = document.createElement('div');
    card.classList.add('user_card');
    
    const name = document.createElement('p');
    name.textContent = 'Имя: ' + users[i].first_name;
    
    const lastName = document.createElement('p');
    lastName.textContent = 'Фамилия: ' + users[i].last_name;
    
    const age = document.createElement('p');
    age.textContent = 'Возраст: ' + users[i].age;
    

    card.appendChild(name);
    card.appendChild(lastName);
    card.appendChild(age);
    
 
    container.appendChild(card);
  }
}