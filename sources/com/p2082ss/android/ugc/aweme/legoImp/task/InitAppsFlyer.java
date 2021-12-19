package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.C1764a;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.experiment.C47029j;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.utils.C80625r;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitAppsFlyer */
public class InitAppsFlyer implements AbstractC58264w {

    /* renamed from: a */
    private static final String f132847a = "wiMmKJ9xudwzNqJW6HoM2g";

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    static {
        Covode.recordClassIndex(68467);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        if (C47029j.m90292b()) {
            return EnumC58151ae.BACKGROUND;
        }
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    /* renamed from: c */
    private static boolean m105790c() {
        String packageName = C17867d.m33078a().getPackageName();
        if (!m105791d() || m105788a(packageName)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m105791d() {
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m105789b(Context context) {
        try {
            SharedPreferences a = C34822d.m71158a(context, "preinsatll_appflyer", 0);
            if (a.contains("is_microsoft_dou")) {
                return a.getBoolean("is_microsoft_dou", false);
            }
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                boolean hasSystemFeature = packageManager.hasSystemFeature("com.microsoft.device.display.displaymask");
                a.edit().putBoolean("is_microsoft_dou", hasSystemFeature).apply();
                return hasSystemFeature;
            }
            a.edit().putBoolean("is_microsoft_dou", false).apply();
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static boolean m105788a(String str) {
        boolean z;
        try {
            z = ((Boolean) Class.forName("miui.os.MiuiInit").getMethod("isPreinstalledPackage", String.class).invoke(null, str)).booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        C1764a.m5928a("app %s is preinstalled app %s", new Object[]{str, Boolean.valueOf(z)});
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011e, code lost:
        if (r12 != false) goto L_0x0153;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004a  */
    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28600a(android.content.Context r15) {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.legoImp.task.InitAppsFlyer.mo28600a(android.content.Context):void");
    }

    /* renamed from: a */
    static void m105787a(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        AppsFlyerLib.getInstance().init(f132847a, appsFlyerConversionListener, context);
        try {
            AppsFlyerLib.getInstance().setCollectIMEI(false);
            AppsFlyerLib.getInstance().setCollectOaid(false);
            if (C39223a.m79590d().mo68622g()) {
                AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
            }
            C80625r.f180271a = true;
            C80625r.m139793a();
        } catch (Exception unused) {
        }
    }
}
