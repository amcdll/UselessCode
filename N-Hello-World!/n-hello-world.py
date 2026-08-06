import sys
import time

def is_natural_num(num_str: str):
    try:
        num = int(num_str)
    except ValueError:
        return False
    if num >= 0:
        return True
    else:
        return False

print("================")
print(" Hello, World!")
print("================")

time.sleep(0.5)

#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa，为什么我不太会英语！！！！！！！！！！！
#代码我写的，除了Hello, World!以外文本机翻的$##@$#^%$^%#$@%$^#@%^$@^%#$@$^@%^$#$%#%$@#@%$@$%@@%$#%^$%
while True:
    count_text = input("How many \"Hello, World!\" do you want?(You can enter ESC to exit): \n")
    if is_natural_num(count_text):
        count = int(count_text)
        if count > 100:
            print("Your number is too large!I need a natural number no greater than 100.")
        else:
            break
    elif count_text.strip().upper() == "ESC":
        sys.exit()
    else:
        print("I need a natural number.")

for i in range(count):
    print("Hello, World!")

print("Exit after 3 seconds")
time.sleep(3)
