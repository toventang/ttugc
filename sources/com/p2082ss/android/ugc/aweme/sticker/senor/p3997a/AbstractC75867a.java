package com.p2082ss.android.ugc.aweme.sticker.senor.p3997a;

import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.sticker.senor.a.a */
public abstract class AbstractC75867a implements SensorEventListener {

    /* renamed from: b */
    public static final C75868a f170412b = new C75868a((byte) 0);

    /* renamed from: a */
    public boolean f170413a;

    static {
        Covode.recordClassIndex(88801);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.senor.a.a$a */
    public static final class C75868a {
        static {
            Covode.recordClassIndex(88802);
        }

        private C75868a() {
        }

        public /* synthetic */ C75868a(byte b) {
            this();
        }
    }

    public AbstractC75867a(boolean z) {
        this.f170413a = z;
    }

    /* renamed from: a */
    protected static double m133041a(SensorEvent sensorEvent) {
        C89219l.m154721d(sensorEvent, "");
        long j = sensorEvent.timestamp;
        long nanoTime = System.nanoTime();
        long abs = Math.abs(nanoTime - j);
        int i = Build.VERSION.SDK_INT;
        long abs2 = Math.abs(SystemClock.elapsedRealtimeNanos() - j);
        return (double) (nanoTime - C89271h.m154770b(C89271h.m154770b(abs, abs2), Math.abs((SystemClock.uptimeMillis() * 1000000) - j)));
    }
}
