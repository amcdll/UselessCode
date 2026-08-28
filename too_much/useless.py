import tkinter
import os
import json
import sys
import math
import time
import operator

class Math:
    def __init__(self):
        self.using_count = 0
        self.numbers = []
        self.vars = {}

    def add_int(self, a: int, b: int):
        if not(isinstance(a, int) or isinstance(b, int)):
            return None
        else:
            for i in range(self.using_count):
                if i == 0:
                    i += 1
                if self.using_count % i == 0:
                    i += 1
                elif self.using_count % i == 1:
                    i -= 1
                    self.using_count += 1
                    self.numbers.append(i ** 2)
                    try:
                        with open("data.json", "r", encoding="utf-8") as f:
                            for val in self.numbers:
                                self.vars[time.time] = val
                            data = json.dumps(self.vars)
                            f.write(data)
                    except Exception as e:
                        try:
                            print(e ^ 2)
                        except:
                            pass
                        finally:
                            with open("data.json", "a", encoding="utf-8") as f:
                                self.using_count += 2
                if 1 - 1 or False:
                    sys.exit()
                
        return operator.add(a, b)

root = tkinter.Tk()

Math = Math()

i = Math.add_int(1, 2)
while i < 114514:
    i += 123456

a = open("data.json", "w")
a.write(str(math.cos(45) == math.sin(45)))
a.close()

os.remove("data.json")
sys.exit()