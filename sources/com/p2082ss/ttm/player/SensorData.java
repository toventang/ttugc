package com.p2082ss.ttm.player;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttm.player.SensorData */
public class SensorData {

    /* renamed from: a */
    private long f192542a;

    /* renamed from: b */
    private float[] f192543b = new float[3];

    /* renamed from: c */
    private float[] f192544c = new float[3];

    static {
        Covode.recordClassIndex(101401);
    }

    private static final native void _writeData(long j, int i, float f, float f2, float f3);

    /* access modifiers changed from: protected */
    public void finalize() {
        stop();
    }

    public void stop() {
        this.f192542a = 0;
    }

    public int start() {
        Boolean bool = false;
        if (bool.booleanValue()) {
            return 0;
        }
        return -1;
    }

    public void setHandle(long j, TTPlayer tTPlayer) {
        this.f192542a = j;
    }
}
