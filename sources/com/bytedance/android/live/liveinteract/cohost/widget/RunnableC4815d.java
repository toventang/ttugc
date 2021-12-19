package com.bytedance.android.live.liveinteract.cohost.widget;

import com.bytedance.android.live.liveinteract.linkroom.widget.C4905ac;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.widget.d */
final /* synthetic */ class RunnableC4815d implements Runnable {

    /* renamed from: a */
    private final LinkCrossRoomWidget f12666a;

    static {
        Covode.recordClassIndex(5397);
    }

    RunnableC4815d(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f12666a = linkCrossRoomWidget;
    }

    public final void run() {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f12666a;
        C4905ac.m11133b(linkCrossRoomWidget.f12648l.f13064a, new RunnableC4817f(linkCrossRoomWidget), C4905ac.EnumC4907b.PK);
    }
}
