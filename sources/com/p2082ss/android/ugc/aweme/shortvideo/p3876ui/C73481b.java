package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b */
public final class C73481b implements AbstractC73799a {
    static {
        Covode.recordClassIndex(86218);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: b */
    public final boolean mo88344b() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.task.AbstractC73799a
    /* renamed from: a */
    public final void mo88343a() {
        C1731i.m5640b(CallableC73482a.f165109a, C1731i.f5562a);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.b$a */
    static final class CallableC73482a<V> implements Callable {

        /* renamed from: a */
        public static final CallableC73482a f165109a = new CallableC73482a();

        static {
            Covode.recordClassIndex(86219);
        }

        CallableC73482a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (!C73352a.f164844a) {
                C73352a.m129490a();
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - C73352a.f164845b.getLong("last_mob_time", 0) >= 259200000) {
                    C73352a.f164845b.storeLong("last_mob_time", currentTimeMillis);
                    C73352a.m129490a();
                }
            }
            return C89391z.f203057a;
        }
    }
}
