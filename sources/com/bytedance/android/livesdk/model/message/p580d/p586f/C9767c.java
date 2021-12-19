package com.bytedance.android.livesdk.model.message.p580d.p586f;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.model.message.d.f.c */
public final class C9767c implements AbstractC2724b<C9765a> {
    static {
        Covode.recordClassIndex(11309);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9765a mo7304a(C2730f fVar) {
        return m18059b(fVar);
    }

    /* renamed from: b */
    public static C9765a m18059b(C2730f fVar) {
        C9765a aVar = new C9765a();
        aVar.f23770a = new ArrayList();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return aVar;
            } else if (b != 1) {
                C2731g.m7903c(fVar);
            } else {
                aVar.f23770a.add(C9768d.m18061b(fVar));
            }
        }
    }
}
