package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.fn */
public abstract class AbstractC25955fn {

    /* renamed from: a */
    int f61123a;

    /* renamed from: b */
    int f61124b;

    /* renamed from: c */
    C25956fo f61125c;

    /* renamed from: d */
    private int f61126d;

    static {
        Covode.recordClassIndex(31370);
    }

    /* renamed from: a */
    public static long m50254a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: e */
    public static int m50256e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public abstract int mo42427a();

    /* renamed from: a */
    public abstract void mo42428a(int i);

    /* renamed from: b */
    public abstract double mo42429b();

    /* renamed from: b */
    public abstract boolean mo42430b(int i);

    /* renamed from: c */
    public abstract float mo42431c();

    /* renamed from: c */
    public abstract int mo42432c(int i);

    /* renamed from: d */
    public abstract long mo42433d();

    /* renamed from: d */
    public abstract void mo42434d(int i);

    /* renamed from: e */
    public abstract long mo42435e();

    /* renamed from: f */
    public abstract int mo42436f();

    /* renamed from: g */
    public abstract long mo42437g();

    /* renamed from: h */
    public abstract int mo42438h();

    /* renamed from: i */
    public abstract boolean mo42439i();

    /* renamed from: j */
    public abstract String mo42440j();

    /* renamed from: k */
    public abstract String mo42441k();

    /* renamed from: l */
    public abstract AbstractC25943fb mo42442l();

    /* renamed from: m */
    public abstract int mo42443m();

    /* renamed from: n */
    public abstract int mo42444n();

    /* renamed from: o */
    public abstract int mo42445o();

    /* renamed from: p */
    public abstract long mo42446p();

    /* renamed from: q */
    public abstract int mo42447q();

    /* renamed from: r */
    public abstract long mo42448r();

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract long mo42449s();

    /* renamed from: t */
    public abstract boolean mo42450t();

    /* renamed from: u */
    public abstract int mo42451u();

    private AbstractC25955fn() {
        this.f61124b = 100;
        this.f61126d = Integer.MAX_VALUE;
    }

    /* synthetic */ AbstractC25955fn(byte b) {
        this();
    }

    /* renamed from: a */
    static AbstractC25955fn m50255a(byte[] bArr, int i) {
        C25957fp fpVar = new C25957fp(bArr, i, (byte) 0);
        try {
            fpVar.mo42432c(i);
            return fpVar;
        } catch (C25994gr e) {
            throw new IllegalArgumentException(e);
        }
    }
}
