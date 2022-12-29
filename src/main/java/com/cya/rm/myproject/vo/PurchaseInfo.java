package com.cya.rm.myproject.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseInfo {
	private int id;
	private String regDate;
	private int productId;
	private String productName;
	private int productPrice;
	private int productCount; // 구매한 제품의 갯수도 구매 정보에 들어가야할 것 같아 추가했습니다.
	private int totalPrice;
	private int customerId;
	private String customerName;
}
