package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.p488c.C7378ak;
import com.bytedance.android.livesdk.chatroom.widget.AbstractC8170a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.aw */
final /* synthetic */ class RunnableC8073aw implements Runnable {

    /* renamed from: a */
    private final DecorationWrapperWidget f20083a;

    /* renamed from: b */
    private final C7378ak f20084b;

    static {
        Covode.recordClassIndex(8880);
    }

    RunnableC8073aw(DecorationWrapperWidget decorationWrapperWidget, C7378ak akVar) {
        this.f20083a = decorationWrapperWidget;
        this.f20084b = akVar;
    }

    public final void run() {
        DecorationWrapperWidget decorationWrapperWidget = this.f20083a;
        decorationWrapperWidget.f19873c[1] = C13628n.m24521b(decorationWrapperWidget.context) - this.f20084b.f18291a;
        for (AbstractC8170a aVar : decorationWrapperWidget.f19875e) {
            aVar.mo14397a(decorationWrapperWidget.f19873c);
        }
    }
}
