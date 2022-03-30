import zeep

wsdl = 'http://localhost:8080/ws/calculator.wsdl'
client = zeep.Client(wsdl=wsdl)

while(True):
    num1 = float(input("Number 1: "))
    num2 = float(input("Number 2: "))
    operation = input("Operator: ")
    try:
        print("Result: " + str(client.service.calculator(num1, num2, operation.strip())))
    except Exception as e: 
        print(e)
    print("")
