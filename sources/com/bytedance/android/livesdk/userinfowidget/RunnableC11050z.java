package com.bytedance.android.livesdk.userinfowidget;

import android.widget.ImageView;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.userinfowidget.z */
final /* synthetic */ class RunnableC11050z implements Runnable {

    /* renamed from: a */
    private final ImageView f26596a;

    /* renamed from: b */
    private final Room f26597b;

    static {
        Covode.recordClassIndex(12668);
    }

    RunnableC11050z(ImageView imageView, Room room) {
        this.f26596a = imageView;
        this.f26597b = room;
    }

    public final void run() {
        C7577g.m15570a(this.f26596a, this.f26597b.getOwner().getAvatarThumb(), 2131234441);
    }
}
