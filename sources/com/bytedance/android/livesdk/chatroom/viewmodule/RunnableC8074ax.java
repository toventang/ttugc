package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.model.C9537au;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ax */
final /* synthetic */ class RunnableC8074ax implements Runnable {

    /* renamed from: a */
    private final DecorationWrapperWidget f20085a;

    /* renamed from: b */
    private final List f20086b;

    static {
        Covode.recordClassIndex(8881);
    }

    RunnableC8074ax(DecorationWrapperWidget decorationWrapperWidget, List list) {
        this.f20085a = decorationWrapperWidget;
        this.f20086b = list;
    }

    public final void run() {
        DecorationWrapperWidget decorationWrapperWidget = this.f20085a;
        for (C9537au auVar : this.f20086b) {
            decorationWrapperWidget.mo14279c(auVar);
            if (auVar.f23165g == 1 || auVar.f23165g == 2) {
                decorationWrapperWidget.mo14278b(auVar);
            }
        }
    }
}
