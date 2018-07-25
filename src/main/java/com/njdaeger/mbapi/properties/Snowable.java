package com.njdaeger.mbapi.properties;

import com.njdaeger.mbapi.data.MaterialType;

public interface Snowable<T extends MaterialType> extends Property<T> {
    
    void setSnowy(boolean snowy);
    
    boolean isSnowy();
    
}
