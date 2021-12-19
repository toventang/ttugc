package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
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
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.CategoryPageModel;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.EffectChannelResponse;
import com.p2082ss.ugc.effectplatform.model.PanelInfoModel;
import com.p2082ss.ugc.effectplatform.model.ProviderEffectModel;
import com.p2082ss.ugc.effectplatform.model.ResourceListModel;
import com.p2082ss.ugc.effectplatform.model.net.EffectListResponse;
import com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponse;
import com.p2082ss.ugc.effectplatform.model.net.SearchEffectResponseV2;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86795d;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86798g;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86800i;
import com.p2082ss.ugc.effectplatform.task.C86882al;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt */
public final class ListenerAdaptExtKt {
    static {
        Covode.recordClassIndex(95732);
    }

    public static final AbstractC86798g toKNListener(IFetchEffectListener iFetchEffectListener) {
        if (iFetchEffectListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$1(iFetchEffectListener);
    }

    public static final AbstractC86796e<SearchEffectResponse> toKNListener(ISearchEffectListener iSearchEffectListener) {
        if (iSearchEffectListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$6(iSearchEffectListener);
    }

    public static final AbstractC86796e<SearchEffectResponseV2> toKNListener(ISearchEffectListenerV2 iSearchEffectListenerV2) {
        if (iSearchEffectListenerV2 == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$7(iSearchEffectListenerV2);
    }

    public static final AbstractC86800i toKNListener(IUpdateTagListener iUpdateTagListener) {
        if (iUpdateTagListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$8(iUpdateTagListener);
    }

    public static final AbstractC86796e<Boolean> toKNListener(IIsTagNeedUpdatedListener iIsTagNeedUpdatedListener) {
        if (iIsTagNeedUpdatedListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$9(iIsTagNeedUpdatedListener);
    }

    public static final AbstractC86796e<ProviderEffectModel> toKNListener(IFetchProviderEffect iFetchProviderEffect) {
        if (iFetchProviderEffect == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$10(iFetchProviderEffect);
    }

    public static final AbstractC86796e<PanelInfoModel> toKNListener(IFetchPanelInfoListener iFetchPanelInfoListener, C86882al alVar) {
        if (iFetchPanelInfoListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$13(alVar, iFetchPanelInfoListener);
    }

    public static final AbstractC86796e<List<String>> toKNListener(IModFavoriteList iModFavoriteList) {
        if (iModFavoriteList == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$14(iModFavoriteList);
    }

    public static final AbstractC86796e<FetchHotEffectResponse> toKNListener(IFetchHotEffectListener iFetchHotEffectListener) {
        if (iFetchHotEffectListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$17(iFetchHotEffectListener);
    }

    public static final AbstractC86796e<ResourceListModel> toKNListener(IFetchResourceListener iFetchResourceListener) {
        if (iFetchResourceListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$18(iFetchResourceListener);
    }

    public static final AbstractC86796e<Effect> toKNListener(IScanQRCodeListener iScanQRCodeListener) {
        if (iScanQRCodeListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$19(iScanQRCodeListener);
    }

    public static final AbstractC86795d toKNListener(IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        if (iDownloadProviderEffectListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$11(iDownloadProviderEffectListener);
    }

    public static final AbstractC86796e<Boolean> toKNListener(ICheckChannelListener iCheckChannelListener) {
        if (iCheckChannelListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$5(iCheckChannelListener);
    }

    public static final ExceptionResult toOldExceptionResult(C86840e eVar) {
        C89219l.m154719c(eVar, "");
        ExceptionResult exceptionResult = new ExceptionResult(eVar.f195756a, eVar.f195758c);
        exceptionResult.setMsg(eVar.f195757b);
        return exceptionResult;
    }

    public static final AbstractC86796e<EffectListResponse> toKNListener(IEffectListResponseListener iEffectListResponseListener) {
        if (iEffectListResponseListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$16(iEffectListResponseListener);
    }

    public static final void preProcess(List<? extends com.p2082ss.android.ugc.effectmanager.effect.model.Effect> list) {
        C89219l.m154719c(list, "");
        for (T t : list) {
            t.getRequirements();
            t.getModel_names();
        }
    }

    public static final AbstractC86796e<EffectListResponse> toKNListener(IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        if (iFetchEffectListByIdsListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$4(iFetchEffectListByIdsListener);
    }

    public static final AbstractC86796e<List<Effect>> toKNListener(IFetchEffectListListener iFetchEffectListListener) {
        if (iFetchEffectListListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$3(iFetchEffectListListener);
    }

    public static final AbstractC86796e<FetchFavoriteListResponse> toKNListener(IFetchFavoriteList iFetchFavoriteList) {
        if (iFetchFavoriteList == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$15(iFetchFavoriteList);
    }

    public static final AbstractC86796e<CategoryPageModel> toKNListener(IFetchCategoryEffectListener iFetchCategoryEffectListener, C86882al alVar) {
        if (iFetchCategoryEffectListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$12(alVar, iFetchCategoryEffectListener);
    }

    public static final AbstractC86796e<EffectChannelResponse> toKNListener(IFetchEffectChannelListener iFetchEffectChannelListener, C86882al alVar) {
        if (iFetchEffectChannelListener == null) {
            return null;
        }
        return new ListenerAdaptExtKt$toKNListener$2(alVar, iFetchEffectChannelListener);
    }

    public static final void preProcess(CategoryPageModel categoryPageModel, C86882al alVar, AbstractC89172b<? super com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel, C89391z> bVar) {
        C89219l.m154719c(categoryPageModel, "");
        C89219l.m154719c(bVar, "");
        if (alVar != null) {
            commit(alVar, categoryPageModel, ListenerAdaptExtKt$preProcess$2.INSTANCE, bVar);
        }
    }

    public static final void preProcess(EffectChannelResponse effectChannelResponse, C86882al alVar, AbstractC89172b<? super com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse, C89391z> bVar) {
        C89219l.m154719c(effectChannelResponse, "");
        C89219l.m154719c(bVar, "");
        if (alVar != null) {
            commit(alVar, effectChannelResponse, ListenerAdaptExtKt$preProcess$1.INSTANCE, bVar);
        }
    }

    public static final void preProcess(PanelInfoModel panelInfoModel, C86882al alVar, AbstractC89172b<? super com.p2082ss.android.ugc.effectmanager.effect.model.PanelInfoModel, C89391z> bVar) {
        C89219l.m154719c(panelInfoModel, "");
        C89219l.m154719c(bVar, "");
        if (alVar != null) {
            commit(alVar, panelInfoModel, ListenerAdaptExtKt$preProcess$3.INSTANCE, bVar);
        }
    }

    public static final <T, R> void commit(C86882al alVar, T t, AbstractC89172b<? super T, ? extends R> bVar, AbstractC89172b<? super R, C89391z> bVar2) {
        C89219l.m154719c(alVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        alVar.mo140600a(new ListenerAdaptExtKt$commit$1(bVar, t, bVar2));
    }
}
