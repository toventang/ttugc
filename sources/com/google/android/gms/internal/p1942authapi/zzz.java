package com.google.android.gms.internal.p1942authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

/* renamed from: com.google.android.gms.internal.auth-api.zzz */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new C25679ae();

    /* renamed from: a */
    private final Credential f60841a;

    static {
        Covode.recordClassIndex(31119);
    }

    public zzz(Credential credential) {
        this.f60841a = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49352a(parcel, 1, this.f60841a, i);
        C25569b.m49359b(parcel, a);
    }
}
