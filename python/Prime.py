class Prime:
    def checkPrime(self, num):
        flag=True
        x=2
        for x in range(2, num // 2 ):
            if(num%x==0):
                flag=False
                return flag
        return flag
def main():
    p= Prime()
    if(p.checkPrime(15)):
        print("its a prime number")
    else:
        print("its not a prime number")

if __name__=="__main__":
    main()
            