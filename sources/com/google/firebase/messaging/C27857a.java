package com.google.firebase.messaging;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.C0595i;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.messaging.a */
public final class C27857a {

    /* renamed from: a */
    static final AtomicInteger f65435a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    static {
        Covode.recordClassIndex(33450);
    }

    /* renamed from: com.google.firebase.messaging.a$a */
    public static class C27858a {

        /* renamed from: a */
        public final C0595i.C0600e f65436a;

        /* renamed from: b */
        public final String f65437b;

        /* renamed from: c */
        public final int f65438c = 0;

        static {
            Covode.recordClassIndex(33451);
        }

        C27858a(C0595i.C0600e eVar, String str) {
            this.f65436a = eVar;
            this.f65437b = str;
        }
    }

    /* renamed from: a */
    static Bundle m55770a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo a = m55769a(packageManager, str, 128);
            if (!(a == null || a.metaData == null)) {
                return a.metaData;
            }
        } catch (PackageManager.NameNotFoundException e) {
            String.valueOf(String.valueOf(e)).length();
        }
        return Bundle.EMPTY;
    }

    /* renamed from: a */
    static PendingIntent m55768a(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, f65435a.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    /* renamed from: a */
    private static boolean m55772a(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (resources.getDrawable(i, null) instanceof AdaptiveIconDrawable) {
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    static String m55773b(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (m55769a(context.getPackageManager(), context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                String.valueOf(str).length();
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                return string;
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", context.getString(context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName())), 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static ApplicationInfo m55769a(PackageManager packageManager, String str, int i) {
        if (!TextUtils.equals(str, C17867d.m33078a().getPackageName()) || i != 128) {
            return packageManager.getApplicationInfo(str, i);
        }
        if (C58014b.f132218a == null) {
            C58014b.f132218a = packageManager.getApplicationInfo(str, i);
        }
        return C58014b.f132218a;
    }

    /* renamed from: a */
    static Integer m55771a(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                String.valueOf(str).length();
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(C0643b.m2378c(context, i));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r1 == 0) goto L_0x0055;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m55767a(android.content.pm.PackageManager r3, android.content.res.Resources r4, java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "drawable"
            int r1 = r4.getIdentifier(r6, r0, r5)
            if (r1 == 0) goto L_0x0015
            boolean r0 = m55772a(r4, r1)
            if (r0 == 0) goto L_0x0015
            return r1
        L_0x0015:
            java.lang.String r0 = "mipmap"
            int r1 = r4.getIdentifier(r6, r0, r5)
            if (r1 == 0) goto L_0x0024
            boolean r0 = m55772a(r4, r1)
            if (r0 == 0) goto L_0x0024
            return r1
        L_0x0024:
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r0.length()
        L_0x002b:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            r2 = 0
            int r1 = r7.getInt(r0, r2)
            if (r1 == 0) goto L_0x003a
            boolean r0 = m55772a(r4, r1)
            if (r0 != 0) goto L_0x004f
        L_0x003a:
            android.content.pm.ApplicationInfo r0 = m55769a(r3, r5, r2)     // Catch:{ NameNotFoundException -> 0x0041 }
            int r1 = r0.icon     // Catch:{ NameNotFoundException -> 0x0041 }
            goto L_0x004d
        L_0x0041:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r0.length()
        L_0x004d:
            if (r1 == 0) goto L_0x0055
        L_0x004f:
            boolean r0 = m55772a(r4, r1)
            if (r0 != 0) goto L_0x0058
        L_0x0055:
            r1 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C27857a.m55767a(android.content.pm.PackageManager, android.content.res.Resources, java.lang.String, java.lang.String, android.os.Bundle):int");
    }
}
