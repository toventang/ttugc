package com.p2082ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.p4453j.C86803a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.effectmanager.algorithm.AlgorithmModelManager$knAlgorithmRepository$2 */
public final class AlgorithmModelManager$knAlgorithmRepository$2 extends AbstractC89220m implements AbstractC89171a<C86803a> {
    final /* synthetic */ DownloadableModelConfig $config;

    static {
        Covode.recordClassIndex(95385);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AlgorithmModelManager$knAlgorithmRepository$2(DownloadableModelConfig downloadableModelConfig) {
        super(0);
        this.$config = downloadableModelConfig;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final C86803a invoke() {
        if (!C86803a.C86804a.m150367b()) {
            C86687a kNEffectConfig = this.$config.getKNEffectConfig();
            C89219l.m154709a((Object) kNEffectConfig, "");
            C86803a.C86804a.m150366a(kNEffectConfig);
        }
        return C86803a.C86804a.m150365a();
    }
}
