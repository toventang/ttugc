package com.bytedance.android.livesdk.p441ah;

import android.os.SystemClock;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.ah.f */
public final class C6695f {

    /* renamed from: a */
    public long f16604a = 0;

    /* renamed from: b */
    public boolean f16605b;

    /* renamed from: c */
    public boolean f16606c;

    static {
        Covode.recordClassIndex(7433);
    }

    /* renamed from: a */
    public final void mo12849a() {
        String str;
        if (this.f16604a != 0) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - this.f16604a;
            if (this.f16605b) {
                str = "yes";
            } else {
                str = "no";
            }
            C6501b.C6502a.m13948a("livesdk_mini_window_mute_or_pause_live_duration").mo12646a("duration", currentThreadTimeMillis).mo12651a("is_auto", str).mo12655b();
            C3854a.m9453a(4, "picture_in_picture", "PipMutePlayTimeLogger uploadEndMuteTime, duration is ".concat(String.valueOf(currentThreadTimeMillis)));
            this.f16604a = 0;
            this.f16606c = false;
        }
    }
}
