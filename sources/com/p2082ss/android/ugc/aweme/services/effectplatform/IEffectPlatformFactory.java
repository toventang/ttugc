package com.p2082ss.android.ugc.aweme.services.effectplatform;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.link.model.host.Host;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory */
public interface IEffectPlatformFactory {
    static {
        Covode.recordClassIndex(79783);
    }

    AbstractC46415f create(EffectPlatformBuilder effectPlatformBuilder);

    AbstractC46415f create(EffectConfiguration.Builder builder, AbstractC89172b<? super EffectConfiguration, C89391z> bVar, boolean z);

    EffectConfiguration.Builder createEffectConfigurationBuilder(EffectPlatformBuilder effectPlatformBuilder);

    List<Host> getDownloadableModelHosts();

    List<Host> getHosts();

    /* renamed from: com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory$DefaultImpls */
    public static final class DefaultImpls {
        static {
            Covode.recordClassIndex(79784);
        }

        public static /* synthetic */ AbstractC46415f create$default(IEffectPlatformFactory iEffectPlatformFactory, EffectConfiguration.Builder builder, AbstractC89172b bVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                return iEffectPlatformFactory.create(builder, bVar, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
    }
}
