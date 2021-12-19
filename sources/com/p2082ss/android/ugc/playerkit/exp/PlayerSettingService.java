package com.p2082ss.android.ugc.playerkit.exp;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.p2082ss.android.ugc.playerkit.model.PlayerGlobalConfig;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.playerkit.exp.PlayerSettingService */
public class PlayerSettingService {
    private static PlayerSettingService instance;
    private static boolean isDebug;

    static {
        Covode.recordClassIndex(98092);
    }

    public Object get(String str, Type type, Object obj, boolean z) {
        return obj;
    }

    public static PlayerSettingService getInstance() {
        PlayerSettingService playerSettingService = instance;
        if (playerSettingService == null) {
            return (PlayerSettingService) InjectedConfigManager.getConfig(PlayerSettingService.class);
        }
        return playerSettingService;
    }

    public static boolean isDebug() {
        if (instance != null) {
            return isDebug;
        }
        PlayerGlobalConfig playerGlobalConfig = (PlayerGlobalConfig) InjectedConfigManager.getConfig(PlayerGlobalConfig.class);
        if (playerGlobalConfig == null) {
            return false;
        }
        return playerGlobalConfig.isDebug();
    }

    public static void init(PlayerSettingService playerSettingService, boolean z) {
        instance = playerSettingService;
        isDebug = z;
    }
}
