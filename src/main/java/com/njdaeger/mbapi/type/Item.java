package com.njdaeger.mbapi.type;

import com.njdaeger.mbapi.Material;
import com.njdaeger.mbapi.data.ItemType;

public final class Item extends ItemType<Item> {
    
    public Item(Material<Item> material) {
        super(material);
    }
    
}
