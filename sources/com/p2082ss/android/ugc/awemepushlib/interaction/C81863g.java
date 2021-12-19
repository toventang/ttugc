package com.p2082ss.android.ugc.awemepushlib.interaction;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.awemepushlib.p4251f.C81835d;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.g */
public final class C81863g {

    /* renamed from: a */
    public static int f183025a = 3;

    /* renamed from: b */
    public static final Map<String, Integer> f183026b = new HashMap<String, Integer>() {
        /* class com.p2082ss.android.ugc.awemepushlib.interaction.C81863g.C818641 */

        static {
            Covode.recordClassIndex(95278);
        }

        {
            put("digg_push", Integer.valueOf((int) R.string.foh));
            put("comment_push", Integer.valueOf((int) R.string.fod));
            put("follow_push", Integer.valueOf((int) R.string.fof));
            put("mention_push", Integer.valueOf((int) R.string.fok));
            put("im_push", Integer.valueOf((int) R.string.foe));
            put("follow_new_video_push", Integer.valueOf((int) R.string.fov));
            put("recommend_video_push", Integer.valueOf((int) R.string.fow));
            put("live_push", Integer.valueOf((int) R.string.foi));
            put("other_channel", Integer.valueOf((int) R.string.foo));
        }
    };

    static {
        Covode.recordClassIndex(95277);
    }

    /* renamed from: a */
    public static void m141765a(Context context) {
        if (Build.VERSION.SDK_INT >= 26 && context != null) {
            m141769b(context);
        }
    }

    /* renamed from: b */
    public static void m141769b(Context context) {
        NotificationManager notificationManager = (NotificationManager) m141762a(context, "notification");
        m141766a(context, notificationManager, f183026b);
        m141764a(notificationManager, "com.ss.android.ugc.aweme.server");
        m141764a(notificationManager, "com.ss.android.ugc.aweme.server.important.low");
    }

    /* renamed from: a */
    private static boolean m141767a(String str) {
        if (!C81835d.m141731b()) {
            return true;
        }
        String[] c = C81835d.m141732c();
        Arrays.toString(c);
        if (c.length != 0) {
            return m141768a(c, str);
        }
        return true;
    }

    /* renamed from: a */
    private static void m141764a(NotificationManager notificationManager, String str) {
        if (Build.VERSION.SDK_INT >= 26 && notificationManager != null && notificationManager.getNotificationChannel(str) != null) {
            notificationManager.deleteNotificationChannel(str);
        }
    }

    /* renamed from: a */
    public static Object m141762a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10356);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(10356);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static String m141763a(String str, int i) {
        m141767a(str);
        if (i == 0) {
            int a = C81835d.m141729a();
            if (a != 0 && m141767a(str)) {
                return str + "_associated_" + a;
            }
            return str;
        } else if (m141767a(str)) {
            return str + "_associated_" + i;
        } else {
            return str;
        }
    }

    /* renamed from: a */
    private static boolean m141768a(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m141766a(Context context, NotificationManager notificationManager, Map<String, Integer> map) {
        if (Build.VERSION.SDK_INT >= 26 && notificationManager != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                NotificationChannel a = m141761a(entry.getKey(), context, context.getString(entry.getValue().intValue()), notificationManager);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            notificationManager.createNotificationChannels(arrayList);
        }
    }

    /* renamed from: a */
    private static NotificationChannel m141761a(String str, Context context, String str2, NotificationManager notificationManager) {
        String str3;
        Uri a;
        if (Build.VERSION.SDK_INT < 26 || notificationManager == null) {
            return null;
        }
        int a2 = C81835d.m141729a();
        if (a2 == 0 || !m141767a(str)) {
            a2 = 0;
            str3 = str;
        } else {
            str3 = str + "_associated_" + a2;
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str3);
        if (notificationChannel == null) {
            notificationChannel = new NotificationChannel(str3, str2, 4);
            notificationChannel.enableLights(true);
            notificationChannel.enableVibration(true);
            notificationChannel.setLockscreenVisibility(1);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLightColor(-16711936);
            if (!(Build.VERSION.SDK_INT < 26 || a2 == 0 || (a = C81835d.m141730a(context, a2)) == null)) {
                notificationChannel.setSound(a, null);
            }
        }
        for (int i = 0; i <= f183025a; i++) {
            if (i != a2) {
                String str4 = i != 0 ? str + "_associated_" + i : str;
                if (notificationManager.getNotificationChannel(str4) != null) {
                    notificationManager.deleteNotificationChannel(str4);
                }
            }
        }
        return notificationChannel;
    }
}
