package com.squareup.p2081b;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.aa */
public final class C29255aa {

    /* renamed from: a */
    final HandlerThread f69387a;

    /* renamed from: b */
    final AbstractC29274d f69388b;

    /* renamed from: c */
    final Handler f69389c;

    /* renamed from: d */
    long f69390d;

    /* renamed from: e */
    long f69391e;

    /* renamed from: f */
    long f69392f;

    /* renamed from: g */
    long f69393g;

    /* renamed from: h */
    long f69394h;

    /* renamed from: i */
    long f69395i;

    /* renamed from: j */
    long f69396j;

    /* renamed from: k */
    long f69397k;

    /* renamed from: l */
    int f69398l;

    /* renamed from: m */
    int f69399m;

    /* renamed from: n */
    int f69400n;

    static {
        Covode.recordClassIndex(35604);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51050a() {
        this.f69389c.sendEmptyMessage(0);
    }

    C29255aa(AbstractC29274d dVar) {
        this.f69388b = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f69387a = handlerThread;
        handlerThread.start();
        C29262ae.m58611a(handlerThread.getLooper());
        this.f69389c = new HandlerC29256a(handlerThread.getLooper(), this);
    }

    /* renamed from: com.squareup.b.aa$a */
    static class HandlerC29256a extends Handler {

        /* renamed from: a */
        private final C29255aa f69401a;

        static {
            Covode.recordClassIndex(35605);
        }

        public final void handleMessage(final Message message) {
            int i = message.what;
            if (i == 0) {
                this.f69401a.f69390d++;
            } else if (i == 1) {
                this.f69401a.f69391e++;
            } else if (i == 2) {
                C29255aa aaVar = this.f69401a;
                long j = (long) message.arg1;
                aaVar.f69399m++;
                aaVar.f69393g += j;
                aaVar.f69396j = aaVar.f69393g / ((long) aaVar.f69399m);
            } else if (i == 3) {
                C29255aa aaVar2 = this.f69401a;
                long j2 = (long) message.arg1;
                aaVar2.f69400n++;
                aaVar2.f69394h += j2;
                aaVar2.f69397k = aaVar2.f69394h / ((long) aaVar2.f69399m);
            } else if (i != 4) {
                C29299t.f69514a.post(new Runnable() {
                    /* class com.squareup.p2081b.C29255aa.HandlerC29256a.RunnableC292571 */

                    static {
                        Covode.recordClassIndex(35606);
                    }

                    public final void run() {
                        throw new AssertionError("Unhandled stats message." + message.what);
                    }
                });
            } else {
                C29255aa aaVar3 = this.f69401a;
                aaVar3.f69398l++;
                aaVar3.f69392f += ((Long) message.obj).longValue();
                aaVar3.f69395i = aaVar3.f69392f / ((long) aaVar3.f69398l);
            }
        }

        public HandlerC29256a(Looper looper, C29255aa aaVar) {
            super(looper);
            this.f69401a = aaVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51051a(Bitmap bitmap, int i) {
        int a = C29262ae.m58600a(bitmap);
        Handler handler = this.f69389c;
        handler.sendMessage(handler.obtainMessage(i, a, 0));
    }
}
