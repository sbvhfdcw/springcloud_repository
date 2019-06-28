package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	/////////////////
	private Integer id;
	//姓名
	private String name;
	//数量
	private Integer number;
	//不同的客户端改了资料
}
