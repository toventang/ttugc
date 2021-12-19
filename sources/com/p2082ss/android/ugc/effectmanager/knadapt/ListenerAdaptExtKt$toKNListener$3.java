package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$3 */
public final class ListenerAdaptExtKt$toKNListener$3 implements AbstractC86796e<List<? extends Effect>> {
    final /* synthetic */ IFetchEffectListListener $oldListener;

    static {
        Covode.recordClassIndex(95753);
    }

    ListenerAdaptExtKt$toKNListener$3(IFetchEffectListListener iFetchEffectListListener) {
        this.$oldListener = iFetchEffectListListener;
    }

    public final void onSuccess(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        IFetchEffectListListener iFetchEffectListListener = this.$oldListener;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.p2082ss.android.ugc.effectmanager.effect.model.Effect(it.next()));
        }
        iFetchEffectListListener.onSuccess(arrayList);
    }

    public final void onFail(List<? extends Effect> list, C86840e eVar) {
        C89219l.m154719c(eVar, "");
        this.$oldListener.onFail(ListenerAdaptExtKt.toOldExceptionResult(eVar));
    }
}
