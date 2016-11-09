package com.scl.manage.common.em;

/**
 * 是否锁定状态
 * 0:未锁定
 * 1:已锁定
 * @author shengchenglong
 *
 */
public enum IsLocked {
	
	YES(1), NO(0);
	
	private Integer value;
	
	private IsLocked(Integer value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}

}
