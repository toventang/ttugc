package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26916bg;
import com.google.android.play.core.p1963b.C26909b;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.av */
public final class C26788av {

    /* renamed from: a */
    static final C26909b f63506a = new C26909b("ExtractorLooper");

    /* renamed from: b */
    final C26785as f63507b;

    /* renamed from: c */
    final C26837cq f63508c;

    /* renamed from: d */
    final C26821ca f63509d;

    /* renamed from: e */
    final C26825ce f63510e;

    /* renamed from: f */
    final C26830cj f63511f;

    /* renamed from: g */
    final AbstractC26916bg<AbstractC26857dj> f63512g;

    /* renamed from: h */
    final C26809bp f63513h;

    /* renamed from: i */
    final AtomicBoolean f63514i = new AtomicBoolean(false);

    /* renamed from: j */
    private final C26806bm f63515j;

    static {
        Covode.recordClassIndex(32263);
    }

    C26788av(C26806bm bmVar, AbstractC26916bg<AbstractC26857dj> bgVar, C26785as asVar, C26837cq cqVar, C26821ca caVar, C26825ce ceVar, C26830cj cjVar, C26809bp bpVar) {
        this.f63515j = bmVar;
        this.f63512g = bgVar;
        this.f63507b = asVar;
        this.f63508c = cqVar;
        this.f63509d = caVar;
        this.f63510e = ceVar;
        this.f63511f = cjVar;
        this.f63513h = bpVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44486a(int i, Exception exc) {
        try {
            this.f63515j.mo44497c(i);
            this.f63515j.mo44495a(i);
        } catch (C26787au unused) {
            f63506a.mo44596b("Error during error handling: %s", exc.getMessage());
        }
    }
}
