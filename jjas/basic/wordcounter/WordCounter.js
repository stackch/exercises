/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/basic/wordcounter
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

console.log('Start Count Words ...');

let sentence = "if it is to be it is up to me to delegate";
let words = sentence.split(" ");
let wordCounter = new Map();

for (let i = 0, len = words.length; i < len; i++) {
    let word = words[i];
    let freq = wordCounter.get(word);
    wordCounter.set(word, (!freq ? 1 : freq + 1));
}

console.log('wordCounter = ', wordCounter);

console.log('... Done Count Words');
