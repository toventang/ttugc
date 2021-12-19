package com.p2082ss.android.ugc.aweme.livewallpaper.p3415c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.e */
public class C58855e {

    /* renamed from: e */
    private static int f133967e = 12375;

    /* renamed from: f */
    private static int f133968f = 12374;

    /* renamed from: a */
    protected C58854d f133969a;

    /* renamed from: b */
    private Object f133970b;

    /* renamed from: c */
    private int f133971c = -1;

    /* renamed from: d */
    private int f133972d = -1;

    static {
        Covode.recordClassIndex(69169);
    }

    /* renamed from: b */
    public final int mo96271b() {
        int i = this.f133971c;
        if (i < 0) {
            return this.f133969a.mo96265a(this.f133970b, f133967e);
        }
        return i;
    }

    /* renamed from: c */
    public final int mo96272c() {
        int i = this.f133972d;
        if (i < 0) {
            return this.f133969a.mo96265a(this.f133970b, f133968f);
        }
        return i;
    }

    /* renamed from: e */
    public final void mo96274e() {
        C58854d dVar = this.f133969a;
        dVar.f133966a.mo96262c(this.f133970b);
    }

    /* renamed from: f */
    public final boolean mo96275f() {
        C58854d dVar = this.f133969a;
        return dVar.f133966a.mo96263d(this.f133970b);
    }

    /* renamed from: a */
    public final void mo96268a() {
        if (this.f133970b == null) {
            this.f133970b = this.f133969a.f133966a.mo96257a(1, 1);
            this.f133971c = 1;
            this.f133972d = 1;
            return;
        }
        throw new IllegalStateException("surface already created");
    }

    /* renamed from: d */
    public final void mo96273d() {
        C58854d dVar = this.f133969a;
        dVar.f133966a.mo96259a(this.f133970b);
        this.f133970b = null;
        this.f133971c = -1;
        this.f133972d = -1;
    }

    protected C58855e(C58854d dVar) {
        this.f133969a = dVar;
    }

    /* renamed from: a */
    public final void mo96269a(long j) {
        C58854d dVar = this.f133969a;
        dVar.f133966a.mo96260a(this.f133970b, j);
    }

    /* renamed from: a */
    public final void mo96270a(Object obj) {
        if (this.f133970b == null) {
            this.f133970b = this.f133969a.f133966a.mo96261b(obj);
            return;
        }
        throw new IllegalStateException("surface already created");
    }
}
