class Palindrome(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        a=x
        rev=0
        while x>0:
            rem= x%10
            rev= rem+rev*10
            x//=10
        return a==rev
    
def main():
        
        sol = Palindrome()
        print(sol.isPalindrome(1221))
        # Using the special variable 
        # __name__
if __name__=="__main__":
        main()