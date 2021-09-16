# -*- coding: utf-8 -*-
"""
A foil has a thickness of 0.025mm. A roll is formed by tightly winding it
around a tube with an outside diameter of 4cm. Given the length of the foil
in cm, write a function that returns the diameter of the roll in cm measured
at its thickest point. Round the result to four places.
"""
import math
import decimal


def get_diameter(length):

    # All measurements are in micrometers for calculations
    length *= 10000
    thickness = 0.025 * 1000
    diameter = 4 * 10000

    while length > 0:
        if length < math.pi * diameter / 2:
            diameter += thickness
        else:
            diameter += thickness * 2
        length -= math.pi * (diameter - thickness)
    return round(diameter / 10000, 4)


print("foil(0) -->", get_diameter(0))
print("foil(50) -->", get_diameter(50))
print("foil(4321) -->", get_diameter(4321))
print("foil(10000) -->", get_diameter(10000))
