package com.p2082ss.android.ugc.trill.p4379h;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: com.ss.android.ugc.trill.h.a */
public final class C85089a {
    static {
        Covode.recordClassIndex(99112);
    }

    /* renamed from: a */
    public static boolean m146303a(Context context) {
        if (m146304b(context) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m146304b(Context context) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
        } catch (Exception unused) {
            return 1;
        }
    }
}
