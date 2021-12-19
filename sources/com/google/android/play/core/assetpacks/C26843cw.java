package com.google.android.play.core.assetpacks;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26916bg;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.p1966e.C27006al;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.cw */
public final class C26843cw {

    /* renamed from: a */
    static final C26909b f63683a = new C26909b("AssetPackManager");

    /* renamed from: b */
    final C26769ac f63684b;

    /* renamed from: c */
    final AbstractC26916bg<AbstractC26857dj> f63685c;

    /* renamed from: d */
    final AbstractC26916bg<Executor> f63686d;

    /* renamed from: e */
    private final C26878w f63687e;

    /* renamed from: f */
    private final C27006al f63688f;

    /* renamed from: g */
    private final C26806bm f63689g;

    /* renamed from: h */
    private final C26791ay f63690h;

    /* renamed from: i */
    private final C26779am f63691i;

    /* renamed from: j */
    private final Handler f63692j = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(32318);
    }

    C26843cw(C26769ac acVar, AbstractC26916bg<AbstractC26857dj> bgVar, C26878w wVar, C27006al alVar, C26806bm bmVar, C26791ay ayVar, C26779am amVar, AbstractC26916bg<Executor> bgVar2) {
        this.f63684b = acVar;
        this.f63685c = bgVar;
        this.f63687e = wVar;
        this.f63688f = alVar;
        this.f63689g = bmVar;
        this.f63690h = ayVar;
        this.f63691i = amVar;
        this.f63686d = bgVar2;
    }

    /* renamed from: a */
    private final void m53309a() {
        this.f63686d.mo44603a().execute(new RunnableC26840ct(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo44541a(boolean z) {
        boolean a = this.f63687e.mo44663a();
        this.f63687e.mo44662a(z);
        if (z && !a) {
            m53309a();
        }
    }
}
