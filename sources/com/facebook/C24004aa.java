package com.facebook;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.facebook.GraphRequest;
import com.facebook.internal.p1894a.p1896b.C24677a;

/* renamed from: com.facebook.aa */
final class C24004aa {

    /* renamed from: a */
    final long f56825a = C24872m.m47695f();

    /* renamed from: b */
    public long f56826b;

    /* renamed from: c */
    long f56827c;

    /* renamed from: d */
    public long f56828d;

    /* renamed from: e */
    private final GraphRequest f56829e;

    /* renamed from: f */
    private final Handler f56830f;

    static {
        Covode.recordClassIndex(28125);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39488a() {
        if (this.f56826b > this.f56827c) {
            GraphRequest.AbstractC23858b bVar = this.f56829e.f56460k;
            final long j = this.f56828d;
            if (j > 0 && (bVar instanceof GraphRequest.AbstractC23860d)) {
                final long j2 = this.f56826b;
                final GraphRequest.AbstractC23860d dVar = (GraphRequest.AbstractC23860d) bVar;
                Handler handler = this.f56830f;
                if (handler != null) {
                    handler.post(new Runnable() {
                        /* class com.facebook.C24004aa.RunnableC240051 */

                        static {
                            Covode.recordClassIndex(28126);
                        }

                        public final void run() {
                            C24677a.m47209a(this);
                        }
                    });
                }
                this.f56827c = this.f56826b;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39489a(long j) {
        this.f56828d += j;
    }

    C24004aa(Handler handler, GraphRequest graphRequest) {
        this.f56829e = graphRequest;
        this.f56830f = handler;
    }
}
