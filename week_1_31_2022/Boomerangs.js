/*
A boomerang is a V-shaped sequence that is either upright or upside down. Specifically, 
a boomerang can be defined as: sub-array of length 3, with the first and last digits being the same and the middle digit being different.
Some boomerang examples:
[3, 7, 3], [1, -1, 1], [5, 6, 5]
Create a function that returns the total number of boomerangs in an array.
Notes:
[5, 5, 5] (triple identical digits) is NOT considered a boomerang because the middle digit is identical to the first and last.
*/
const countBoomerangs = (given) => {
  let numOfBoomerangs = 0;
  for (let i = 0; i < given.length - 3; i++) {
    if (given[i] == given[i + 1]) {
      continue;
    } else if (given[i] == given[i + 2]) {
      numOfBoomerangs += 1;
    }
  }
  return numOfBoomerangs;
};

console.log("countBoomerangs([9, 5, 9, 5, 1, 1, 1]) -> " + countBoomerangs([9, 5, 9, 5, 1, 1, 1]));
console.log("countBoomerangs([5, 6, 6, 7, 6, 3, 9]) -> " + countBoomerangs([5, 6, 6, 7, 6, 3, 9]));
console.log("countBoomerangs([4, 4, 4, 9, 9, 9, 9]) -> " + countBoomerangs([4, 4, 4, 9, 9, 9, 9]));
