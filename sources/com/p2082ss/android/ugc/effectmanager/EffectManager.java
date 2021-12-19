package com.p2082ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IEffectListResponseListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchHotEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchResourceListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IIsTagNeedUpdatedListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IScanQRCodeListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ISearchEffectListenerV2;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectQRCode;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.p2082ss.ugc.effectplatform.C86717b;
import com.p2082ss.ugc.effectplatform.model.CategoryPageModel;
import com.p2082ss.ugc.effectplatform.model.PanelInfoModel;
import com.p2082ss.ugc.effectplatform.model.ProviderEffectModel;
import com.p2082ss.ugc.effectplatform.model.ResourceListModel;
import com.p2082ss.ugc.effectplatform.model.net.EffectListResponse;
import com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import com.p2082ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import com.p2082ss.ugc.effectplatform.model.net.RecommendSearchWordsResponse;
import com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse;
import com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86795d;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86800i;
import com.p2082ss.ugc.effectplatform.p4453j.C86803a;
import com.p2082ss.ugc.effectplatform.p4453j.C86811b;
import com.p2082ss.ugc.effectplatform.p4453j.C86812c;
import com.p2082ss.ugc.effectplatform.p4453j.C86814e;
import com.p2082ss.ugc.effectplatform.p4453j.C86816g;
import com.p2082ss.ugc.effectplatform.task.C86868ac;
import com.p2082ss.ugc.effectplatform.task.C86870ad;
import com.p2082ss.ugc.effectplatform.task.C86874ae;
import com.p2082ss.ugc.effectplatform.task.C86876ag;
import com.p2082ss.ugc.effectplatform.task.C86878ai;
import com.p2082ss.ugc.effectplatform.task.C86882al;
import com.p2082ss.ugc.effectplatform.task.C86902c;
import com.p2082ss.ugc.effectplatform.task.C86923i;
import com.p2082ss.ugc.effectplatform.task.C86950o;
import com.p2082ss.ugc.effectplatform.task.C86953p;
import com.p2082ss.ugc.effectplatform.task.C86956q;
import com.p2082ss.ugc.effectplatform.task.C86957r;
import com.p2082ss.ugc.effectplatform.task.C86972w;
import com.p2082ss.ugc.effectplatform.task.C86975x;
import com.p2082ss.ugc.effectplatform.task.C86977y;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import com.p2082ss.ugc.effectplatform.util.C87006t;
import com.p2082ss.ugc.effectplatform.util.C87007u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4519d.p4520a.p4522b.C87993b;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4533f.AbstractC88065d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.EffectManager */
public class EffectManager {
    private C86717b mEffectPlatform;

    static {
        Covode.recordClassIndex(95367);
    }

    public C86717b getEffectPlatform() {
        return this.mEffectPlatform;
    }

    public C86717b getKNEffectPlatform() {
        return this.mEffectPlatform;
    }

    public void removeListener() {
        this.mEffectPlatform.f195552b.f195443K.f195697a.clear();
    }

    public void clearEffects() {
        C86717b bVar = this.mEffectPlatform;
        String a = C87006t.m150696a();
        C86717b.C86721c cVar = new C86717b.C86721c(bVar, a, a);
        C86882al alVar = bVar.f195552b.f195470z;
        if (alVar != null) {
            alVar.mo140600a(cVar);
        }
    }

    public EffectChannelResponse getCurrentEffectChannel() {
        return new EffectChannelResponse(this.mEffectPlatform.mo139969d().f195724a.f199870a);
    }

    public void destroy() {
        C86717b bVar = this.mEffectPlatform;
        C86882al alVar = bVar.f195552b.f195470z;
        if (alVar != null) {
            if (alVar.f195896b) {
                alVar.f195897c.shutdown();
            }
            if (!alVar.f195895a.isEmpty()) {
                for (Map.Entry<String, AbstractC88065d> entry : alVar.f195895a.entrySet()) {
                    entry.getKey();
                    entry.getValue().cancel();
                }
            }
            alVar.f195895a.clear();
        }
        C86811b.f195721b.clear();
        bVar.f195552b.f195443K.f195697a.clear();
    }

