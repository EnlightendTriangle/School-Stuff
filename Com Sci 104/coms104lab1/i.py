from random import random

r = random

x = int(input("Enter your favorite number: "))

n = r + x

if (r + x) // 5:
    print ("Your secret number is" , x , "and your sum is" , n)

else: print ("Sorry! You lose!")
