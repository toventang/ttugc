package com.p2082ss.android.ugc.aweme.utils;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27259t;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.utils.hn */
public final class C80540hn extends AbstractC27259t {

    /* renamed from: b */
    public static C80540hn f180153b = new C80540hn();

    private C80540hn() {
    }

    static {
        Covode.recordClassIndex(93813);
    }

    @Override // com.google.p1998c.p1999a.AbstractC27259t
    /* renamed from: a */
    public final long mo45347a() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis());
    }
}
