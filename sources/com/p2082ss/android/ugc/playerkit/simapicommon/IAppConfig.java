package com.p2082ss.android.ugc.playerkit.simapicommon;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.simapicommon.IAppConfig */
public interface IAppConfig {
    static {
        Covode.recordClassIndex(98139);
    }

    String defaultHost();

    int getAppID();

    String getAppName();

    String getAppVersion();

    String getChannel();

    boolean isDebug();

    List<String> redirectHosts();
}
