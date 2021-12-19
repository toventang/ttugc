package com.p2082ss.android.ugc.aweme.sticker.panel.guide;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.C75536c;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.guide.e */
final /* synthetic */ class RunnableC75543e implements Runnable {

    /* renamed from: a */
    private final C75536c.C755413 f169788a;

    /* renamed from: b */
    private final Animatable f169789b;

    static {
        Covode.recordClassIndex(88467);
    }

    RunnableC75543e(C75536c.C755413 r1, Animatable animatable) {
        this.f169788a = r1;
        this.f169789b = animatable;
    }

    public final void run() {
        C75536c.C755413 r2 = this.f169788a;
        Animatable animatable = this.f169789b;
        if (animatable.isRunning()) {
            animatable.stop();
            if (C75536c.this.f169776g) {
                C75536c.this.f169773d.post(C75536c.this.f169778i);
            }
        }
    }
}
