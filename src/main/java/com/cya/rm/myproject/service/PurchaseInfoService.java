package com.cya.rm.myproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cya.rm.myproject.repository.PurchaseInfoRepository;
import com.cya.rm.myproject.vo.PurchaseInfo;

@Service
public class PurchaseInfoService {
	
	@Autowired
	PurchaseInfoRepository purchaseInfoRepository;

	public List<PurchaseInfo> getPurchaseInfos() {
		return purchaseInfoRepository.getForPrintPurchaseInfos();
	}

	public int getPurchaseInfosCount() {
		return purchaseInfoRepository.getPurchaseInfosCount();
	}
}
