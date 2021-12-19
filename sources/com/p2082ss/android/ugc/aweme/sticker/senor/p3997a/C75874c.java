package com.p2082ss.android.ugc.aweme.sticker.senor.p3997a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.senor.AbstractC75877c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.senor.a.c */
public final class C75874c extends AbstractC75867a {

    /* renamed from: c */
    private final AbstractC75877c f170423c;

    static {
        Covode.recordClassIndex(88808);
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        C89219l.m154721d(sensor, "");
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        C89219l.m154721d(sensorEvent, "");
        int i2 = 0;
        float f = sensorEvent.values[0];
        float f2 = sensorEvent.values[1];
        float[] fArr = sensorEvent.values;
        if (f2 > 0.0f && Math.abs(f) < f2) {
            i = 0;
        } else if (f > 0.0f && Math.abs(f2) < f) {
            i = 270;
        } else if (f2 >= 0.0f || Math.abs(f) >= (-f2)) {
            i = 90;
        } else {
            i = LiveFeedRefreshTimeSetting.DEFAULT;
        }
        if (!TextUtils.equals(Build.MODEL, "vivo X9")) {
            i2 = i;
        }
        if (this.f170413a) {
            this.f170423c.mo23149a((float) i2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75874c(AbstractC75877c cVar, boolean z) {
        super(z);
        C89219l.m154721d(cVar, "");
        this.f170423c = cVar;
    }
}
