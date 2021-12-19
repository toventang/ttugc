package com.p2082ss.android.ugc.aweme.sticker.repository.p3983a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.a.o */
public interface AbstractC75709o {
    static {
        Covode.recordClassIndex(88640);
    }

    /* renamed from: a */
    void mo119436a(Effect effect, IFetchEffectListener iFetchEffectListener);

    /* renamed from: a */
    void mo119437a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    /* renamed from: a */
    void mo119438a(List<String> list, boolean z, Map<String, String> map, IFetchEffectListListener iFetchEffectListListener);
}
