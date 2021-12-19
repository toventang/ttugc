package com.p2082ss.android.ugc.aweme.video.preload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.preload.VideoCachePreloader;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.preload.p */
final /* synthetic */ class RunnableC80934p implements Runnable {

    /* renamed from: a */
    private final VideoCachePreloader.C807863 f180961a;

    /* renamed from: b */
    private final JSONObject f180962b;

    static {
        Covode.recordClassIndex(94236);
    }

    RunnableC80934p(VideoCachePreloader.C807863 r1, JSONObject jSONObject) {
        this.f180961a = r1;
        this.f180962b = jSONObject;
    }

    public final void run() {
        VideoCachePreloader.C807863 r0 = this.f180961a;
        try {
            C84231a.m144836b().monitorCommonLog("aweme_play_416", VideoCachePreloader.this.f180665d.getPlayerCommonParamManager().mo124201a(this.f180962b));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
