package net.blay09.mods.cookingforblockheads.client;

import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.cookingforblockheads.CookingForBlockheads;
import net.fabricmc.api.ClientModInitializer;

public class FabricCookingForBlockheadsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BalmClient.initialize(CookingForBlockheads.MOD_ID, CookingForBlockheadsClient::initialize);
    }
}
