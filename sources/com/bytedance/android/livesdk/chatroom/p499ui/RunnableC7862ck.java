package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.livesdk.chatroom.p499ui.C7822br;
import com.bytedance.android.livesdk.event.C8452e;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ck */
public final /* synthetic */ class RunnableC7862ck implements Runnable {

    /* renamed from: a */
    private final C7822br f19584a;

    /* renamed from: b */
    private final C8452e f19585b;

    static {
        Covode.recordClassIndex(8657);
    }

    RunnableC7862ck(C7822br brVar, C8452e eVar) {
        this.f19584a = brVar;
        this.f19585b = eVar;
    }

    public final void run() {
        C7822br brVar = this.f19584a;
        C8452e eVar = this.f19585b;
        brVar.mo14099a(C7822br.EnumC7841a.JUMP_TO_OTHER);
        if (brVar.f19472at != null) {
            brVar.f19472at.mo12695a(eVar.f20898c, eVar.f20899d, eVar.f20896a);
        }
    }
}
