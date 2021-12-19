package com.p2082ss.android.ugc.aweme.miniapp_api.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.C59314b;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3445b.C59315a;
import com.p2082ss.android.ugc.aweme.miniapp_api.p3443b.AbstractC59304a;
import com.p2082ss.android.ugc.aweme.miniapp_api.p3443b.AbstractC59305b;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService */
public interface IMiniAppService {
    static {
        Covode.recordClassIndex(69698);
    }

    String addScene(String str, String str2);

    boolean checkMiniAppEnable(Context context);

    String getJsSdkVersion(Application application);

    AbstractC59318a getMobClickCombinerIpcService();

    void getShareInfo(String str, AbstractC59305b bVar);

    AbstractC59319b getTTDownloaderIpcService();

    void handleActivityImageResult(int i, int i2, Intent intent);

    void initMiniApp(AbstractC59304a aVar);

    void initWebViewSuffix(ContextWrapper contextWrapper, String str);

    boolean isMinAppAvailable(Context context, String str);

    void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4);

    void logExcitingVideoAd(Context context, String str, long j, String str2);

    void notifyFollowAwemeState(int i);

    void notifyLocaleChange(Locale locale);

    void onRequestPermissionsResult(Activity activity, String[] strArr, int[] iArr);

    boolean openMiniApp(Context context, C59314b bVar, C59315a aVar);

    boolean openMiniApp(Context context, String str, C59315a aVar);

    boolean openShortcut(Context context, Intent intent);

    void preloadMiniApp(String str);

    void preloadMiniApp(String str, int i);

    void remoteMobV3(String str, JSONObject jSONObject);

    String setLaunchModeHostTask(String str);

    void tryMoveMiniAppActivityToFront(String str);
}
