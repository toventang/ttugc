package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.ac */
public final /* synthetic */ class RunnableC72754ac implements Runnable {

    /* renamed from: a */
    private final C72809t f163130a;

    /* renamed from: b */
    private final File f163131b;

    /* renamed from: c */
    private final int f163132c;

    static {
        Covode.recordClassIndex(85440);
    }

    RunnableC72754ac(C72809t tVar, File file, int i) {
        this.f163130a = tVar;
        this.f163131b = file;
        this.f163132c = i;
    }

    public final void run() {
        this.f163130a.mo115106a(this.f163131b, this.f163132c);
    }
}
