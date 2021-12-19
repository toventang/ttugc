package com.p2082ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.C18297h;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.sdk.webview.p2175a.C30242g;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.y */
public final class C81629y extends C30242g {
    static {
        Covode.recordClassIndex(95026);
    }

    public C81629y(WeakReference<Context> weakReference) {
        super(weakReference);
    }

    @Override // com.p2082ss.android.sdk.webview.p2175a.C30242g, com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        hVar.f43670c = "open";
        hVar.f43671d.put(StringSet.type, "publishVideo");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("video_id", hVar.f43671d.optString("review_video_id"));
        jSONObject2.put("video_url", hVar.f43671d.optString("video_url"));
        jSONObject2.put("music_id", hVar.f43671d.optString("music_id"));
        jSONObject2.put("challenge_id", hVar.f43671d.optString("challenge_id"));
        jSONObject2.put("need_duet", hVar.f43671d.optBoolean("need_duet", false));
        jSONObject2.put("widget_id", hVar.f43671d.optString("widget_id"));
        jSONObject2.put("cover_url", hVar.f43671d.optString("cover_url"));
        hVar.f43671d.put("args", jSONObject2);
        mo53694a(hVar.f43671d);
    }
}
