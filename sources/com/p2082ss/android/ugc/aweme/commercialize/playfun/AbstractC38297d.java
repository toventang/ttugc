package com.p2082ss.android.ugc.aweme.commercialize.playfun;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.d */
public abstract class AbstractC38297d {

    /* renamed from: a */
    public Runnable f90509a;

    /* renamed from: b */
    public final C38298e f90510b;

    static {
        Covode.recordClassIndex(45784);
    }

    /* renamed from: a */
    public static void m77676a(String str) {
        C89219l.m154721d(str, "");
    }

    /* renamed from: a */
    public abstract void mo66869a();

    /* renamed from: b */
    public void mo66871b() {
    }

    /* renamed from: c */
    public void mo66872c() {
    }

    /* renamed from: d */
    public void mo66877d() {
    }

    /* renamed from: f */
    public boolean mo66878f() {
        return false;
    }

    /* renamed from: g */
    public final void mo66888g() {
        this.f90510b.mo66890a(0);
    }

    /* renamed from: e */
    public void mo66873e() {
        Runnable runnable = this.f90509a;
        if (runnable != null) {
            this.f90510b.f90524n.removeCallbacks(runnable);
        }
        this.f90509a = null;
    }

    public AbstractC38297d(C38298e eVar) {
        C89219l.m154721d(eVar, "");
        this.f90510b = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66887a(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        this.f90509a = runnable;
        this.f90510b.f90524n.post(runnable);
    }
}
