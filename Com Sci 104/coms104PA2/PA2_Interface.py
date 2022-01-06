from PA2_Functions import findUniqueDigits, generateSecretNumber, findBulls, findCows

print ("Bulls and Cows Game")

secret = generateSecretNumber()
guess = input ("Enter your Guess: ")


while guess != secret:
    bulls = findBulls(secret, guess)
    cows = findCows(secret, guess)

    print (secret, cows, "A",bulls,"B") #I put secret in so that the game can be tested, delete it out to play without secret number
    guess = input("Enter your guess: ") 
    
if guess == secret:
    print ("That's it!")


