/*
Write two functions:
- One to retrieve all unique substrings that start and end with a vowel.
- One to retrieve all unique substrings that start and end with a consonant.
The resulting array should be sorted in lexicographic ascending order (same order as a dictionary).
Notes:
- Remember the output array should have unique values.
- The word itself counts as a potential substring.
- Exclude the empty string when outputting the array.
*/
const getVowelSubstrings = (given) => {
  let chars = Array.from(given);
  substrings = [];
  for (let i = 0; i < chars.length; i++) {
    if (
      chars[i] == "a" ||
      chars[i] == "e" ||
      chars[i] == "i" ||
      chars[i] == "o" ||
      chars[i] == "u" ||
      chars[i] == "y"
    ) {
      substrings.push(chars[i]);
      for (let j = i + 1; j < chars.length; j++) {
        let substring = "";
        if (
          chars[j] == "a" ||
          chars[j] == "e" ||
          chars[j] == "i" ||
          chars[j] == "o" ||
          chars[j] == "u" ||
          chars[j] == "y"
        ) {
          for (let k = i; k < j + 1; k++) {
            substring += chars[k];
          }
          substrings.push(substring);
        }
      }
    }
  }
  substrings.sort();
  return substrings;
};
const getConsonantSubstrings = (given) => {
  let chars = Array.from(given);
  substrings = [];
  for (let i = 0; i < chars.length; i++) {
    if (
      chars[i] != "a" &&
      chars[i] != "e" &&
      chars[i] != "i" &&
      chars[i] != "o" &&
      chars[i] != "u" &&
      chars[i] != "y"
    ) {
      substrings.push(chars[i]);
      for (let j = i + 1; j < chars.length; j++) {
        let substring = "";
        if (
          chars[j] != "a" &&
          chars[j] != "e" &&
          chars[j] != "i" &&
          chars[j] != "o" &&
          chars[j] != "u" &&
          chars[j] != "y"
        ) {
          for (let k = i; k < j + 1; k++) {
            substring += chars[k];
          }
          substrings.push(substring);
        }
      }
    }
  }
  substrings.sort();
  return substrings;
};

console.log('getVowelSubstrings("apple") -> ' + getVowelSubstrings("apple"));
console.log('getVowelSubstrings("hmm") -> ' + getVowelSubstrings("hmm"));
console.log('getConsonantSubstrings("aviation") -> ' + getConsonantSubstrings("aviation"));
console.log('getConsonantSubstrings("motor") -> ' + getConsonantSubstrings("motor"));
