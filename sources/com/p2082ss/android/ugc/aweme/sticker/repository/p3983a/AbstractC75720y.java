package com.p2082ss.android.ugc.aweme.sticker.repository.p3983a;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2426bw.p2428b.C35324a;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.net.SearchEffectResponseV2;
import com.p2082ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.sticker.repository.a.y */
public interface AbstractC75720y {

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.a.y$a */
    public static final class C75721a {
        static {
            Covode.recordClassIndex(88652);
        }
    }

    static {
        Covode.recordClassIndex(88651);
    }

    /* renamed from: a */
    LiveData<C35324a<CategoryEffectModel>> mo119465a(String str, boolean z);

    /* renamed from: a */
    Map<String, Effect> mo119466a();

    /* renamed from: a */
    void mo119467a(String str);

    /* renamed from: a */
    void mo119468a(List<? extends Effect> list);

    /* renamed from: b */
    LiveData<C35324a<PanelInfoModel>> mo119469b();

    /* renamed from: b */
    void mo119470b(List<? extends Effect> list);

    /* renamed from: c */
    Map<String, LiveData<C35324a<CategoryEffectModel>>> mo119471c();

    /* renamed from: d */
    LiveData<List<String>> mo119472d();

    /* renamed from: e */
    LiveData<List<EffectCategoryModel>> mo119473e();

    /* renamed from: f */
    LiveData<C35324a<SearchEffectResponseV2>> mo119474f();

    /* renamed from: g */
    LiveData<C35324a<RecommendSearchWordsResponse>> mo119475g();
}
