from random import randint
from unittest import TestCase


class YourTestClass(TestCase):
    @classmethod
    def setUpTestData(cls):
        print("setUpTestData: Run once to set up non-modified data for all class method. ")
        pass

    def setUp(self):
        print("setUp: Run once for every test method to setup clean data. ")
        pass

    def test_false_is_false(self):
        print("Method: test_false_is_false.")
        self.assertFalse(False)

    def test_false_is_true(self):
        print("Method: test_false_is_true.")
        self.assertTrue(True)

    def test_four_minus_three_equals_one(self):
        print("Method: test_four_minus_three_equals_one. ")
        self.assertEqual(4-3,1)

    def check_age(self):
        def get_age():
            return randint(5,8)
        print("Method: My_age")
        self.assertEqual(5,get_age())