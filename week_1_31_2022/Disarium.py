# -*- coding: utf-8 -*-
"""
A number is said to be Disarium if the sum of its digits raised to their respective positions is the number itself.
Create a function that determines whether a number is a Disarium or not.
"""


def is_disarium(number):
    string = str(number)
    ans = 0
    i = 0
    for c in string:
        i += 1
        ans += int(c) ** i
    if ans == number:
        return True
    return False


print('"is_disarium(75)" ->', is_disarium(75))
print('"is_disarium(135)" ->', is_disarium(135))
print('"is_disarium(544)" ->', is_disarium(544))
print('"is_disarium(518)" ->', is_disarium(518))
print('"is_disarium(466)" ->', is_disarium(466))
print('"is_disarium(8)" ->', is_disarium(8))
