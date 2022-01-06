x = raw_input ("Enter name of customer: ")

w = input ("Number of nights: ")

input ("Total room service charge($): ")

input ("Total telephone charge($): ")

print "River Bend Hotel Bill (Customer:" , x , ")")

trc = int(55 * w) 

print  "Total room charge($):" , trc , 

et = float( trc * 0.1)

print "Entertainment tax($):" , et ,

tb = int(trc + 135 + 12.5 + et)

print "Total bill($):" , tb 


       
