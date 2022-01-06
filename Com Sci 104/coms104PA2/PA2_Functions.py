from random import randint





def findUniqueDigits(s):
    uniqueDigits = []

    for i in range(len(s)):
     
        if uniqueDigits.count(s[i]) == 0:
            uniqueDigits.append(s[i])
    return uniqueDigits

def generateSecretNumber():
    r = randint(0,9999)
    stringR = str(r)
    l = len(stringR)
    return ((4-l) * "0" + stringR)

def findBulls (secret, guess):
    
    bulls = 0
    indexList = [0, 1, 2, 3]

    for i in indexList: 
        if guess [i] == secret [i]:
            bulls += 1

    return bulls
      

def findCows(secret, guess):

    bothBC = 0
   
    findUniqueDigits(secret)
    secretUniDigits = [1,2,3,4]
    for i in range(len(secretUniDigits)):
        secretCount = secretUniDigits.count(secretUniDigits[i])
        guessCount = secretUniDigits.count(secretUniDigits[i])
        a = min(secretCount , guessCount)
        bothBC = bothBC + a

    findBulls(secret, guess)
    bulls = findBulls(secret, guess)
    return(bothBC - bulls)


    

        



            
        
    
            
            
            
            
        
    
