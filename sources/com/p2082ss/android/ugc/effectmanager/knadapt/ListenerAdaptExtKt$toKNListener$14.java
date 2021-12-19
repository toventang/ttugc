package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$14 */
public final class ListenerAdaptExtKt$toKNListener$14 implements AbstractC86796e<List<? extends String>> {
    final /* synthetic */ IModFavoriteList $oldListener;

    static {
        Covode.recordClassIndex(95745);
    }

    ListenerAdaptExtKt$toKNListener$14(IModFavoriteList iModFavoriteList) {
        this.$oldListener = iModFavoriteList;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
    public final /* bridge */ /* synthetic */ void onSuccess(List<? extends String> list) {
        onSuccess((List<String>) list);
    }

    public final void onSuccess(List<String> list) {
        C89219l.m154719c(list, "");
        this.$oldListener.onSuccess(list);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
    @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
    public final /* bridge */ /* synthetic */ void onFail(List<? extends String> list, C86840e eVar) {
        onFail((List<String>) list, eVar);
    }

    public final void onFail(List<String> list, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
