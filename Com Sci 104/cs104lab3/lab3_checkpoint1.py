num = int(input("How many mousetraps? "))
res = raw_input ("Are you an Iowa resident (y/n)?:")

tax = 6.9
stotal = 115.0
stax = num * 0.06
total = 115.0

if res == "y":
    print ("Subtotal:") , stotal
    print ("Tax:") , tax

    if num <= 50:
        print ("Total:") , stotal + stax
    
else:
    first = 50 * 2.00
    extra = (num - 50) * 1.50
    total = first + extra
    print ("Total:"), total
