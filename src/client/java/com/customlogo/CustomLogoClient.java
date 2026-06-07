package com.customlogo;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomLogoClient implements ClientModInitializer {

    public static final String MOD_ID = "customlogo";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("CustomLogo mod loaded - taskbar icon will be replaced with logo.png");
    }
}
