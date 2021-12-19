package com.p2082ss.android.ugc.aweme.plugin;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.ttuploader.TTImageUploader;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.aweme.plugin.a */
public final class C63124a {

    /* renamed from: a */
    public static final C63124a f143459a = new C63124a();

    private C63124a() {
    }

    static {
        Covode.recordClassIndex(73967);
    }

    /* renamed from: a */
    public static final TTImageUploader m114067a() {
        C63253l.f143623a.mo73329y().mo101687a("ttvideouploader");
        return new TTImageUploader();
    }

    /* renamed from: b */
    public static final JSONArray m114068b() {
        JSONArray a = C63244g.m114602a().mo73287o().mo104792l().mo104816a();
        int length = a.length();
        for (int i = 0; i < length; i++) {
            try {
                AppLog.recordMiscLog(C63247i.f143610a, "image_upload", a.getJSONObject(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return a;
    }
}
