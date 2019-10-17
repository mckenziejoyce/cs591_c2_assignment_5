import unittest
import Problem2

def get_input(text):
    return input(text)

class TestProblem2(unittest.TestCase):

    def test_circle(self):
        self.assertEqual(Problem2.circle(0), (0, 0))
        self.assertEqual(Problem2.circle(2), (12.57, 12.57))
        self.assertEqual(Problem2.circle(15), (706.86, 94.25))

    def test_square(self):
        self.assertEqual(Problem2.square(0), (0, 0))
        self.assertEqual(Problem2.square(2), (4, 8))
        self.assertEqual(Problem2.square(7), (49, 28))

    def test_rectangle(self):
        self.assertEqual(Problem2.rectangle(0, 0), (0, 0))
        self.assertEqual(Problem2.rectangle(2, 0), (0, 4))
        self.assertEqual(Problem2.rectangle(3, 6), (18, 18))

    def test_choose_shape(self):
        self.assertEqual(Problem2.choose_shape('D'), 'Not a valid shape')
        self.assertEqual(Problem2.choose_shape('asfasdf'), 'Not a valid shape')

    def test_print_result(self):
        self.assertEqual(Problem2.print_result('C', 0, 0), 'Area of circle: 0 Circumference of circle: 0')
        self.assertEqual(Problem2.print_result('S', 2, 8), 'Area of square: 2 Perimeter of square: 8')
        self.assertEqual(Problem2.print_result('R', 49, 28), 'Area of rectangle: 49 Perimeter of rectangle: 28')


if __name__ == "__main__":
     unittest.main()
