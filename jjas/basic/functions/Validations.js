console.log('Start Functions Validations ...');

var validations = {
    validateRequired: function(value) {
        return value !== undefined && value !== null && value != "";
    },
    validateNumber: function (number) {
        return Number.isInteger(number);
    },
    validateNumberRange: function (number, min, max) {
        if (!validations.validateNumber(number)) {
            return false;
        }
        return number >= min && number <= max;
    },
    validateMaxLength: function(value, max) {
        if (!(value instanceof String)) {
            return false;
        }
        return value.length <= max;
    },
    validateDate: function(date) {
        const realDate = new Date(date);
        return (realDate !== "Invalid Date") && !isNaN(realDate);
    },
    validateEMail: function(email) {
        const re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return re.test(String(email).toLowerCase());
    }

}

console.log('validateRequired(100) = ', validations.validateRequired(100));
console.log('validateRequired("") = ', validations.validateRequired(""));
console.log('validateRequired("hello") = ', validations.validateRequired("hello"));
console.log('validateRequired(null) = ', validations.validateRequired(null));
console.log('validateRequired() = ', validations.validateRequired());

console.log('validateMaxLength("", 5) = ', validations.validateMaxLength("", 5));
console.log('validateMaxLength("testtest", 5) = ', validations.validateMaxLength("testtest", 5));
console.log('validateMaxLength(undefined, 5) = ', validations.validateMaxLength(undefined, 5));

console.log('validateNumber(100) = ', validations.validateNumber(100));
console.log('validateNumber(\'hello\') = ', validations.validateNumber('hello'));
console.log('validations.validateNumber(100 / 0) = ', validations.validateNumber(100 / 0));
console.log('validations.validateNumber(null) = ', validations.validateNumber(null));
console.log('validations.validateNumber(undefined) = ', validations.validateNumber(undefined));

console.log('validations.validateNumberRange(100, 1, 100) = ', validations.validateNumberRange(100, 1, 100));
console.log('validations.validateNumberRange(100, 1, 10) = ', validations.validateNumberRange(100, 1, 10));

console.log('validations.validateDate(new Date().toString()) = ', validations.validateDate(new Date().toString()));
console.log('validations.validateDate("hello") = ', validations.validateDate('hello'));
console.log('validations.validateDate("2020-09-05T17:00:00.000Z") = ', validations.validateDate('2020-09-05T17:00:00.000Z'));

console.log('validations.validateEMail("info@simtech-ag.ch") = ', validations.validateEMail("info@simtech-ag.ch"));
console.log('validations.validateEMail("info.simtech-ag.ch") = ', validations.validateEMail("info.simtech-ag.ch"));
console.log('validations.validateEMail("info@simtech-ag") = ', validations.validateEMail("info@simtech-ag"));

console.log('... Done Functions Validations');