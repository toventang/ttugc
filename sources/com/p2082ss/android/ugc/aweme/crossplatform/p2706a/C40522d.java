package com.p2082ss.android.ugc.aweme.crossplatform.p2706a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.a.d */
public final class C40522d {

    /* renamed from: a */
    private AtomicBoolean f94794a;

    static {
        Covode.recordClassIndex(48338);
    }

    /* renamed from: a */
    public final void mo69606a() {
        this.f94794a.compareAndSet(false, true);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.a.d$a */
    public static class C40523a {

        /* renamed from: a */
        public static C40522d f94795a = new C40522d((byte) 0);

        static {
            Covode.recordClassIndex(48339);
        }
    }

    private C40522d() {
        this.f94794a = new AtomicBoolean(false);
    }

    /* synthetic */ C40522d(byte b) {
        this();
    }
}
