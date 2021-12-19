package com.p2082ss.android.ugc.aweme.report;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29819a;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.report.e */
public final /* synthetic */ class RunnableC67109e implements Runnable {

    /* renamed from: a */
    private final long[] f150504a;

    /* renamed from: b */
    private final String f150505b;

    /* renamed from: c */
    private final String f150506c;

    /* renamed from: d */
    private final String f150507d;

    static {
        Covode.recordClassIndex(78691);
    }

    RunnableC67109e(long[] jArr, String str, String str2, String str3) {
        this.f150504a = jArr;
        this.f150505b = str;
        this.f150506c = str2;
        this.f150507d = str3;
    }

    public final void run() {
        long[] jArr = this.f150504a;
        String str = this.f150505b;
        String str2 = this.f150506c;
        String str3 = this.f150507d;
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < jArr.length; i++) {
            try {
                jSONObject.put(EnumC67106c.values()[i].getType(), jArr[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        jSONObject.put("ui_scene", str);
        jSONObject.put("current_video", str2);
        jSONObject.put("next_video", str3);
        C29819a.m60077a("feed_scroll_time", jSONObject);
    }
}
