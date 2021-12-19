package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C26554i();

    /* renamed from: a */
    public final ConnectionResult f62652a;

    /* renamed from: b */
    public final ResolveAccountResponse f62653b;

    /* renamed from: c */
    private final int f62654c;

    static {
        Covode.recordClassIndex(31985);
    }

    public zak() {
        this(new ConnectionResult(8, null));
    }

    private zak(ConnectionResult connectionResult) {
        this(1, connectionResult, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f62654c);
        C25569b.m49352a(parcel, 2, this.f62652a, i);
        C25569b.m49352a(parcel, 3, this.f62653b, i);
        C25569b.m49359b(parcel, a);
    }

    zak(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f62654c = i;
        this.f62652a = connectionResult;
        this.f62653b = resolveAccountResponse;
    }
}
