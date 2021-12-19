package com.bytedance.jedi.ext.adapter.internal;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.f */
public final class C20666f {

    /* renamed from: a */
    public final AbstractC89171a<JediViewHolderProxy> f48871a = C20667a.f48875a;

    /* renamed from: b */
    public final C20658b f48872b;

    /* renamed from: c */
    public final C20668g f48873c;

    /* renamed from: d */
    public final C20662d f48874d;

    static {
        Covode.recordClassIndex(24202);
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.f$a */
    static final class C20667a extends AbstractC89220m implements AbstractC89171a<JediViewHolderProxy> {

        /* renamed from: a */
        public static final C20667a f48875a = new C20667a();

        static {
            Covode.recordClassIndex(24203);
        }

        C20667a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ JediViewHolderProxy invoke() {
            return new JediViewHolderProxy();
        }
    }

    public C20666f(C20662d dVar) {
        C89219l.m154719c(dVar, "");
        this.f48874d = dVar;
        C20658b bVar = new C20658b();
        dVar.f48865b = bVar;
        this.f48872b = bVar;
        C20668g gVar = new C20668g(dVar);
        dVar.f48866c = gVar;
        this.f48873c = gVar;
    }
}
