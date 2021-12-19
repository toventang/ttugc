package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C25524aq();

    /* renamed from: a */
    private final int f60651a;

    static {
        Covode.recordClassIndex(30984);
    }

    zzs(int i) {
        this.f60651a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f60651a);
        C25569b.m49359b(parcel, a);
    }
}
