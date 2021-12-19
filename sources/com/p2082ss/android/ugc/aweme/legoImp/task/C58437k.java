package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.C18364w;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.legoImp.task.k */
public final /* synthetic */ class C58437k implements C18364w.AbstractC18367b {

    /* renamed from: a */
    private final boolean f133051a;

    /* renamed from: b */
    private final long f133052b;

    static {
        Covode.recordClassIndex(68693);
    }

    C58437k(boolean z, long j) {
        this.f133051a = z;
        this.f133052b = j;
    }

    @Override // com.bytedance.ies.web.jsbridge2.C18364w.AbstractC18367b
    /* renamed from: a */
    public final void mo29407a() {
        if (!this.f133051a && !TextUtils.isEmpty("host") && C18364w.f43928a != null) {
            C18364w.f43928a.mo29318a("host", null);
        }
        System.currentTimeMillis();
    }
}
