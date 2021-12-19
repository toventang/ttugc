package com.p2082ss.android.ugc.aweme.story.live;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.story.live.d */
public final class C77354d {
    static {
        Covode.recordClassIndex(90383);
    }

    /* renamed from: a */
    public static void m135258a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", str);
        hashMap.put("_param_live_platform", "live");
        C39162r.m79460a("livesdk_live_merge_show", hashMap);
    }

    /* renamed from: b */
    public static void m135264b(String str, String str2) {
        C39162r.m79460a("livesdk_push_click", new C33744d().mo59983a("anchor_id", str2).mo59983a("room_id", str).f79943a);
    }

    /* renamed from: a */
    public static void m135260a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", str);
        hashMap.put("_param_live_platform", "live");
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("gd_label", str2);
        }
        C39162r.m79460a("livesdk_enter_live_merge", hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (android.text.TextUtils.equals(r3, "message") != false) goto L_0x005f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m135255a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.live.C77354d.m135255a(java.lang.String, java.lang.String, java.lang.String):org.json.JSONObject");
    }

    /* renamed from: a */
    public static void m135259a(String str, long j, String str2) {
        C33744d a = new C33744d().mo59983a("anchor_id", str).mo59983a("anchor_status", str2);
        if (j <= 0) {
            j = 0;
        }
        C39162r.m79460a("livesdk_push_click_lookup_anchor", a.mo59983a("room_id", String.valueOf(j)).f79943a);
    }

    /* renamed from: a */
    public static void m135261a(String str, String str2, long j) {
        m135256a(1, str2, j, m135255a("push", "push", str));
    }

    /* renamed from: a */
    public static void m135256a(int i, String str, long j, JSONObject jSONObject) {
        if (i == 0) {
            C39162r.m79456a("impression", "live", str, j, jSONObject);
        } else if (i == 1 && jSONObject != null) {
            C39162r.m79456a("enter_detail", "live_aud", str, j, jSONObject);
        }
    }

    /* renamed from: b */
    public static void m135265b(String str, String str2, long j, String str3) {
        JSONObject a = m135255a("homepage_hot", "video", str);
        try {
            a.put("video_value", str3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m135256a(1, str2, j, a);
    }

    /* renamed from: a */
    public static void m135262a(String str, String str2, long j, String str3) {
        JSONObject a = m135255a("homepage_follow", "video", str);
        try {
            a.put("video_value", str3);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m135256a(1, str2, j, a);
    }

    /* renamed from: a */
    public static final void m135257a(int i, String str, String str2, String str3, long j) {
        m135256a(i, str3, j, m135255a(str, "head", str2));
    }

    /* renamed from: a */
    public static void m135263a(boolean z, int i, String str, String str2, long j) {
        String str3;
        if (z) {
            str3 = "homepage";
        } else {
            str3 = "others_homepage";
        }
        m135256a(i, str2, j, m135255a(str3, "head", str));
    }
}
