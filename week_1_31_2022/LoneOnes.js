/*
Create a function which counts how many lone 1s appear in a given number. Lone means the number doesn't appear twice or more in a row.
Examples:
countLoneOnes(101) ➞ 2
countLoneOnes(1191) ➞ 1
countLoneOnes(1111) ➞ 0
countLoneOnes(462) ➞ 0
*/
const countLoneOnes = (given) => {
  let digits = Array.from(String(given));
  console.log(digits);
  let numOfLoneOnes = 0;
  let lastDigit = "-1";
  for (let i = 0; i < digits.length; i++) {
    if (digits[i] == "1" && lastDigit != "1" && digits[i + 1] != "1") {
      numOfLoneOnes++;
    }
    lastDigit = digits[i];
  }
  return numOfLoneOnes;
};

console.log("countLoneOnes(101) -> " + countLoneOnes(101));
console.log("countLoneOnes(1191) -> " + countLoneOnes(1191));
console.log("countLoneOnes(1111) -> " + countLoneOnes(1111));
console.log("countLoneOnes(462) -> " + countLoneOnes(462));
