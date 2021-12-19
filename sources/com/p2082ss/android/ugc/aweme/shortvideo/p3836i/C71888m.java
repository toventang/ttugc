package com.p2082ss.android.ugc.aweme.shortvideo.p3836i;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.i.m */
public final class C71888m {
    static {
        Covode.recordClassIndex(84437);
    }

    /* renamed from: a */
    private static long m126957a() {
        long maxShootingDuration = C63244g.m114602a().mo73284l().getMaxDurationResolver().getMaxShootingDuration();
        if (C63244g.m114602a().mo73277e().getDurationMode(true)) {
            return maxShootingDuration;
        }
        return 15000;
    }

    /* renamed from: a */
    public static long m126958a(String str) {
        long a = m126957a();
        if (!TextUtils.isEmpty(str)) {
            long b = (long) C63253l.f143623a.mo73306b().mo101542b(str);
            if (b != -1) {
                return Math.min(a, b);
            }
        }
        return a;
    }
}
