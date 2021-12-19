package com.bytedance.android.live.broadcast.api.p185c;

import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.p425aa.C6497a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.api.c.d */
public final class C3053d {
    static {
        Covode.recordClassIndex(3531);
    }

    /* renamed from: a */
    public static final C6497a m8363a(C6497a aVar) {
        C89219l.m154721d(aVar, "");
        return aVar.mo12624a("LiveBroadcastBusinessLog");
    }

    /* renamed from: b */
    public static final C6497a m8364b(C6497a aVar) {
        C89219l.m154721d(aVar, "");
        return m8365c(aVar.mo12631a(C6501b.C6502a.m13948a("").mo12659d()));
    }

    /* renamed from: c */
    private static C6497a m8365c(C6497a aVar) {
        C89219l.m154721d(aVar, "");
        Float valueOf = Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue());
        C89219l.m154721d("device_score", "");
        if (valueOf == null || Float.isNaN(valueOf.floatValue()) || Float.isInfinite(valueOf.floatValue())) {
            aVar.f16145a.put("device_score", Float.valueOf(0.0f));
            aVar.f16146b.put("device_score", Float.valueOf(0.0f));
        } else {
            aVar.f16145a.put("device_score", valueOf);
            aVar.f16146b.put("device_score", valueOf);
        }
        return aVar;
    }
}
