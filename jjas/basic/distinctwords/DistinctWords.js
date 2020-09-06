/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/basic/distinctwords
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

console.log('Start Distinct Words ...');

let sentence = "if it is to be it is up to me to delegate";
let words = sentence.split(" ");
let distinctWords = new Set();

for (let i = 0, len = words.length; i < len; i++) {
    let word = words[i];
    if (distinctWords.has(word)) {
        console.log('distinct word ', word, ' detected');
    }
    distinctWords.add(word);
}

console.log('distinctWords = ', distinctWords);

console.log('... Done Distinct Words');
