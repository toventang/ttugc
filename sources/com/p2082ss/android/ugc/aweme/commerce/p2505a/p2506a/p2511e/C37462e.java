package com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2511e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.p2506a.p2508b.C37452c;
import java.util.ArrayList;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commerce.a.a.e.e */
public final /* synthetic */ class C37462e implements AbstractC88433f {

    /* renamed from: a */
    static final AbstractC88433f f88444a = new C37462e();

    static {
        Covode.recordClassIndex(44847);
    }

    private C37462e() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C37452c.C37453a aVar = (C37452c.C37453a) obj;
        C37452c cVar = C37452c.f88416a;
        if (aVar.f88420c != null) {
            if (!cVar.f88417b.containsKey(aVar.f88420c)) {
                cVar.f88417b.put(aVar.f88420c, new ArrayList<>());
            }
            cVar.f88417b.get(aVar.f88420c).add(aVar);
        }
    }
}
