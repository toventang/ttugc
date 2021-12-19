package com.p2082ss.android.ugc.aweme.feed.p2944e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2433ca.C35340a;
import java.util.Iterator;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.e.r */
public final /* synthetic */ class RunnableC49484r implements Runnable {

    /* renamed from: a */
    static final Runnable f113795a = new RunnableC49484r();

    static {
        Covode.recordClassIndex(58297);
    }

    private RunnableC49484r() {
    }

    public final void run() {
        if (!C35340a.f83371b) {
            Iterator<T> it = C35340a.f83370a.iterator();
            while (it.hasNext()) {
                C35340a.m72329b(it.next().intValue());
            }
            C35340a.f83370a.clear();
            C35340a.f83371b = true;
        }
    }
}
