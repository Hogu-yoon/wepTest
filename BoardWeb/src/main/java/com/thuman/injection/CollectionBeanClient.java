package com.thuman.injection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

   public static void main(String[] args) {
	   //정부프레임워크 295쪽 예시
      AbstractApplicationContext factory=new GenericXmlApplicationContext("applicationContext.xml");
      
      CollectionBean bean=(CollectionBean) factory.getBean("collectionBean");
//      List<String> addressList=bean.getAddressList();
//      for(String address:addressList) {
//         System.out.println(address.toString());
//      }
      Map<String,String> addressList = bean.getAddressList();
      Iterator<String> iter = addressList.keySet().iterator();
      while(iter.hasNext()) {
    	  System.out.println(addressList.get(iter.next()));
      }
      
      
      factory.close();
   }

}