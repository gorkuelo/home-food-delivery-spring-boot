package com.homefooddelivery.enums;

public enum TypeFoodEnum {
	PRINCIPAL("principal"), 
	BEBIDA("bebida"), 
	POSTRE("postre"),
    UNKNOWN("");

    private String type;

    public String type() {
        return type;
    }

	private TypeFoodEnum(String type) {
		this.type = type;
	}
    
}
