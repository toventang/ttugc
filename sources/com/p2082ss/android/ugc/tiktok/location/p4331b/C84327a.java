package com.p2082ss.android.ugc.tiktok.location.p4331b;

import android.util.Log;
import com.bytedance.bdlocation.p848c.AbstractC13163c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* renamed from: com.ss.android.ugc.tiktok.location.b.a */
public final class C84327a implements AbstractC13163c {
    static {
        Covode.recordClassIndex(98257);
    }

    @Override // com.bytedance.bdlocation.p848c.AbstractC13163c
    /* renamed from: a */
    public final void mo21270a(String str, String str2) {
        m145026a(3, str, str2, null);
    }

    @Override // com.bytedance.bdlocation.p848c.AbstractC13163c
    /* renamed from: b */
    public final void mo21272b(String str, String str2) {
        m145026a(4, str, str2, null);
    }

    @Override // com.bytedance.bdlocation.p848c.AbstractC13163c
    /* renamed from: a */
    public final void mo21271a(String str, String str2, Throwable th) {
        m145026a(6, str, str2, th);
    }

    /* renamed from: a */
    private static void m145026a(int i, String str, String str2, Throwable th) {
        if (th != null) {
            str2 = str2 + '\n' + Log.getStackTraceString(th);
        }
        C51423a.m95791b(i, str, str2);
    }
}
