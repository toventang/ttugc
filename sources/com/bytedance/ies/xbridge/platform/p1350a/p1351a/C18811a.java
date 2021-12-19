package com.bytedance.ies.xbridge.platform.p1350a.p1351a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.C18371a;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.platform.p1350a.p1351a.C18812b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.platform.a.a.a */
public final class C18811a {

    /* renamed from: a */
    public static final C18811a f44603a = new C18811a();

    private C18811a() {
    }

    static {
        Covode.recordClassIndex(21507);
    }

    /* renamed from: a */
    public static /* synthetic */ List m34906a(C18742c cVar, C16248b bVar, List list) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c("DEFAULT", "");
        Map<String, Class<? extends AbstractC18400b>> a = C18371a.m34206a(EnumC18483e.ALL, "DEFAULT");
        if (a == null) {
            return C89086z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(a.size());
        for (Map.Entry<String, Class<? extends AbstractC18400b>> entry : a.entrySet()) {
            AbstractC18400b bVar2 = (AbstractC18400b) entry.getValue().newInstance();
            C89219l.m154709a((Object) bVar2, "");
            C89219l.m154719c(bVar2, "");
            C89219l.m154719c(cVar, "");
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(list, "");
            arrayList.add(new C18812b.C18813a(cVar, list, bVar2, bVar, bVar));
        }
        return arrayList;
    }
}
