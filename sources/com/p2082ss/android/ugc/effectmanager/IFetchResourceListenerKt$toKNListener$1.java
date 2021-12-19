package com.p2082ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.IFetchResourceListenerKt$toKNListener$1 */
public final class IFetchResourceListenerKt$toKNListener$1 implements AbstractC86796e<Long> {
    final /* synthetic */ IFetchResourceListener $oldListener;

    static {
        Covode.recordClassIndex(95372);
    }

    IFetchResourceListenerKt$toKNListener$1(IFetchResourceListener iFetchResourceListener) {
        this.$oldListener = iFetchResourceListener;
    }

    public final void onSuccess(long j) {
        this.$oldListener.onSuccess(j);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
    public final /* synthetic */ void onSuccess(Long l) {
        onSuccess(l.longValue());
    }

    public final void onFail(Long l, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        IFetchResourceListener iFetchResourceListener = this.$oldListener;
        Exception exception = ListenerAdaptExtKt.toOldExceptionResult(eVar).getException();
        C89219l.m154709a((Object) exception, "");
        iFetchResourceListener.onFailure(exception);
    }
}
