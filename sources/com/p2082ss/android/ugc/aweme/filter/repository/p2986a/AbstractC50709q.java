package com.p2082ss.android.ugc.aweme.filter.repository.p2986a;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.q */
public interface AbstractC50709q {
    static {
        Covode.recordClassIndex(59871);
    }

    /* renamed from: a */
    LiveData<List<FilterBean>> mo86074a();

    /* renamed from: b */
    LiveData<List<FilterBean>> mo86075b();

    /* renamed from: c */
    LiveData<List<C89378p<EffectCategoryResponse, List<FilterBean>>>> mo86076c();

    /* renamed from: d */
    LiveData<Map<String, Effect>> mo86077d();
}
