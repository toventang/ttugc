package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C25569b;
import java.util.List;

public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C26514kc();

    /* renamed from: a */
    public final String f62590a;

    /* renamed from: b */
    public final String f62591b;

    /* renamed from: c */
    public final String f62592c;

    /* renamed from: d */
    public final String f62593d;

    /* renamed from: e */
    public final long f62594e;

    /* renamed from: f */
    public final long f62595f;

    /* renamed from: g */
    public final String f62596g;

    /* renamed from: h */
    public final boolean f62597h;

    /* renamed from: i */
    public final boolean f62598i;

    /* renamed from: j */
    public final long f62599j;

    /* renamed from: k */
    public final String f62600k;

    /* renamed from: l */
    public final long f62601l;

    /* renamed from: m */
    public final long f62602m;

    /* renamed from: n */
    public final int f62603n;

    /* renamed from: o */
    public final boolean f62604o;

    /* renamed from: p */
    public final boolean f62605p;

    /* renamed from: q */
    public final boolean f62606q;

    /* renamed from: r */
    public final String f62607r;

    /* renamed from: s */
    public final Boolean f62608s;

    /* renamed from: t */
    public final long f62609t;

    /* renamed from: u */
    public final List<String> f62610u;

    /* renamed from: v */
    public final String f62611v;

    static {
        Covode.recordClassIndex(31966);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C25569b.m49347a(parcel, 20293);
        C25569b.m49353a(parcel, 2, this.f62590a);
        C25569b.m49353a(parcel, 3, this.f62591b);
        C25569b.m49353a(parcel, 4, this.f62592c);
        C25569b.m49353a(parcel, 5, this.f62593d);
        C25569b.m49349a(parcel, 6, this.f62594e);
        C25569b.m49349a(parcel, 7, this.f62595f);
        C25569b.m49353a(parcel, 8, this.f62596g);
        C25569b.m49355a(parcel, 9, this.f62597h);
        C25569b.m49355a(parcel, 10, this.f62598i);
        C25569b.m49349a(parcel, 11, this.f62599j);
        C25569b.m49353a(parcel, 12, this.f62600k);
        C25569b.m49349a(parcel, 13, this.f62601l);
        C25569b.m49349a(parcel, 14, this.f62602m);
        C25569b.m49360b(parcel, 15, this.f62603n);
        C25569b.m49355a(parcel, 16, this.f62604o);
        C25569b.m49355a(parcel, 17, this.f62605p);
        C25569b.m49355a(parcel, 18, this.f62606q);
        C25569b.m49353a(parcel, 19, this.f62607r);
        Boolean bool = this.f62608s;
        if (bool != null) {
            C25569b.m49348a(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        C25569b.m49349a(parcel, 22, this.f62609t);
        C25569b.m49354a(parcel, 23, this.f62610u);
        C25569b.m49353a(parcel, 24, this.f62611v);
        C25569b.m49359b(parcel, a);
    }

    zzn(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        C25565r.m49316a(str);
        this.f62590a = str;
        this.f62591b = TextUtils.isEmpty(str2) ? null : str2;
        this.f62592c = str3;
        this.f62599j = j;
        this.f62593d = str4;
        this.f62594e = j2;
        this.f62595f = j3;
        this.f62596g = str5;
        this.f62597h = z;
        this.f62598i = z2;
        this.f62600k = str6;
        this.f62601l = j4;
        this.f62602m = j5;
        this.f62603n = i;
        this.f62604o = z3;
        this.f62605p = z4;
        this.f62606q = z5;
        this.f62607r = str7;
        this.f62608s = bool;
        this.f62609t = j6;
        this.f62610u = list;
        this.f62611v = str8;
    }

    zzn(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list, String str8) {
        this.f62590a = str;
        this.f62591b = str2;
        this.f62592c = str3;
        this.f62599j = j3;
        this.f62593d = str4;
        this.f62594e = j;
        this.f62595f = j2;
        this.f62596g = str5;
        this.f62597h = z;
        this.f62598i = z2;
        this.f62600k = str6;
        this.f62601l = j4;
        this.f62602m = j5;
        this.f62603n = i;
        this.f62604o = z3;
        this.f62605p = z4;
        this.f62606q = z5;
        this.f62607r = str7;
        this.f62608s = bool;
        this.f62609t = j6;
        this.f62610u = list;
        this.f62611v = str8;
    }
}
