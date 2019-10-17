
'''
    Assume the goal of problem three works only for positive integers.
    This case is handled in problem3.py in the __main__ function.
'''
import math

'''
    Takes in two strings and returns a single integer product.
'''
def find_number(num_one, num_two):
    num_one = string_to_char(num_one)
    num_two = string_to_char(num_two)
    new_one = 0
    new_two = 0
    len_one = len(num_one)
    len_two = len(num_two)
    temp_len = 0
    for letter in num_one:
        temp_len = calc_place(len_one)
        new_one += num_value(letter,temp_len)
        len_one -= 1
    for letter in num_two:
        temp_len = calc_place(len_two)
        new_two += num_value(letter, temp_len)
        len_two -= 1
    return new_one * new_two

'''
    Takes in one number and returns a string.
'''
def find_string(number):
    digits = []
    string = ''
    if number == 0:
        counter = 1
    else:
        counter = int(math.log10(number))+1
    while counter != 0:
        digits.append(number % 10)
        number = number // 10
        counter -= 1
    digits.reverse()
    for digit in digits:
        string += char_value(digit)
    return string


'''
    Converts a string to a list of characters.
'''
def string_to_char(string):
    return [ch for ch in string]


'''
    Converts from integer to string.
'''
def char_value(number):
    if number == 0:
        return "0"
    if number == 1:
        return "1"
    if number == 2:
        return "2"
    if number == 3:
        return "3"
    if number == 4:
        return "4"
    if number == 5:
        return "5"
    if number == 6:
        return "6"
    if number == 7:
        return "7"
    if number == 8:
        return "8"
    if number == 9:
        return "9"


'''
    Calculates the "placement" of a number i.e. the hundreds place, tens, etc.
'''
def calc_place(length):
    if length == 1:
        return 1
    else:
        return 10**(length-1)

'''
    Converts from character to number in specified place (called length), i.e.
    with ('7', 100), we would get 700.
'''
def num_value(character, length):
    if character == "0":
        return 0
    elif character == "1":
        return 1 * length
    elif character == "2":
        return 2 * length
    elif character == "3":
        return 3 * length
    elif character == "4":
        return 4 * length
    elif character == "5":
        return 5 * length
    elif character == "6":
        return 6 * length
    elif character == "7":
        return 7 * length
    elif character == "8":
        return 8 * length
    elif character == "9":
        return 9 * length


'''
    Returns the string product. 
'''
def mult_strings(num_one, num_two):
    number_result = find_number(num_one, num_two)
    string_result = find_string(number_result)
    return string_result 

    
'''
    Main function checks for positive integers.
'''
def main():
    print("Please input your first number: ")
    num_one = input()
    while num_one[0] == "-" or "." in num_one:
        print("The number is not valid, please select a positive integer:")
        num_one = input()
    print("Please input your second number: ")
    num_two = input()
    while num_two[0] == "-" or "." in num_two:
        print("The number is not valid, please select a positive integer:")
        num_two = input()
    result = mult_strings(num_one, num_two)
    print("Your number is " + result + ".")


if __name__ == '__main__':
    main()

