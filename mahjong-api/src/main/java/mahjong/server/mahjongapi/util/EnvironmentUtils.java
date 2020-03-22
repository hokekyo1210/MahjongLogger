package mahjong.server.mahjongapi.util;

import java.util.Map;

public class EnvironmentUtils {
    private static Map<String, String> envValue;

    static {
        envValue = System.getenv();
    }

    public String getDBHost() {
        return envValue.get("DB_HOST");
    }

}
