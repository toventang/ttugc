package com.facebook.fresco.animation.p1863b.p1864a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1836h.C24117a;
import com.facebook.fresco.animation.p1863b.AbstractC24280b;

/* renamed from: com.facebook.fresco.animation.b.a.b */
public final class C24278b implements AbstractC24280b {

    /* renamed from: a */
    private int f57561a = -1;

    /* renamed from: b */
    private C24117a<Bitmap> f57562b;

    static {
        Covode.recordClassIndex(28410);
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24280b
    /* renamed from: b */
    public final void mo40058b(int i, C24117a<Bitmap> aVar) {
    }

    /* renamed from: d */
    private synchronized void m46173d() {
        MethodCollector.m26663i(6315);
        C24117a.m45712c(this.f57562b);
        this.f57562b = null;
        this.f57561a = -1;
        MethodCollector.m26664o(6315);
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24280b
    /* renamed from: a */
    public final synchronized C24117a<Bitmap> mo40054a() {
        C24117a<Bitmap> b;
        MethodCollector.m26663i(5734);
        b = C24117a.m45711b(this.f57562b);
        MethodCollector.m26664o(5734);
        return b;
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24280b
    /* renamed from: b */
    public final synchronized C24117a<Bitmap> mo40057b() {
        MethodCollector.m26663i(5869);
        try {
        } finally {
            m46173d();
            MethodCollector.m26664o(5869);
        }
        return C24117a.m45711b(this.f57562b);
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24280b
    /* renamed from: c */
    public final synchronized void mo40060c() {
        MethodCollector.m26663i(6158);
        m46173d();
        MethodCollector.m26664o(6158);
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24280b
    /* renamed from: a */
    public final synchronized C24117a<Bitmap> mo40055a(int i) {
        MethodCollector.m26663i(5497);
        if (this.f57561a == i) {
            C24117a<Bitmap> b = C24117a.m45711b(this.f57562b);
            MethodCollector.m26664o(5497);
            return b;
        }
        MethodCollector.m26664o(5497);
        return null;
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24280b
    /* renamed from: b */
    public final synchronized boolean mo40059b(int i) {
        MethodCollector.m26663i(6010);
        if (i != this.f57561a || !C24117a.m45710a((C24117a<?>) this.f57562b)) {
            MethodCollector.m26664o(6010);
            return false;
        }
        MethodCollector.m26664o(6010);
        return true;
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24280b
    /* renamed from: a */
    public final synchronized void mo40056a(int i, C24117a<Bitmap> aVar) {
        MethodCollector.m26663i(6314);
        if (aVar == null || this.f57562b == null || !aVar.mo39695a().equals(this.f57562b.mo39695a())) {
            C24117a.m45712c(this.f57562b);
            this.f57562b = C24117a.m45711b(aVar);
            this.f57561a = i;
            MethodCollector.m26664o(6314);
            return;
        }
        MethodCollector.m26664o(6314);
    }
}
