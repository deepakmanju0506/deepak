package com.xworkz.shop.runner;

import com.xworkz.shop.interfaces.Shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopRunner {

  public static void main (String []args){

      Shop shop;
      shop=(a,b)->(a+b);

      List<Integer> list =new ArrayList<>(Arrays.asList(1,5,8,9));
      int size=list.size();

      list.forEach(a-> System.out.println(a));

      System.out.println(size);
  }



}
