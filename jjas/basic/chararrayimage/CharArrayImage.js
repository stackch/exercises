/*
 * see https://www.simtech-ag.ch/education/internet/jjas/resources/basic/chararrayimage
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

console.log('Start CharArrayImage ...');

const xDim = 10;
const yDim = 10;

const image = [];
// init the image
for(let i = 0; i < xDim; i++) {
    image[i] = [];
	for(let j = 0; j < yDim; j++) {
        if (i == j) {
            image[i][j] = 'x';	
        } else {
            image[i][j] = '&';								
        }
    }
}
// print the image
for(let i = 0; i < image.length; i++) {
    let line = '';
    for(let j = 0; j < yDim; j++) {
        line += image[i][j];
    }
    console.log(line);
}
console.log('... CharArrayImage Done');
