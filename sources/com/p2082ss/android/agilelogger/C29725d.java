package com.p2082ss.android.agilelogger;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.alog.AbstractC2687b;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.agilelogger.d */
public final class C29725d implements AbstractC2687b {
    static {
        Covode.recordClassIndex(36122);
    }

    C29725d() {
    }

    @Override // com.bytedance.android.alog.AbstractC2687b
    /* renamed from: a */
    public final void mo7212a() {
        try {
            Librarian.m38963a("alog", ALog.sConfig.f70852a);
        } catch (Throwable unused) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.m38964a("alog", false, (Context) null);
            C58032m.m104852a(uptimeMillis, "alog");
        }
    }
}
