package com.bytedance.android.livesdk.chatroom.p481b;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p692h.C11777a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.b.e */
public final /* synthetic */ class RunnableC7306e implements Runnable {

    /* renamed from: a */
    private final EnumC7303c f18158a;

    /* renamed from: b */
    private final Room f18159b;

    /* renamed from: c */
    private final C11777a f18160c;

    static {
        Covode.recordClassIndex(8069);
    }

    RunnableC7306e(EnumC7303c cVar, Room room, C11777a aVar) {
        this.f18158a = cVar;
        this.f18159b = room;
        this.f18160c = aVar;
    }

    public final void run() {
        this.f18158a.addFollowGuideMessage(this.f18159b, this.f18160c);
    }
}
