package com.bytedance.ies.xbridge.p1322j.p1323a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1322j.p1325c.C18653a;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.j.a.a */
public abstract class AbstractC18631a extends AbstractC18468a {

    /* renamed from: a */
    private final String f44371a = "x.getAPIParams";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44372b = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.j.a.a$a */
    public interface AbstractC18632a {
        static {
            Covode.recordClassIndex(21326);
        }

        /* renamed from: a */
        void mo29690a(C18653a aVar, String str);
    }

    static {
        Covode.recordClassIndex(21325);
    }

    /* renamed from: a */
    public abstract void mo29689a(C18752c cVar, AbstractC18632a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44371a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44372b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18752c> mo29415d() {
        return C18752c.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18653a> mo29416e() {
        return C18653a.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.j.a.a$b */
    public static final class C18633b implements AbstractC18632a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18631a f44373a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44374b;

        static {
            Covode.recordClassIndex(21327);
        }

        C18633b(AbstractC18631a aVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44373a = aVar;
            this.f44374b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1322j.p1323a.AbstractC18631a.AbstractC18632a
        /* renamed from: a */
        public final void mo29690a(C18653a aVar, String str) {
            C89219l.m154719c(aVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(aVar, "");
            if (aVar.f44423a == null) {
                AbstractC18468a.m34357a(this.f44374b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, ? extends Object> map = aVar.f44423a;
            if (map != null) {
                linkedHashMap.put("apiParams", map);
            }
            AbstractC18631a.m34358a(this.f44374b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        mo29689a(C18752c.C18753a.m34818a(nVar), new C18633b(this, bVar), eVar);
    }
}
