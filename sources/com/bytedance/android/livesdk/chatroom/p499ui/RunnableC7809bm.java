package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.livesdk.chatroom.p499ui.C7794bg;
import com.bytedance.android.livesdk.utils.C11278o;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bm */
final /* synthetic */ class RunnableC7809bm implements Runnable {

    /* renamed from: a */
    private final C7794bg f19379a;

    /* renamed from: b */
    private final C7794bg.EnumC7803a f19380b;

    static {
        Covode.recordClassIndex(8604);
    }

    RunnableC7809bm(C7794bg bgVar, C7794bg.EnumC7803a aVar) {
        this.f19379a = bgVar;
        this.f19380b = aVar;
    }

    public final void run() {
        C7794bg bgVar = this.f19379a;
        if (this.f19380b == C7794bg.EnumC7803a.Keyboard) {
            C11278o.m19995a(bgVar.getContext(), bgVar.f19343k);
        } else {
            bgVar.mo14066g();
        }
    }
}
