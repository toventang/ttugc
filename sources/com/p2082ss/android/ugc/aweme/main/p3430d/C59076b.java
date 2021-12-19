package com.p2082ss.android.ugc.aweme.main.p3430d;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.main.d.b */
public final class C59076b implements AbstractC33485al {

    /* renamed from: a */
    static boolean f134472a;

    /* renamed from: b */
    public static final C59076b f134473b = new C59076b();

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: b */
    public final void mo59569b() {
        f134472a = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.main.d.b$a */
    static final class RunnableC59077a implements Runnable {

        /* renamed from: a */
        public static final RunnableC59077a f134474a = new RunnableC59077a();

        static {
            Covode.recordClassIndex(69423);
        }

        RunnableC59077a() {
        }

        public final void run() {
            boolean z = C59076b.f134472a;
        }
    }

    private C59076b() {
    }

    static {
        Covode.recordClassIndex(69422);
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC33485al
    /* renamed from: a */
    public final void mo59568a() {
        if (f134472a) {
            f134472a = false;
            new Handler().postDelayed(RunnableC59077a.f134474a, TimeUnit.SECONDS.toMillis(5));
        }
    }
}
