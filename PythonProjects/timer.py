import time

t = int(input("How many seconds do you want to set timer for?"))

while t:
    mins = t // 60
    sec = t % 60
    timer = '{:02d}:{:02d}'.format(mins,sec)
    print(timer, end="\r")
    time.sleep(1)
    t -=1
print("Balst off !!")