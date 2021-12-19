package com.ttnet.org.chromium.base;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.p4497a.C87443b;

public class BuildInfo {

    /* renamed from: m */
    static final /* synthetic */ boolean f198228m = true;

    /* renamed from: n */
    private static PackageInfo f198229n;

    /* renamed from: o */
    private static boolean f198230o;

    /* renamed from: p */
    private static String f198231p = "";

    /* renamed from: a */
    public String f198232a;

    /* renamed from: b */
    public long f198233b;

    /* renamed from: c */
    public String f198234c;

    /* renamed from: d */
    public long f198235d;

    /* renamed from: e */
    public String f198236e;

    /* renamed from: f */
    public String f198237f;

    /* renamed from: g */
    public String f198238g;

    /* renamed from: h */
    public String f198239h;

    /* renamed from: i */
    public String f198240i;

    /* renamed from: j */
    public String f198241j;

    /* renamed from: k */
    public String f198242k;

    /* renamed from: l */
    public String f198243l;

    /* renamed from: com.ttnet.org.chromium.base.BuildInfo$a */
    static class C87428a {

        /* renamed from: a */
        public static BuildInfo f198244a = new BuildInfo((byte) 0);

        static {
            Covode.recordClassIndex(103332);
        }
    }

    static {
        Covode.recordClassIndex(103331);
    }

    /* renamed from: a */
    public static boolean m151721a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    private static String[] getAll() {
        String str;
        BuildInfo buildInfo = C87428a.f198244a;
        String packageName = C87445c.f198342a.getPackageName();
        String[] strArr = new String[23];
        strArr[0] = Build.BRAND;
        strArr[1] = Build.DEVICE;
        strArr[2] = Build.ID;
        strArr[3] = Build.MANUFACTURER;
        strArr[4] = Build.MODEL;
        strArr[5] = String.valueOf(Build.VERSION.SDK_INT);
        strArr[6] = Build.TYPE;
        strArr[7] = Build.BOARD;
        strArr[8] = packageName;
        strArr[9] = String.valueOf(buildInfo.f198233b);
        strArr[10] = buildInfo.f198232a;
        strArr[11] = buildInfo.f198234c;
        strArr[12] = String.valueOf(buildInfo.f198235d);
        strArr[13] = buildInfo.f198236e;
        strArr[14] = buildInfo.f198240i;
        strArr[15] = buildInfo.f198238g;
        strArr[16] = buildInfo.f198237f;
        strArr[17] = buildInfo.f198239h;
        strArr[18] = f198231p;
        strArr[19] = buildInfo.f198242k;
        strArr[20] = buildInfo.f198243l;
        strArr[21] = buildInfo.f198241j;
        if (m151721a()) {
            str = "1";
        } else {
            str = "0";
        }
        strArr[22] = str;
        return strArr;
    }

    private BuildInfo() {
        String str;
        this.f198232a = "";
        this.f198234c = "";
        this.f198236e = "";
        this.f198237f = "";
        this.f198238g = "";
        this.f198239h = "";
        this.f198240i = "";
        this.f198241j = "";
        this.f198242k = "";
        this.f198243l = "";
        f198230o = true;
        try {
            Context context = C87445c.f198342a;
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            long a = m151719a(packageInfo);
            this.f198233b = a;
            PackageInfo packageInfo2 = f198229n;
            PackageInfo packageInfo3 = null;
            if (packageInfo2 != null) {
                this.f198234c = packageInfo2.packageName;
                this.f198235d = m151719a(f198229n);
                this.f198236e = m151720a(f198229n.versionName);
                f198229n = null;
            } else {
                this.f198234c = packageName;
                this.f198235d = a;
                this.f198236e = m151720a(packageInfo.versionName);
            }
            this.f198232a = m151720a(packageManager.getApplicationLabel(packageInfo.applicationInfo));
            this.f198237f = m151720a(packageManager.getInstallerPackageName(this.f198234c));
            try {
                packageInfo3 = packageManager.getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo3 != null) {
                str = String.valueOf(m151719a(packageInfo3));
            } else {
                str = "gms versionCode not available.";
            }
            this.f198238g = str;
            String str2 = "true";
            try {
                packageManager.getPackageInfo("projekt.substratum", 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str2 = "false";
            }
            this.f198242k = str2;
            String str3 = "Not Enabled";
            if (C87444b.f198340d != 0) {
                try {
                    str3 = C87445c.f198342a.getString(C87444b.f198340d);
                } catch (Exception unused3) {
                    str3 = "Not found";
                }
            }
            this.f198243l = str3;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f198239h = TextUtils.join(", ", Build.SUPPORTED_ABIS);
            } else {
                this.f198239h = C1764a.m5928a("ABI1: %s, ABI2: %s", new Object[]{Build.CPU_ABI, Build.CPU_ABI2});
            }
            this.f198241j = C1764a.m5928a("@%x_%x", new Object[]{Long.valueOf(this.f198235d), Long.valueOf(packageInfo.lastUpdateTime)});
            this.f198240i = Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), 128));
        } catch (Exception e) {
            C87457f.m151789c("BuildInfo", "NameNotFoundException: ".concat(String.valueOf(e)), new Object[0]);
        }
    }

    /* synthetic */ BuildInfo(byte b) {
        this();
    }

    /* renamed from: a */
    private static long m151719a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C87443b.m151774a(packageInfo);
        }
        return (long) packageInfo.versionCode;
    }

    /* renamed from: a */
    private static String m151720a(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }
}
