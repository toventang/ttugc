package com.p2082ss.android.vesdk;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.h */
public final class C85510h {

    /* renamed from: a */
    public int f191546a;

    /* renamed from: b */
    public SurfaceTexture f191547b;

    /* renamed from: c */
    public SurfaceTexture.OnFrameAvailableListener f191548c;

    /* renamed from: d */
    public float[] f191549d = new float[16];

    /* renamed from: e */
    public boolean f191550e;

    /* renamed from: f */
    public volatile boolean f191551f;

    /* renamed from: g */
    private EnumC85512a f191552g = EnumC85512a.Detached;

    static {
        Covode.recordClassIndex(99666);
    }

    /* renamed from: a */
    public final void mo131337a() {
        if (this.f191550e) {
            m147351c();
            this.f191550e = false;
        }
        this.f191547b.updateTexImage();
    }

    /* renamed from: c */
    private boolean m147351c() {
        if (EnumC85512a.Detached != this.f191552g) {
            return false;
        }
        this.f191547b.attachToGLContext(this.f191546a);
        this.f191552g = EnumC85512a.Attached;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vesdk.h$a */
    public enum EnumC85512a {
        Attached,
        Detached;

        static {
            Covode.recordClassIndex(99668);
        }
    }

    /* renamed from: b */
    public final double mo131338b() {
        if (this.f191547b == null) {
            return -1.0d;
        }
        long nanoTime = System.nanoTime();
        long abs = Math.abs(nanoTime - this.f191547b.getTimestamp());
        int i = Build.VERSION.SDK_INT;
        long abs2 = Math.abs(SystemClock.elapsedRealtimeNanos() - this.f191547b.getTimestamp());
        double min = (double) (nanoTime - Math.min(Math.min(abs, abs2), Math.abs((SystemClock.uptimeMillis() * 1000000) - this.f191547b.getTimestamp())));
        Double.isNaN(min);
        return min / 1000000.0d;
    }
}
