package com.bytedance.ies.foundation.base;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.foundation.base.b */
public final class C17365b {

    /* renamed from: a */
    private final AbstractC89244h f41683a = C89250i.m154773a((AbstractC89171a) C17367b.f41686a);

    /* renamed from: b */
    private final AbstractC89244h f41684b = C89250i.m154773a((AbstractC89171a) C17366a.f41685a);

    static {
        Covode.recordClassIndex(19851);
    }

    /* renamed from: a */
    public final List<AbstractC17368c> mo27697a() {
        return (List) this.f41683a.getValue();
    }

    /* renamed from: b */
    public final List<AbstractC17362a> mo27699b() {
        return (List) this.f41684b.getValue();
    }

    /* renamed from: com.bytedance.ies.foundation.base.b$a */
    static final class C17366a extends AbstractC89220m implements AbstractC89171a<List<AbstractC17362a>> {

        /* renamed from: a */
        public static final C17366a f41685a = new C17366a();

        static {
            Covode.recordClassIndex(19852);
        }

        C17366a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<AbstractC17362a> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: com.bytedance.ies.foundation.base.b$b */
    static final class C17367b extends AbstractC89220m implements AbstractC89171a<List<AbstractC17368c>> {

        /* renamed from: a */
        public static final C17367b f41686a = new C17367b();

        static {
            Covode.recordClassIndex(19853);
        }

        C17367b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<AbstractC17368c> invoke() {
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public final void mo27698a(AbstractC17362a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar instanceof AbstractC17371f) {
            mo27699b().add(aVar);
            return;
        }
        List<AbstractC17362a> b = mo27699b();
        ArrayList arrayList = new ArrayList();
        for (T t : b) {
            if (C89219l.m154714a(t.getClass(), aVar.getClass())) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if ((!arrayList2.isEmpty()) && arrayList2 != null) {
            mo27699b().removeAll(C89070n.m154590j(arrayList2));
        }
        mo27699b().add(aVar);
    }
}
