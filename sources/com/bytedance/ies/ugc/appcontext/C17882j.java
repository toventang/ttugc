package com.bytedance.ies.ugc.appcontext;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.appcontext.j */
public final class C17882j {
    static {
        Covode.recordClassIndex(20483);
    }

    /* renamed from: a */
    public static final C17867d.C17870c m33115a(Context context) {
        PackageInfo packageInfo;
        String str = "";
        C89219l.m154721d(context, str);
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception e) {
            e.printStackTrace();
            packageInfo = null;
        }
        long j = -1;
        if (packageInfo != null) {
            String str2 = packageInfo.versionName;
            C89219l.m154716b(str2, str);
            j = (long) packageInfo.versionCode;
            str = str2;
        }
        return new C17867d.C17870c(j, str);
    }

    /* renamed from: b */
    public static final C17867d.C17868a m33117b(Context context) {
        String str;
        long j;
        C89219l.m154721d(context, "");
        String i = C17867d.m33088i();
        long h = C17867d.m33087h();
        try {
            str = (String) C17883k.m33118a(context, "SS_VERSION_NAME");
            C89219l.m154716b(str, "");
        } catch (Throwable unused) {
            str = i;
        }
        try {
            h = (long) C17883k.m33120b(context, "SS_VERSION_CODE");
        } catch (Throwable unused2) {
        }
        try {
            j = (long) C17883k.m33120b(context, "UPDATE_VERSION_CODE");
        } catch (Throwable unused3) {
            j = -1;
        }
        return new C17867d.C17868a(h, str, j);
    }

    /* renamed from: a */
    public static final String m33116a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        try {
            Object a = C17880h.m33107a(context).mo28459a(str);
            if (!(a instanceof String)) {
                return "";
            }
            return (String) a;
        } catch (Exception unused) {
            return null;
        }
    }
}
