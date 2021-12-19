package com.bytedance.android.livesdk.performance;

import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencyPeriodDurationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencyPeriodIntervalSetting;
import com.bytedance.android.livesdkapi.host.AbstractC11808h;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.performance.p */
public final class RunnableC10134p implements Runnable {

    /* renamed from: a */
    public final Handler f24582a;

    /* renamed from: b */
    public final AbstractC11808h.AbstractC11811c f24583b;

    /* renamed from: c */
    private boolean f24584c = true;

    static {
        Covode.recordClassIndex(11697);
    }

    public final void run() {
        if (this.f24584c) {
            AbstractC11808h.AbstractC11811c cVar = this.f24583b;
            if (cVar != null) {
                cVar.mo16948a();
            }
            this.f24584c = false;
            this.f24582a.postDelayed(this, LiveFluencyPeriodDurationSetting.INSTANCE.getValue());
            return;
        }
        AbstractC11808h.AbstractC11811c cVar2 = this.f24583b;
        if (cVar2 != null) {
            cVar2.mo16951b();
        }
        this.f24584c = true;
        this.f24582a.postDelayed(this, LiveFluencyPeriodIntervalSetting.INSTANCE.getValue());
    }

    public RunnableC10134p(Handler handler, AbstractC11808h.AbstractC11811c cVar) {
        C89219l.m154721d(handler, "");
        this.f24582a = handler;
        this.f24583b = cVar;
    }
}
