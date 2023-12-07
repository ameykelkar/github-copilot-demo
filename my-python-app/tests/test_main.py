import unittest
from app import main

class TestMain(unittest.TestCase):
    def test_main(self):
        self.assertEqual(main.hello_world(), "Hello, World!")

if __name__ == '__main__':
    unittest.main()