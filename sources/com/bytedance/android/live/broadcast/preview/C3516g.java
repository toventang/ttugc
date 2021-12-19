package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89223p;

/* renamed from: com.bytedance.android.live.broadcast.preview.g */
final /* synthetic */ class C3516g extends C89223p {
    static {
        Covode.recordClassIndex(4000);
    }

    C3516g(C3421d dVar) {
        super(dVar, C3421d.class, "mLiveParamsListener", "getMLiveParamsListener()Lcom/bytedance/android/livesdkapi/depend/model/broadcast/ILiveParamsListener;", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89223p, p4600h.p4620k.AbstractC89288j
    public final Object get() {
        return ((C3421d) this.receiver).f9690j;
    }

    @Override // p4600h.p4611f.p4613b.C89223p
    public final void set(Object obj) {
        ((C3421d) this.receiver).f9690j = (AbstractC11683e) obj;
    }
}
