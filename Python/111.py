import random
from urllib.request import urlopen
from bs4 import BeautifulSoup as bf
html=urlopen("http://www.baidu.com/")
obj=bf(html.read(),'html.parser')
title=obj.head.title
pic_info=obj.find_all('img')
print(title)
for i in pic_info:
    print(i)