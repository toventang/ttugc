package com.facebook.p1814a.p1820e;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.a.e.b */
public class C23929b {
    static {
        Covode.recordClassIndex(28050);
    }

    /* renamed from: a */
    public static String m45242a() {
        C24699ae.m47299a();
        Context context = C24872m.f59047g;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static double m45240a(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(C24693ad.m47276d()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    /* renamed from: a */
    public static View m45241a(Activity activity) {
        if (C24677a.m47209a(C23929b.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23929b.class);
            return null;
        }
    }
}
