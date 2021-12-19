package com.bytedance.android.livesdk.model.message.p578b;

import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.bytedance.android.livesdk.model.message.b.x */
public final class C9660x implements AbstractC2724b<C9644i> {
    static {
        Covode.recordClassIndex(11202);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ C9644i mo7304a(C2730f fVar) {
        return m17975b(fVar);
    }

    /* renamed from: b */
    public static C9644i m17975b(C2730f fVar) {
        C9644i iVar = new C9644i();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        iVar.f23494b = fVar.mo7314f();
                        break;
                    case 2:
                        iVar.f23495c = fVar.mo7314f();
                        break;
                    case 3:
                        iVar.f23496d = (int) fVar.mo7314f();
                        break;
                    case 4:
                        iVar.f23493a = fVar.mo7314f();
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        iVar.f23497e = fVar.mo7313e();
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        iVar.f23498f = fVar.mo7313e();
                        break;
                    default:
                        C2731g.m7903c(fVar);
                        break;
                }
            } else {
                fVar.mo7309a(a);
                return iVar;
            }
        }
    }
}
