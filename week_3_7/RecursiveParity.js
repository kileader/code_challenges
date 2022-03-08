/*
Write a recursive function that filters the items in an array (given as parameter arr) by positional parity (odd or even),
given as parameter par, starting from the opposite end. Return an array of items on odd positions (... 5, 3, 1) or on even positions
(... 6, 4, 2) and counting from the last item in the array.
*/

let start = true;
let ans;

const getItemsAt = (arr, par) => {
  if (start == true) {
    ans = [];
    start = false;
  }
  if (par == "odd") {
    ans.unshift(arr[arr.length - 1]);
  } else if (par == "even" && arr.length > 1) {
    ans.unshift(arr[arr.length - 2]);
  }
  if (arr.length <= 2) {
    start = true;
    return ans;
  } else {
    arr.pop();
    arr.pop();
    return getItemsAt(arr, par);
  }
};

console.log('getItemsAt([2, 4, 6, 8, 10], "odd") -> ' + getItemsAt([2, 4, 6, 8, 10], "odd"));
console.log(
  'getItemsAt(["E", "D", "A", "B", "I", "T"], "even") -> ' + getItemsAt(["E", "D", "A", "B", "I", "T"], "even")
);
console.log(
  'getItemsAt([")", "(", "*", "&", "^", "%", "$", "#", "@", "!"], "even") -> ' +
    getItemsAt([")", "(", "*", "&", "^", "%", "$", "#", "@", "!"], "even")
);
console.log(
  'getItemsAt(["A", "R", "B", "I", "T", "R", "A", "R", "I", "L", "Y"], "even") -> ' +
    getItemsAt(["A", "R", "B", "I", "T", "R", "A", "R", "I", "L", "Y"], "even")
);
