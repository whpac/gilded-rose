package com.gildedrose;

import java.util.HashMap;
import java.util.Map;

public class ItemUpdaterFactory {
    private static final Map<String, ItemUpdater> updaters = new HashMap<>();

    static{
        updaters.put("Aged Brie", new AgedBrieUpdater());
        updaters.put("Sulfuras, Hand of Ragnaros", new SulfurasUpdater());
        updaters.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassUpdater());
    }

    public static ItemUpdater getUpdater(Item item) {
        return updaters.getOrDefault(item.name, new DefaultItemUpdater());
    }
}
