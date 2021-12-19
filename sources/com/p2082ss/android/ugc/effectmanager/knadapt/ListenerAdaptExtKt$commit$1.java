package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import p4519d.p4520a.p4533f.AbstractC88065d;
import p4519d.p4520a.p4534g.C88073f;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt$commit$1 */
public final class ListenerAdaptExtKt$commit$1 implements AbstractC88065d {
    final /* synthetic */ AbstractC89172b $callbackInMainThread;
    final /* synthetic */ Object $data;
    final /* synthetic */ AbstractC89172b $runnable;

    static {
        Covode.recordClassIndex(95733);
    }

    @Override // p4519d.p4520a.p4533f.AbstractC88065d
    public final void cancel() {
    }

    @Override // p4519d.p4520a.p4533f.AbstractC88065d
    public final String getId() {
        return "";
    }

    @Override // p4519d.p4520a.p4533f.AbstractC88065d
    public final void run() {
        C88073f.m153147a(new ListenerAdaptExtKt$commit$1$run$1(this, this.$runnable.invoke(this.$data)));
    }

    ListenerAdaptExtKt$commit$1(AbstractC89172b bVar, Object obj, AbstractC89172b bVar2) {
        this.$runnable = bVar;
        this.$data = obj;
        this.$callbackInMainThread = bVar2;
    }
}
