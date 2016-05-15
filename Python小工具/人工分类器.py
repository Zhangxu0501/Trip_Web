# -*- coding: utf-8 -*-
"""
Created on Mon Mar 21 13:44:38 2016

@author: zx
"""
f = open("two.txt", "r")  
ff = open("result.txt","w+")
count = 1
i=3
result = ["0","1"]
while (i):  
    line = f.readline() 
    line2 = f.readline() 
    if line2:  
       i=i-1
       print line
       print line2
       a=raw_input()
       while(a not in result):
           print u'错误的结果，重新比较'
           print line
           print line2
           a=raw_input()
       ff.write(u"第"+str(count)+u"个结果"+"\n")
       count=count+1
       ff.write(line)
       ff.write(line2)
       ff.write(a+"\n"+"\n")
       ff.flush()
    else:  
        break
        ff.close()
f.close()
ff.close()
