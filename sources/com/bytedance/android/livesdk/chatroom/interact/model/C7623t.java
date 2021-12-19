package com.bytedance.android.livesdk.chatroom.interact.model;

import com.bytedance.android.livesdkapi.depend.model.live.C11714al;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.model.t */
public final class C7623t implements AbstractC2724b<C7611i> {
    static {
        Covode.recordClassIndex(8398);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7611i mo7304a(C2730f fVar) {
        C7611i iVar = new C7611i();
        iVar.f18900b = new ArrayList();
        iVar.f18899a = new ArrayList();
        iVar.f18901c = new HashMap();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return iVar;
            } else if (b == 1) {
                iVar.f18899a.add(C11714al.m20674b(fVar));
            } else if (b == 8) {
                iVar.f18902d = C7622s.m15637b(fVar);
            } else if (b == 3) {
                iVar.f18900b.add(C11714al.m20674b(fVar));
            } else if (b != 4) {
                C2731g.m7903c(fVar);
            } else {
                long a2 = fVar.mo7307a();
                Long l = null;
                C7610h hVar = null;
                while (true) {
                    int b2 = fVar.mo7310b();
                    if (b2 == -1) {
                        break;
                    } else if (b2 == 1) {
                        l = Long.valueOf(C2731g.m7902b(fVar));
                    } else if (b2 == 2) {
                        hVar = C7619p.m15632b(fVar);
                    }
                }
                fVar.mo7309a(a2);
                if (l == null) {
                    throw new IllegalStateException("Map key must not be null!");
                } else if (hVar != null) {
                    iVar.f18901c.put(l, hVar);
                } else {
                    throw new IllegalStateException("Map value must not be null!");
                }
            }
        }
    }
}
