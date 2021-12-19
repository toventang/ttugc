package com.p2082ss.android.ugc.aweme.base;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.p */
public final /* synthetic */ class RunnableC34646p implements Serializable, Runnable {

    /* renamed from: a */
    private final String f81818a;

    /* renamed from: b */
    private final String f81819b;

    static {
        Covode.recordClassIndex(41613);
    }

    RunnableC34646p(String str, String str2) {
        this.f81818a = str;
        this.f81819b = str2;
    }

    public final void run() {
        try {
            C12290b.m22064a(this.f81818a, new JSONObject(this.f81819b));
        } catch (Exception unused) {
        }
    }
}
