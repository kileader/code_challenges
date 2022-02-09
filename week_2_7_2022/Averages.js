/*
In this exercise the goal is to extend the Math() object adding four methods for calculate different types of averages.

-Arithmetic Mean: The division of the sum of the numbers by the quantity of numbers.
avg of [A, B, C] ➞ (A + B + C) / 3
-Quadratic Mean: Also called Root Mean Square, is the square root of the arithmetic mean of the squared numbers.
qAvg of [A, B, C] ➞ ²√ ( (A² + B² + C²) / 3 )
-Harmonic Mean: is the reciprocal of the arithmetic mean of the numbers reciprocals.
hAvg of [A, B, C] ➞ ( (A⁻¹ + B⁻¹ + C⁻¹) / 3 )⁻¹
-Geometric Mean: is the n-th root of the product of the numbers, where n is the quantity of numbers.
gAvg of [A, B, C] ➞ ³√ (A B C)

For each average type build a function that, given a required parameter (the array containing the numbers) 
and an optional one (the precision, or number of floating digits to return) returns the result as a number.

Notes:
-Pay attention to cumulative rounding errors! Precision is required only if the parameter is indicated and only for the final result.
-All given arrays are valid ones containing positive numbers greater than zero, either integers or float.
*/

Math.avg = (nums, p) => {
  let sum = 0;
  for (let i = 0; i < nums.length; i++) {
    sum += nums[i];
  }
  if (p === undefined) {
    return sum / nums.length;
  } else {
    return Math.round(10 ** p * (sum / nums.length)) / 10 ** p;
  }
};

Math.qAvg = (nums, p) => {
  let squaredSum = 0;
  for (let i = 0; i < nums.length; i++) {
    squaredSum += nums[i] ** 2;
  }
  if (p === undefined) {
    return Math.sqrt(squaredSum / nums.length);
  } else {
    return Math.round(10 ** p * Math.sqrt(squaredSum / nums.length)) / 10 ** p;
  }
};

Math.hAvg = (nums, p) => {
  let recipSum = 0;
  for (let i = 0; i < nums.length; i++) {
    recipSum += 1 / nums[i];
  }
  if (p === undefined) {
    return 1 / (recipSum / nums.length);
  } else {
    return Math.round(10 ** p / (recipSum / nums.length)) / 10 ** p;
  }
};

Math.gAvg = (nums, p) => {
  let product = 1;
  let root = nums.length;
  for (let i = 0; i < root; i++) {
    product *= nums[i];
  }
  if (p === undefined) {
    return product ** (1 / root);
  } else {
    return Math.round(10 ** p * product ** (1 / root)) / 10 ** p;
  }
};

console.log("Math.avg([3, 5, 7]) -> " + Math.avg([3, 5, 7]));
console.log("Math.qAvg([3, 5, 7], 1) -> " + Math.qAvg([3, 5, 7], 1));
console.log("Math.hAvg([3, 5, 7], 1) -> " + Math.hAvg([3, 5, 7], 1));
console.log("Math.gAvg([3, 5, 7], 1) -> " + Math.gAvg([3, 5, 7], 1));
