package com.bytedance.creativex.p936a.p937a;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27910f;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.a.a.d */
public final class C14086d extends AbstractC28031v<HashMap<String, Serializable>> {

    /* renamed from: a */
    private final C27910f f34265a;

    /* renamed from: b */
    private final AbstractC14085c f34266b;

    static {
        Covode.recordClassIndex(16153);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ HashMap<String, Serializable> read(C27897a aVar) {
        C89219l.m154721d(aVar, "");
        HashMap hashMap = new HashMap();
        aVar.mo46623c();
        while (aVar.mo46626e()) {
            String h = aVar.mo46628h();
            AbstractC14085c cVar = this.f34266b;
            C89219l.m154716b(h, "");
            Object a = this.f34265a.mo46670a(aVar.mo46629i(), (Class) cVar.mo22599a(h));
            if (a == null) {
                hashMap.put(h, a);
            } else if (a instanceof Serializable) {
                hashMap.put(h, a);
            } else {
                throw new IllegalStateException("type not supported yet".toString());
            }
        }
        aVar.mo46625d();
        return hashMap;
    }

    public C14086d(C27910f fVar, AbstractC14085c cVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(cVar, "");
        this.f34265a = fVar;
        this.f34266b = cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ void write(C27900c cVar, HashMap<String, Serializable> hashMap) {
        HashMap<String, Serializable> hashMap2 = hashMap;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(hashMap2, "");
        cVar.mo46652d();
        for (Map.Entry<String, Serializable> entry : hashMap2.entrySet()) {
            String key = entry.getKey();
            Serializable value = entry.getValue();
            Class<?> a = this.f34266b.mo22599a(key);
            cVar.mo46645a(key);
            cVar.mo46648b(this.f34265a.mo46675b(value, a));
        }
        cVar.mo46653e();
    }
}
