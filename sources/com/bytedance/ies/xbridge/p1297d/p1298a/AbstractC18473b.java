package com.bytedance.ies.xbridge.p1297d.p1298a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.params.C18752c;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1297d.p1300c.C18480b;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.d.a.b */
public abstract class AbstractC18473b extends AbstractC18468a {

    /* renamed from: a */
    private final String f44114a = "x.getMethodList";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44115b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.d.a.b$a */
    public interface AbstractC18474a {
        static {
            Covode.recordClassIndex(21168);
        }

        /* renamed from: a */
        void mo29623a(C18480b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21167);
    }

    /* renamed from: a */
    public abstract void mo29622a(C18752c cVar, AbstractC18474a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44114a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44115b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18752c> mo29415d() {
        return C18752c.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18480b> mo29416e() {
        return C18480b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.d.a.b$b */
    public static final class C18475b implements AbstractC18474a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18473b f44116a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44117b;

        static {
            Covode.recordClassIndex(21169);
        }

        C18475b(AbstractC18473b bVar, AbstractC18400b.AbstractC18402b bVar2) {
            this.f44116a = bVar;
            this.f44117b = bVar2;
        }

        @Override // com.bytedance.ies.xbridge.p1297d.p1298a.AbstractC18473b.AbstractC18474a
        /* renamed from: a */
        public final void mo29623a(C18480b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(bVar, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Map<String, C18480b.C18482b> map = bVar.f44124a;
            if (map != null) {
                for (T t : map.entrySet()) {
                    Object key = t.getKey();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("authType", ((C18480b.C18482b) t.getValue()).f44125a);
                    linkedHashMap2.put(key, linkedHashMap3);
                }
            }
            linkedHashMap.put("methodList", linkedHashMap2);
            AbstractC18473b.m34358a(this.f44117b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        mo29622a(C18752c.C18753a.m34818a(nVar), new C18475b(this, bVar), eVar);
    }
}
