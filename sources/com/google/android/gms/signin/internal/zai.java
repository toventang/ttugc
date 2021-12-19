package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C26553h();

    /* renamed from: a */
    private final int f62650a;

    /* renamed from: b */
    private final ResolveAccountRequest f62651b;

    static {
        Covode.recordClassIndex(31984);
    }

    public zai(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    zai(int i, ResolveAccountRequest resolveAccountRequest) {
        this.f62650a = i;
        this.f62651b = resolveAccountRequest;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f62650a);
        C25569b.m49352a(parcel, 2, this.f62651b, i);
        C25569b.m49359b(parcel, a);
    }
}
