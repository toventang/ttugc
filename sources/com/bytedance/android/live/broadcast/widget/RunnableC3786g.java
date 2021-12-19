package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.widget.g */
public final /* synthetic */ class RunnableC3786g implements Runnable {

    /* renamed from: a */
    private final View$OnClickListenerC3783e f10501a;

    /* renamed from: b */
    private final ImageModel f10502b;

    static {
        Covode.recordClassIndex(4312);
    }

    public RunnableC3786g(View$OnClickListenerC3783e eVar, ImageModel imageModel) {
        this.f10501a = eVar;
        this.f10502b = imageModel;
    }

    public final void run() {
        View$OnClickListenerC3783e eVar = this.f10501a;
        C3941k.m9601a(eVar.f10488a, this.f10502b);
    }
}
