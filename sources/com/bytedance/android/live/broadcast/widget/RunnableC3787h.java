package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.widget.h */
public final /* synthetic */ class RunnableC3787h implements Runnable {

    /* renamed from: a */
    private final View$OnClickListenerC3783e f10503a;

    /* renamed from: b */
    private final AbstractC2994b f10504b;

    static {
        Covode.recordClassIndex(4313);
    }

    public RunnableC3787h(View$OnClickListenerC3783e eVar, AbstractC2994b bVar) {
        this.f10503a = eVar;
        this.f10504b = bVar;
    }

    public final void run() {
        C3941k.m9601a(this.f10503a.f10488a, this.f10504b.getAvatarThumb());
    }
}
