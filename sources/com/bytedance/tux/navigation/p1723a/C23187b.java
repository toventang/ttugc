package com.bytedance.tux.navigation.p1723a;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1710c.C22999a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.navigation.a.b */
public final class C23187b extends AbstractC23189c {

    /* renamed from: a */
    public int f54929a = -1;

    /* renamed from: b */
    public boolean f54930b = true;

    /* renamed from: c */
    public C22999a f54931c;

    /* renamed from: d */
    public AbstractC89172b<? super TuxIconView, C89391z> f54932d;

    /* renamed from: e */
    public boolean f54933e = true;

    static {
        Covode.recordClassIndex(27125);
    }

    /* renamed from: com.bytedance.tux.navigation.a.b$a */
    public static final class C23188a implements AbstractC23190d {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f54934a;

        static {
            Covode.recordClassIndex(27126);
        }

        @Override // com.bytedance.tux.navigation.p1723a.AbstractC23190d
        /* renamed from: a */
        public final void mo37744a() {
            this.f54934a.invoke();
        }

        C23188a(AbstractC89171a aVar) {
            this.f54934a = aVar;
        }
    }

    /* renamed from: a */
    private final void m43715a() {
        this.f54929a = -1;
        this.f54931c = null;
        this.f54932d = null;
    }

    /* renamed from: a */
    public final C23187b mo37738a(int i) {
        m43715a();
        this.f54929a = i;
        return this;
    }

    /* renamed from: a */
    public final C23187b mo37739a(C22999a aVar) {
        C89219l.m154719c(aVar, "");
        m43715a();
        this.f54931c = aVar;
        return this;
    }

    /* renamed from: a */
    public final C23187b mo37740a(AbstractC23190d dVar) {
        C89219l.m154719c(dVar, "");
        this.f54935f = dVar;
        return this;
    }

    /* renamed from: a */
    public final C23187b mo37741a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154719c(aVar, "");
        this.f54935f = new C23188a(aVar);
        return this;
    }

    /* renamed from: a */
    public final C23187b mo37742a(AbstractC89172b<? super TuxIconView, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        m43715a();
        this.f54932d = bVar;
        return this;
    }

    /* renamed from: a */
    public final C23187b mo37743a(Object obj) {
        C89219l.m154719c(obj, "");
        this.f54936g = obj;
        return this;
    }
}
