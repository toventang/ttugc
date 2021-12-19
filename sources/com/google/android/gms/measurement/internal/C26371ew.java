package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;

/* renamed from: com.google.android.gms.measurement.internal.ew */
public final class C26371ew {

    /* renamed from: a */
    public final AbstractC26370ev f61957a;

    static {
        Covode.recordClassIndex(31793);
    }

    public C26371ew(AbstractC26370ev evVar) {
        C25565r.m49314a(evVar);
        this.f61957a = evVar;
    }

    /* renamed from: a */
    public static boolean m51831a(Context context) {
        ActivityInfo receiverInfo;
        C25565r.m49314a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
