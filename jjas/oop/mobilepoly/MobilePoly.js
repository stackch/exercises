/*
 * see https://www.simtech-ag.ch/education/internet/jjas
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

console.log('Start Mobile Poly ...');

class Mobile {
    constructor() {
        
    }
    brake() {
        console.log('I am breaking');
    }
    move() {
        console.log('I move but do not know how');
    }
}

class Car extends Mobile {
    constructor() {
        super();
    }
    move() {
        console.log('On the street');
    }
}

class Ship extends Mobile {
    constructor() {
        super();
    }
    move() {
        console.log('Cross the sea');
    }

}

class Plane extends Mobile {
    constructor() {
        super();
    }
    move() {
        console.log('In the sky');
    }
}

let mobiles = [];
mobiles.push(new Car());
mobiles.push(new Ship());
mobiles.push(new Plane());

console.log('let\'s move');
for (const mobile of mobiles) {
    mobile.move();    
}

console.log('let\'s brake');
for (const mobile of mobiles) {
    mobile.brake();    
}

console.log('... Mobile Poly Done');
