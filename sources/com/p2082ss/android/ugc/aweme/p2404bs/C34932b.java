package com.p2082ss.android.ugc.aweme.p2404bs;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22096s;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bs.b */
public final class C34932b extends C22096s {

    /* renamed from: Q */
    public final HashMap<String, Long> f82409Q = new HashMap<>();

    /* renamed from: R */
    public final HashMap<String, Long> f82410R = new HashMap<>();

    /* renamed from: S */
    public final HashMap<String, Long> f82411S = new HashMap<>();

    /* renamed from: T */
    public long f82412T;

    /* renamed from: U */
    public long f82413U;

    /* renamed from: V */
    public long f82414V;

    /* renamed from: W */
    public long f82415W;

    /* renamed from: X */
    public long f82416X;

    /* renamed from: Y */
    public String f82417Y = "";

    /* renamed from: Z */
    public long f82418Z;

    static {
        Covode.recordClassIndex(41953);
    }

    /* renamed from: a */
    public final void mo61813a(String str) {
        C89219l.m154721d(str, "");
        this.f82417Y = str;
    }

    /* renamed from: b */
    public final void mo61815b(String str, long j) {
        C89219l.m154721d(str, "");
        this.f82410R.put(str, Long.valueOf(j));
    }

    /* renamed from: c */
    public final void mo61816c(String str, long j) {
        C89219l.m154721d(str, "");
        this.f82411S.put(str, Long.valueOf(j));
    }

    public C34932b(long j, long j2) {
        super(j, j2);
    }

    /* renamed from: a */
    public final void mo61814a(String str, long j) {
        C89219l.m154721d(str, "");
        Long l = this.f82409Q.get(str);
        if (l == null) {
            l = 0L;
        }
        C89219l.m154716b(l, "");
        this.f82409Q.put(str, Long.valueOf(j + l.longValue()));
    }
}
