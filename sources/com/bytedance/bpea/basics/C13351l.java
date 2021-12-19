package com.bytedance.bpea.basics;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.bpea.basics.l */
public final class C13351l {

    /* renamed from: a */
    public C13352a f32629a = new C13352a();

    /* renamed from: b */
    public final C13352a f32630b;

    /* renamed from: c */
    public C13352a f32631c;

    static {
        Covode.recordClassIndex(15347);
    }

    /* renamed from: com.bytedance.bpea.basics.l$a */
    public static final class C13352a {

        /* renamed from: a */
        public long f32632a;

        /* renamed from: b */
        public long f32633b;

        static {
            Covode.recordClassIndex(15348);
        }

        /* renamed from: a */
        public final long mo21596a() {
            long j = this.f32633b - this.f32632a;
            if (j < 0) {
                return 0;
            }
            return j;
        }

        public final String toString() {
            return "TimeAnchorBean(startTime=" + this.f32632a + ", endTime=" + this.f32633b + ",costTime=" + mo21596a() + ')';
        }
    }

    /* renamed from: a */
    public final void mo21594a() {
        this.f32629a.f32633b = System.currentTimeMillis();
        this.f32630b.f32633b = System.nanoTime();
        this.f32631c.f32633b = SystemClock.currentThreadTimeMillis();
    }

    public C13351l() {
        C13352a aVar = new C13352a();
        this.f32630b = aVar;
        this.f32631c = new C13352a();
        this.f32629a.f32632a = System.currentTimeMillis();
        aVar.f32632a = System.nanoTime();
        this.f32631c.f32632a = SystemClock.currentThreadTimeMillis();
    }

    public final String toString() {
        return "TimeAnchor(absoluteTime=" + this.f32629a + ", threadTime=" + this.f32631c + ", nanoTime=" + this.f32630b + ')';
    }
}
