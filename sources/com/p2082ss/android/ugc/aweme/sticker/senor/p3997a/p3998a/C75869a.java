package com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.p3998a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75866a;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.AbstractC75867a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.senor.a.a.a */
public final class C75869a extends AbstractC75867a {

    /* renamed from: c */
    private final AbstractC75866a f170414c;

    static {
        Covode.recordClassIndex(88803);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        C89219l.m154721d(sensor, "");
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        C89219l.m154721d(sensorEvent, "");
        double a = m133041a(sensorEvent);
        if (this.f170413a) {
            this.f170414c.mo119390a((double) sensorEvent.values[0], (double) sensorEvent.values[1], (double) sensorEvent.values[2], a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75869a(AbstractC75866a aVar, boolean z) {
        super(z);
        C89219l.m154721d(aVar, "");
        this.f170414c = aVar;
    }
}