    public void clearVersion(String str) {
        this.mEffectPlatform.mo139962a(str);
    }

    public boolean isEffectDownloaded(Effect effect) {
        return this.mEffectPlatform.mo139966a(effect);
    }

    public boolean init(EffectConfiguration effectConfiguration) {
        this.mEffectPlatform = new C86717b(effectConfiguration.getEffectConfig());
        return true;
    }

    public boolean isEffectDownloading(Effect effect) {
        C89219l.m154719c(effect, "");
        if (!C86993j.m150664a(effect) || !C86811b.m150376a(effect.getEffect_id())) {
            return false;
        }
        return true;
    }

    public boolean isEffectReady(Effect effect) {
        C86717b bVar = this.mEffectPlatform;
        C89219l.m154719c(effect, "");
        if (bVar.mo139966a(effect)) {
            return ((C86803a) bVar.f195551a.getValue()).mo140041a(effect);
        }
        return false;
    }

    public void deleteEffect(Effect effect) {
        C86717b bVar = this.mEffectPlatform;
        if (effect != null) {
            AbstractC86755f fVar = (AbstractC86755f) C87993b.m153064a(bVar.f195552b.f195467w);
            if (fVar != null) {
                fVar.mo140011d(effect.getId());
            }
            AbstractC86755f fVar2 = (AbstractC86755f) C87993b.m153064a(bVar.f195552b.f195467w);
            if (fVar2 != null) {
                fVar2.mo140011d(effect.getId() + ".zip");
            }
        }
    }

