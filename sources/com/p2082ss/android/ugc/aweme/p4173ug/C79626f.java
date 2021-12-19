package com.p2082ss.android.ugc.aweme.p4173ug;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.ug.f */
public final class C79626f {

    /* renamed from: b */
    public static final C79626f f178662b = new C79626f();

    /* renamed from: c */
    public static final C79627a f178663c = new C79627a((byte) 0);

    /* renamed from: a */
    public final Keva f178664a = Keva.getRepo("first_install_version");

    /* renamed from: d */
    private long f178665d;

    /* renamed from: com.ss.android.ugc.aweme.ug.f$a */
    public static final class C79627a {
        static {
            Covode.recordClassIndex(92839);
        }

        private C79627a() {
        }

        public /* synthetic */ C79627a(byte b) {
            this();
        }
    }

    private C79626f() {
    }

    static {
        Covode.recordClassIndex(92838);
    }

    /* renamed from: a */
    public final long mo123172a() {
        long j;
        PackageInfo packageInfo;
        long j2 = this.f178665d;
        if (j2 != 0) {
            return j2;
        }
        Context a = C17867d.m33078a();
        if (a != null) {
            try {
                PackageManager packageManager = a.getPackageManager();
                if (!(packageManager == null || (packageInfo = packageManager.getPackageInfo(a.getPackageName(), 0)) == null)) {
                    j = packageInfo.firstInstallTime;
                    this.f178665d = j;
                    return j;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }
        j = 0;
        this.f178665d = j;
        return j;
    }
}
