package com.facebook.p1814a.p1816b;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.p1896b.C24677a;

/* renamed from: com.facebook.a.b.f */
public final class C23907f implements SensorEventListener {

    /* renamed from: a */
    public AbstractC23908a f56604a;

    /* renamed from: com.facebook.a.b.f$a */
    public interface AbstractC23908a {
        static {
            Covode.recordClassIndex(28029);
        }

        /* renamed from: a */
        void mo39387a();
    }

    static {
        Covode.recordClassIndex(28028);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        C24677a.m47209a(this);
    }

    C23907f() {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (!C24677a.m47209a(this)) {
            try {
                if (this.f56604a != null) {
                    float f = sensorEvent.values[0];
                    double d = (double) (f / 9.80665f);
                    double d2 = (double) (sensorEvent.values[1] / 9.80665f);
                    double d3 = (double) (sensorEvent.values[2] / 9.80665f);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    Double.isNaN(d3);
                    if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.299999952316284d) {
                        this.f56604a.mo39387a();
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }
}
