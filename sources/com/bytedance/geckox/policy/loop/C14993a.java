package com.bytedance.geckox.policy.loop;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.C14930f;
import com.bytedance.geckox.p1022i.C14957a;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import com.bytedance.p1603q.AbstractC21936e;
import java.util.Map;

/* renamed from: com.bytedance.geckox.policy.loop.a */
public final class C14993a implements AbstractC21936e {
    static {
        Covode.recordClassIndex(17130);
    }

    @Override // com.bytedance.p1603q.AbstractC21936e
    /* renamed from: a */
    public final void mo24206a(Object obj) {
        if (obj != null && C14930f.m27473a().mo24034e() == null) {
            Map<String, LoopInterval> map = (Map) obj;
            C14957a.m27543a("[loop]update interval:", map);
            C14994b.m27595a().mo24211b(map);
        }
    }
}
