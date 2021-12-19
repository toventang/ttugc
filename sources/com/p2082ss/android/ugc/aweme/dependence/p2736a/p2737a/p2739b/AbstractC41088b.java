package com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2738a.AbstractC41086b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dependence.a.a.b.b */
public abstract class AbstractC41088b<Param, Target> {

    /* renamed from: a */
    public AtomicInteger f96043a = new AtomicInteger(-1);

    /* renamed from: b */
    public int f96044b;

    /* renamed from: c */
    public boolean f96045c;

    /* renamed from: d */
    public AtomicBoolean f96046d = new AtomicBoolean(false);

    /* renamed from: e */
    public Target f96047e;

    /* renamed from: f */
    public C41091e f96048f;

    /* renamed from: g */
    public String f96049g;

    /* renamed from: h */
    public Param f96050h;

    static {
        Covode.recordClassIndex(48958);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo70304a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo70305b(AbstractC41086b<Param, Target> bVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo70306c(AbstractC41086b<Param, Target> bVar) {
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: a */
    public final void mo70302a(int i) {
        this.f96043a.set(i);
    }

    /* renamed from: a */
    public final void mo70303a(AbstractC41086b<Param, Target> bVar) {
        C89219l.m154721d(bVar, "");
        if (!this.f96046d.get()) {
            this.f96046d.set(true);
            bVar.mo70283a(this);
        }
        if (mo70304a()) {
            mo70302a(3);
            mo70306c(bVar);
            bVar.mo70289b(this);
            return;
        }
        mo70302a(2);
        mo70305b(bVar);
    }

    public AbstractC41088b(String str, Param param) {
        C89219l.m154721d(str, "");
        this.f96049g = str;
        this.f96050h = param;
        mo70302a(0);
    }
}
