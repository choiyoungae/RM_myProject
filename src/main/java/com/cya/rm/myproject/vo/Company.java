package com.cya.rm.myproject.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
	private int id;
	private String companyName;
	private String CEOname;
	private String contactNum;
}
