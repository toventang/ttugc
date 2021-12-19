package com.p2082ss.android.ugc.aweme.base;

import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.s */
public final /* synthetic */ class RunnableC34649s implements Serializable, Runnable {

    /* renamed from: a */
    private final String f81826a;

    static {
        Covode.recordClassIndex(41616);
    }

    RunnableC34649s(String str) {
        this.f81826a = str;
    }

    public final void run() {
        C12290b.m22064a(this.f81826a, (JSONObject) null);
    }
}
