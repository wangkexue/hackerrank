#!usr/bin/python3
import re

if re.search("^M{0,3}(CM)?D?(CD)?C{0,3}(XC)?L?(XL)?X{0,3}(IX)?V?(IV)?I{0,3}$", input()):
    print("True")
else:
    print("False")
