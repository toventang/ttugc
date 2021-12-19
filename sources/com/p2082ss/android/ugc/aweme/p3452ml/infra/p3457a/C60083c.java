package com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.AbstractC30090l;
import com.p2082ss.android.p2160ml.C30091m;
import com.p2082ss.android.p2160ml.process.AbstractC30113c;
import com.p2082ss.android.p2160ml.process.p2162bl.AfOPModel;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.C60100k;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartSceneConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.a.c */
public final class C60083c extends AbstractC60085e {
    static {
        Covode.recordClassIndex(70591);
    }

    public C60083c(SmartSceneConfig smartSceneConfig) {
        super(smartSceneConfig);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a.AbstractC60086f
    /* renamed from: a */
    public final void mo97615a(C60087g gVar, AbstractC60081a aVar) {
        AbstractC30090l lVar;
        try {
            Map<String, Object> map = gVar.f136917a;
            C30091m mVar = this.f136910a;
            if (mVar != null) {
                lVar = mVar.f71806b;
            } else {
                lVar = null;
            }
            if (mo97618a(mVar, gVar, aVar) && mVar != null && map != null && lVar != null) {
                List<? extends AbstractC30113c> a = mVar.mo53460a();
                AfOPModel afOPModel = mVar.f71808d.output;
                List<String> list = mVar.f71808d.feature_list;
                HashMap hashMap = new HashMap();
                long currentTimeMillis = System.currentTimeMillis();
                List<String> a2 = lVar.mo53455a(map, a, afOPModel, list, hashMap);
                this.f136911b = System.currentTimeMillis() - currentTimeMillis;
                if (!a2.isEmpty()) {
                    C60100k kVar = new C60100k();
                    kVar.f136966b = hashMap;
                    kVar.f136965a = a2.get(0);
                    this.f136915f = kVar;
                    this.f136912c = 0;
                    aVar.mo97584a(true, 0, kVar);
                    return;
                }
                this.f136912c = -5;
                aVar.mo97584a(false, -5, null);
            }
        } catch (Exception unused) {
            this.f136912c = -6;
            aVar.mo97584a(false, -6, null);
        }
    }
}
