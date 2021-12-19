package com.p2082ss.android.ugc.aweme.commercialize.p2604n;

import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.commercialize.n.b */
public final class C38264b implements AbstractC38263a {

    /* renamed from: a */
    public static boolean f90431a;

    /* renamed from: b */
    public static final C38264b f90432b = new C38264b();

    /* renamed from: c */
    private static WeakReference<AbstractC38263a> f90433c;

    private C38264b() {
    }

    static {
        Covode.recordClassIndex(45748);
    }

    /* renamed from: c */
    public static final AbstractC38263a m77611c() {
        WeakReference<AbstractC38263a> weakReference = f90433c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.p2604n.AbstractC38263a
    /* renamed from: b */
    public final void mo66031b() {
        AbstractC38263a c = m77611c();
        if (c != null) {
            c.mo66031b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.p2604n.AbstractC38263a
    /* renamed from: a */
    public final void mo66030a() {
        AbstractC38263a c = m77611c();
        if (c != null) {
            c.mo66030a();
        }
    }

    /* renamed from: a */
    public static final void m77610a(AbstractC38263a aVar) {
        WeakReference<AbstractC38263a> weakReference;
        if (aVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(aVar);
        }
        f90433c = weakReference;
    }
}
