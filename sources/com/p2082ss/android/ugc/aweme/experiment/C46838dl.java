package com.p2082ss.android.ugc.aweme.experiment;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.dl */
public final class C46838dl {

    /* renamed from: a */
    public static final C46838dl f109118a = new C46838dl();

    /* renamed from: b */
    private static final int f109119b = 1;

    /* renamed from: c */
    private static long f109120c;

    private C46838dl() {
    }

    static {
        Covode.recordClassIndex(55439);
    }

    /* renamed from: a */
    public static final boolean m90154a() {
        boolean z;
        if (System.currentTimeMillis() - m90155b() <= TimeUnit.DAYS.toMillis(7)) {
            z = true;
        } else {
            z = false;
        }
        Boolean a = C49907s.m93685a();
        C89219l.m154716b(a, "");
        if (a.booleanValue() || z) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static long m90155b() {
        long j;
        PackageInfo packageInfo;
        long j2 = f109120c;
        if (j2 != 0) {
            return j2;
        }
        Context a = C17867d.m33078a();
        if (a != null) {
            try {
                PackageManager packageManager = a.getPackageManager();
                if (!(packageManager == null || (packageInfo = packageManager.getPackageInfo(a.getPackageName(), 0)) == null)) {
                    j = packageInfo.firstInstallTime;
                    f109120c = j;
                    return j;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }
        j = 0;
        f109120c = j;
        return j;
    }
}
