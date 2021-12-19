package com.p2082ss.android.ugc.aweme.sticker.senor.p3997a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75877c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.senor.a.d */
public final class C75875d extends AbstractC75867a {

    /* renamed from: c */
    private final AbstractC75877c f170424c;

    static {
        Covode.recordClassIndex(88809);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        C89219l.m154721d(sensor, "");
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        C89219l.m154721d(sensorEvent, "");
        if (this.f170413a) {
            AbstractC75877c cVar = this.f170424c;
            float[] fArr = sensorEvent.values;
            C89219l.m154716b(fArr, "");
            cVar.mo23150a(fArr, m133041a(sensorEvent));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75875d(AbstractC75877c cVar, boolean z) {
        super(z);
        C89219l.m154721d(cVar, "");
        this.f170424c = cVar;
    }
}