    public void recommendSearchWords(AbstractC86796e<RecommendSearchWordsResponse> eVar) {
        C86814e a = this.mEffectPlatform.mo139960a();
        String a2 = C87006t.m150696a();
        if (eVar != null) {
            a.f195725a.f195443K.mo140036a(a2, eVar);
        }
        C86882al alVar = a.f195725a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(new C86874ae(a.f195725a, a2));
        }
    }

    public void clearCache(String str) {
        C86717b bVar = this.mEffectPlatform;
        if (str != null) {
            AbstractC86755f fVar = (AbstractC86755f) C87993b.m153064a(bVar.f195552b.f195467w);
            if (fVar != null) {
                fVar.mo140014f("effectchannel" + str + "(.*)");
            }
            AbstractC86755f fVar2 = (AbstractC86755f) C87993b.m153064a(bVar.f195552b.f195467w);
            if (fVar2 != null) {
                C89219l.m154719c(str, "");
                fVar2.mo140014f(str + C88045d.f199951a + "effect_version(.*)");
            }
            AbstractC86755f fVar3 = (AbstractC86755f) C87993b.m153064a(bVar.f195552b.f195467w);
            if (fVar3 != null) {
                C89219l.m154719c(str, "");
                fVar3.mo140014f(str + C88045d.f199951a + "effectchannel(.*)");
            }
            AbstractC86755f fVar4 = (AbstractC86755f) C87993b.m153064a(bVar.f195552b.f195467w);
            if (fVar4 != null) {
                C89219l.m154719c(str, "");
                fVar4.mo140014f(str + C88045d.f199951a + "category_version(.*)");
            }
            AbstractC86755f fVar5 = (AbstractC86755f) C87993b.m153064a(bVar.f195552b.f195467w);
            if (fVar5 != null) {
                fVar5.mo140014f("effectchannelinfosticker" + str + "(.*)");
            }
            AbstractC86755f fVar6 = (AbstractC86755f) C87993b.m153064a(bVar.f195552b.f195467w);
            if (fVar6 != null) {
                C89219l.m154719c(str, "");
                fVar6.mo140014f(str + C88045d.f199951a + "info_sticker_version(.*)");
            }
            bVar.mo139962a(str);
        }
    }

    public void downloadEffectList(List<Effect> list, IFetchEffectListListener iFetchEffectListListener) {
        downloadEffectList(list, iFetchEffectListListener, null);
    }

    public void fetchEffect(String str, IFetchEffectListener iFetchEffectListener) {
        fetchEffectWithDownload(str, null, iFetchEffectListener);
    }

    public void fetchEffectList(List<String> list, IFetchEffectListListener iFetchEffectListListener) {
        fetchEffectList(list, true, null, iFetchEffectListListener);
    }

    public void checkPanelIsUpdate(String str, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 2, null, iCheckChannelListener);
    }

    public void checkedEffectListUpdate(String str, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 0, null, iCheckChannelListener);
    }

    public void fetchEffect(Effect effect, IFetchEffectListener iFetchEffectListener) {
        this.mEffectPlatform.mo139961a(effect, ListenerAdaptExtKt.toKNListener(iFetchEffectListener));
    }

    public void downloadProviderEffect(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86795d kNListener = ListenerAdaptExtKt.toKNListener(iDownloadProviderEffectListener);
        C89219l.m154719c(providerEffect, "");
        C86814e a = bVar.mo139960a();
        C89219l.m154719c(providerEffect, "");
        String a2 = C87006t.m150696a();
        if (kNListener != null) {
            a.f195725a.f195443K.mo140036a(a2, kNListener);
        }
        C86923i iVar = new C86923i(a.f195725a, providerEffect, a2);
        C86882al alVar = a.f195725a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(iVar);
        }
    }

    public void fetchEffect(EffectQRCode effectQRCode, IScanQRCodeListener iScanQRCodeListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<com.p2082ss.ugc.effectplatform.model.Effect> kNListener = ListenerAdaptExtKt.toKNListener(iScanQRCodeListener);
        C89219l.m154719c(effectQRCode, "");
        C86717b.C86726h hVar = new C86717b.C86726h(bVar, kNListener);
        C86812c b = bVar.mo139967b();
        C89219l.m154719c(effectQRCode, "");
        String a = C87006t.m150696a();
        b.f195723a.f195443K.mo140036a(a, hVar);
        C86950o oVar = new C86950o(b.f195723a, effectQRCode, a);
        C86882al alVar = b.f195723a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(oVar);
        }
    }

    public void fetchEffectListFromCache(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<com.p2082ss.ugc.effectplatform.model.EffectChannelResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, bVar.f195552b.f195470z);
        C89219l.m154719c(str, "");
        C86717b.C86731k kVar = new C86717b.C86731k(bVar, kNListener);
        if (!C87007u.m150697a(str)) {
            bVar.mo139967b().mo140046a(str, true, kVar);
        } else {
            bVar.mo139967b().mo140046a("default", true, kVar);
        }
    }

    public void fetchExistEffectList(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<com.p2082ss.ugc.effectplatform.model.EffectChannelResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, bVar.f195552b.f195470z);
        if (!C87007u.m150697a(str)) {
            bVar.mo139967b().mo140044a(str, kNListener);
        } else {
            bVar.mo139967b().mo140044a("default", kNListener);
        }
    }

    public void fetchFavoriteList(String str, IFetchFavoriteList iFetchFavoriteList) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<FetchFavoriteListResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchFavoriteList);
        C86816g c = bVar.mo139968c();
        String a = C87006t.m150696a();
        if (kNListener != null) {
            c.f195728b.f195443K.mo140036a(a, kNListener);
        }
        C86956q qVar = new C86956q(c.f195728b, str, a);
        C86882al alVar = c.f195728b.f195470z;
        if (alVar != null) {
            alVar.mo140600a(qVar);
        }
    }

    public void fetchResourceList(Map<String, String> map, IFetchResourceListener iFetchResourceListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<ResourceListModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchResourceListener);
        C86814e a = bVar.mo139960a();
        String a2 = C87006t.m150696a();
        if (kNListener != null) {
            a.f195725a.f195443K.mo140036a(a2, kNListener);
        }
        C86882al alVar = a.f195725a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(new C86977y(a.f195725a, a2, map));
        }
    }

    public void queryVideoUsedStickers(Map<String, String> map, IEffectListResponseListener iEffectListResponseListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<EffectListResponse> kNListener = ListenerAdaptExtKt.toKNListener(iEffectListResponseListener);
        C86812c b = bVar.mo139967b();
        String a = C87006t.m150696a();
        if (kNListener != null) {
            b.f195723a.f195443K.mo140036a(a, kNListener);
        }
        C86868ac acVar = new C86868ac(b.f195723a, map, a);
        C86882al alVar = b.f195723a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(acVar);
        }
    }

    public void checkCategoryIsUpdate(String str, String str2, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, str2, 1, null, iCheckChannelListener);
    }

    public void downloadEffectList(List<Effect> list, IFetchEffectListListener iFetchEffectListListener, DownloadEffectExtra downloadEffectExtra) {
        this.mEffectPlatform.mo139964a(list, ListenerAdaptExtKt.toKNListener(iFetchEffectListListener), downloadEffectExtra);
    }

    public void fetchEffectList(List<String> list, boolean z, IFetchEffectListListener iFetchEffectListListener) {
        fetchEffectList(list, z, null, iFetchEffectListListener);
    }

    public void checkPanelIsUpdate(String str, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 2, map, iCheckChannelListener);
    }

    public void checkedEffectListUpdate(String str, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, null, 0, map, iCheckChannelListener);
    }

    public void fetchEffectWithDownload(String str, Map<String, String> map, IFetchEffectListener iFetchEffectListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86798g kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListener);
        C89219l.m154719c(str, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        bVar.mo139965a((List<String>) arrayList, true, map, (AbstractC86796e<List<com.p2082ss.ugc.effectplatform.model.Effect>>) new C86717b.C86725g(kNListener));
    }

    public void fetchEffectList(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<com.p2082ss.ugc.effectplatform.model.EffectChannelResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectChannelListener, bVar.f195552b.f195470z);
        C89219l.m154719c(str, "");
        C86717b.C86729j jVar = new C86717b.C86729j(bVar, z, kNListener);
        if (!C87007u.m150697a(str)) {
            bVar.mo139967b().mo140046a(str, false, jVar);
        } else {
            bVar.mo139967b().mo140046a("default", false, jVar);
        }
    }

    public void fetchEffectList2(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        ArrayList arrayList = new ArrayList(list);
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<EffectListResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListByIdsListener);
        C86814e a = bVar.mo139960a();
        String a2 = C87006t.m150696a();
        if (kNListener != null) {
            a.f195725a.f195443K.mo140036a(a2, kNListener);
        }
        C86882al alVar = a.f195725a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(new C86953p(a.f195725a, arrayList, a2, map, true));
        }
    }

    public void fetchEffectList(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<EffectListResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchEffectListByIdsListener);
        C86814e a = bVar.mo139960a();
        String a2 = C87006t.m150696a();
        if (kNListener != null) {
            a.f195725a.f195443K.mo140036a(a2, kNListener);
        }
        C86882al alVar = a.f195725a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(new C86953p(a.f195725a, list, a2, map, false));
        }
    }

    public void isTagUpdated(String str, String str2, IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<Boolean> kNListener = ListenerAdaptExtKt.toKNListener(iIsTagNeedUpdatedListener);
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C86816g c = bVar.mo139968c();
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        String a = C87006t.m150696a();
        if (c.f195727a.f199870a == null) {
            c.f195728b.f195443K.mo140036a(a, new C86816g.C86818b(c, str, str2, kNListener));
            C86870ad adVar = new C86870ad(c.f195728b, a);
            C86882al alVar = c.f195728b.f195470z;
            if (alVar != null) {
                alVar.mo140600a(adVar);
                return;
            }
            return;
        }
        c.mo140053a(str, str2, kNListener);
    }

    public void updateTag(String str, String str2, IUpdateTagListener iUpdateTagListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86800i kNListener = ListenerAdaptExtKt.toKNListener(iUpdateTagListener);
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C86816g c = bVar.mo139968c();
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        String a = C87006t.m150696a();
        if (c.f195727a.f199870a == null) {
            c.f195728b.f195443K.mo140036a(a, new C86816g.C86820d(c, a, str, str2, kNListener));
            C86870ad adVar = new C86870ad(c.f195728b, a);
            C86882al alVar = c.f195728b.f195470z;
            if (alVar != null) {
                alVar.mo140600a(adVar);
                return;
            }
            return;
        }
        c.mo140054a(a, str, str2, kNListener);
    }

    public void modifyFavoriteList(String str, List<String> list, Boolean bool, IModFavoriteList iModFavoriteList) {
        this.mEffectPlatform.mo139963a(str, list, bool.booleanValue(), ListenerAdaptExtKt.toKNListener(iModFavoriteList));
    }

    public void checkCategoryIsUpdate(String str, String str2, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        checkUpdate(str, str2, 1, map, iCheckChannelListener);
    }

    public void fetchEffectList(List<String> list, boolean z, Map<String, String> map, IFetchEffectListListener iFetchEffectListListener) {
        this.mEffectPlatform.mo139965a(list, z, map, ListenerAdaptExtKt.toKNListener(iFetchEffectListListener));
    }

    public void modifyFavoriteList(String str, String str2, Boolean bool, IModFavoriteList iModFavoriteList) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        this.mEffectPlatform.mo139963a(str, arrayList, bool.booleanValue(), ListenerAdaptExtKt.toKNListener(iModFavoriteList));
    }

    public void fetchProviderEffect(String str, boolean z, int i, int i2, IFetchProviderEffect iFetchProviderEffect) {
        fetchProviderEffect(str, z, i, i2, null, iFetchProviderEffect);
    }

    private void checkUpdate(String str, String str2, int i, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<Boolean> kNListener = ListenerAdaptExtKt.toKNListener(iCheckChannelListener);
        C89219l.m154719c(str, "");
        C86812c b = bVar.mo139967b();
        String a = C87006t.m150696a();
        if (kNListener != null) {
            b.f195723a.f195443K.mo140036a(a, kNListener);
        }
        C86902c cVar = new C86902c(b.f195723a, a, str, str2, i, map);
        C86882al alVar = b.f195723a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(cVar);
        }
    }

    public void fetchHotEffect(int i, int i2, Map<String, String> map, boolean z, IFetchHotEffectListener iFetchHotEffectListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<FetchHotEffectResponse> kNListener = ListenerAdaptExtKt.toKNListener(iFetchHotEffectListener);
        C86812c b = bVar.mo139967b();
        String a = C87006t.m150696a();
        if (kNListener != null) {
            b.f195723a.f195443K.mo140036a(a, kNListener);
        }
        C86957r rVar = new C86957r(b.f195723a, i, i2, a, map);
        C86882al alVar = b.f195723a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(rVar);
        }
    }

    public void fetchProviderEffectsByGiphyIds(String str, String str2, Map<String, String> map, boolean z, AbstractC86796e<GifProviderEffectListResponse> eVar) {
        C86717b bVar = this.mEffectPlatform;
        C89219l.m154719c(str, "");
        C86814e a = bVar.mo139960a();
        C89219l.m154719c(str, "");
        String a2 = C87006t.m150696a();
        if (eVar != null) {
            a.f195725a.f195443K.mo140036a(a2, eVar);
        }
        C86972w wVar = new C86972w(a.f195725a, a2, str, str2, map, z);
        C86882al alVar = a.f195725a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(wVar);
        }
    }

    public void searchProviderEffect(String str, String str2, int i, int i2, boolean z, IFetchProviderEffect iFetchProviderEffect) {
        searchProviderEffect(str, str2, i, i2, z, null, iFetchProviderEffect);
    }

    public void fetchPanelInfo(String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<PanelInfoModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, bVar.f195552b.f195470z);
        C89219l.m154719c(str, "");
        bVar.mo139967b().mo140047a(str, z, str2, i, i2, false, kNListener);
    }

    public void fetchPanelInfoFromCache(String str, boolean z, String str2, int i, int i2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<PanelInfoModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchPanelInfoListener, bVar.f195552b.f195470z);
        C89219l.m154719c(str, "");
        bVar.mo139967b().mo140047a(str, z, str2, i, i2, true, kNListener);
    }

    public void searchEffects(String str, String str2, int i, int i2, Map<String, String> map, ISearchEffectListenerV2 iSearchEffectListenerV2) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<SearchEffectResponseV2> kNListener = ListenerAdaptExtKt.toKNListener(iSearchEffectListenerV2);
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        bVar.mo139960a().mo140049a(str, str2, i, i2, map, kNListener, null);
    }

    public void fetchProviderEffect(String str, boolean z, int i, int i2, String str2, IFetchProviderEffect iFetchProviderEffect) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<ProviderEffectModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchProviderEffect);
        C86812c b = bVar.mo139967b();
        String a = C87006t.m150696a();
        if (kNListener != null) {
            b.f195723a.f195443K.mo140036a(a, kNListener);
        }
        C86975x xVar = new C86975x(b.f195723a, a, str, i, i2, str2);
        C86882al alVar = b.f195723a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(xVar);
        }
    }

    public void searchEffect(String str, String str2, int i, int i2, Map<String, String> map, ISearchEffectListener iSearchEffectListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<SearchEffectResponse> kNListener = ListenerAdaptExtKt.toKNListener(iSearchEffectListener);
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C86814e a = bVar.mo139960a();
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        String a2 = C87006t.m150696a();
        if (kNListener != null) {
            a.f195725a.f195443K.mo140036a(a2, kNListener);
        }
        C86882al alVar = a.f195725a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(new C86876ag(a.f195725a, str, str2, i, i2, map, a2));
        }
    }

    public void fetchCategoryEffect(String str, String str2, int i, int i2, int i3, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<CategoryPageModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchCategoryEffectListener, bVar.f195552b.f195470z);
        C89219l.m154719c(str, "");
        bVar.mo139967b().mo140045a(str, str2, i, i2, i3, str3, false, kNListener);
    }

    public void fetchCategoryEffectFromCache(String str, String str2, int i, int i2, int i3, String str3, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<CategoryPageModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchCategoryEffectListener, bVar.f195552b.f195470z);
        C89219l.m154719c(str, "");
        bVar.mo139967b().mo140045a(str, str2, i, i2, i3, str3, true, kNListener);
    }

    public void searchProviderEffect(String str, String str2, int i, int i2, boolean z, String str3, IFetchProviderEffect iFetchProviderEffect) {
        C86717b bVar = this.mEffectPlatform;
        AbstractC86796e<ProviderEffectModel> kNListener = ListenerAdaptExtKt.toKNListener(iFetchProviderEffect);
        C89219l.m154719c(str, "");
        C86812c b = bVar.mo139967b();
        C89219l.m154719c(str, "");
        String a = C87006t.m150696a();
        if (kNListener != null) {
            b.f195723a.f195443K.mo140036a(a, kNListener);
        }
        C86878ai aiVar = new C86878ai(b.f195723a, a, str, str2, i, i2, str3);
        C86882al alVar = b.f195723a.f195470z;
        if (alVar != null) {
            alVar.mo140600a(aiVar);
        }
    }
}
