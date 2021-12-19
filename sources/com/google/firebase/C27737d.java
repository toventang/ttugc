package com.google.firebase;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;

/* renamed from: com.google.firebase.d */
public class C27737d extends Exception {
    static {
        Covode.recordClassIndex(33320);
    }

    public C27737d() {
    }

    public C27737d(String str) {
        super(C25565r.m49317a(str, (Object) "Detail message must not be empty"));
    }

    public C27737d(String str, Throwable th) {
        super(C25565r.m49317a(str, (Object) "Detail message must not be empty"), th);
    }
}
