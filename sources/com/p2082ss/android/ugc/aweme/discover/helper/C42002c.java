package com.p2082ss.android.ugc.aweme.discover.helper;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17234b;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2798a.p2802b.p2803a.C42618a;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.c */
public final class C42002c {

    /* renamed from: a */
    public static final C42002c f97951a = new C42002c();

    private C42002c() {
    }

    static {
        Covode.recordClassIndex(49932);
    }

    /* renamed from: a */
    public static final boolean m84070a(C42618a aVar) {
        if (aVar == null || aVar.mo72817a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final int m84069a(Activity activity, C42618a aVar, boolean z) {
        double d;
        double d2;
        if (activity == null) {
            return -2;
        }
        if (aVar == null || aVar.mo72817a()) {
            if (!z) {
                return -2;
            }
        } else if (!z) {
            d = (double) C17234b.m31808b(activity);
            d2 = 0.75d;
            Double.isNaN(d);
            return (int) (d * d2);
        }
        d = (double) C17234b.m31808b(activity);
        d2 = 0.9d;
        Double.isNaN(d);
        return (int) (d * d2);
    }
}
