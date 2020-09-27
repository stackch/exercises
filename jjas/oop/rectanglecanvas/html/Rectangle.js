/*
 * see https://dev.simtech-ag.ch/education/internet/jjas/resources/oo/rectanglecanvas
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

'use strict';

class Rectangle {
    constructor(x, y, width, height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    toString() {
        return 'Rectangle [x=' + this.x + ', y=' + this.y + ', width=' + this.width + ', height=' + this.height + ']';
    }
};
