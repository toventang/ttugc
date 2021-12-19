package com.google.p1970ar.core;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.p1970ar.core.ArCoreApk;
import com.google.p1970ar.core.exceptions.FatalException;
import com.google.p1970ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p1970ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.google.ar.core.z */
final class C27117z extends ArCoreApk {

    /* renamed from: a */
    static final C27117z f64185a = new C27117z();

    /* renamed from: b */
    Exception f64186b;

    /* renamed from: c */
    boolean f64187c = true;

    /* renamed from: d */
    ArCoreApk.Availability f64188d;

    /* renamed from: e */
    boolean f64189e;

    /* renamed from: f */
    private boolean f64190f;

    /* renamed from: g */
    private int f64191g;

    /* renamed from: h */
    private long f64192h;

    /* renamed from: i */
    private C27088ak f64193i;

    /* renamed from: j */
    private boolean f64194j;

    /* renamed from: k */
    private boolean f64195k;

    /* renamed from: l */
    private int f64196l;

    C27117z() {
    }

    /* renamed from: b */
    private static boolean m53870b() {
        return Build.VERSION.SDK_INT >= 24;
    }

    static {
        Covode.recordClassIndex(32697);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo45156a() {
        MethodCollector.m26663i(8937);
        if (this.f64186b == null) {
            this.f64191g = 0;
        }
        this.f64190f = false;
        C27088ak akVar = this.f64193i;
        if (akVar != null) {
            akVar.mo45125a();
            this.f64193i = null;
            MethodCollector.m26664o(8937);
            return;
        }
        MethodCollector.m26664o(8937);
    }

    /* renamed from: c */
    private final boolean m53872c(Context context) {
        m53874e(context);
        return this.f64195k;
    }

    /* renamed from: a */
    private static final ArCoreApk.InstallStatus m53869a(Activity activity) {
        PendingIntent a = C27100i.m53866a(activity);
        if (a != null) {
            try {
                activity.startIntentSender(a.getIntentSender(), null, 0, 0, 0);
                return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
            } catch (IntentSender.SendIntentException | RuntimeException unused) {
            }
        }
        return ArCoreApk.InstallStatus.INSTALLED;
    }

    /* renamed from: b */
    private boolean m53871b(Context context) {
        m53874e(context);
        if (m53873d(context) == 0 || m53873d(context) >= this.f64196l) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static int m53873d(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i = packageInfo.versionCode;
            if (i != 0) {
                return i;
            }
            if (packageInfo.services == null || packageInfo.services.length == 0) {
                return -1;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C27088ak mo45155a(Context context) {
        C27088ak akVar;
        MethodCollector.m26663i(8936);
        if (this.f64193i == null) {
            C27088ak akVar2 = new C27088ak((byte) 0);
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c) {
                if (applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
            }
            akVar2.mo45126a(applicationContext);
            this.f64193i = akVar2;
        }
        akVar = this.f64193i;
        MethodCollector.m26664o(8936);
        return akVar;
    }

    /* renamed from: e */
    private final synchronized void m53874e(Context context) {
        ApplicationInfo applicationInfo;
        String str;
        MethodCollector.m26663i(8939);
        if (this.f64194j) {
            MethodCollector.m26664o(8939);
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            if (TextUtils.equals(packageName, C17867d.m33078a().getPackageName())) {
                if (C58014b.f132218a == null) {
                    C58014b.f132218a = packageManager.getApplicationInfo(packageName, 128);
                }
                applicationInfo = C58014b.f132218a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle.containsKey("com.google.ar.core")) {
                String string = bundle.getString("com.google.ar.core");
                string.getClass();
                this.f64195k = string.equals("required");
                if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                    this.f64196l = bundle.getInt("com.google.ar.core.min_apk_version");
                    try {
                        ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 1).activities;
                        String canonicalName = InstallActivity.class.getCanonicalName();
                        for (ActivityInfo activityInfo : activityInfoArr) {
                            if (canonicalName.equals(activityInfo.name)) {
                                this.f64194j = true;
                                MethodCollector.m26664o(8939);
                                return;
                            }
                        }
                        String valueOf = String.valueOf(canonicalName);
                        if (valueOf.length() != 0) {
                            str = "Application manifest must contain activity ".concat(valueOf);
                        } else {
                            str = new String("Application manifest must contain activity ");
                        }
                        FatalException fatalException = new FatalException(str);
                        MethodCollector.m26664o(8939);
                        throw fatalException;
                    } catch (PackageManager.NameNotFoundException e) {
                        FatalException fatalException2 = new FatalException("Could not load application package info", e);
                        MethodCollector.m26664o(8939);
                        throw fatalException2;
                    }
                } else {
                    FatalException fatalException3 = new FatalException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
                    MethodCollector.m26664o(8939);
                    throw fatalException3;
                }
            } else {
                FatalException fatalException4 = new FatalException("Application manifest must contain meta-data com.google.ar.core");
                MethodCollector.m26664o(8939);
                throw fatalException4;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            FatalException fatalException5 = new FatalException("Could not load application package metadata", e2);
            MethodCollector.m26664o(8939);
            throw fatalException5;
        }
    }

    @Override // com.google.p1970ar.core.ArCoreApk
    public final ArCoreApk.Availability checkAvailability(Context context) {
        ArCoreApk.Availability availability;
        MethodCollector.m26663i(8794);
        if (!m53870b()) {
            ArCoreApk.Availability availability2 = ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
            MethodCollector.m26664o(8794);
            return availability2;
        }
        try {
            if (m53871b(context)) {
                mo45156a();
                try {
                    if (C27100i.m53866a(context) != null) {
                        availability = ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD;
                    } else {
                        availability = ArCoreApk.Availability.SUPPORTED_INSTALLED;
                    }
                } catch (UnavailableDeviceNotCompatibleException unused) {
                    availability = ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
                } catch (UnavailableUserDeclinedInstallationException | RuntimeException unused2) {
                    availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                }
                MethodCollector.m26664o(8794);
                return availability;
            }
            synchronized (this) {
                try {
                    ArCoreApk.Availability availability3 = this.f64188d;
                    if ((availability3 == null || availability3.isUnknown()) && !this.f64189e) {
                        this.f64189e = true;
                        C27116y yVar = new C27116y(this);
                        if (m53871b(context)) {
                            yVar.mo45119a(ArCoreApk.Availability.SUPPORTED_INSTALLED);
                        } else if (m53873d(context) != -1) {
                            yVar.mo45119a(ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD);
                        } else if (m53872c(context)) {
                            yVar.mo45119a(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
                        } else {
                            mo45155a(context).mo45127a(context, yVar);
                        }
                    }
                    ArCoreApk.Availability availability4 = this.f64188d;
                    if (availability4 != null) {
                        return availability4;
                    }
                    if (this.f64189e) {
                        ArCoreApk.Availability availability5 = ArCoreApk.Availability.UNKNOWN_CHECKING;
                        MethodCollector.m26664o(8794);
                        return availability5;
                    }
                    ArCoreApk.Availability availability6 = ArCoreApk.Availability.UNKNOWN_ERROR;
                    MethodCollector.m26664o(8794);
                    return availability6;
                } finally {
                    MethodCollector.m26664o(8794);
                }
            }
        } catch (FatalException unused3) {
            ArCoreApk.Availability availability7 = ArCoreApk.Availability.UNKNOWN_ERROR;
            MethodCollector.m26664o(8794);
            return availability7;
        }
    }

    @Override // com.google.p1970ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z) {
        ArCoreApk.InstallBehavior installBehavior;
        ArCoreApk.UserMessageType userMessageType;
        if (m53872c(activity)) {
            installBehavior = ArCoreApk.InstallBehavior.REQUIRED;
        } else {
            installBehavior = ArCoreApk.InstallBehavior.OPTIONAL;
        }
        if (m53872c(activity)) {
            userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        } else {
            userMessageType = ArCoreApk.UserMessageType.USER_ALREADY_INFORMED;
        }
        return requestInstall(activity, z, installBehavior, userMessageType);
    }

    @Override // com.google.p1970ar.core.ArCoreApk
    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z, ArCoreApk.InstallBehavior installBehavior, ArCoreApk.UserMessageType userMessageType) {
        if (!m53870b()) {
            throw new UnavailableDeviceNotCompatibleException();
        } else if (m53871b(activity)) {
            mo45156a();
            return m53869a(activity);
        } else if (this.f64190f) {
            return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
        } else {
            Exception exc = this.f64186b;
            if (exc != null) {
                if (z) {
                    this.f64186b = null;
                } else if (exc instanceof UnavailableDeviceNotCompatibleException) {
                    throw exc;
                } else if (exc instanceof UnavailableUserDeclinedInstallationException) {
                    throw exc;
                } else if (exc instanceof RuntimeException) {
                    throw exc;
                } else {
                    throw new RuntimeException("Unexpected exception type", exc);
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f64192h > 5000) {
                this.f64191g = 0;
            }
            int i = this.f64191g + 1;
            this.f64191g = i;
            this.f64192h = uptimeMillis;
            if (i <= 2) {
                try {
                    Intent putExtra = new Intent(activity, InstallActivity.class).putExtra("message", userMessageType).putExtra("behavior", installBehavior);
                    C84349a.m145093a(putExtra, activity);
                    activity.startActivity(putExtra);
                    this.f64190f = true;
                    return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
                } catch (ActivityNotFoundException e) {
                    throw new FatalException("Failed to launch InstallActivity", e);
                }
            } else {
                throw new FatalException("Requesting ARCore installation too rapidly.");
            }
        }
    }
}
