def isPowerOfTwo(n):
    if n <= 0:
        return False
    else:
        return (n & (n - 1) == 0)
num = int(input('ENTER ANY NUMBER: '))
if(isPowerOfTwo(num)):
    print(num, 'IS A POWER OF TWO')
else:
    print(num, 'IS NOT A POWER OF TWO')