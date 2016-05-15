# -*- coding: utf-8 -*-
"""
Created on Sat Dec 12 13:09:17 2015

@author: zx
"""
import random

city=["beijing","tianjin","shanghai","haerbin","tongliao","shenzhen","xianggang","sanya"]
date=["10-1","10-2","10-3","10-4","10-5","10-6","10-7","10-8","10-9","10-10"]
url=["www.xiecheng.com","www.qunai.com","www.tuniu.com"]


ff=open('two.txt','w+')

count=1;
for i in range(0,8):
    for ii in range(0,8):
        for j in range(0,10):
            for k in range(0,3):
                for w in range(1,10):
                    row=url[k][4:]
                    row=row[0:-4]
                    count_s=str(count)
                    while(len(count_s)<=5):
                        count_s="0"+count_s
                    row=row+count_s
                    count=count+1
                    ff.write(row)
                    ff.write(" ")
                    ff.write(city[i])
                    ff.write(" ")
                    ff.write(city[ii])
                    ff.write(" ")
                    ff.write(date[j])
                    ff.write(" ")
                    ff.write(url[k])
                    ff.write(" ")
                    ff.write(city[ii]+str(count))
                    ff.write(" ")
                    ff.write(str(random.randint(100,88888)))
                    ff.write("\n")
                    
                    
                     
            
            
