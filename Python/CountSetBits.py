def countSetBits(n):
    counter = 0
    if n < 0:
        return 'INVALID INPUT'
    else:
        while n!= 0:
            n = n & (n - 1)
            counter += 1
        return counter
num = int(input('ENTER ANY NUMBER: '))
print('NUMBER OF SET BITS IN ', num, 'IS: ', countSetBits(num))