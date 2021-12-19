package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.C25351e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p1940d.C25632i;

/* renamed from: com.google.android.gms.common.api.internal.t */
public final class C25470t {
    static {
        Covode.recordClassIndex(30869);
    }

    /* renamed from: a */
    public static <TResult> void m49133a(Status status, TResult tresult, C25632i<TResult> iVar) {
        if (status.mo41477c()) {
            iVar.mo41894a((Object) tresult);
        } else {
            iVar.mo41893a((Exception) new C25351e(status));
        }
    }
}
