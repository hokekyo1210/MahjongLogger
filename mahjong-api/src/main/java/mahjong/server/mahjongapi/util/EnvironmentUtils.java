package mahjong.server.mahjongapi.util;

import java.util.Map;

public class EnvironmentUtils {
    private static Map<String, String> envValue;

    static {
        envValue = System.getenv();
    }

    public static String get(String key) {
        return envValue.get(key);
    }

}
