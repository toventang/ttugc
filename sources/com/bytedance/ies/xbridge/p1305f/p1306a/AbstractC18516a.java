package com.bytedance.ies.xbridge.p1305f.p1306a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18700m;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1305f.p1308c.C18530a;
import java.util.ArrayList;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.f.a.a */
public abstract class AbstractC18516a extends AbstractC18468a {

    /* renamed from: a */
    public final String f44173a = "XBatchEventsEventMethod";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44174b = AbstractC18400b.EnumC18401a.PRIVATE;

    /* renamed from: e */
    private final String f44175e = "x.batchEvents";

    /* renamed from: com.bytedance.ies.xbridge.f.a.a$a */
    public interface AbstractC18517a {
        static {
            Covode.recordClassIndex(21211);
        }

        /* renamed from: a */
        void mo29644a(C18745b bVar, String str);

        /* renamed from: a */
        void mo29645a(String str);
    }

    static {
        Covode.recordClassIndex(21210);
    }

    /* renamed from: a */
    public abstract void mo29643a(C18530a aVar, AbstractC18517a aVar2, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44175e;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44174b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18530a> mo29415d() {
        return C18530a.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18745b> mo29416e() {
        return C18745b.class;
    }

    /* renamed from: com.bytedance.ies.xbridge.f.a.a$b */
    public static final class C18518b implements AbstractC18517a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18516a f44176a;

        /* renamed from: b */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44177b;

        static {
            Covode.recordClassIndex(21212);
        }

        @Override // com.bytedance.ies.xbridge.p1305f.p1306a.AbstractC18516a.AbstractC18517a
        /* renamed from: a */
        public final void mo29645a(String str) {
            C89219l.m154719c(str, "");
            AbstractC18468a.m34357a(this.f44177b, -3, str, null, 8);
        }

        C18518b(AbstractC18516a aVar, AbstractC18400b.AbstractC18402b bVar) {
            this.f44176a = aVar;
            this.f44177b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1305f.p1306a.AbstractC18516a.AbstractC18517a
        /* renamed from: a */
        public final void mo29644a(C18745b bVar, String str) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(str, "");
            AbstractC18516a.m34358a(this.f44177b, C18745b.C18746a.m34815a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        AbstractC18700m c = C18586i.m34544c(nVar, "actionList");
        if (c == null) {
            AbstractC18468a.m34357a(bVar, -3, null, null, 12);
            return;
        }
        String str = C18586i.m34539a(nVar, "actionType", "");
        C18530a aVar = new C18530a();
        C89219l.m154719c(str, "");
        aVar.f44190a = str;
        ArrayList arrayList = new ArrayList();
        int a = c.mo29730a();
        for (int i = 0; i < a; i++) {
            AbstractC18754n f = c.mo29737f(i);
            if (f != null) {
                String str2 = C18586i.m34539a(f, "methodName", "");
                AbstractC18754n b = C18586i.m34543b(f, "params");
                arrayList.add(new C18530a.C18531a(str2, new JSONObject(b != null ? C18586i.m34541a(b) : null)));
            }
        }
        aVar.f44191b = arrayList;
        mo29643a(aVar, new C18518b(this, bVar), eVar);
    }
}
