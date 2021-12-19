package com.bytedance.android.livesdk.chatroom.model.p495b.p496a;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.b.a.d */
public final class C7660d implements AbstractC2724b<C7657a> {
    static {
        Covode.recordClassIndex(8442);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C7657a mo7304a(C2730f fVar) {
        C7657a aVar = new C7657a();
        aVar.f18973a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b != 200) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f18973a.add(C7661e.m15658b(fVar));
            }
        }
    }
}
