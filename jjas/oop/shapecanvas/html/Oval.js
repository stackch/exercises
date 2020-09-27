/*
 * see https://dev.simtech-ag.ch/education/internet/jjas/resources/oo/shapecanvas
 * author: Daniel Schmutz
 * copyright: Simtech AG (https://www.simtech-ag.ch)
*/

'use strict';

class Oval extends Shape {
    constructor(x, y, width, height, color, fill = false) {
        super(x, y, width, height, color, fill);
    }

    getArea() {
        return this.width * this.height * Math.PI / 4.0;
    }

    draw(canvas) {
        let ctx = canvas.getContext("2d");
        ctx.beginPath();
        if (this.fill) {
            ctx.fillStyle = this.color;
            ctx.strokeStyle = this.color;
            ctx.ellipse(this.x, this.y, this.width / 2, this.height / 2, 0, 0, Math.PI*2)
            ctx.fill();
        } else {
            ctx.strokeStyle = this.color;
            ctx.ellipse(this.x, this.y, this.width / 2, this.height / 2, 0, 0, Math.PI*2)
            ctx.stroke();
        }
        ctx.fillStyle = this.color;
        ctx.fillText('area = ' +  this.getArea(), this.x - (this.width / 2), this.y-(this.height / 2) - 4);
    }

};
