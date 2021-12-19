package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.C14208y;
import com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.an */
final /* synthetic */ class RunnableC72765an implements Runnable {

    /* renamed from: a */
    private final C72809t.C728189 f163146a;

    /* renamed from: b */
    private final float f163147b;

    /* renamed from: c */
    private final boolean f163148c;

    /* renamed from: d */
    private final C2563k f163149d;

    static {
        Covode.recordClassIndex(85451);
    }

    RunnableC72765an(C72809t.C728189 r1, float f, boolean z, C2563k kVar) {
        this.f163146a = r1;
        this.f163147b = f;
        this.f163148c = z;
        this.f163149d = kVar;
    }

    public final void run() {
        C72809t.C728189 r5 = this.f163146a;
        float f = this.f163147b;
        boolean z = this.f163148c;
        C2563k kVar = this.f163149d;
        if (f == 0.0f) {
            C72809t.this.mo115123aN();
        }
        if (z) {
            kVar.mo6999a(new C14208y(f == 0.0f));
        }
    }
}
