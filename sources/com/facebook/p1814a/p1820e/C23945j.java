package com.facebook.p1814a.p1820e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.facebook.EnumC25029u;
import com.facebook.internal.C24783w;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.internal.p1901c.C24729a;
import com.facebook.p1814a.C23964g;
import com.facebook.p1814a.C23973h;
import com.facebook.p1814a.C23998m;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.io.File;
import java.util.Locale;

/* renamed from: com.facebook.a.e.j */
class C23945j {

    /* renamed from: a */
    private static final String f56688a = C23945j.class.getCanonicalName();

    /* renamed from: b */
    private static final long[] f56689b = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    C23945j() {
    }

    /* renamed from: a */
    private static void m45267a() {
        if (!C24677a.m47209a(C23945j.class)) {
            try {
                C24783w.m47440a(EnumC25029u.APP_EVENTS, f56688a, "Clock skew detected");
            } catch (Throwable th) {
                C24677a.m47208a(th, C23945j.class);
            }
        }
    }

    static {
        Covode.recordClassIndex(28066);
    }

    /* renamed from: a */
    private static int m45265a(long j) {
        if (C24677a.m47209a(C23945j.class)) {
            return 0;
        }
        int i = 0;
        while (true) {
            try {
                long[] jArr = f56689b;
                if (i >= jArr.length || jArr[i] >= j) {
                    return i;
                }
                i++;
            } catch (Throwable th) {
                C24677a.m47208a(th, C23945j.class);
                return 0;
            }
        }
        return i;
    }

    /* renamed from: a */
    private static String m45266a(Context context) {
        if (C24677a.m47209a(C23945j.class)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String concat = "PCKGCHKSUM;".concat(String.valueOf(packageManager.getPackageInfo(context.getPackageName(), 0).versionName));
            SharedPreferences a = C34822d.m71158a(context, "com.facebook.sdk.appEventPreferences", 0);
            String string = a.getString(concat, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String packageName = context.getPackageName();
            TextUtils.equals(packageName, C17867d.m33078a().getPackageName());
            String a2 = C23937f.m45248a(new File(packageManager.getApplicationInfo(packageName, 0).sourceDir));
            a.edit().putString(concat, a2).apply();
            return a2;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23945j.class);
            return null;
        }
    }

    /* renamed from: a */
    static void m45268a(String str, C23944i iVar, String str2) {
        String str3;
        if (!C24677a.m47209a(C23945j.class) && iVar != null) {
            try {
                Long valueOf = Long.valueOf(iVar.mo39442a() - iVar.f56683b.longValue());
                if (valueOf.longValue() < 0) {
                    valueOf = 0L;
                    m45267a();
                }
                Long valueOf2 = Long.valueOf(iVar.mo39443b());
                if (valueOf2.longValue() < 0) {
                    m45267a();
                    valueOf2 = 0L;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("fb_mobile_app_interruptions", iVar.f56684c);
                bundle.putString("fb_mobile_time_between_sessions", C1764a.m5929a(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(m45265a(valueOf.longValue()))}));
                C23946k kVar = iVar.f56686e;
                if (kVar != null) {
                    str3 = kVar.toString();
                } else {
                    str3 = "Unclassified";
                }
                bundle.putString("fb_mobile_launch_source", str3);
                bundle.putLong("_logTime", iVar.f56683b.longValue() / 1000);
                C23998m mVar = new C23998m(str, str2);
                double longValue = (double) valueOf2.longValue();
                Double.isNaN(longValue);
                mVar.mo39474a(longValue / 1000.0d);
            } catch (Throwable th) {
                C24677a.m47208a(th, C23945j.class);
            }
        }
    }

    /* renamed from: a */
    static void m45269a(String str, String str2, Context context) {
        if (!C24677a.m47209a(C23945j.class)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("fb_mobile_launch_source", "Unclassified");
                bundle.putString("fb_mobile_pckg_fp", m45266a(context));
                bundle.putString("fb_mobile_app_cert_hash", C24729a.m47357a(context));
                C23998m mVar = new C23998m(str, str2);
                mVar.mo39473a();
                if (C23973h.m45326a() != C23964g.EnumC23965a.EXPLICIT_ONLY) {
                    mVar.mo39479e();
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, C23945j.class);
            }
        }
    }
}
