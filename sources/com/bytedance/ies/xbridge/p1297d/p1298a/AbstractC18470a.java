package com.bytedance.ies.xbridge.p1297d.p1298a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1297d.p1300c.C18478a;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.d.a.a */
public abstract class AbstractC18470a extends AbstractC18468a {

    /* renamed from: a */
    private final AbstractC18400b.EnumC18401a f44110a = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: b */
    private final String f44111b = "x.getDebugInfo";

    /* renamed from: com.bytedance.ies.xbridge.d.a.a$a */
    public interface AbstractC18471a {
        static {
            Covode.recordClassIndex(21165);
        }

        /* renamed from: a */
        void mo29620a(C18478a aVar, String str);

        /* renamed from: a */
        void mo29621a(String str);
    }

    static {
        Covode.recordClassIndex(21164);
    }

    /* renamed from: a */
    public abstract void mo29619a(C18752c cVar, AbstractC18471a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44111b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44110a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18752c> mo29415d() {
        return C18752c.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18478a> mo29416e() {
        return C18478a.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.d.a.a$b */
    public static final class C18472b implements AbstractC18471a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18470a f44112a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44113b;

        static {
            Covode.recordClassIndex(21166);
        }

        @Override // com.bytedance.ies.xbridge.p1297d.p1298a.AbstractC18470a.AbstractC18471a
        /* renamed from: a */
        public final void mo29621a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44113b, 0, str, null, 8);
        }

        C18472b(AbstractC18470a aVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44112a = aVar;
            this.f44113b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1297d.p1298a.AbstractC18470a.AbstractC18471a
        /* renamed from: a */
        public final void mo29620a(C18478a aVar, String str) {
            Boolean bool;
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(aVar, "");
            Boolean bool2 = aVar.f44119a;
            if (bool2 != null) {
                bool2.booleanValue();
                if (!(aVar.f44120b == null || (bool = aVar.f44121c) == null)) {
                    bool.booleanValue();
                    if (aVar.f44122d != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Boolean bool3 = aVar.f44119a;
                        if (bool3 == null) {
                            C89219l.m154707a();
                        }
                        linkedHashMap.put("useBOE", bool3);
                        String str2 = aVar.f44120b;
                        if (str2 == null) {
                            C89219l.m154707a();
                        }
                        linkedHashMap.put("boeChannel", str2);
                        Boolean bool4 = aVar.f44121c;
                        if (bool4 == null) {
                            C89219l.m154707a();
                        }
                        linkedHashMap.put("usePPE", bool4);
                        String str3 = aVar.f44122d;
                        if (str3 == null) {
                            C89219l.m154707a();
                        }
                        linkedHashMap.put("ppeChannel", str3);
                        AbstractC18470a.m34358a(this.f44113b, linkedHashMap, str);
                        return;
                    }
                }
            }
            AbstractC18468a.m34357a(this.f44113b, -5, null, null, 12);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        mo29619a(C18752c.C18753a.m34818a(nVar), new C18472b(this, bVar), eVar);
    }
}
