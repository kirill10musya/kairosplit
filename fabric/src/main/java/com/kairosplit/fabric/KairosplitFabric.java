package com.kairosplit.fabric;

import com.kairosplit.KairosplitMod;
import net.fabricmc.api.ModInitializer;

public class KairosplitFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        KairosplitMod.init();
    }
}
