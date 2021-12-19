package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.l */
public final class C26526l {

    /* renamed from: a */
    final String f62443a;

    /* renamed from: b */
    final String f62444b;

    /* renamed from: c */
    final long f62445c;

    /* renamed from: d */
    final long f62446d;

    /* renamed from: e */
    final long f62447e;

    /* renamed from: f */
    final long f62448f;

    /* renamed from: g */
    final long f62449g;

    /* renamed from: h */
    final Long f62450h;

    /* renamed from: i */
    final Long f62451i;

    /* renamed from: j */
    final Long f62452j;

    /* renamed from: k */
    final Boolean f62453k;

    static {
        Covode.recordClassIndex(31948);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C26526l mo43652a(long j) {
        return new C26526l(this.f62443a, this.f62444b, this.f62445c, this.f62446d, this.f62447e, j, this.f62449g, this.f62450h, this.f62451i, this.f62452j, this.f62453k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C26526l mo43653a(long j, long j2) {
        return new C26526l(this.f62443a, this.f62444b, this.f62445c, this.f62446d, this.f62447e, this.f62448f, j, Long.valueOf(j2), this.f62451i, this.f62452j, this.f62453k);
    }

    C26526l(String str, String str2, long j) {
        this(str, str2, 0, 0, 0, j, 0, null, null, null, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C26526l mo43654a(Long l, Long l2, Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null && !bool2.booleanValue()) {
            bool2 = null;
        }
        return new C26526l(this.f62443a, this.f62444b, this.f62445c, this.f62446d, this.f62447e, this.f62448f, this.f62449g, this.f62450h, l, l2, bool2);
    }

    C26526l(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        C25565r.m49316a(str);
        C25565r.m49316a(str2);
        boolean z4 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C25565r.m49324b(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C25565r.m49324b(z2);
        if (j3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C25565r.m49324b(z3);
        C25565r.m49324b(j5 < 0 ? false : z4);
        this.f62443a = str;
        this.f62444b = str2;
        this.f62445c = j;
        this.f62446d = j2;
        this.f62447e = j3;
        this.f62448f = j4;
        this.f62449g = j5;
        this.f62450h = l;
        this.f62451i = l2;
        this.f62452j = l3;
        this.f62453k = bool;
    }
}
