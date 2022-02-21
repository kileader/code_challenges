/*
When coloring a striped pattern, you may start by coloring each square sequentially, meaning you spend time needing to switch coloring pencils.
Create a function where given an array of colors cols, return how long it takes to color the whole pattern. Note the following times:
It takes 1 second to switch between pencils.
It takes 2 seconds to color a square.
See the example below for clarification.
<code>color_pattern_times(["Red", "Blue", "Red", "Blue", "Red"]) ➞ 14</code><code>// There are 5 colors so it takes 2 seconds to color each one (2 x 5 = 10).</code><code>// You need to switch the pencils 4 times and it takes 1 second to switch (1 x 4 = 4).</code><code>// 10 + 4 = 14</code>
Examples
<code>colorPatternTimes(["Blue"]) ➞ 2</code><code>colorPatternTimes(["Red", "Yellow", "Green", "Blue"]) ➞ 11</code><code>colorPatternTimes(["Blue", "Blue", "Blue", "Red", "Red", "Red"]) ➞ 13</code>
Notes
Only change coloring pencils if the next color is different to the color before it.
Return a number in seconds.
*/
const colorPatternTimes = (cols) => {
  let time = cols.length * 2;
  for (let i = 1; i < cols.length; i++) {
    if (cols[i - 1] != cols[i]) {
      time += 1;
    }
  }
  return time;
};
console.log(
  'colorPatternTimes(["Red", "Blue", "Red", "Blue", "Red"]) -> ' +
    colorPatternTimes(["Red", "Blue", "Red", "Blue", "Red"])
);
console.log('colorPatternTimes(["Blue"]) -> ' + colorPatternTimes(["Blue"]));
console.log(
  'colorPatternTimes(["Red", "Yellow", "Green", "Blue"]) -> ' + colorPatternTimes(["Red", "Yellow", "Green", "Blue"])
);
console.log(
  'colorPatternTimes(["Blue", "Blue", "Blue", "Red", "Red", "Red"]) -> ' +
    colorPatternTimes(["Blue", "Blue", "Blue", "Red", "Red", "Red"])
);
