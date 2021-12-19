package com.bytedance.jedi.p1445a.p1453f;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1448c.AbstractC20168e;
import com.bytedance.jedi.p1445a.p1448c.C20165b;
import com.bytedance.jedi.p1445a.p1462l.AbstractC20320c;
import com.bytedance.jedi.p1445a.p1462l.C20322e;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89387v;

/* renamed from: com.bytedance.jedi.a.f.c */
public final class C20189c {
    static {
        Covode.recordClassIndex(23697);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.jedi.a.f.c$a */
    public static final class C20190a<T> implements AbstractC88433f<RESP> {

        /* renamed from: a */
        final /* synthetic */ AbstractC20181b f47963a;

        /* renamed from: b */
        final /* synthetic */ Object f47964b;

        static {
            Covode.recordClassIndex(23698);
        }

        C20190a(AbstractC20181b bVar, Object obj) {
            this.f47963a = bVar;
            this.f47964b = obj;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final void accept(RESP resp) {
            Object a = this.f47963a.mo33482a(this.f47964b, resp);
            if (a != null) {
                AbstractC20168e a2 = C20165b.m38139a(this.f47963a);
                if (!(a2 instanceof AbstractC20320c)) {
                    a2 = null;
                }
                AbstractC20320c cVar = (AbstractC20320c) a2;
                if (cVar != null) {
                    cVar.mo33477a(C20322e.C20323a.m38510a(C89387v.m154943a(this.f47963a.mo33483b(this.f47964b), a)));
                }
            }
        }
    }
}
