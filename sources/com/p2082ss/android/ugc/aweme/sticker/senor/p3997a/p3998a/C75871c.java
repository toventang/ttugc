package com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.p3998a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75866a;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.AbstractC75867a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.senor.a.a.c */
public final class C75871c extends AbstractC75867a {

    /* renamed from: c */
    private final boolean f170417c;

    /* renamed from: d */
    private final AbstractC75866a f170418d;

    static {
        Covode.recordClassIndex(88805);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        C89219l.m154721d(sensor, "");
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        C89219l.m154721d(sensorEvent, "");
        double a = m133041a(sensorEvent);
        if (this.f170413a) {
            this.f170418d.mo119393b((double) sensorEvent.values[0], (double) sensorEvent.values[1], (double) sensorEvent.values[2], a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75871c(boolean z, AbstractC75866a aVar) {
        super(z);
        C89219l.m154721d(aVar, "");
        this.f170417c = z;
        this.f170418d = aVar;
    }
}
