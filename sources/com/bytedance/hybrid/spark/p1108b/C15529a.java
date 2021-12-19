package com.bytedance.hybrid.spark.p1108b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.p1290b.AbstractC18405a;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.hybrid.spark.b.a */
public final class C15529a extends AbstractC18468a {

    /* renamed from: a */
    public static final Map<String, Boolean> f37875a = new LinkedHashMap();

    /* renamed from: b */
    public static final C15530a f37876b = new C15530a((byte) 0);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return "enableBlockBackPress";
    }

    /* renamed from: com.bytedance.hybrid.spark.b.a$a */
    public static final class C15530a {
        static {
            Covode.recordClassIndex(17792);
        }

        private C15530a() {
        }

        public /* synthetic */ C15530a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(17791);
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        AbstractC18405a aVar;
        String a;
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        boolean a2 = C18586i.m34542a(nVar, "status", false);
        C18742c cVar = this.f44109d;
        if (!(cVar == null || (aVar = (AbstractC18405a) cVar.mo29769a(AbstractC18405a.class)) == null || (a = aVar.mo13407a()) == null)) {
            f37875a.put(a, Boolean.valueOf(a2));
        }
        AbstractC18468a.m34358a(bVar, new LinkedHashMap(), "");
    }
}
