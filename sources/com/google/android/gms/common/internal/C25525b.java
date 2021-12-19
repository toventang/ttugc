package com.google.android.gms.common.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.C25351e;
import com.google.android.gms.common.api.C25483n;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b */
public final class C25525b {
    static {
        Covode.recordClassIndex(30928);
    }

    /* renamed from: a */
    public static C25351e m49218a(Status status) {
        if (status.mo41476b()) {
            return new C25483n(status);
        }
        return new C25351e(status);
    }
}
