package com.bytedance.platform.godzilla.p1575b.p1576a.p1580b.p1581a;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1578a.AbstractC21696b;
import com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1578a.AbstractC21697c;
import com.bytedance.platform.godzilla.p1586d.C21722a;
import com.bytedance.platform.godzilla.p1586d.C21725d;
import com.bytedance.platform.godzilla.p1586d.C21728g;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.bytedance.platform.godzilla.b.a.b.a.a */
public final class C21700a extends AbstractC21697c {

    /* renamed from: e */
    private String f51477e;

    static {
        Covode.recordClassIndex(25341);
    }

    /* renamed from: a */
    public final void mo35358a() {
        Object b;
        C21702b bVar = new C21702b(this.f51477e, this);
        try {
            Class<?> cls = Class.forName("android.os.ServiceManager");
            Object a = C21725d.m40687a(cls, "getService", bVar.f51479a);
            if (a != null && (b = C21722a.m40684b(cls, "sCache")) != null && (b instanceof Map)) {
                bVar.f51480b.mo35354a(a);
                ((Map) b).put(bVar.f51479a, C21728g.m40693a(a, bVar.f51480b));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.bytedance.platform.godzilla.b.a.b.a.a$a */
    static class C21701a extends AbstractC21696b {

        /* renamed from: a */
        private AbstractC21697c f51478a;

        static {
            Covode.recordClassIndex(25342);
        }

        C21701a(AbstractC21697c cVar) {
            this.f51478a = cVar;
        }

        @Override // com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1578a.AbstractC21696b
        /* renamed from: a */
        public final Object mo35352a(Object obj, Method method, Object[] objArr) {
            return super.mo35352a(obj, method, objArr);
        }

        @Override // com.bytedance.platform.godzilla.p1575b.p1576a.p1577a.p1578a.AbstractC21696b
        /* renamed from: a */
        public final Object mo35353a(Object obj, Method method, Object[] objArr, Object obj2) {
            return C21728g.m40693a(this.f51478a.f51472c, this.f51478a);
        }
    }

    public C21700a(String str, AbstractC21697c cVar) {
        this.f51477e = str;
        this.f51471b.put("queryLocalInterface", new C21701a(cVar));
    }
}
