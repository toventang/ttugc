package com.p2082ss.android.ugc.aweme.feed.p2952k;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.background.C49286c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50532ah;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.feed.k.a */
public final class C49717a {
    static {
        Covode.recordClassIndex(58566);
    }

    /* renamed from: a */
    public static void m93132a(String str, String str2, String str3, JSONObject jSONObject, Aweme aweme) {
        C1731i.m5640b(new CallableC49718b(jSONObject, aweme, C49907s.m93688b(), C49907s.f115050b.name(), str, str2, str3), C39162r.m79452a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m93131a(JSONObject jSONObject, Aweme aweme, String str, String str2, String str3, String str4, String str5) {
        JSONObject jSONObject2;
        int i;
        if (jSONObject == null) {
            try {
                jSONObject2 = new JSONObject();
            } catch (JSONException unused) {
                return null;
            }
        } else {
            jSONObject2 = jSONObject;
        }
        jSONObject2.put("has_tts", C50532ah.m94733i(aweme));
        jSONObject2.put("has_cla", C50532ah.m94732h(aweme));
        jSONObject2.put("top_activity", str);
        jSONObject2.put("feed_tab", str2);
        jSONObject2.put("err_code", str3);
        jSONObject2.put("err_msg", str4);
        if (C49286c.m92321a()) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject2.put("is_audio_mode", String.valueOf(i));
        C39162r.onEvent(MobClick.obtain().setEventName("video_play_failed").setValue(str5).setJsonObject(jSONObject));
        return null;
    }
}
