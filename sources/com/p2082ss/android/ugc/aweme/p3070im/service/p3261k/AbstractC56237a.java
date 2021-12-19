package com.p2082ss.android.ugc.aweme.p3070im.service.p3261k;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.im.service.k.a */
public abstract class AbstractC56237a implements Comparable<AbstractC56237a> {

    /* renamed from: j */
    public long f128231j = -1;

    /* renamed from: k */
    public String f128232k;

    /* renamed from: l */
    public Object f128233l;

    /* renamed from: m */
    public String f128234m;

    /* renamed from: n */
    public String f128235n;

    /* renamed from: o */
    public long f128236o;

    /* renamed from: p */
    public long f128237p;

    /* renamed from: q */
    public int f128238q;

    /* renamed from: r */
    public boolean f128239r;

    /* renamed from: s */
    public boolean f128240s;

    /* renamed from: t */
    public int f128241t;

    /* renamed from: u */
    public HashMap<String, String> f128242u;

    /* renamed from: v */
    public boolean f128243v;

    /* renamed from: w */
    public AbstractC56238b f128244w;

    /* renamed from: x */
    public boolean f128245x;

    /* renamed from: y */
    public C56241d f128246y;

    static {
        Covode.recordClassIndex(66046);
    }

    /* renamed from: b */
    public abstract AbstractC56238b mo91859b();

    public abstract String bL_();

    /* renamed from: c */
    public abstract int mo91860c();

    /* renamed from: d */
    public abstract void mo91863d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo91864e() {
        return this.f128236o;
    }

    /* renamed from: f */
    public String mo91869f() {
        return this.f128234m;
    }

    /* renamed from: g */
    public String mo91870g() {
        return this.f128235n;
    }

    public AbstractC56237a() {
        mo91863d();
        this.f128244w = mo91859b();
    }

    /* renamed from: i */
    public final boolean mo93053i() {
        if (mo91860c() == 0 || mo91860c() == 20) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f128232k, this.f128233l, this.f128234m, this.f128235n, Long.valueOf(this.f128236o), Long.valueOf(this.f128237p), Integer.valueOf(this.f128238q), Boolean.valueOf(this.f128239r), Boolean.valueOf(this.f128240s), Boolean.valueOf(this.f128245x), this.f128246y);
    }

    /* renamed from: a */
    public final void mo93051a(long j) {
        if (j < 10000000000L) {
            this.f128236o = j * 1000;
        } else {
            this.f128236o = j;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(AbstractC56237a aVar) {
        AbstractC56237a aVar2 = aVar;
        if (aVar2 == null) {
            return -1;
        }
        int i = this.f128241t;
        int i2 = aVar2.f128241t;
        if (i == i2) {
            return Long.compare(mo91864e(), aVar2.mo91864e());
        }
        return i - i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC56237a aVar = (AbstractC56237a) obj;
            if (this.f128236o == aVar.f128236o && this.f128237p == aVar.f128237p && this.f128238q == aVar.f128238q && this.f128239r == aVar.f128239r && this.f128240s == aVar.f128240s && this.f128245x == aVar.f128245x && Objects.equals(this.f128232k, aVar.f128232k) && Objects.equals(this.f128233l, aVar.f128233l) && Objects.equals(this.f128234m, aVar.f128234m) && Objects.equals(this.f128235n, aVar.f128235n) && Objects.equals(this.f128246y, aVar.f128246y)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
