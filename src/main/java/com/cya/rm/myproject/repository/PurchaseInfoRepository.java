package com.cya.rm.myproject.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cya.rm.myproject.vo.PurchaseInfo;

@Mapper
public interface PurchaseInfoRepository {

	@Select("""
			<script>
				SELECT PC.id, PC.regDate, PC.productId, P.`name` AS productName, P.price AS productPrice,
				PC.productCount,
				P.price*PC.productCount AS totalPrice,
				PC.customerId, C.`name` AS customerName
				FROM purchaseInfo AS PC
				LEFT JOIN product AS P
				ON PC.productId = P.id
				LEFT JOIN customer AS C
				ON PC.customerId = C.id;
			</script>
			""")
	List<PurchaseInfo> getForPrintPurchaseInfos();

	@Select("""
			<script>
				SELECT COUNT(*) FROM purchaseInfo;
			</script>
			""")
	int getPurchaseInfosCount();

}
