package com.airbnb.lottie.p093a.p095b;

import com.airbnb.lottie.p104g.C2144d;
import com.airbnb.lottie.p107j.C2202a;
import com.airbnb.lottie.p107j.C2204c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.a */
public abstract class AbstractC2012a<K, A> {

    /* renamed from: a */
    final List<AbstractC2013a> f6064a = new ArrayList();

    /* renamed from: b */
    public boolean f6065b = false;

    /* renamed from: c */
    public float f6066c = 0.0f;

    /* renamed from: d */
    protected C2204c<A> f6067d;

    /* renamed from: e */
    private AbstractC2015c<K> f6068e;

    /* renamed from: f */
    private final List<? extends C2202a<K>> f6069f;

    /* renamed from: g */
    private C2202a<K> f6070g;

    /* renamed from: h */
    private A f6071h = null;

    /* renamed from: i */
    private float f6072i = -1.0f;

    /* renamed from: j */
    private float f6073j = -1.0f;

    /* renamed from: com.airbnb.lottie.a.b.a$a */
    public interface AbstractC2013a {
        static {
            Covode.recordClassIndex(2208);
        }

        /* renamed from: a */
        void mo5895a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.lottie.a.b.a$c */
    public interface AbstractC2015c<T> {
        static {
            Covode.recordClassIndex(2210);
        }

        /* renamed from: a */
        boolean mo5919a();

        /* renamed from: a */
        boolean mo5920a(float f);

        /* renamed from: b */
        C2202a<T> mo5921b();

        /* renamed from: b */
        boolean mo5922b(float f);

        /* renamed from: c */
        float mo5923c();

        /* renamed from: d */
        float mo5924d();
    }

