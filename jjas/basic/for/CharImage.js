/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/basic/for
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

console.log('Start CharImage ...');

const xDim = 10;
const yDim = 10;
for(let i = 0; i < xDim; i++) {
    let line = '';
	for(let j = 0; j < yDim; j++) {
        if (i == j) {
            line += 'x';	
        } else {
            line += '&';								
        }
    }
    console.log(line);
}
console.log('... CharImage Done');
