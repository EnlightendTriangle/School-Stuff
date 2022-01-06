import cmath          #This source codes solves the quadratic equation

print ("Solve the quadratic equation: ax**2 + bx + c = 0")

a = input("Please enter value for a: ")
b = input("Please enter value for b: ")
c = input("Please enter value for c: ")

a = float(a)
b = float(b)
c = float(c)


discriminant = (int(b**2) - (4 *a*c))


sol1 = (-b-cmath.sqrt(discriminant))/(2*a)
sol2 = (-b+cmath.sqrt(discriminant))/(2*a)

print ("These are the solutions!"), raw_input(sol1)+raw_input(sol2) .format(sol1,sol2)

