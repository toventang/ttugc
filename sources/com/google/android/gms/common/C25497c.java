package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.p1938c.C25500c;
import com.google.android.gms.common.util.C25606h;

/* renamed from: com.google.android.gms.common.c */
public class C25497c {
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = C25504g.f60486b;
    private static final C25497c zzab = new C25497c();

    public boolean isUserResolvableError(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    C25497c() {
    }

    public static C25497c getInstance() {
        return zzab;
    }

    static {
        Covode.recordClassIndex(30896);
    }

    public int getApkVersion(Context context) {
        return C25504g.m49189e(context);
    }

    public Intent getErrorResolutionIntent(int i) {
        return getErrorResolutionIntent(null, i, null);
    }

    public String getErrorString(int i) {
        return ConnectionResult.m48700a(i);
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public void cancelAvailabilityErrorNotifications(Context context) {
        if (!C25504g.f60487c.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) C25504g.m49183a(context, "notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    public boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        return C25504g.m49185b(context, i);
    }

    public boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        return C25504g.m49186b(context, str);
    }

    public int isGooglePlayServicesAvailable(Context context, int i) {
        int a = C25504g.m49180a(context, i);
        if (C25504g.m49185b(context, a)) {
            return 18;
        }
        return a;
    }

    private static String zza(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C25500c.f60481a.mo41741a(context).mo41740b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return getErrorResolutionPendingIntent(context, i, i2, null);
    }

    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context == null || !C25606h.m49415b(context)) {
                String zza = zza(context, str);
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(zza)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", zza);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2, String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, errorResolutionIntent, 134217728);
    }
}
