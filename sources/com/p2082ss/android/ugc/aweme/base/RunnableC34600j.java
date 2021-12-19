package com.p2082ss.android.ugc.aweme.base;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.j */
final /* synthetic */ class RunnableC34600j implements Runnable {

    /* renamed from: a */
    private final Uri f81650a;

    /* renamed from: b */
    private final long f81651b;

    /* renamed from: c */
    private final boolean f81652c;

    static {
        Covode.recordClassIndex(41562);
    }

    RunnableC34600j(Uri uri, long j, boolean z) {
        this.f81650a = uri;
        this.f81651b = j;
        this.f81652c = z;
    }

    public final void run() {
        Uri uri = this.f81650a;
        long j = this.f81651b;
        boolean z = this.f81652c;
        String uri2 = uri != null ? uri.toString() : null;
        if (!TextUtils.isEmpty(uri2)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", uri2);
                jSONObject.put("fromNetwork", z);
                jSONObject.put("url_convert", false);
                if (!TextUtils.isEmpty("")) {
                    jSONObject.put("caller_id", "");
                }
                jSONObject.put("duration", j);
            } catch (Exception e) {
                e.printStackTrace();
            }
            C12290b.m22060a("aweme_image_load_error_rate", 0, jSONObject);
            if (j > 0) {
                C34611o.m70667a("aweme_image_load", "load_time", (float) j);
            }
        }
    }
}
