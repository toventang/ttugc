package com.p2082ss.android.ugc.aweme.base;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.u */
public final /* synthetic */ class RunnableC34651u implements Serializable, Runnable {

    /* renamed from: a */
    private final String f81830a;

    static {
        Covode.recordClassIndex(41620);
    }

    RunnableC34651u(String str) {
        this.f81830a = str;
    }

    public final void run() {
        C12290b.m22064a(this.f81830a, (JSONObject) null);
    }
}
