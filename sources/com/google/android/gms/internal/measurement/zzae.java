package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new C25971g();

    /* renamed from: a */
    public final long f61657a;

    /* renamed from: b */
    public final long f61658b;

    /* renamed from: c */
    public final boolean f61659c;

    /* renamed from: d */
    public final String f61660d;

    /* renamed from: e */
    public final String f61661e;

    /* renamed from: f */
    public final String f61662f;

    /* renamed from: g */
    public final Bundle f61663g;

    static {
        Covode.recordClassIndex(31651);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49349a(parcel, 1, this.f61657a);
        C25569b.m49349a(parcel, 2, this.f61658b);
        C25569b.m49355a(parcel, 3, this.f61659c);
        C25569b.m49353a(parcel, 4, this.f61660d);
        C25569b.m49353a(parcel, 5, this.f61661e);
        C25569b.m49353a(parcel, 6, this.f61662f);
        C25569b.m49350a(parcel, 7, this.f61663g);
        C25569b.m49359b(parcel, a);
    }

    public zzae(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.f61657a = j;
        this.f61658b = j2;
        this.f61659c = z;
        this.f61660d = str;
        this.f61661e = str2;
        this.f61662f = str3;
        this.f61663g = bundle;
    }
}
