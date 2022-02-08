# -*- coding: utf-8 -*-
"""
Create a solution that checks if a given string consists of a sub-string pattern 
repeated multiple times to return True or False.
"""


def repeated(string):
    for i in range(1, len(string)):
        if string[0] == string[i]:
            substr = string[0:i]
            if len(string) % len(substr) == 0 and string == int(len(string)/len(substr)) * substr:
                return True
    return False


print('repeated("a") -->', repeated("a"))
print('repeated("ababab") -->', repeated("ababab"))
print('repeated("aba") -->', repeated("aba"))
print('repeated("abcabcabcabc") -->', repeated("abcabcabcabc"))
print('repeated("aaxxtaaxztaaxxt") -->', repeated("aaxxtaaxztaaxxt"))
