package com.p2082ss.android.ugc.effectmanager.effect.bridge;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcherArguments */
public class EffectFetcherArguments {
    private List<String> mDownloadUrl;
    private Effect mEffect;
    private String mEffectDir;

    static {
        Covode.recordClassIndex(95543);
    }

    public List<String> getDownloadUrl() {
        return this.mDownloadUrl;
    }

    public Effect getEffect() {
        return this.mEffect;
    }

    public String getEffectDir() {
        return this.mEffectDir;
    }

    public EffectFetcherArguments(Effect effect, List<String> list, String str) {
        this.mEffect = effect;
        this.mDownloadUrl = list;
        this.mEffectDir = str;
    }
}
