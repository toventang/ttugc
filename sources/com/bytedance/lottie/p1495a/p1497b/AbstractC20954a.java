package com.bytedance.lottie.p1495a.p1497b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1506g.C21089a;
import com.bytedance.lottie.p1506g.C21091c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lottie.a.b.a */
public abstract class AbstractC20954a<K, A> {

    /* renamed from: a */
    final List<AbstractC20955a> f49656a = new ArrayList();

    /* renamed from: b */
    public boolean f49657b = false;

    /* renamed from: c */
    public float f49658c = 0.0f;

    /* renamed from: d */
    protected C21091c<A> f49659d;

    /* renamed from: e */
    private final List<? extends C21089a<K>> f49660e;

    /* renamed from: f */
    private C21089a<K> f49661f;

    /* renamed from: com.bytedance.lottie.a.b.a$a */
    public interface AbstractC20955a {
        static {
            Covode.recordClassIndex(24571);
        }

        /* renamed from: a */
        void mo34451a();
    }

    static {
        Covode.recordClassIndex(24570);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract A mo34463a(C21089a<K> aVar, float f);

    /* renamed from: f */
    private float m39493f() {
        if (this.f49660e.isEmpty()) {
            return 0.0f;
        }
        return ((C21089a) this.f49660e.get(0)).mo34566a();
    }

    /* renamed from: a */
    public void mo34464a() {
        for (int i = 0; i < this.f49656a.size(); i++) {
            this.f49656a.get(i).mo34451a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo34469c() {
        if (this.f49660e.isEmpty()) {
            return 1.0f;
        }
        List<? extends C21089a<K>> list = this.f49660e;
        return ((C21089a) list.get(list.size() - 1)).mo34568b();
    }

    /* renamed from: d */
    public A mo34470d() {
        float interpolation;
        C21089a<K> e = m39492e();
        C21089a<K> e2 = m39492e();
        if (e2.mo34569c()) {
            interpolation = 0.0f;
        } else {
            interpolation = e2.f49990e.getInterpolation(mo34468b());
        }
        return mo34463a(e, interpolation);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo34468b() {
        if (this.f49657b) {
            return 0.0f;
        }
        C21089a<K> e = m39492e();
        if (e.mo34569c()) {
            return 0.0f;
        }
        return (this.f49658c - e.mo34566a()) / (e.mo34568b() - e.mo34566a());
    }

    /* renamed from: e */
    private C21089a<K> m39492e() {
        C21089a<K> aVar = this.f49661f;
        if (aVar != null && aVar.mo34567a(this.f49658c)) {
            return this.f49661f;
        }
        List<? extends C21089a<K>> list = this.f49660e;
        C21089a<K> aVar2 = (C21089a) list.get(list.size() - 1);
        if (this.f49658c < aVar2.mo34566a()) {
            for (int size = this.f49660e.size() - 1; size >= 0; size--) {
                aVar2 = (C21089a) this.f49660e.get(size);
                if (aVar2.mo34567a(this.f49658c)) {
                    break;
                }
            }
        }
        this.f49661f = aVar2;
        return aVar2;
    }

    /* renamed from: a */
    public final void mo34466a(AbstractC20955a aVar) {
        this.f49656a.add(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.lottie.a.b.a<K, A> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo34467a(C21091c<A> cVar) {
        C21091c<A> cVar2 = this.f49659d;
        if (cVar2 != null) {
            cVar2.f50003a = null;
        }
        this.f49659d = cVar;
        if (cVar != null) {
            cVar.f50003a = this;
        }
    }

    AbstractC20954a(List<? extends C21089a<K>> list) {
        this.f49660e = list;
    }

    /* renamed from: a */
    public void mo34465a(float f) {
        if (f < m39493f()) {
            f = m39493f();
        } else if (f > mo34469c()) {
            f = mo34469c();
        }
        if (f != this.f49658c) {
            this.f49658c = f;
            mo34464a();
        }
    }
}
