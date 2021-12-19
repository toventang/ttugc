package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$15 */
public final class ListenerAdaptExtKt$toKNListener$15 implements AbstractC86796e<FetchFavoriteListResponse> {
    final /* synthetic */ IFetchFavoriteList $oldListener;

    static {
        Covode.recordClassIndex(95746);
    }

    ListenerAdaptExtKt$toKNListener$15(IFetchFavoriteList iFetchFavoriteList) {
        this.$oldListener = iFetchFavoriteList;
    }

    public final void onSuccess(FetchFavoriteListResponse fetchFavoriteListResponse) {
        C89219l.m154719c(fetchFavoriteListResponse, "");
        this.$oldListener.onSuccess(new com.p2082ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse(fetchFavoriteListResponse));
    }

    public final void onFail(FetchFavoriteListResponse fetchFavoriteListResponse, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFailed(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
