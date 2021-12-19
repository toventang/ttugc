package com.bytedance.helios.api.config;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.config.a */
public final class C15330a {

    /* renamed from: a */
    public boolean f37406a;

    /* renamed from: b */
    public long f37407b;

    /* renamed from: c */
    public final Application f37408c;

    /* renamed from: d */
    public final String f37409d;

    /* renamed from: e */
    public final boolean f37410e;

    static {
        Covode.recordClassIndex(17576);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15330a)) {
            return false;
        }
        C15330a aVar = (C15330a) obj;
        return C89219l.m154714a(this.f37408c, aVar.f37408c) && C89219l.m154714a(this.f37409d, aVar.f37409d) && this.f37410e == aVar.f37410e;
    }

    public final int hashCode() {
        Application application = this.f37408c;
        int i = 0;
        int hashCode = (application != null ? application.hashCode() : 0) * 31;
        String str = this.f37409d;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f37410e;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "AppInfoModel(application=" + this.f37408c + ", channel='" + this.f37409d + "', isFirstStart=" + this.f37410e + ", isDebug=" + this.f37406a + ", versionCode=" + this.f37407b + ')';
    }

    public C15330a(Application application, String str, boolean z) {
        boolean z2;
        long j;
        C89219l.m154719c(application, "");
        C89219l.m154719c(str, "");
        this.f37408c = application;
        this.f37409d = str;
        this.f37410e = z;
        try {
            if ((application.getApplicationInfo().flags & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f37406a = z2;
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            if (Build.VERSION.SDK_INT >= 28) {
                C89219l.m154709a((Object) packageInfo, "");
                j = packageInfo.getLongVersionCode();
            } else {
                j = (long) packageInfo.versionCode;
            }
            this.f37407b = j;
        } catch (Exception unused) {
        }
    }
}
