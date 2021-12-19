package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new C26525kn();

    /* renamed from: a */
    public String f62612a;

    /* renamed from: b */
    public String f62613b;

    /* renamed from: c */
    public zzkr f62614c;

    /* renamed from: d */
    public long f62615d;

    /* renamed from: e */
    public boolean f62616e;

    /* renamed from: f */
    public String f62617f;

    /* renamed from: g */
    public zzao f62618g;

    /* renamed from: h */
    public long f62619h;

    /* renamed from: i */
    public zzao f62620i;

    /* renamed from: j */
    public long f62621j;

    /* renamed from: k */
    public zzao f62622k;

    static {
        Covode.recordClassIndex(31967);
    }

    zzw(zzw zzw) {
        C25565r.m49314a(zzw);
        this.f62612a = zzw.f62612a;
        this.f62613b = zzw.f62613b;
        this.f62614c = zzw.f62614c;
        this.f62615d = zzw.f62615d;
        this.f62616e = zzw.f62616e;
        this.f62617f = zzw.f62617f;
        this.f62618g = zzw.f62618g;
        this.f62619h = zzw.f62619h;
        this.f62620i = zzw.f62620i;
        this.f62621j = zzw.f62621j;
        this.f62622k = zzw.f62622k;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49353a(parcel, 2, this.f62612a);
        C25569b.m49353a(parcel, 3, this.f62613b);
        C25569b.m49352a(parcel, 4, this.f62614c, i);
        C25569b.m49349a(parcel, 5, this.f62615d);
        C25569b.m49355a(parcel, 6, this.f62616e);
        C25569b.m49353a(parcel, 7, this.f62617f);
        C25569b.m49352a(parcel, 8, this.f62618g, i);
        C25569b.m49349a(parcel, 9, this.f62619h);
        C25569b.m49352a(parcel, 10, this.f62620i, i);
        C25569b.m49349a(parcel, 11, this.f62621j);
        C25569b.m49352a(parcel, 12, this.f62622k, i);
        C25569b.m49359b(parcel, a);
    }

    zzw(String str, String str2, zzkr zzkr, long j, boolean z, String str3, zzao zzao, long j2, zzao zzao2, long j3, zzao zzao3) {
        this.f62612a = str;
        this.f62613b = str2;
        this.f62614c = zzkr;
        this.f62615d = j;
        this.f62616e = z;
        this.f62617f = str3;
        this.f62618g = zzao;
        this.f62619h = j2;
        this.f62620i = zzao2;
        this.f62621j = j3;
        this.f62622k = zzao3;
    }
}