    static {
        Covode.recordClassIndex(2207);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract A mo5909a(C2202a<K> aVar, float f);

    /* renamed from: com.airbnb.lottie.a.b.a$b */
    static final class C2014b<T> implements AbstractC2015c<T> {
        static {
            Covode.recordClassIndex(2209);
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: a */
        public final boolean mo5919a() {
            return true;
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: a */
        public final boolean mo5920a(float f) {
            return false;
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: c */
        public final float mo5923c() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: d */
        public final float mo5924d() {
            return 1.0f;
        }

        private C2014b() {
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: b */
        public final C2202a<T> mo5921b() {
            throw new IllegalStateException("not implemented");
        }

        /* synthetic */ C2014b(byte b) {
            this();
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: b */
        public final boolean mo5922b(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    /* renamed from: com.airbnb.lottie.a.b.a$d */
    static final class C2016d<T> implements AbstractC2015c<T> {

        /* renamed from: a */
        private final List<? extends C2202a<T>> f6074a;

        /* renamed from: b */
        private C2202a<T> f6075b;

        /* renamed from: c */
        private C2202a<T> f6076c;

        /* renamed from: d */
        private float f6077d = -1.0f;

        static {
            Covode.recordClassIndex(2211);
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: a */
        public final boolean mo5919a() {
            return false;
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: b */
        public final C2202a<T> mo5921b() {
            return this.f6075b;
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: c */
        public final float mo5923c() {
            return ((C2202a) this.f6074a.get(0)).mo6122b();
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: d */
        public final float mo5924d() {
            List<? extends C2202a<T>> list = this.f6074a;
            return ((C2202a) list.get(list.size() - 1)).mo6123c();
        }

        C2016d(List<? extends C2202a<T>> list) {
            this.f6074a = list;
            this.f6075b = m6417c(0.0f);
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: a */
        public final boolean mo5920a(float f) {
            if (!this.f6075b.mo6121a(f)) {
                this.f6075b = m6417c(f);
                return true;
            } else if (!this.f6075b.mo6124d()) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: b */
        public final boolean mo5922b(float f) {
            C2202a<T> aVar = this.f6076c;
            C2202a<T> aVar2 = this.f6075b;
            if (aVar == aVar2 && this.f6077d == f) {
                return true;
            }
            this.f6076c = aVar2;
            this.f6077d = f;
            return false;
        }

        /* renamed from: c */
        private C2202a<T> m6417c(float f) {
            List<? extends C2202a<T>> list = this.f6074a;
            C2202a<T> aVar = (C2202a) list.get(list.size() - 1);
            if (f >= aVar.mo6122b()) {
                return aVar;
            }
            for (int size = this.f6074a.size() - 2; size > 0; size--) {
                C2202a<T> aVar2 = (C2202a) this.f6074a.get(size);
                if (this.f6075b != aVar2 && aVar2.mo6121a(f)) {
                    return aVar2;
                }
            }
            return (C2202a) this.f6074a.get(0);
        }
    }

    /* renamed from: com.airbnb.lottie.a.b.a$e */
    static final class C2017e<T> implements AbstractC2015c<T> {

        /* renamed from: a */
        private final C2202a<T> f6078a;

        /* renamed from: b */
        private float f6079b = -1.0f;

        static {
            Covode.recordClassIndex(2212);
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: a */
        public final boolean mo5919a() {
            return false;
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: b */
        public final C2202a<T> mo5921b() {
            return this.f6078a;
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: c */
        public final float mo5923c() {
            return this.f6078a.mo6122b();
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: d */
        public final float mo5924d() {
            return this.f6078a.mo6123c();
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: a */
        public final boolean mo5920a(float f) {
            if (!this.f6078a.mo6124d()) {
                return true;
            }
            return false;
        }

        @Override // com.airbnb.lottie.p093a.p095b.AbstractC2012a.AbstractC2015c
        /* renamed from: b */
        public final boolean mo5922b(float f) {
            if (this.f6079b == f) {
                return true;
            }
            this.f6079b = f;
            return false;
        }

        C2017e(List<? extends C2202a<T>> list) {
            this.f6078a = (C2202a) list.get(0);
        }
    }

    /* renamed from: a */
    public void mo5910a() {
        for (int i = 0; i < this.f6064a.size(); i++) {
            this.f6064a.get(i).mo5895a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final float mo5916d() {
        C2202a<K> b = mo5914b();
        if (b.mo6124d()) {
            return 0.0f;
        }
        return b.f6568d.getInterpolation(mo5915c());
    }

    /* renamed from: g */
    private float mo5925g() {
        AbstractC2015c<K> cVar;
        if (C2144d.C2145a.f6479a && (cVar = this.f6068e) != null) {
            if (this.f6072i == -1.0f) {
                this.f6072i = cVar.mo5923c();
            }
            return this.f6072i;
        } else if (this.f6069f.isEmpty()) {
            return 0.0f;
        } else {
            return ((C2202a) this.f6069f.get(0)).mo6122b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final float mo5915c() {
        if (this.f6065b) {
            return 0.0f;
        }
        C2202a<K> b = mo5914b();
        if (b.mo6124d()) {
            return 0.0f;
        }
        return (this.f6066c - b.mo6122b()) / (b.mo6123c() - b.mo6122b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo5917e() {
        AbstractC2015c<K> cVar;
        if (C2144d.C2145a.f6479a && (cVar = this.f6068e) != null) {
            if (this.f6073j == -1.0f) {
                this.f6073j = cVar.mo5924d();
            }
            return this.f6073j;
        } else if (this.f6069f.isEmpty()) {
            return 1.0f;
        } else {
            List<? extends C2202a<K>> list = this.f6069f;
            return ((C2202a) list.get(list.size() - 1)).mo6123c();
        }
    }

    /* renamed from: f */
    public A mo5918f() {
        if (!C2144d.C2145a.f6479a || this.f6068e == null) {
            return mo5909a(mo5914b(), mo5916d());
        }
        float d = mo5916d();
        if (this.f6067d == null && this.f6068e.mo5922b(d)) {
            return this.f6071h;
        }
        A a = mo5909a(mo5914b(), d);
        this.f6071h = a;
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C2202a<K> mo5914b() {
        AbstractC2015c<K> cVar;
        if (C2144d.C2145a.f6479a && (cVar = this.f6068e) != null) {
            return cVar.mo5921b();
        }
        C2202a<K> aVar = this.f6070g;
        if (aVar != null && aVar.mo6121a(this.f6066c)) {
            return this.f6070g;
        }
        List<? extends C2202a<K>> list = this.f6069f;
        C2202a<K> aVar2 = (C2202a) list.get(list.size() - 1);
        if (this.f6066c < aVar2.mo6122b()) {
            for (int size = this.f6069f.size() - 1; size >= 0; size--) {
                aVar2 = (C2202a) this.f6069f.get(size);
                if (aVar2.mo6121a(this.f6066c)) {
                    break;
                }
            }
        }
        this.f6070g = aVar2;
        return aVar2;
    }

    /* renamed from: a */
    public final void mo5912a(AbstractC2013a aVar) {
        this.f6064a.add(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.airbnb.lottie.a.b.a<K, A> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo5913a(C2204c<A> cVar) {
        C2204c<A> cVar2 = this.f6067d;
        if (cVar2 != null) {
            cVar2.f6586a = null;
        }
        this.f6067d = cVar;
        if (cVar != null) {
            cVar.f6586a = this;
        }
    }

    AbstractC2012a(List<? extends C2202a<K>> list) {
        AbstractC2015c<K> dVar;
        this.f6069f = list;
        if (C2144d.C2145a.f6479a) {
            if (list.isEmpty()) {
                dVar = new C2014b<>((byte) 0);
            } else if (list.size() == 1) {
                dVar = new C2017e<>(list);
            } else {
                dVar = new C2016d<>(list);
            }
            this.f6068e = dVar;
        }
    }

    /* renamed from: a */
    public void mo5911a(float f) {
        AbstractC2015c<K> cVar;
        AbstractC2015c<K> cVar2;
        if (!C2144d.C2145a.f6479a || (cVar2 = this.f6068e) == null || !cVar2.mo5919a()) {
            if (f < mo5925g()) {
                f = mo5925g();
            } else if (f > mo5917e()) {
                f = mo5917e();
            }
            if (f != this.f6066c) {
                this.f6066c = f;
                if (!C2144d.C2145a.f6479a || (cVar = this.f6068e) == null || cVar.mo5920a(f)) {
                    mo5910a();
                }
            }
        }
    }
}
