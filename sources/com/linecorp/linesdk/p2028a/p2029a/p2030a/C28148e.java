package com.linecorp.linesdk.p2028a.p2029a.p2030a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

/* renamed from: com.linecorp.linesdk.a.a.a.e */
final class C28148e {

    /* renamed from: a */
    private final PackageInfo f65871a;

    /* renamed from: b */
    private final String f65872b;

    /* renamed from: c */
    private String f65873c;

    static {
        Covode.recordClassIndex(34089);
    }

    /* renamed from: a */
    public final String mo48137a() {
        String str;
        String str2 = this.f65873c;
        if (str2 != null) {
            return str2;
        }
        PackageInfo packageInfo = this.f65871a;
        String str3 = "UNK";
        if (packageInfo == null) {
            str = str3;
        } else {
            str = packageInfo.packageName;
        }
        PackageInfo packageInfo2 = this.f65871a;
        if (packageInfo2 != null) {
            str3 = packageInfo2.versionName;
        }
        Locale locale = Locale.getDefault();
        String str4 = str + "/" + str3 + " ChannelSDK/" + this.f65872b + " (Linux; U; Android " + Build.VERSION.RELEASE + "; " + locale.getLanguage() + "-" + locale.getCountry() + "; " + Build.MODEL + " Build/" + Build.ID + ")";
        this.f65873c = str4;
        return str4;
    }

    /* renamed from: a */
    private static PackageInfo m56261a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            throw null;
        }
    }

    C28148e(Context context, String str) {
        this.f65871a = m56261a(context);
        this.f65872b = str;
    }
}
