package com.p2082ss.android.ugc.playerkit.simapicommon.reporter;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.playerkit.simapicommon.reporter.IALog */
public interface IALog {
    static {
        Covode.recordClassIndex(98151);
    }

    /* renamed from: d */
    void mo124331d(String str);

    /* renamed from: d */
    void mo124332d(String str, JSONObject jSONObject);

    /* renamed from: e */
    void mo124333e(String str, String str2);

    /* renamed from: e */
    void mo124334e(String str, JSONObject jSONObject);

    /* renamed from: i */
    void mo124335i(String str, JSONObject jSONObject);

    boolean isEnabled();

    /* renamed from: w */
    void mo124338w(String str, JSONObject jSONObject);
}
