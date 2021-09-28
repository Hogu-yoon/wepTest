package com.thuman.injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	// List 콜렉션 타입 빈 클래스
//   private List<String> addressList;
//
//   public List<String> getAddressList() {
//      return addressList;
//   }
//
//   public void setAddressList(List<String> addressList) {
//      this.addressList = addressList;
//   }

	// Set 컬랙션 타입 빈 클래스
//	private Set<String> addressList;
//
//	public Set<String> getAddressList() {
//		return addressList;
//	}
//
//	public void setAddressList(Set<String> addressList) {
//		this.addressList = addressList;
//	}

	// Map 컬랙션 타입 빈 클래스
   private Map<String, String> addressList;
   public Map<String, String> getAddressList(){
	return addressList;   
   }

   public void setAddressList(Map<String, String> addressList) {
      this.addressList = addressList;
   }

	// Properties 컬랙션 타입 빈 클래스
	// Properties:(key=value형태의 데이터 등록,사용할때 이용되는 컬렉션)

//	private Properties addressList;
//
//	public void setAddressList(Properties addressList) {
//		this.addressList = addressList;
//	}
//
//	public Properties getAddressList() {
//		return addressList;
//	}

}