package com.bytedance.ies.xbridge.p1296c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.model.p1342c.AbstractC18744a;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.c.a */
public abstract class AbstractC18468a implements AbstractC18400b {

    /* renamed from: d */
    public C18742c f44109d;

    static {
        Covode.recordClassIndex(21162);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public Class<? extends AbstractC18749a> mo29415d() {
        return null;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public Class<? extends AbstractC18744a> mo29416e() {
        return null;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: f */
    public void mo29431f() {
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public AbstractC18400b.EnumC18401a mo7346c() {
        return AbstractC18400b.EnumC18401a.PRIVATE;
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo29430a(C18742c cVar) {
        this.f44109d = cVar;
    }

    /* renamed from: a */
    public final <T> T mo29616a(Class<T> cls) {
        C89219l.m154719c(cls, "");
        C18742c cVar = this.f44109d;
        if (cVar != null) {
            return (T) cVar.mo29769a(cls);
        }
        return null;
    }

    /* renamed from: a */
    public static void m34358a(AbstractC18400b.AbstractC18402b bVar, Map<String, Object> map, String str) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(map, "");
        C89219l.m154719c(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", 1);
        linkedHashMap.put("msg", str);
        linkedHashMap.put("data", map);
        bVar.mo13405a(linkedHashMap);
    }

    /* renamed from: a */
    public static void m34356a(AbstractC18400b.AbstractC18402b bVar, int i, String str, Map<String, Object> map) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", Integer.valueOf(i));
        linkedHashMap.put("msg", str);
        linkedHashMap.put("data", map);
        bVar.mo13405a(linkedHashMap);
    }

    /* renamed from: a */
    public static /* synthetic */ void m34357a(AbstractC18400b.AbstractC18402b bVar, int i, String str, Map map, int i2) {
        if ((i2 & 4) != 0) {
            str = "";
        }
        if ((i2 & 8) != 0) {
            map = new LinkedHashMap();
        }
        m34356a(bVar, i, str, map);
    }
}
