package com.bytedance.android.livesdk.p442ai;

import com.bytedance.android.livesdk.p442ai.AbstractC6724g;
import com.bytedance.android.livesdk.p442ai.C6752v;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ai.y */
final /* synthetic */ class RunnableC6756y implements Runnable {

    /* renamed from: a */
    private final C6752v.C67531 f16782a;

    /* renamed from: b */
    private final AbstractC6724g.EnumC6727c f16783b;

    /* renamed from: c */
    private final int f16784c;

    /* renamed from: d */
    private final String f16785d;

    static {
        Covode.recordClassIndex(7494);
    }

    RunnableC6756y(C6752v.C67531 r1, AbstractC6724g.EnumC6727c cVar, int i, String str) {
        this.f16782a = r1;
        this.f16783b = cVar;
        this.f16784c = i;
        this.f16785d = str;
    }

    public final void run() {
        C6752v.C67531 r4 = this.f16782a;
        AbstractC6724g.EnumC6727c cVar = this.f16783b;
        int i = this.f16784c;
        String str = this.f16785d;
        if (C6752v.this.f16768c != null) {
            C6752v.this.f16768c.mo12905a(cVar, i, str);
        }
    }
}
