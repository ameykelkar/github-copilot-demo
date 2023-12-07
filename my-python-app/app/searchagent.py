from langchain.utilities import GoogleSerperAPIWrapper

import os

os.environ["SERPER_API_KEY"] = "a9e02fa974ae7470cc6e4e89dc7d808f0b8d4882"
search = GoogleSerperAPIWrapper()
print(search.run("What is the first president of the United States?"))


