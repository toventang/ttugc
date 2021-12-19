package com.p2082ss.android.ugc.effectmanager.algorithm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.p2082ss.android.ugc.effectmanager.EffectConfiguration;
import com.p2082ss.android.ugc.effectmanager.common.utils.EffectRequestUtil;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.algorithm.AlgorithmConfigUtil */
public final class AlgorithmConfigUtil {
    public static final AlgorithmConfigUtil INSTANCE = new AlgorithmConfigUtil();

    private AlgorithmConfigUtil() {
    }

    static {
        Covode.recordClassIndex(95379);
    }

    public static final boolean isOnlineEnv(DownloadableModelConfig downloadableModelConfig) {
        C89219l.m154719c(downloadableModelConfig, "");
        EffectConfiguration effectConfiguration = downloadableModelConfig.getEffectConfiguration();
        if (effectConfiguration != null && effectConfiguration.getChannel() != null) {
            return EffectRequestUtil.isOnlineEnv(effectConfiguration);
        }
        if (downloadableModelConfig.getModelFileEnv() == DownloadableModelConfig.ModelFileEnv.ONLINE) {
            return true;
        }
        return false;
    }
}
