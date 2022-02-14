# -*- coding: utf-8 -*-
"""
The Atbash cipher is an encryption method in which each letter of a word is 
replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.
Create a function that takes a string and applies the Atbash cipher to it.
"""


def atbash(string):

    ans = ""
    for c in string:
        code = ord(c)
        if 64 < code and code < 91:
            capOrd = code - 65
            ans += chr(90-capOrd)
        elif 96 < code and code < 123:
            lowOrd = code - 97
            ans += chr(122-lowOrd)
        else:
            ans += c
    return ans


print('"atbash("apple")" ->', atbash("apple"))
print('"atbash("Hello world!")" ->', atbash("Hello world!"))
print('"atbash("Christmas is the 25th of December")" ->',
      atbash("Christmas is the 25th of December"))
