package com.bytedance.android.livesdk.chatroom.p499ui;

import com.bytedance.android.livesdk.chatroom.backroom.p485d.C7349a;
import com.bytedance.android.livesdk.chatroom.p499ui.C7822br;
import com.bytedance.android.livesdkapi.depend.p680d.EnumC11662p;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cj */
public final /* synthetic */ class RunnableC7861cj implements Runnable {

    /* renamed from: a */
    private final C7822br f19582a;

    /* renamed from: b */
    private final int f19583b;

    static {
        Covode.recordClassIndex(8656);
    }

    RunnableC7861cj(C7822br brVar, int i) {
        this.f19582a = brVar;
        this.f19583b = i;
    }

    public final void run() {
        C7822br brVar = this.f19582a;
        int i = this.f19583b;
        if (brVar.f19511s != null && brVar.f19510r == EnumC11662p.LIVE_STARTED) {
            brVar.f19511s.mo13671a(brVar.f19496d);
        }
        if (!C7349a.m15253c() || i != 8 || brVar.f19472at == null || !brVar.f19472at.mo12709j()) {
            brVar.mo14099a(C7822br.EnumC7841a.USER_CLOSE);
        }
    }
}
