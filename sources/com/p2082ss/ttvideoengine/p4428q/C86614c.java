package com.p2082ss.ttvideoengine.p4428q;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.networkpredictor.ISpeedPredictor;

/* renamed from: com.ss.ttvideoengine.q.c */
public final class C86614c {

    /* renamed from: a */
    public static ISpeedPredictor f195159a;

    /* renamed from: b */
    public static ISpeedPredictor f195160b;

    static {
        Covode.recordClassIndex(101842);
    }

    /* renamed from: a */
    public static void m150011a(int i) {
        ISpeedPredictor iSpeedPredictor = f195159a;
        if (iSpeedPredictor != null) {
            iSpeedPredictor.setSpeedQueueSize(i);
        }
    }
}
