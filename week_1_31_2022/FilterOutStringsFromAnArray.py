# -*- coding: utf-8 -*-
"""
Create a function that takes an array of non-negative integers and strings and
returns a new array without the strings.
"""


def filter_array(array):
    answer = []
    for e in array:
        if isinstance(e, int):
            answer.append(e)
    return answer


print('[1, 2, "a", "b"] -->', filter_array([1, 2, "a", "b"]))
print('[1, "a", "b", 0, 15] -->', filter_array([1, "a", "b", 0, 15]))
print('[1, 2, "aasf", "1", "123", 123] -->',
      filter_array([1, 2, "aasf", "1", "123", 123]))
