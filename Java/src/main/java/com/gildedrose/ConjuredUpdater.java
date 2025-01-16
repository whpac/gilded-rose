package com.gildedrose;

public class ConjuredUpdater implements ItemUpdater {
    @Override
    public void update(Item item) {

        if (item.quality > 0 && item.sellIn >0) {
            item.quality -= 2; 
        }

        if (item.sellIn < 0 && item.quality > 0) {
                item.quality -= 4; 
            }

        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
