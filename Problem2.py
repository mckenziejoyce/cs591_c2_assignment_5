import math

def choose_shape(shape):
    if(shape=='C'):
        print("Please input a radius: ")
        radius = input()
        return circle(radius)
    if(shape=='R'):
        print("Please input a length: ")
        length = input()
        print("Please input a breadth: ")
        breadth = input()
        return rectangle(length, breadth)
    if(shape=='S'):
        print("Please input a length: ")
        length = input()
        return square(length)
    else:
        return "Not a valid shape"

def circle(radius):
    area = math.pi*(radius*radius)
    circumference = 2*math.pi*radius
    area = round(area, 2)
    circumference = round(circumference, 2)
    print_result('C', area, circumference)
    return area, circumference

def square(length):
    area = (length*length)
    perimeter = 4*length
    print_result('S', area, perimeter)
    return area, perimeter

def rectangle(length, breadth):
    area = (length*breadth)
    perimeter = 2*length + 2*breadth
    print_result('R', area, perimeter)
    return area, perimeter

def print_result(shape, input1, input2):
    if(shape=='C'):
        return "Area of circle: " + str(input1) + " Circumference of circle: " + str(input2)
    if(shape=='R'):
        return "Area of rectangle: " + str(input1) + " Perimeter of rectangle: " + str(input2)
    if(shape=='S'):
        return "Area of square: " + str(input1) + " Perimeter of square: " + str(input2)

def main():
    print("Type C, R, or S, to choose between Circle, Rectangle, or Square.")
    shape = input()
    input1, input2 = choose_shape(shape)
    print(print_result(shape, input1, input2))




if __name__ == '__main__':
    main()
