package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.awemepushlib.interaction.l */
public final /* synthetic */ class RunnableC81877l implements Runnable {

    /* renamed from: a */
    private final Boolean f183042a;

    static {
        Covode.recordClassIndex(95291);
    }

    RunnableC81877l(Boolean bool) {
        this.f183042a = bool;
    }

    public final void run() {
        Boolean bool = this.f183042a;
        int intValue = C52912c.f121688a.f121689b.getPushdelayinitSwitch().intValue();
        if (bool.booleanValue()) {
            intValue = 0;
        }
        new Handler(Looper.getMainLooper()).postDelayed(RunnableC81883r.f183048a, (long) intValue);
    }
}
