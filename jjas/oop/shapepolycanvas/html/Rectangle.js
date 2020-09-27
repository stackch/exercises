/*
 * see https://dev.simtech-ag.ch/education/internet/jjas/resources/oo/shapepolycanvas
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

'use strict';

class Rectangle extends Shape {
    constructor(x, y, width, height, color, fill = false) {
        super(x, y, width, height, color, fill);
    }

    getArea() {
        return this.width * this.height;
    }

    draw(canvas) {
        let ctx = canvas.getContext("2d");
        ctx.beginPath();
        if (this.fill) {
            ctx.fillStyle = this.color;
            ctx.fillRect(this.x, this.y, this.width, this.height);
        } else {
            ctx.strokeStyle = this.color;
            ctx.rect(this.x, this.y, this.width, this.height);
        }
        ctx.fillStyle = this.color;
        ctx.fillText('area = ' +  this.getArea(), this.x, this.y-4,);
        ctx.stroke();
    }

};
