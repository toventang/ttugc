package com.p4501vk.api.sdk.p4507f;

import com.bytedance.covode.number.Covode;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: com.vk.api.sdk.f.b */
public final class C87886b {

    /* renamed from: d */
    public static final C87887a f199616d = new C87887a((byte) 0);

    /* renamed from: a */
    public volatile long f199617a;

    /* renamed from: b */
    public volatile int f199618b;

    /* renamed from: c */
    public final long f199619c;

    /* renamed from: e */
    private final Random f199620e;

    /* renamed from: f */
    private final long f199621f;

    /* renamed from: g */
    private final float f199622g;

    /* renamed from: h */
    private final float f199623h;

    static {
        Covode.recordClassIndex(103896);
    }

    public C87886b() {
        this(0, 0, 0.0f, 0.0f, 15);
    }

    /* renamed from: com.vk.api.sdk.f.b$a */
    public static final class C87887a {
        static {
            Covode.recordClassIndex(103897);
        }

        private C87887a() {
        }

        public /* synthetic */ C87887a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo142365a() {
        if (this.f199618b > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo142366b() {
        this.f199617a = (long) Math.min(((float) this.f199617a) * this.f199622g, (float) this.f199621f);
        this.f199617a += m152888a(((float) this.f199617a) * this.f199623h);
        this.f199618b++;
    }

    /* renamed from: a */
    private final long m152888a(float f) {
        double nextGaussian = this.f199620e.nextGaussian();
        double d = (double) f;
        Double.isNaN(d);
        return (long) (nextGaussian * d);
    }

    private C87886b(long j, long j2, float f, float f2) {
        this.f199619c = j;
        this.f199621f = j2;
        this.f199622g = f;
        this.f199623h = f2;
        this.f199620e = new Random(System.currentTimeMillis());
        this.f199617a = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C87886b(long j, long j2, float f, float f2, int i) {
        this((i & 1) != 0 ? TimeUnit.MILLISECONDS.toMillis(100) : j, (i & 2) != 0 ? TimeUnit.MINUTES.toMillis(5) : j2, (i & 4) != 0 ? 2.0f : f, (i & 8) != 0 ? 0.1f : f2);
    }
}
