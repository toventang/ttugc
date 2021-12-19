package com.p2082ss.android.vesdk.utils;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.vesdk.utils.a */
public final class C85577a {
    static {
        Covode.recordClassIndex(99761);
    }

    /* renamed from: a */
    public static float[] m147482a(List<Float> list) {
        if (list == null || list.isEmpty()) {
            return new float[0];
        }
        float[] fArr = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            fArr[i] = list.get(i).floatValue();
        }
        return fArr;
    }
}
