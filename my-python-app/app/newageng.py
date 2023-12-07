import os
from langchain.utilities import GoogleSerperAPIWrapper

class LangchainAgent:
    def __init__(self):
        # Initialize any necessary attributes or variables here
        pass

    def generate_output(self):
        # Implement the logic to generate the output here
        pass

    def process_input(self, input_text):
        os.environ["SERPER_API_KEY"] = "a9e02fa974ae7470cc6e4e89dc7d808f0b8d4882"
        search = GoogleSerperAPIWrapper()
        return search.run(input_text)
        pass

if __name__ == "__main__":
    agent = LangchainAgent()
    # Call the necessary methods or functions here
    print(agent.process_input("What is the first president of the United States?"))
    pass
