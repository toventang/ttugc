package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.p1942authapi.BinderC25693o;

/* renamed from: com.google.android.gms.auth.api.signin.internal.r */
public abstract class AbstractBinderC25318r extends BinderC25693o implements AbstractC25315o {
    static {
        Covode.recordClassIndex(30708);
    }

    public AbstractBinderC25318r() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p1942authapi.BinderC25693o
    /* renamed from: a */
    public final boolean mo41424a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo41420a();
        } else if (i != 2) {
            return false;
        } else {
            mo41421b();
        }
        return true;
    }
}
