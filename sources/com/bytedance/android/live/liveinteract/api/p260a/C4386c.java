package com.bytedance.android.live.liveinteract.api.p260a;

import com.bytedance.android.livesdk.p458b.p459a.AbstractC6891a;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.api.a.c */
public final class C4386c extends AbstractC6891a<Integer> {

    /* renamed from: o */
    private static C4386c f11979o;

    /* renamed from: a */
    public long f11980a;

    /* renamed from: b */
    public boolean f11981b;

    /* renamed from: c */
    public long f11982c;

    /* renamed from: d */
    public boolean f11983d;

    /* renamed from: e */
    public int f11984e;

    /* renamed from: f */
    public C11672a f11985f;

    /* renamed from: g */
    public String f11986g;

    /* renamed from: h */
    public boolean f11987h;

    /* renamed from: i */
    public int f11988i;

    /* renamed from: j */
    public int f11989j;

    /* renamed from: k */
    public int f11990k;

    /* renamed from: l */
    public int f11991l;

    /* renamed from: p */
    private long f11992p;

    static {
        Covode.recordClassIndex(4962);
    }

    private C4386c() {
        this.f17248n = 0;
    }

    /* renamed from: a */
    public static C4386c m10499a() {
        if (f11979o == null) {
            f11979o = new C4386c();
        }
        return f11979o;
    }

    /* renamed from: b */
    public final long mo10160b() {
        long j = this.f11992p;
        this.f11980a += j;
        this.f11992p = 0;
        return j;
    }

    /* renamed from: c */
    public final void mo10161c() {
        this.f17248n = 0;
        this.f11981b = false;
        this.f11992p = 0;
        this.f11980a = 0;
        this.f11982c = 0;
        this.f11983d = false;
        this.f11984e = 0;
        this.f11985f = null;
        this.f11986g = null;
        this.f11987h = false;
        this.f11988i = 0;
        this.f11989j = 0;
        this.f11991l = 0;
    }

    /* renamed from: a */
    public final void mo10157a(long j) {
        if (j > this.f11992p) {
            this.f11992p = j;
        }
    }

    /* renamed from: a */
    public final void mo10159a(Integer num) {
        if (num != null && num.intValue() >= 0 && num.intValue() <= 2) {
            if (2 == num.intValue()) {
                this.f11981b = true;
            }
            super.mo10159a((Object) num);
        }
    }
}
