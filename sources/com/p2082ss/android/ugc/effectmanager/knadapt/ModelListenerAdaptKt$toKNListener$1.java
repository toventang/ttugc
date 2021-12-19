package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.IFetchModelListener;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ModelListenerAdaptKt$toKNListener$1 */
public final class ModelListenerAdaptKt$toKNListener$1 implements AbstractC86796e<String[]> {
    final /* synthetic */ IFetchModelListener $oldListener;

    static {
        Covode.recordClassIndex(95763);
    }

    ModelListenerAdaptKt$toKNListener$1(IFetchModelListener iFetchModelListener) {
        this.$oldListener = iFetchModelListener;
    }

    public final void onSuccess(String[] strArr) {
        C89219l.m154719c(strArr, "");
        this.$oldListener.onSuccess(strArr);
    }

    public final void onFail(String[] strArr, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFailed(ListenerAdaptExtKt.toOldExceptionResult(eVar).getException());
    }
}
