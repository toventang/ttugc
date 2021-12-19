package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.message.fg */
public final class C9851fg implements AbstractC2724b<C9682bo> {
    static {
        Covode.recordClassIndex(11393);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9682bo mo7304a(C2730f fVar) {
        return m18158b(fVar);
    }

    /* renamed from: b */
    public static C9682bo m18158b(C2730f fVar) {
        C9682bo boVar = new C9682bo();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return boVar;
            } else if (b == 1) {
                boVar.f23558a = C2731g.m7901a(fVar);
            } else if (b == 3) {
                boVar.f23559b = fVar.mo7314f();
            } else if (b == 4) {
                boVar.f23560c = C9716r.m18010b(fVar);
            } else if (b == 5) {
                boVar.f23561d = C9853fi.m18161b(fVar);
            } else if (b == 6) {
                boVar.f23562e = fVar.mo7313e();
            } else if (b != 7) {
                C2731g.m7903c(fVar);
            } else {
                boVar.f23563f = C2731g.m7901a(fVar);
            }
        }
    }
}
