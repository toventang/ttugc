package com.p2082ss.android.ugc.aweme.music.presenter;

import android.os.Message;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.presenter.h */
public final /* synthetic */ class RunnableC60851h implements Runnable {

    /* renamed from: a */
    private final C60849g f138278a;

    /* renamed from: b */
    private final Message f138279b;

    static {
        Covode.recordClassIndex(71439);
    }

    RunnableC60851h(C60849g gVar, Message message) {
        this.f138278a = gVar;
        this.f138279b = message;
    }

    public final void run() {
        this.f138278a.handleMsg(this.f138279b);
    }
}
