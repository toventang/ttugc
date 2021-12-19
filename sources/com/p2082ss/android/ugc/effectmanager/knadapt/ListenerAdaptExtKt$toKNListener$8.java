package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86800i;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$toKNListener$8 */
public final class ListenerAdaptExtKt$toKNListener$8 implements AbstractC86800i {
    final /* synthetic */ IUpdateTagListener $oldListener;

    static {
        Covode.recordClassIndex(95758);
    }

    @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86800i
    public final void onFinally() {
        this.$oldListener.onFinally();
    }

    ListenerAdaptExtKt$toKNListener$8(IUpdateTagListener iUpdateTagListener) {
        this.$oldListener = iUpdateTagListener;
    }
}
