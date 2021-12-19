package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;

public final class zzkr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkr> CREATOR = new C26508jx();

    /* renamed from: a */
    public final String f62582a;

    /* renamed from: b */
    public final long f62583b;

    /* renamed from: c */
    public final Long f62584c;

    /* renamed from: d */
    public final String f62585d;

    /* renamed from: e */
    public final String f62586e;

    /* renamed from: f */
    public final Double f62587f;

    /* renamed from: g */
    private final int f62588g;

    /* renamed from: h */
    private final Float f62589h;

    static {
        Covode.recordClassIndex(31965);
    }

    /* renamed from: a */
    public final Object mo43675a() {
        Long l = this.f62584c;
        if (l != null) {
            return l;
        }
        Double d = this.f62587f;
        if (d != null) {
            return d;
        }
        String str = this.f62585d;
        if (str != null) {
            return str;
        }
        return null;
    }

    zzkr(C26507jw jwVar) {
        this(jwVar.f62393c, jwVar.f62394d, jwVar.f62395e, jwVar.f62392b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49360b(parcel, 1, this.f62588g);
        C25569b.m49353a(parcel, 2, this.f62582a);
        C25569b.m49349a(parcel, 3, this.f62583b);
        Long l = this.f62584c;
        if (l != null) {
            C25569b.m49348a(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        C25569b.m49353a(parcel, 6, this.f62585d);
        C25569b.m49353a(parcel, 7, this.f62586e);
        Double d = this.f62587f;
        if (d != null) {
            C25569b.m49348a(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        C25569b.m49359b(parcel, a);
    }

    zzkr(String str, long j, Object obj, String str2) {
        C25565r.m49316a(str);
        this.f62588g = 2;
        this.f62582a = str;
        this.f62583b = j;
        this.f62586e = str2;
        if (obj == null) {
            this.f62584c = null;
            this.f62589h = null;
            this.f62587f = null;
            this.f62585d = null;
        } else if (obj instanceof Long) {
            this.f62584c = (Long) obj;
            this.f62589h = null;
            this.f62587f = null;
            this.f62585d = null;
        } else if (obj instanceof String) {
            this.f62584c = null;
            this.f62589h = null;
            this.f62587f = null;
            this.f62585d = (String) obj;
        } else if (obj instanceof Double) {
            this.f62584c = null;
            this.f62589h = null;
            this.f62587f = (Double) obj;
            this.f62585d = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    zzkr(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        Double d2;
        this.f62588g = i;
        this.f62582a = str;
        this.f62583b = j;
        this.f62584c = l;
        if (i == 1) {
            if (f != null) {
                d2 = Double.valueOf(f.doubleValue());
            } else {
                d2 = null;
            }
            this.f62587f = d2;
        } else {
            this.f62587f = d;
        }
        this.f62585d = str2;
        this.f62586e = str3;
    }
}
