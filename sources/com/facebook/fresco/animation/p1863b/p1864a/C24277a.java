package com.facebook.fresco.animation.p1863b.p1864a;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1833e.C24099a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.fresco.animation.p1863b.AbstractC24280b;
import com.facebook.imagepipeline.p1871a.p1874c.C24338c;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1885j.C24458g;
import com.facebook.p1826c.p1827a.AbstractC24026e;

/* renamed from: com.facebook.fresco.animation.b.a.a */
public class C24277a implements AbstractC24280b {

    /* renamed from: a */
    private static final Class<?> f57555a = C24277a.class;

    /* renamed from: b */
    private final C24338c f57556b;

    /* renamed from: c */
    private final boolean f57557c;

    /* renamed from: d */
    private final SparseArray<C24117a<AbstractC24454c>> f57558d;

    /* renamed from: e */
    private C24117a<AbstractC24454c> f57559e;

    /* renamed from: f */
    private int f57560f = -1;

    static {
        Covode.recordClassIndex(28409);
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24280b
    /* renamed from: a */
    public final synchronized C24117a<Bitmap> mo40054a() {
        C24117a<Bitmap> a;
        MethodCollector.m26663i(5576);
        a = m46163a(C24117a.m45711b(this.f57559e));
        MethodCollector.m26664o(5576);
        return a;
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24280b
    /* renamed from: b */
    public final synchronized C24117a<Bitmap> mo40057b() {
        MethodCollector.m26663i(5578);
        C24117a<AbstractC24454c> aVar = null;
        if (!this.f57557c) {
            MethodCollector.m26664o(5578);
            return null;
        }
        C24338c cVar = this.f57556b;
        while (true) {
            AbstractC24026e a = cVar.mo40134a();
            if (a == null) {
                break;
            }
            C24117a<AbstractC24454c> b = cVar.f57714b.mo40207b(a);
            if (b != null) {
                aVar = b;
                break;
            }
        }
        C24117a<Bitmap> a2 = m46163a(aVar);
        MethodCollector.m26664o(5578);
        return a2;
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24280b
    /* renamed from: c */
    public final synchronized void mo40060c() {
        MethodCollector.m26663i(5584);
        C24117a.m45712c(this.f57559e);
        this.f57556b.mo40139c(this.f57560f);
        this.f57559e = null;
        this.f57560f = -1;
        for (int i = 0; i < this.f57558d.size(); i++) {
            C24117a<AbstractC24454c> valueAt = this.f57558d.valueAt(i);
            if (valueAt != null) {
                C24117a.m45712c(valueAt);
                this.f57556b.mo40139c(this.f57558d.keyAt(i));
            }
        }
        this.f57558d.clear();
        MethodCollector.m26664o(5584);
    }

    /* renamed from: b */
    private static C24117a<AbstractC24454c> m46164b(C24117a<Bitmap> aVar) {
        return C24117a.m45706a(new C24455d(aVar, C24458g.f58105a));
    }

    /* renamed from: a */
    private static C24117a<Bitmap> m46163a(C24117a<AbstractC24454c> aVar) {
        C24455d dVar;
        try {
            if (C24117a.m45710a((C24117a<?>) aVar) && (aVar.mo39695a() instanceof C24455d) && (dVar = (C24455d) aVar.mo39695a()) != null) {
                return dVar.mo40299f();
            }
            C24117a.m45712c(aVar);
            return null;
        } finally {
            C24117a.m45712c(aVar);
        }
    }

    /* renamed from: c */
    private synchronized void m46165c(int i) {
        MethodCollector.m26663i(5986);
        C24117a<AbstractC24454c> aVar = this.f57558d.get(i);
        if (aVar != null) {
            this.f57558d.delete(i);
            C24117a.m45712c(aVar);
            C24099a.m45636a(f57555a, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), this.f57558d);
        }
        MethodCollector.m26664o(5986);
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24280b
    /* renamed from: a */
    public final synchronized C24117a<Bitmap> mo40055a(int i) {
        MethodCollector.m26663i(5472);
        if (this.f57556b.mo40137a(i)) {
            C24338c cVar = this.f57556b;
            C24117a<Bitmap> a = m46163a(cVar.f57714b.mo40201a(cVar.mo40138b(i)));
            MethodCollector.m26664o(5472);
            return a;
        }
        C24117a<Bitmap> a2 = m46163a(C24117a.m45711b(this.f57558d.get(i)));
        MethodCollector.m26664o(5472);
        return a2;
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24280b
    /* renamed from: b */
    public final synchronized boolean mo40059b(int i) {
        MethodCollector.m26663i(5580);
        if (!this.f57556b.mo40137a(i)) {
            if (this.f57558d.get(i) == null) {
                MethodCollector.m26664o(5580);
                return false;
            }
        }
        MethodCollector.m26664o(5580);
        return true;
    }

    public C24277a(C24338c cVar, boolean z) {
        this.f57556b = cVar;
        this.f57557c = z;
        this.f57558d = new SparseArray<>();
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24280b
    /* renamed from: b */
    public final synchronized void mo40058b(int i, C24117a<Bitmap> aVar) {
        MethodCollector.m26663i(5841);
        C24091i.m45617a(aVar);
        C24117a<AbstractC24454c> aVar2 = null;
        try {
            aVar2 = m46164b(aVar);
            if (aVar2 != null) {
                C24117a<AbstractC24454c> a = this.f57556b.mo40135a(i, aVar2);
                if (C24117a.m45710a((C24117a<?>) a)) {
                    C24117a.m45712c(this.f57558d.get(i));
                } else {
                    a = aVar2.clone();
                    C24117a.m45712c(this.f57558d.get(i));
                }
                this.f57558d.put(i, a);
                C24099a.m45636a(f57555a, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i), this.f57558d);
                C24117a.m45712c(aVar2);
                MethodCollector.m26664o(5841);
            }
        } finally {
            C24117a.m45712c(aVar2);
            MethodCollector.m26664o(5841);
        }
    }

    @Override // com.facebook.fresco.animation.p1863b.AbstractC24280b
    /* renamed from: a */
    public final synchronized void mo40056a(int i, C24117a<Bitmap> aVar) {
        MethodCollector.m26663i(5707);
        C24091i.m45617a(aVar);
        m46165c(i);
        C24117a<AbstractC24454c> aVar2 = null;
        try {
            aVar2 = m46164b(aVar);
            if (aVar2 != null) {
                C24117a.m45712c(this.f57559e);
                this.f57559e = this.f57556b.mo40135a(i, aVar2);
                this.f57560f = i;
            }
        } finally {
            C24117a.m45712c(aVar2);
            MethodCollector.m26664o(5707);
        }
    }
}
