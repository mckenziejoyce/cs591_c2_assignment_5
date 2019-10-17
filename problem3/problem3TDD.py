
'''
    Assume the goal of problem three works only for positive integers.
    This case is handled in problem3.py in the __main__ function.
'''
import unittest
import problem3


def get_input(text):
    return input(text)

class TDD(unittest.TestCase):

    # Test to make sure that find_number correcty outputs the right integer given two strings.
    def test_find_number(self):
        self.assertEqual(problem3.find_number('7', '8'), (56))
        self.assertEqual(problem3.find_number('0', '71'), (0))
        self.assertEqual(problem3.find_number('345', '72'), (24840))

    # Test to make sure that find_string correcty outputs the string given an integer.
    def test_find_string(self):
        self.assertEqual(problem3.find_string(345), ('345'))
        self.assertEqual(problem3.find_string(79), ('79'))
        self.assertEqual(problem3.find_string(0), ('0'))

    # Test to make sure that string_to_char outputs correct list of characters given a string.
    def test_string_to_char(self):
        self.assertEqual(problem3.string_to_char('123'), (['1','2','3']))
        self.assertEqual(problem3.string_to_char('43678'), (['4','3','6','7','8']))

    # Test to make sure that char_value correcty outputs the right character given an integer.
    def test_char_value(self):
        self.assertEqual(problem3.char_value(2), ('2'))
        self.assertEqual(problem3.char_value(7), ('7'))

    # Test to make sure that num_value correcty outputs the right integer given a character.
    def test_num_value(self):
        self.assertEqual(problem3.num_value('5', 100), (500))
        self.assertEqual(problem3.num_value('9', 1), (9))

    # Test to make sure that calc_place correctly output the expected value of 10, given a length.
    def test_calc_place(self):
        self.assertEqual(problem3.calc_place(1), (1))
        self.assertEqual(problem3.calc_place(5), (10000))

    # Test to make sure the correct string product is output given two string integers.
    def test_mult_strings(self):
        self.assertEqual(problem3.mult_strings('8', '9'), ('72'))
        self.assertEqual(problem3.mult_strings('0', '40'), ('0'))
        self.assertEqual(problem3.mult_strings('45', '567'), ('25515'))

if __name__ == "__main__":
     unittest.main()

