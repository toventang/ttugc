package com.bytedance.android.livesdkapi.host;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.EffectManager;
import java.io.File;
import java.util.Locale;

public interface IHostContext extends AbstractC2953a {
    static {
        Covode.recordClassIndex(13482);
    }

    int appId();

    String appName();

    Context context();

    Locale currentLocale();

    void enterRecorderActivity(Activity activity);

    String getBoeLane();

    String getChannel();

    EffectManager getEffectManager();

    Pair<String, String> getFreeFlowModel();

    String getIapKey();

    int getLastVersionCode();

    String getPackageName();

    Object getResourceFinder(Context context, String str);

    String getServerDeviceId();

    String getTTLiveGeckoCdnUrl(String str, String str2);

    File getTTLiveGeckoResourceFile(String str, String str2);

    String getTTLiveGeckoResourcePath(String str, String str2);

    String getTTLiveGeckoResourcePathAndUrl(String str, String str2);

    int getUpdateVersionCode();

    String getVersionCode();

    boolean isBoe();

    boolean isLocalTest();

    boolean isNeedProtectMinor();

    boolean isOffline();

    int liveId();

    void refreshClientABTestValues();
}
