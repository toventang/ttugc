package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC25551l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new C25511ad();

    /* renamed from: a */
    public IBinder f60510a;

    /* renamed from: b */
    public ConnectionResult f60511b;

    /* renamed from: c */
    public boolean f60512c;

    /* renamed from: d */
    public boolean f60513d;

    /* renamed from: e */
    private final int f60514e;

    static {
        Covode.recordClassIndex(30909);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        if (!this.f60511b.equals(resolveAccountResponse.f60511b) || !AbstractC25551l.AbstractBinderC25552a.m49297a(this.f60510a).equals(AbstractC25551l.AbstractBinderC25552a.m49297a(resolveAccountResponse.f60510a))) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f60514e);
        C25569b.m49351a(parcel, 2, this.f60510a);
        C25569b.m49352a(parcel, 3, this.f60511b, i);
        C25569b.m49355a(parcel, 4, this.f60512c);
        C25569b.m49355a(parcel, 5, this.f60513d);
        C25569b.m49359b(parcel, a);
    }

    ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f60514e = i;
        this.f60510a = iBinder;
        this.f60511b = connectionResult;
        this.f60512c = z;
        this.f60513d = z2;
    }
}
