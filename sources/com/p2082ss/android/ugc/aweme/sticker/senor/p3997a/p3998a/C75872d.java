package com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.p3998a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75866a;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75877c;
import com.p2082ss.android.ugc.aweme.sticker.senor.p3997a.AbstractC75867a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.senor.a.a.d */
public final class C75872d extends AbstractC75867a {

    /* renamed from: c */
    private final AbstractC75877c f170419c;

    /* renamed from: d */
    private final SensorManager f170420d;

    /* renamed from: e */
    private final AbstractC75866a f170421e;

    static {
        Covode.recordClassIndex(88806);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        C89219l.m154721d(sensor, "");
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        C89219l.m154721d(sensorEvent, "");
        double a = m133041a(sensorEvent);
        if (this.f170413a) {
            float[] fArr = new float[9];
            if (this.f170420d != null) {
                SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
            }
            double[] dArr = new double[9];
            int i = 0;
            do {
                dArr[i] = (double) fArr[i];
                i++;
            } while (i < 9);
            this.f170421e.mo119392a(dArr, a);
            AbstractC75877c cVar = this.f170419c;
            float[] fArr2 = sensorEvent.values;
            C89219l.m154716b(fArr2, "");
            cVar.mo23150a(fArr2, a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75872d(AbstractC75877c cVar, SensorManager sensorManager, AbstractC75866a aVar, boolean z) {
        super(z);
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        this.f170419c = cVar;
        this.f170420d = sensorManager;
        this.f170421e = aVar;
    }
}
