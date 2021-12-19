package com.bytedance.android.p126a.p136b.p138b;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.a.b.b.c */
public final class C2667c {

    /* renamed from: a */
    public int f7965a = -1;

    /* renamed from: b */
    public String f7966b;

    /* renamed from: c */
    public Map<String, List<String>> f7967c;

    /* renamed from: d */
    public final long f7968d;

    /* renamed from: e */
    public final C2665b f7969e;

    /* renamed from: f */
    public Throwable f7970f;

    static {
        Covode.recordClassIndex(3055);
    }

    /* renamed from: a */
    public final boolean mo7183a() {
        int i = this.f7965a;
        if (i < 200 || i >= 300) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C2667c m7705a(Throwable th, C2665b bVar) {
        return new C2667c(-1, th.getMessage(), null, bVar, th);
    }

    public C2667c(int i, String str, Map<String, List<String>> map, C2665b bVar, Throwable th) {
        this.f7965a = i;
        this.f7966b = str;
        this.f7967c = map;
        this.f7969e = bVar;
        this.f7970f = th;
        this.f7968d = System.currentTimeMillis();
    }
}
