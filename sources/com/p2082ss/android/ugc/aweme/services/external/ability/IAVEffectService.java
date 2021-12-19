package com.p2082ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p2082ss.android.ugc.aweme.shortvideo.util.AbstractC73999bo;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import p077b.AbstractC1729g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVEffectService */
public interface IAVEffectService {

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVEffectService$EffectPlatformLoader */
    public interface EffectPlatformLoader {
        static {
            Covode.recordClassIndex(79814);
        }

        void load(AbstractC1729g<AbstractC46415f, Void> gVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVEffectService$IAVEffectReadyCallback */
    public interface IAVEffectReadyCallback<T> {
        static {
            Covode.recordClassIndex(79815);
        }

        void finish(T t);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ability.IAVEffectService$ResourceFinder */
    public interface ResourceFinder {
        static {
            Covode.recordClassIndex(79816);
        }

        long createNativeResourceFinder(long j);

        void release(long j);
    }

    static {
        Covode.recordClassIndex(79813);
    }

    void buildEffectPlatform(Context context, IAVEffectReadyCallback<AbstractC46415f> iAVEffectReadyCallback, AbstractC89172b<? super EffectPlatformBuilder, C89391z> bVar);

    void buildEffectPlatform(Context context, boolean z, IAVEffectReadyCallback<AbstractC46415f> iAVEffectReadyCallback, AbstractC89172b<? super EffectPlatformBuilder, C89391z> bVar);

    void clearCacheInFTC();

    void fetchEffectListResource(List<String> list, Map<String, String> map, boolean z, AbstractC46415f fVar, IFetchEffectListListener iFetchEffectListListener);

    void fetchEffectModel(String[] strArr, IAVEffectReadyCallback<String[]> iAVEffectReadyCallback);

    void fetchEffectResource(String str, boolean z, Map<String, String> map, AbstractC46415f fVar, IFetchEffectListener iFetchEffectListener);

    AbstractC73999bo getVideoCoverBitmapCache(AbstractC1204m mVar, String str, int i, int i2, int i3);

    boolean isEffectControlGame(Effect effect);

    void provideResourceFinder(IAVEffectReadyCallback<ResourceFinder> iAVEffectReadyCallback);
}
