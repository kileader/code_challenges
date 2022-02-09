/*
Create a function that takes guitar strings as an array of frequencies, starting at the first string (High E) and ending in the sixth string (Low E).

The function must return the display of a tuner for each string, in the same order, as an array.

(You can find the frequencies of the strings on the Wikipedia page)

-The guitar strings are played 1st to 6th, High E to Low E.
-If the guitar string matches, return "OK" for that guitar string.
-If it's too low, return ">•" for 1 or 2 percent off (the arrow means, tune up).
-Return ">>•" if it's way off. For more than 3 percent.
-If it's too high, return "•<" for 1 or 2 percent, and "•<<" for more, (tune down).
-Check the rounded percentages.
-If 0 is given, the guitar string isn't played, return " - ".

Examples:
tune([0, 246.94, 0, 0, 0, 80]) ➞ [" - ", "OK", " - ", " - ", " - ", ">>•"]

tune([329, 246, 195, 146, 111, 82]) ➞ ["OK", "OK", ">•", ">•", "•<", "OK" ]

tune([329.63, 246.94, 196, 146.83, 110, 82.41]) ➞ ["OK", "OK", "OK", "OK", "OK", "OK"]

Notes:
Items in the array will always be numbers.
*/

const tune = (freqs) => {
  let ans = [];
  let inTune = [329.63, 246.94, 196.0, 146.83, 110.0, 82.41];
  for (let i = 0; i < 6; i++) {
    let off = (freqs[i] * 100) / inTune[i] - 100;
    if (freqs[i] == 0) {
      ans.push(" - ");
    } else if (-1 < off && off < 1) {
      ans.push("OK");
    } else if (-3 <= off && off <= -1) {
      ans.push(">•");
    } else if (off < -3) {
      ans.push(">>•");
    } else if (1 <= off && off <= 3) {
      ans.push("<•");
    } else if (3 < off) {
      ans.push("<<•");
    }
  }
  return ans;
};

console.log("tune([0, 246.94, 0, 0, 0, 80]) -> [" + tune([0, 246.94, 0, 0, 0, 80]) + "]");
console.log("tune([329, 246, 195, 146, 111, 82]) -> [" + tune([329, 246, 195, 146, 111, 82]) + "]");
console.log(
  "tune([329.63, 246.94, 196, 146.83, 110, 82.41]) -> [" + tune([329.63, 246.94, 196, 146.83, 110, 82.41]) + "]"
);
