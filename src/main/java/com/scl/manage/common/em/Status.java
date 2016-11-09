package com.scl.manage.common.em;

/**
 * 是否是正常状态
 * 0:不正常（不可用）
 * 1:正常 （可用）
 * @author shengchenglong
 *
 */
public enum Status {

	NOMAL(1), ABNOMAL(0);
	
	private Integer value;
	
	private Status(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
	
}
