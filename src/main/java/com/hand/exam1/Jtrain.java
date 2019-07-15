package com.hand.exam1;

import java.util.*;

public class Jtrain implements Jtest{
    Random ran=new Random();//创建随机对象
    List lis=new ArrayList();//创建list
    List newlis=new ArrayList();//创建list
    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();//创建map
    data2 dat=new data2();//创建对象
    @Override
    public void sort() {//借助一个新的list排序
        for(int i=0;i<50;i++){//放入数据
            dat.key=ran.nextInt(100);
            lis.add(dat.key);//向lis存数据
        }
        int count=0,count1=0;
        for(int i=0;i<lis.size();i++) {
            count=(int)lis.get(i);
            for(int j=i+1;j<lis.size();j++) {//每一圈最小的放入新的list
            count1=(int)lis.get(j);
            if(count>count1)
            {
              count=count1;
            }
        }
          newlis.add(count);
        }
        for(int i=0;i<lis.size();i++)
        {
            System.out.println(newlis.get(i));
        }
    }

    @Override
    public void CreatMap() {
        for(int i=0;i<50;i++){
            dat.key=ran.nextInt(100);
            dat.value=dat.key/10;
            lis.add(dat.key);//向lis存数据
            map.put(dat.key,dat.value);//向map中存数据
        }
    }
}
