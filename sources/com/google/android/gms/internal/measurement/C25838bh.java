package com.google.android.gms.internal.measurement;

import android.os.Binder;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.bh */
public final /* synthetic */ class C25838bh {
    static {
        Covode.recordClassIndex(31253);
    }

    /* renamed from: a */
    public static <V> V m50030a(AbstractC25837bg<V> bgVar) {
        long clearCallingIdentity;
        try {
            return bgVar.mo42196a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = bgVar.mo42196a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
