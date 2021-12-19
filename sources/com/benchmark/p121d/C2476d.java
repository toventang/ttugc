package com.benchmark.p121d;

import com.bytedance.covode.number.Covode;
import java.util.Date;

/* renamed from: com.benchmark.d.d */
public final class C2476d {

    /* renamed from: a */
    public AbstractC2471a f7428a;

    /* renamed from: b */
    public int f7429b;

    /* renamed from: c */
    public long f7430c;

    /* renamed from: d */
    private Date f7431d;

    /* renamed from: e */
    private Date f7432e;

    static {
        Covode.recordClassIndex(2831);
    }

    /* renamed from: b */
    public final C2476d mo6858b() {
        this.f7431d = new Date();
        return this;
    }

    /* renamed from: a */
    public final C2475c mo6857a() {
        if (this.f7431d == null || this.f7428a == null) {
            throw new RuntimeException("mStartTime or job cant not be null");
        }
        C2475c cVar = new C2475c();
        Date date = this.f7432e;
        if (date != null && this.f7429b < 0 && this.f7430c > 0) {
            this.f7429b = (int) (((date.getTime() - this.f7431d.getTime()) / this.f7430c) + 1);
        }
        cVar.f7423a = this.f7431d;
        cVar.f7424b = this.f7432e;
        cVar.f7425c = this.f7428a;
        cVar.f7426d.set(this.f7429b);
        cVar.f7427e = this.f7430c;
        return cVar;
    }
}
