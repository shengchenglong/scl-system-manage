package com.scl.manage.common.em;

/**
 * 是否删除状态
 * 0:未删除
 * 1:已删除
 * @author shengchenglong
 *
 */
public enum IsDelete {
	
	YES(1), NO(0);
	
	private Integer value;
	
	private IsDelete(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}

}
