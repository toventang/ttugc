package com.bytedance.p802b.p806b.p807a.p811d;

import com.bytedance.android.livesdk.livesetting.feed.BackRefreshTimeoutSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p806b.p807a.p808a.C12928a;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p841k.C13130f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.b.b.a.d.c */
public final class C12957c {

    /* renamed from: n */
    private static final long[] f31554n = {120000, 300000, 600000, 1800000, 3600000};

    /* renamed from: a */
    volatile int f31555a;

    /* renamed from: b */
    volatile int f31556b;

    /* renamed from: c */
    volatile int f31557c;

    /* renamed from: d */
    volatile int f31558d;

    /* renamed from: e */
    volatile int f31559e;

    /* renamed from: f */
    public List<String> f31560f;

    /* renamed from: g */
    public List<String> f31561g;

    /* renamed from: h */
    List<String> f31562h;

    /* renamed from: i */
    volatile boolean f31563i;

    /* renamed from: j */
    AtomicLong f31564j;

    /* renamed from: k */
    AtomicLong f31565k;

    /* renamed from: l */
    public C12928a f31566l;

    /* renamed from: m */
    volatile boolean f31567m;

    /* renamed from: com.bytedance.b.b.a.d.c$a */
    public static class C12958a {

        /* renamed from: a */
        public static C12957c f31568a = new C12957c((byte) 0);

        static {
            Covode.recordClassIndex(14794);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo20816c() {
        this.f31563i = false;
        this.f31564j.set(System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo20815b() {
        if (this.f31563i || System.currentTimeMillis() - this.f31564j.get() > mo20817d()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final long mo20817d() {
        int i;
        if (this.f31556b > this.f31558d) {
            i = this.f31556b;
        } else {
            i = this.f31558d;
        }
        long j = (long) i;
        if (j > ((long) this.f31559e)) {
            return j;
        }
        return (long) this.f31559e;
    }

    static {
        Covode.recordClassIndex(14793);
    }

    private C12957c() {
        this.f31563i = true;
        this.f31560f = new ArrayList();
        this.f31561g = new ArrayList();
        this.f31562h = new ArrayList();
        this.f31564j = new AtomicLong(0);
        this.f31565k = new AtomicLong();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20813a() {
        if (this.f31555a == 0) {
            this.f31555a = 1;
            this.f31556b = 300000;
        } else if (this.f31555a == 1) {
            this.f31555a = 2;
            this.f31556b = 900000;
        } else if (this.f31555a == 2) {
            this.f31555a = 3;
            this.f31556b = BackRefreshTimeoutSetting.DEFAULT;
        } else {
            this.f31555a = 4;
            this.f31556b = BackRefreshTimeoutSetting.DEFAULT;
        }
        C13037a.m23579r();
        mo20816c();
    }

    /* synthetic */ C12957c(byte b) {
        this();
    }

    /* renamed from: a */
    static long m23254a(int i) {
        int i2 = i - 1;
        if (i2 < 0) {
            return 0;
        }
        long[] jArr = f31554n;
        if (i2 >= jArr.length) {
            return jArr[jArr.length - 1];
        }
        return jArr[i2];
    }

    /* renamed from: a */
    public final void mo20814a(List<String> list) {
        if (!C13130f.m23608a(list)) {
            this.f31562h.clear();
            this.f31562h.addAll(list);
        }
    }
}
