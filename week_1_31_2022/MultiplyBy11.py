# -*- coding: utf-8 -*-
"""
Given a positive number as a string, multiply the number by 11 and also return it as a string.
However, there is a catch:
You are NOT ALLOWED to simply cast the numeric string into an integer!
"""


def multiply_by_11(given_str):
    ans = given_str[-1]
    carry_one = 0
    while len(given_str) > 1:
        sum_last_two = int(given_str[-1]) + int(given_str[-2])
        remainder = sum_last_two % 10
        ans = str(remainder + carry_one) + ans
        carry_one = int(sum_last_two / 10)
        given_str = given_str[:-1]
    ans = str(int(given_str[0]) + carry_one) + ans
    return ans


print('"11" ->', multiply_by_11("11"))
print('"111111111" ->', multiply_by_11("111111111"))
print('"1213200020" ->', multiply_by_11("1213200020"))
print('"1217197941" ->', multiply_by_11("1217197941"))
print('"9473745364784876253253263723" ->',
      multiply_by_11("9473745364784876253253263723"))
