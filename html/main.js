alert('Welcome to Quiz Ninja!');

const characters = [
  ['Superman', 'Clark Kent'], 
  ['Wonder Woman', 'Diana Prince'],
  ['Batman', 'Bruce Wayne']
];

const heroes = new Map(characters);

let score = 0;

for(const [alterEgo, person] of heroes.entries()) {
  const response = ask(alterEgo);
  check(response, person);
}
gameOver();


function ask(alterEgo) {
  return prompt(`What is ${alterEgo}'s real name?`);
}

function check(response, answer) {
  if(response === answer) {
    alert('Correct!');
    score++;
  } else {
    alert (`Wrong! The correct answer was ${answer}.`);
  }
}  

function gameOver() {
  alert(`Your score is ${score}.`);
}
