package com.p2082ss.android.ugc.aweme.effectplatform;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.EffectManager;
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
import com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86794c;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.f */
public interface AbstractC46415f extends AbstractC84398d {
    static {
        Covode.recordClassIndex(54996);
    }

    /* renamed from: a */
    void mo78886a(AbstractC1204m mVar);

    /* renamed from: a */
    void mo78887a(Effect effect, IFetchEffectListener iFetchEffectListener);

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    void mo78888a(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener);

    /* renamed from: a */
    void mo78891a(String str);

    /* renamed from: a */
    void mo78892a(String str, IFetchEffectChannelListener iFetchEffectChannelListener);

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    void mo78893a(String str, IFetchFavoriteList iFetchFavoriteList);

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    void mo78897a(String str, String str2, IUpdateTagListener iUpdateTagListener);

    /* renamed from: a */
    void mo78901a(String str, String str2, Map<String, String> map, boolean z, AbstractC86794c cVar);

    /* renamed from: a */
    void mo78902a(String str, String str2, boolean z, int i, int i2, int i3, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener);

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    void mo78903a(String str, String str2, boolean z, int i, int i2, IFetchProviderEffect iFetchProviderEffect);

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    void mo78904a(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener);

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    void mo78905a(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList);

    /* renamed from: a */
    void mo78906a(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener);

    /* renamed from: a */
    void mo78907a(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener);

    /* renamed from: a */
    void mo78908a(String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener);

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    void mo78911a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener);

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: a */
    void mo78912a(List<String> list, Map<String, String> map, boolean z, IFetchEffectListListener iFetchEffectListListener);

    /* renamed from: a */
    void mo78913a(Map<String, Object> map);

    /* renamed from: a */
    boolean mo78914a(Effect effect);

    /* renamed from: b */
    boolean mo78916b(Effect effect);

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    /* renamed from: c */
    EffectManager mo78917c();

    /* renamed from: d */
    void mo78919d();

    @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
    void destroy();
}
