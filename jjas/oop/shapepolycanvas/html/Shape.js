/*
 * see https://dev.simtech-ag.ch/education/internet/jjas/resources/oo/shapepolycanvas
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

'use strict';

class Shape {
    constructor(x, y, width, height, color, fill = false) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.fill = fill;
    }

    getArea() {
        return 0.0;
    }

    draw(canvas) { throw 'not supported'; }

    toString() {
        return this.className + ' [x=' + this.x + ', y=' + this.y + ', width=' + this.width + ', height=' + this.height + ']';
    }
};
