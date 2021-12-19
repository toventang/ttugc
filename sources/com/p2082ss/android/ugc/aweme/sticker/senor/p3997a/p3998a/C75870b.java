package com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.p3998a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75866a;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.AbstractC75867a;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.C75874c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.senor.a.a.b */
public final class C75870b extends AbstractC75867a {

    /* renamed from: c */
    private final C75874c f170415c;

    /* renamed from: d */
    private final AbstractC75866a f170416d;

    static {
        Covode.recordClassIndex(88804);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        C89219l.m154721d(sensor, "");
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        C89219l.m154721d(sensorEvent, "");
        if (this.f170413a) {
            this.f170416d.mo119394c((double) sensorEvent.values[0], (double) sensorEvent.values[1], (double) sensorEvent.values[2], m133041a(sensorEvent));
            this.f170415c.onSensorChanged(sensorEvent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75870b(AbstractC75866a aVar, boolean z) {
        super(z);
        C89219l.m154721d(aVar, "");
        this.f170416d = aVar;
        this.f170415c = new C75874c(aVar.mo119389a(), z);
    }
}
