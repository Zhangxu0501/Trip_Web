# -*- coding: utf-8 -*-
"""
Created on Wed Mar 30 17:54:14 2016

@author: zx
"""
import urllib2
import re

a= os.listdir(u"C:\Users\zx\Desktop\quna\") 
print a

file_object = open(u'C:\Users\zx\Desktop\去哪儿\合肥到哈尔滨旅游线路推荐_合肥到哈尔滨旅游线路报价-去哪儿网Qunar.com.html')
try:
    word = file_object.read( )
finally:
     file_object.close( )


string='data-pid=^-?[1-9]\d*$'
print word
find_word=re.findall(string,word,re.S)
print find_word