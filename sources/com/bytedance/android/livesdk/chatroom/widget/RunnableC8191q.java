package com.bytedance.android.livesdk.chatroom.widget;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.widget.C8187o;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.q */
final /* synthetic */ class RunnableC8191q implements Runnable {

    /* renamed from: a */
    private final C8187o.C81892 f20316a;

    static {
        Covode.recordClassIndex(9014);
    }

    RunnableC8191q(C8187o.C81892 r1) {
        this.f20316a = r1;
    }

    public final void run() {
        MethodCollector.m26663i(4756);
        C8187o.C81892 r2 = this.f20316a;
        if (C8187o.this.getParent() != null) {
            ((ViewGroup) C8187o.this.getParent()).removeView(C8187o.this);
        }
        MethodCollector.m26664o(4756);
    }
}
