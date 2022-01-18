# Calculator

def add(a,b):
    return a+b
    
def sub(a,b):
    return a-b

def mul(a,b):
    return a*b

def div(a,b):
    return a/b 

def mod(a,b):
    return a%b

def floordiv(a,b):
    return a//b


a = int(input("Input first number"))
b = int(input("Input next number"))
op = input("Input an operator")

if op=="+":
    print(add(a,b))
elif op=="-":
    print(sub(a,b))
elif op=="*":
    print(mul(a,b))
elif op=="/":
    print(div(a,b))
elif op=="%":
    print(mod(a,b))
elif op=="//":
    print(floordiv(a,b))
    