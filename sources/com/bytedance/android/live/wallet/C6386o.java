package com.bytedance.android.live.wallet;

import android.os.SystemClock;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.livesdk.wallet.p658b.C11312a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.wallet.o */
public final /* synthetic */ class C6386o implements AbstractC88433f {

    /* renamed from: a */
    private final long f15961a;

    static {
        Covode.recordClassIndex(7116);
    }

    C6386o(long j) {
        this.f15961a = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        long j = this.f15961a;
        Throwable th = (Throwable) obj;
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", th.getMessage());
        hashMap.put("error_code", Integer.valueOf(th instanceof C2908a ? ((C2908a) th).getErrorCode() : -16));
        C11312a.m20053a(SystemClock.uptimeMillis() - j, hashMap);
        C11312a.m20052a(1, SystemClock.uptimeMillis() - j, hashMap);
    }
}
