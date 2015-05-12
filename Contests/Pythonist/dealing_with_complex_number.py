import math

class Complex:
    def __init__(self, a, b):
        self.r = a
        self.c = b
        
    def __add__(self, that):
        return Complex(self.r + that.r, self.c + that.c)
    
    def __sub__(self, that):
        return Complex(self.r - that.r, self.c - that.c)
    
    def __mul__(self, that):
        return Complex(self.r * that.r - self.c * that.c, self.c * that.r + self.r * that.c)
    
    def __truediv__(self, that):
        deno = that.r**2 + that.c**2
        return Complex((self.r * that.r + self.c * that.c) / deno, (self.c * that.r - self.r * that.c) / deno)
    
    def mod(self):
        return math.sqrt(self.r**2 + self.c**2)
    
    def __str__(self):
        s = []
        if self.r == 0 and self.c == 0:
            return '0.00'
        if self.r != 0.:
            s.append("{0:.2f}".format(self.r))
        if self.c == 0.:
            return ''.join(s)
        if self.c > 0.:
            s.extend(['+', "{0:.2f}".format(self.c)+'i'])
            if self.r == 0:
                return s[-1]
            return ' '.join(s)
        if self.c < 0.:
            s.extend(['-', "{0:.2f}".format(-self.c)+'i'])
            if self.r == 0:
                return '-'+s[-1]
            return ' '.join(s)
        
a, b = map(float, input().split())
comp_1 = Complex(a, b)
a, b = map(float, input().split())
comp_2 = Complex(a, b)
print(comp_1 + comp_2)
print(comp_1 - comp_2)
print(comp_1 * comp_2)
print(comp_1 / comp_2)
print("{0:.2f}".format(comp_1.mod()))
print("{0:.2f}".format(comp_2.mod()))
        
