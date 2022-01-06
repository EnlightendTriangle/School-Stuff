from math import ceil

weigth = int(input ("Please enter the weight of the letter in ounce:"))


if weigth > 3.5:
    cost = .88 + ceil(weight - 1.00) * 0.17

else: cost = 0.44

if weigth > 1.00:
        cost = cost + ceil(weigth - 1.00) * 0.17

    

print "Cost:" , cost

