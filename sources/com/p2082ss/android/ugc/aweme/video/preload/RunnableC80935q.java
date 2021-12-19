package com.p2082ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.preload.q */
final /* synthetic */ class RunnableC80935q implements Runnable {

    /* renamed from: a */
    private final VideoCachePreloader.C807863 f180963a;

    /* renamed from: b */
    private final boolean f180964b;

    /* renamed from: c */
    private final String f180965c;

    /* renamed from: d */
    private final int f180966d;

    /* renamed from: e */
    private final int f180967e;

    /* renamed from: f */
    private final String f180968f;

    static {
        Covode.recordClassIndex(94237);
    }

    RunnableC80935q(VideoCachePreloader.C807863 r1, boolean z, String str, int i, int i2, String str2) {
        this.f180963a = r1;
        this.f180964b = z;
        this.f180965c = str;
        this.f180966d = i;
        this.f180967e = i2;
        this.f180968f = str2;
    }

    public final void run() {
        VideoCachePreloader.C807863 r7 = this.f180963a;
        boolean z = this.f180964b;
        String str = this.f180965c;
        int i = this.f180966d;
        int i2 = this.f180967e;
        String str2 = this.f180968f;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("disableAutoDiskCacheManagement", z);
            jSONObject.put("key", str);
            jSONObject.put("oldContentLength", i);
            jSONObject.put("newContentLength", i2);
            jSONObject.put("previousInfo", str2);
            VideoCachePreloader.this.f180665d.getPlayerCommonParamManager().mo124201a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C84231a.m144836b().monitorCommonLog("aweme_play_content_length_not_match", jSONObject);
    }
}
