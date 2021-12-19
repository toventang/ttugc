package com.p2082ss.android.ugc.aweme.account.p2274n;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.GoogleApiAvailability;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.ss.android.ugc.aweme.account.n.f */
public final class C32856f {
    static {
        Covode.recordClassIndex(39641);
    }

    /* renamed from: a */
    public static boolean m67455a(Context context) {
        if (m67456b(context) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static int m67456b(Context context) {
        try {
            GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            return instance.isGooglePlayServicesAvailable(applicationContext);
        } catch (Exception unused) {
            return 1;
        }
    }
}
