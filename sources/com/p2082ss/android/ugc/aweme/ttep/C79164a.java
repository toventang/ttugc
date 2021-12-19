package com.p2082ss.android.ugc.aweme.ttep;

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
import com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import com.p2082ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86793b;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ttep.a */
public final class C79164a {
    static {
        Covode.recordClassIndex(92351);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.a$a */
    public static final class C79165a implements AbstractC84398d {

        /* renamed from: a */
        final /* synthetic */ AbstractC84398d f177955a;

        /* renamed from: b */
        private final /* synthetic */ AbstractC84398d f177956b;

        static {
            Covode.recordClassIndex(92352);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78885a(int i, String str, String str2, Integer num, Integer num2, AbstractC86796e<InfoStickerListResponse> eVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(eVar, "");
            this.f177956b.mo78885a(i, str, str2, num, num2, eVar);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78888a(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
            C89219l.m154721d(providerEffect, "");
            C89219l.m154721d(iDownloadProviderEffectListener, "");
            this.f177956b.mo78888a(providerEffect, iDownloadProviderEffectListener);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78889a(AbstractC86796e<RecommendSearchWordsResponse> eVar) {
            C89219l.m154721d(eVar, "");
            this.f177956b.mo78889a(eVar);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78890a(InfoStickerEffect infoStickerEffect, AbstractC86793b bVar) {
            C89219l.m154721d(infoStickerEffect, "");
            this.f177956b.mo78890a(infoStickerEffect, bVar);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78893a(String str, IFetchFavoriteList iFetchFavoriteList) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchFavoriteList, "");
            this.f177956b.mo78893a(str, iFetchFavoriteList);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78894a(String str, String str2, int i, int i2, int i3, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchCategoryEffectListener, "");
            this.f177956b.mo78894a(str, str2, i, i2, i3, str3, z, iFetchCategoryEffectListener);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78895a(String str, String str2, int i, int i2, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(map, "");
            C89219l.m154721d(iSearchEffectListenerV2, "");
            this.f177956b.mo78895a(str, str2, i, i2, map, iSearchEffectListenerV2);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78896a(String str, String str2, int i, ICheckChannelListener iCheckChannelListener, Map<String, String> map) {
            C89219l.m154721d(iCheckChannelListener, "");
            this.f177956b.mo78896a(str, str2, i, iCheckChannelListener, map);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78897a(String str, String str2, IUpdateTagListener iUpdateTagListener) {
            C89219l.m154721d(iUpdateTagListener, "");
            this.f177956b.mo78897a(str, str2, iUpdateTagListener);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78898a(String str, String str2, String str3, int i, int i2, IFetchProviderEffect iFetchProviderEffect, boolean z) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchProviderEffect, "");
            this.f177956b.mo78898a(str, str2, str3, i, i2, iFetchProviderEffect, z);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78899a(String str, String str2, String str3, Integer num, Integer num2, AbstractC86796e<InfoStickerListResponse> eVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(eVar, "");
            this.f177956b.mo78899a(str, str2, str3, num, num2, eVar);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78900a(String str, String str2, String str3, String str4, int i, int i2, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            C89219l.m154721d(map, "");
            C89219l.m154721d(iSearchEffectListenerV2, "");
            this.f177956b.mo78900a(str, str2, str3, str4, i, i2, map, iSearchEffectListenerV2);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78903a(String str, String str2, boolean z, int i, int i2, IFetchProviderEffect iFetchProviderEffect) {
            C89219l.m154721d(iFetchProviderEffect, "");
            this.f177956b.mo78903a(str, str2, z, i, i2, iFetchProviderEffect);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78904a(String str, List<String> list, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
            C89219l.m154721d(iIsTagNeedUpdatedListener, "");
            this.f177956b.mo78904a(str, list, str2, iIsTagNeedUpdatedListener);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78905a(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(list, "");
            C89219l.m154721d(iModFavoriteList, "");
            this.f177956b.mo78905a(str, list, z, iModFavoriteList);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78910a(String str, boolean z, boolean z2, IFetchEffectChannelListener iFetchEffectChannelListener) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchEffectChannelListener, "");
            this.f177956b.mo78910a(str, z, z2, iFetchEffectChannelListener);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78911a(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
            C89219l.m154721d(list, "");
            this.f177956b.mo78911a(list, map, iFetchEffectListByIdsListener);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78912a(List<String> list, Map<String, String> map, boolean z, IFetchEffectListListener iFetchEffectListListener) {
            this.f177956b.mo78912a(list, map, z, iFetchEffectListListener);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: b */
        public final void mo78915b(Effect effect, IFetchEffectListener iFetchEffectListener) {
            C89219l.m154721d(effect, "");
            C89219l.m154721d(iFetchEffectListener, "");
            this.f177956b.mo78915b(effect, iFetchEffectListener);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: c */
        public final EffectManager mo78917c() {
            return this.f177956b.mo78917c();
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: c */
        public final boolean mo78918c(Effect effect) {
            C89219l.m154721d(effect, "");
            return this.f177956b.mo78918c(effect);
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        public final void destroy() {
            this.f177956b.destroy();
        }

        @Override // com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d
        /* renamed from: a */
        public final void mo78909a(String str, boolean z, String str2, int i, int i2, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(iFetchPanelInfoListener, "");
            if (C89219l.m154714a((Object) str, (Object) "default")) {
                iFetchPanelInfoListener.onSuccess(new PanelInfoModel(null, 1, null));
            } else {
                this.f177955a.mo78909a(str, z, str2, i, i2, z2, iFetchPanelInfoListener);
            }
        }

        C79165a(AbstractC84398d dVar) {
            this.f177955a = dVar;
            this.f177956b = dVar;
        }
    }
}
