def user_name(first,last):
    last = input ("Enter your last name: ")
    first = input ("Enter your first name: ")
    l = last.lower().strip()
    y = first[0:1].upper().strip()
    print ("Your username is", y + l)


user_name("Kent","Mark")



