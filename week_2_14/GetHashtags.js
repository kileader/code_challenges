/*
Write a function that retrieves the top 3 longest words of a newspaper headline and transforms them into hashtags.
If multiple words tie for the same length, retrieve the word that occurs first.
*/
const getHashTags = (given) => {
  let words = given.split(" ");
  for (let i = 0; i < words.length; i++) {
    words[i] = words[i].replace(/[^\w\-]+/i, "");
  }
  let wordsByLength = ["#" + words[0].toLowerCase()];
  outer: for (let i = 1; i < words.length; i++) {
    let hashtag = "#" + words[i].toLowerCase();
    if (wordsByLength.includes(hashtag)) {
      continue;
    }
    for (let j = 0; j < wordsByLength.length; j++) {
      if (hashtag.length > wordsByLength[j].length) {
        wordsByLength.splice(j, 0, hashtag);
        continue outer;
      }
    }
    wordsByLength.push(hashtag);
  }
  if (wordsByLength.length < 3) {
    return wordsByLength;
  }
  return wordsByLength.slice(0, 3);
};

console.log(
  'getHashTags("How the Avocado Became the Fruit of the Global Trade") -> ' +
    getHashTags("How the Avocado Became the Fruit of the Global Trade")
);
console.log(
  'getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year") -> ' +
    getHashTags("Why You Will Probably Pay More for Your Christmas Tree This Year")
);
console.log(
  'getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit") -> ' +
    getHashTags("Hey Parents, Surprise, Fruit Juice Is Not Fruit")
);
console.log('getHashTags("Visualizing Science") -> ' + getHashTags("Visualizing Science"));
