package com.bytedance.android.livesdk.p442ai;

import com.bytedance.android.livesdk.p442ai.AbstractC6724g;
import com.bytedance.android.livesdk.p442ai.C6752v;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ai.x */
final /* synthetic */ class RunnableC6755x implements Runnable {

    /* renamed from: a */
    private final C6752v.C67531 f16778a;

    /* renamed from: b */
    private final AbstractC6724g.EnumC6727c f16779b;

    /* renamed from: c */
    private final int f16780c;

    /* renamed from: d */
    private final String f16781d;

    static {
        Covode.recordClassIndex(7493);
    }

    RunnableC6755x(C6752v.C67531 r1, AbstractC6724g.EnumC6727c cVar, int i, String str) {
        this.f16778a = r1;
        this.f16779b = cVar;
        this.f16780c = i;
        this.f16781d = str;
    }

    public final void run() {
        C6752v.C67531 r4 = this.f16778a;
        AbstractC6724g.EnumC6727c cVar = this.f16779b;
        int i = this.f16780c;
        String str = this.f16781d;
        if (C6752v.this.f16768c != null) {
            C6752v.this.f16768c.mo12905a(cVar, i, str);
        }
    }
}
