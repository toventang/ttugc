package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new C26531q();

    /* renamed from: a */
    public final String f62578a;

    /* renamed from: b */
    public final zzan f62579b;

    /* renamed from: c */
    public final String f62580c;

    /* renamed from: d */
    public final long f62581d;

    static {
        Covode.recordClassIndex(31964);
    }

    public final String toString() {
        String str = this.f62580c;
        String str2 = this.f62578a;
        String valueOf = String.valueOf(this.f62579b);
        return new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length()).append("origin=").append(str).append(",name=").append(str2).append(",params=").append(valueOf).toString();
    }

    zzao(zzao zzao, long j) {
        C25565r.m49314a(zzao);
        this.f62578a = zzao.f62578a;
        this.f62579b = zzao.f62579b;
        this.f62580c = zzao.f62580c;
        this.f62581d = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49353a(parcel, 2, this.f62578a);
        C25569b.m49352a(parcel, 3, this.f62579b, i);
        C25569b.m49353a(parcel, 4, this.f62580c);
        C25569b.m49349a(parcel, 5, this.f62581d);
        C25569b.m49359b(parcel, a);
    }

    public zzao(String str, zzan zzan, String str2, long j) {
        this.f62578a = str;
        this.f62579b = zzan;
        this.f62580c = str2;
        this.f62581d = j;
    }
}
