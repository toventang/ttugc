package com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.f.a.a.a.d */
public class C81983d implements Serializable {
    public double duration;
    public double preloadSize;
    public boolean shift;
    public double speed;
    public int type;
    public double videoSize;

    static {
        Covode.recordClassIndex(95798);
    }

    public C81983d(double d, double d2, double d3, double d4, boolean z, int i) {
        this.preloadSize = d;
        this.videoSize = d2;
        this.duration = d3;
        this.speed = d4;
        this.shift = z;
        this.type = i;
    }
}
