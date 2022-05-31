package config;

import org.aeonbits.owner.ConfigFactory;

public class Credentials {
    public static BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());
    public static EmulatorConfig  configEmul = ConfigFactory.create(EmulatorConfig.class, System.getProperties());
}
