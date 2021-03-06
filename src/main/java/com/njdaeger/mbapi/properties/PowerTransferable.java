package com.njdaeger.mbapi.properties;

import com.njdaeger.mbapi.data.MaterialType;

public interface PowerTransferable<T extends MaterialType> extends Property<T> {
    
    void setPower(int power);
    
    int getPower();
    
    int getMaxPower();
    
}
