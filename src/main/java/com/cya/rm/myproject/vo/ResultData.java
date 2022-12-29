package com.cya.rm.myproject.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class ResultData<DT> {
	@Getter
	private int total_item_count;
	@Getter
	private Object list;

	public static <DT> ResultData<DT> from(int total_item_count, Object list) {
		ResultData<DT> rd = new ResultData<DT>();
		rd.total_item_count = total_item_count;
		rd.list = list;

		return rd;
	}
}
