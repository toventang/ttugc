package com.p2082ss.android.ugc.aweme.p2719cv;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.cv.m */
public final class C40789m {

    /* renamed from: a */
    private C40792n f95510a;

    /* renamed from: b */
    private AbstractC40790a f95511b;

    /* renamed from: com.ss.android.ugc.aweme.cv.m$a */
    public interface AbstractC40790a {
        static {
            Covode.recordClassIndex(48642);
        }

        /* renamed from: a */
        ExecutorService mo70012a(C40787l lVar);
    }

    static {
        Covode.recordClassIndex(48641);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.cv.m$b */
    public static class C40791b {

        /* renamed from: a */
        public static final C40789m f95512a = new C40789m((byte) 0);

        static {
            Covode.recordClassIndex(48643);
        }
    }

    private C40789m() {
        this.f95510a = new C40792n();
        this.f95511b = new C40767d();
    }

    /* synthetic */ C40789m(byte b) {
        this();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ExecutorService mo70029a(C40787l lVar, boolean z) {
        ExecutorService a = this.f95511b.mo70012a(lVar);
        if (C40780g.f95475a.f95482a) {
            this.f95510a.mo70030a(lVar.f95496a, a, z);
        }
        return a;
    }
}
