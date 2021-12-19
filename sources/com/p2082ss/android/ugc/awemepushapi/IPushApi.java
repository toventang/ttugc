package com.p2082ss.android.ugc.awemepushapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushapi.IPushApi */
public interface IPushApi {
    static {
        Covode.recordClassIndex(95214);
    }

    boolean checkChannelStatus(Context context, String str);

    void clearAll(Context context);

    void clearNotificationId(String str, Context context, int i);

    Object getCancelNotiTask();

    List<String> getFromNotificationIds();

    String getRealChannelId(String str);

    void init(Context context, AbstractC81805a aVar);

    void initImmediately(Context context, AbstractC81805a aVar);

    void initMessageDepend();

    void initNotificationChannel();

    void initPushAccountService(boolean z);

    boolean isNotificationIdContains(String str);

    boolean isPushProcess(Context context);

    int isPushVideoPreload(long j);

    boolean isSswoAct(Activity activity);

    void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri);

    void onGcmNotificationClick(JSONObject jSONObject, Activity activity, int i, String str, int i2, String str2);

    void removeRedBadge(Context context);

    void setAutoDisappear(int i);

    void startPushProcess(Context context);
}
