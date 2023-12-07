class LangchainAgent:
    data = []

    def __init__(self):
        # Add any initialization code here
        pass

    def train(self, data):
        # Add your training logic here
        self.data = data
        pass

    def predict(self):
        if all(isinstance(x, int) for x in self.data):
            print("Input list contains all integers")
        else:
            print("Input list does not contain all integers")

def main():
    # Create an instance of LangchainAgent
    agent = LangchainAgent()

    # Call the train method
    agent.train([1, 2.023, 3, 4, 5])

    # Call the predict method
    agent.predict()

if __name__ == "__main__":
    main()


