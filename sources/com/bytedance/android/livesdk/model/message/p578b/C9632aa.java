package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11702i;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.b.aa */
public final class C9632aa implements AbstractC2724b<C9648l> {
    static {
        Covode.recordClassIndex(11174);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9648l mo7304a(C2730f fVar) {
        return m17951b(fVar);
    }

    /* renamed from: b */
    public static C9648l m17951b(C2730f fVar) {
        C9648l lVar = new C9648l((char) 0);
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return lVar;
            } else if (b == 1) {
                lVar.f23508a = Long.valueOf(fVar.mo7314f());
            } else if (b != 2) {
                C2731g.m7903c(fVar);
            } else {
                lVar.f23509b = C11702i.m20654b(fVar);
            }
        }
    }
}
