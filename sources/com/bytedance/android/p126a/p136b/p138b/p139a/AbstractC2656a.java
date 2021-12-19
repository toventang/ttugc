package com.bytedance.android.p126a.p136b.p138b.p139a;

import com.bytedance.android.p126a.p127a.p135h.C2640a;
import com.bytedance.android.p126a.p127a.p135h.C2642c;
import com.bytedance.android.p126a.p136b.C2651a;
import com.bytedance.android.p126a.p136b.p138b.C2665b;
import com.bytedance.android.p126a.p136b.p138b.C2667c;
import com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2661e;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.a.b.b.a.a */
public abstract class AbstractC2656a implements AbstractC2661e {

    /* renamed from: a */
    public C2651a f7951a;

    static {
        Covode.recordClassIndex(3044);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2665b mo7175a(C2665b bVar) {
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2667c mo7177a(C2667c cVar) {
        return cVar;
    }

    /* renamed from: com.bytedance.android.a.b.b.a.a$a */
    public static class C2657a implements AbstractC2661e.AbstractC2662a {

        /* renamed from: a */
        private C2665b f7952a;

        /* renamed from: b */
        private int f7953b = 0;

        /* renamed from: c */
        private List<AbstractC2661e> f7954c;

        static {
            Covode.recordClassIndex(3045);
        }

        @Override // com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2661e.AbstractC2662a
        /* renamed from: a */
        public final C2665b mo7178a() {
            return this.f7952a;
        }

        public C2657a(List<AbstractC2661e> list) {
            this.f7954c = list;
        }

        @Override // com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2661e.AbstractC2662a
        /* renamed from: a */
        public final C2667c mo7179a(C2665b bVar) {
            if (bVar == null) {
                C2640a.m7643a("null request");
                return C2667c.m7705a(C2642c.m7647a("null request"), null);
            }
            List<AbstractC2661e> list = this.f7954c;
            if (list == null || list.isEmpty()) {
                C2640a.m7643a("no interceptor in the chain");
                return C2667c.m7705a(C2642c.m7647a("no interceptor in the chain"), null);
            } else if (this.f7953b >= this.f7954c.size()) {
                C2640a.m7643a("interceptors index out of bound");
                return C2667c.m7705a(C2642c.m7647a("interceptors index out of bound"), bVar);
            } else {
                AbstractC2661e eVar = this.f7954c.get(this.f7953b);
                if (eVar == null) {
                    C2640a.m7643a("null interceptor");
                    return C2667c.m7705a(C2642c.m7647a("null interceptor"), bVar);
                }
                this.f7952a = bVar;
                this.f7953b++;
                return eVar.mo7176a(this);
            }
        }
    }

    public AbstractC2656a(C2651a aVar) {
        this.f7951a = aVar;
    }

    @Override // com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2661e
    /* renamed from: a */
    public C2667c mo7176a(AbstractC2661e.AbstractC2662a aVar) {
        return mo7177a(aVar.mo7179a(mo7175a(aVar.mo7178a())));
    }
}
