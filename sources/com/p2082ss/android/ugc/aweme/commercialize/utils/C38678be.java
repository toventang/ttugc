package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.be */
public final class C38678be {

    /* renamed from: a */
    private final AtomicBoolean f91380a = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(46219);
    }

    /* renamed from: a */
    public final boolean mo67252a() {
        return this.f91380a.compareAndSet(false, true);
    }
}
