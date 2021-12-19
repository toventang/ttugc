package com.bytedance.android.livesdk.chatroom.p481b;

import com.bytedance.android.livesdk.model.message.C9890t;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.b.d */
public final /* synthetic */ class RunnableC7305d implements Runnable {

    /* renamed from: a */
    private final EnumC7303c f18155a;

    /* renamed from: b */
    private final Room f18156b;

    /* renamed from: c */
    private final C9890t f18157c;

    static {
        Covode.recordClassIndex(8068);
    }

    RunnableC7305d(EnumC7303c cVar, Room room, C9890t tVar) {
        this.f18155a = cVar;
        this.f18156b = room;
        this.f18157c = tVar;
    }

    public final void run() {
        EnumC7303c cVar = this.f18155a;
        Room room = this.f18156b;
        C9890t tVar = this.f18157c;
        if (!EnumC7303c.m15210a(room)) {
            cVar.add(tVar);
        }
        cVar.f18148a = null;
    }
}
