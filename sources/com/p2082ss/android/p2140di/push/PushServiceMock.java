package com.p2082ss.android.p2140di.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.awemepushapi.AbstractC81805a;
import com.p2082ss.android.ugc.awemepushapi.IPushApi;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.di.push.PushServiceMock */
public class PushServiceMock implements IPushApi {
    static {
        Covode.recordClassIndex(36312);
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public boolean checkChannelStatus(Context context, String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void clearAll(Context context) {
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void clearNotificationId(String str, Context context, int i) {
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public AbstractC58264w getCancelNotiTask() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public String getRealChannelId(String str) {
        return "";
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void init(Context context, AbstractC81805a aVar) {
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void initImmediately(Context context, AbstractC81805a aVar) {
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void initMessageDepend() {
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void initNotificationChannel() {
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void initPushAccountService(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public boolean isNotificationIdContains(String str) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public boolean isPushProcess(Context context) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public int isPushVideoPreload(long j) {
        return 0;
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public boolean isSswoAct(Activity activity) {
        return false;
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void notifyOnDeeplink(boolean z, Context context, Intent intent, Uri uri) {
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void onGcmNotificationClick(JSONObject jSONObject, Activity activity, int i, String str, int i2, String str2) {
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void removeRedBadge(Context context) {
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void setAutoDisappear(int i) {
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public void startPushProcess(Context context) {
    }

    @Override // com.p2082ss.android.ugc.awemepushapi.IPushApi
    public List<String> getFromNotificationIds() {
        return new ArrayList();
    }
}
