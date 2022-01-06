import math         #Use this to make unit conversions 

print ("Unit Conversion")

Unit1 = input ("Convert from (gal, lb, mi): ")
Unit2 = input ("Convert to (l, kg, and km): ")

if Unit1 != "gal" or "lb" or "mi" and Unit2 != "l" or "kg" or "km":
    print ("Error: Incompatible conversion.")

num1 = int(input("Enter your value: "))
           
if Unit1 == "gal" and Unit2 == "l":
    print (num1 , "gal = " , float(num1 * 3.78541) , "l")

elif Unit1 == "lb" and Unit2 == "kg":
    print (num1 , "lb = " , float(num1 * 0.45359) , "kg")

elif Unit1 == "mi" and Unit2 == "km":
    print (num1 , "mi = " , float(num1 * 1.60934) , "km")


   

    
            
    
    

    
    


