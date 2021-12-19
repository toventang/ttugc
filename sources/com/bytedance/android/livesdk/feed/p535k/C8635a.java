package com.bytedance.android.livesdk.feed.p535k;

import android.os.Build;
import android.view.Choreographer;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.livesdk.feed.C8687t;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.k.a */
public final class C8635a {

    /* renamed from: a */
    public static final boolean f21350a = Logger.debug();

    /* renamed from: b */
    long f21351b;

    /* renamed from: c */
    long f21352c;

    /* renamed from: d */
    long f21353d;

    /* renamed from: e */
    public boolean f21354e;

    /* renamed from: f */
    public int f21355f;

    /* renamed from: g */
    public Choreographer.FrameCallback f21356g;

    /* renamed from: com.bytedance.android.livesdk.feed.k.a$a */
    public static class C8637a {

        /* renamed from: a */
        public static final C8635a f21358a = new C8635a((byte) 0);

        static {
            Covode.recordClassIndex(9494);
        }
    }

    static {
        Covode.recordClassIndex(9492);
    }

    private C8635a() {
        this.f21356g = new Choreographer.FrameCallback() {
            /* class com.bytedance.android.livesdk.feed.p535k.C8635a.Choreographer$FrameCallbackC86361 */

            static {
                Covode.recordClassIndex(9493);
            }

            public final void doFrame(long j) {
                if (C8635a.this.f21354e) {
                    if (C8635a.this.f21352c <= 0) {
                        C8635a.this.f21352c = j;
                    } else {
                        C8635a.this.f21353d++;
                    }
                    C8635a.this.f21351b = j;
                    try {
                        Choreographer.getInstance().postFrameCallback(this);
                        if (C8635a.f21350a) {
                            C8635a.this.mo14932a(true);
                        }
                    } catch (Throwable unused) {
                        C8635a.this.f21354e = false;
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo14931a() {
        int i = Build.VERSION.SDK_INT;
        try {
            Choreographer.getInstance().removeFrameCallback(this.f21356g);
            if (this.f21354e) {
                mo14932a(false);
            }
        } catch (Throwable unused) {
        }
        this.f21354e = false;
        this.f21352c = 0;
        this.f21351b = 0;
        this.f21353d = 0;
    }

    /* synthetic */ C8635a(byte b) {
        this();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14932a(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 30;
        }
        long j = this.f21353d;
        if (j >= ((long) i)) {
            long j2 = this.f21351b;
            long j3 = this.f21352c;
            if (j2 > j3) {
                float f = (((float) j) * 1.0E9f) / ((float) (j2 - j3));
                if (!z) {
                    C8687t.m16965a(f);
                    this.f21355f++;
                }
                if (f21350a) {
                    C3854a.m9453a(3, "FPSMonitor", "report: realTime = " + z + ", frameCount = " + this.f21353d + ", fps = " + f);
                }
            }
        }
    }
}
