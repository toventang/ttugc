package com.p2082ss.android.ugc.tools.p4337b.p4338a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.EffectManager;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import com.p2082ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86793b;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.tools.b.a.d */
public interface AbstractC84398d {

    /* renamed from: e */
    public static final C84399a f188712e = C84399a.f188716d;

    /* renamed from: com.ss.android.ugc.tools.b.a.d$b */
    public static final class C84400b {
        static {
            Covode.recordClassIndex(98365);
        }
    }

    static {
        Covode.recordClassIndex(98363);
    }

    /* renamed from: a */
    void mo78885a(int i, String str, String str2, Integer num, Integer num2, AbstractC86796e<InfoStickerListResponse> eVar);

    /* renamed from: a */
    void mo78888a(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener);

    /* renamed from: a */
    void mo78889a(AbstractC86796e<RecommendSearchWordsResponse> eVar);

    /* renamed from: a */
    void mo78890a(InfoStickerEffect infoStickerEffect, AbstractC86793b bVar);

    /* renamed from: a */
    void mo78893a(String str, IFetchFavoriteList iFetchFavoriteList);

    /* renamed from: a */
    void mo78894a(String str, String str2, int i, int i2, int i3, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener);

    /* renamed from: a */
    void mo78895a(String str, String str2, int i, int i2, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2);

    /* renamed from: a */
    void mo78896a(String str, String str2, int i, ICheckChannelListener iCheckChannelListener, Map<String, String> map);

    /* renamed from: a */
    void mo78897a(String str, String str2, IUpdateTagListener iUpdateTagListener);

    /* renamed from: a */
    void mo78898a(String str, String str2, String str3, int i, int i2, IFetchProviderEffect iFetchProviderEffect, boolean z);

    /* renamed from: a */
    void mo78899a(String str, String str2, String str3, Integer num, Integer num2, AbstractC86796e<InfoStickerListResponse> eVar);

    /* renamed from: a */
    void mo78900a(String str, String str2, String str3, String str4, int i, int i2, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2);

    /* renamed from: a */
    void mo78903a(String str, String str2, boolean z, int i, int i2, IFetchProviderEffect iFetchProviderEffect);

    /* renamed from: a */
    void mo78904a(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener);

    /* renamed from: a */
    void mo78905a(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList);

    /* renamed from: a */
    void mo78909a(String str, boolean z, String str2, int i, int i2, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener);

    /* renamed from: a */
    void mo78910a(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener);

    /* renamed from: a */
    void mo78911a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    /* renamed from: a */
    void mo78912a(List<String> list, Map<String, String> map, boolean z, IFetchEffectListListener iFetchEffectListListener);

    /* renamed from: b */
    void mo78915b(Effect effect, IFetchEffectListener iFetchEffectListener);

    /* renamed from: c */
    EffectManager mo78917c();

    /* renamed from: c */
    boolean mo78918c(Effect effect);

    void destroy();

    /* renamed from: com.ss.android.ugc.tools.b.a.d$a */
    public static final class C84399a {

        /* renamed from: a */
        public static final int f188713a = 0;

        /* renamed from: b */
        public static final int f188714b = 1;

        /* renamed from: c */
        public static final int f188715c = 2;

        /* renamed from: d */
        static final /* synthetic */ C84399a f188716d = new C84399a();

        private C84399a() {
        }

        static {
            Covode.recordClassIndex(98364);
        }
    }
}
