package com.bytedance.ies.ugc.network.partner;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.p1275a.C18184a;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.C22096s;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.network.partner.a */
public final class C18182a {

    /* renamed from: a */
    public final AbstractC21983b<?> f43318a;

    /* renamed from: b */
    public final C22096s f43319b;

    /* renamed from: c */
    public C18184a f43320c = new C18184a();

    /* renamed from: d */
    private final AbstractC89244h f43321d = C89250i.m154773a((AbstractC89171a) C18183a.f43322a);

    static {
        Covode.recordClassIndex(20838);
    }

    /* renamed from: a */
    private final Map<? super AbstractC18185b, Object> m33821a() {
        return (Map) this.f43321d.getValue();
    }

    /* renamed from: com.bytedance.ies.ugc.network.partner.a$a */
    static final class C18183a extends AbstractC89220m implements AbstractC89171a<Map<AbstractC18185b, Object>> {

        /* renamed from: a */
        public static final C18183a f43322a = new C18183a();

        static {
            Covode.recordClassIndex(20839);
        }

        C18183a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<AbstractC18185b, Object> invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: a */
    public final Object mo29031a(AbstractC18185b bVar) {
        C89219l.m154721d(bVar, "");
        return m33821a().get(bVar);
    }

    public C18182a(AbstractC22021a.AbstractC22022a aVar) {
        C89219l.m154721d(aVar, "");
        this.f43318a = aVar.mo35811b();
        this.f43319b = aVar.mo35812c();
    }

    /* renamed from: a */
    public final void mo29032a(AbstractC18185b bVar, Object obj) {
        C89219l.m154721d(bVar, "");
        if (obj == null) {
            m33821a().remove(bVar);
        } else {
            m33821a().put(bVar, obj);
        }
    }
}
