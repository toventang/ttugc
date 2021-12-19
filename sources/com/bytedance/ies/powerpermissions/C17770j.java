package com.bytedance.ies.powerpermissions;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerpermissions.p1239b.C17747a;
import com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.j */
public final class C17770j {

    /* renamed from: a */
    public static final C17770j f42432a = new C17770j();

    private C17770j() {
    }

    static {
        Covode.recordClassIndex(20334);
    }

    /* renamed from: a */
    public static boolean m32953a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m32961b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m32963c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m32964d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m32965e() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static Intent m32958b(Context context) {
        C89219l.m154719c(context, "");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        return intent;
    }

    /* renamed from: a */
    public static boolean m32955a(Context context) {
        C89219l.m154719c(context, "");
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 24) {
            return ((NotificationManager) context.getSystemService(NotificationManager.class)).areNotificationsEnabled();
        }
        if (!m32965e()) {
            return true;
        }
        Object c = m32962c(context, "appops");
        if (c != null) {
            try {
                Method method = c.getClass().getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class);
                Object obj = c.getClass().getDeclaredField("OP_POST_NOTIFICATION").get(Integer.TYPE);
                if (obj != null) {
                    Object invoke = method.invoke(c, Integer.valueOf(((Integer) obj).intValue()), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName());
                    if (invoke != null) {
                        if (((Integer) invoke).intValue() == 0) {
                            z = true;
                        }
                        return z;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                return true;
            }
        } else {
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: b */
    public static void m32959b(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static boolean m32956a(Context context, Intent intent) {
        C89219l.m154719c(context, "");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        C89219l.m154709a((Object) queryIntentActivities, "");
        if (!queryIntentActivities.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m32957a(Context context, String str) {
        AbstractC17752a a;
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        if (!m32965e()) {
            return true;
        }
        if (C17741a.m32881b(str) && (a = C17741a.m32880a(str)) != null) {
            return a.mo28235a((Activity) context);
        }
        if (C0643b.m2367a(context, str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m32954a(Activity activity, String str) {
        boolean z;
        AbstractC17752a a;
        C89219l.m154719c(activity, "");
        C89219l.m154719c(str, "");
        if (!m32965e()) {
            return false;
        }
        if (!C17741a.m32881b(str) || (a = C17741a.m32880a(str)) == null) {
            if (activity.checkSelfPermission(str) == -1) {
                z = true;
            } else {
                z = false;
            }
            boolean shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
            boolean a2 = C17747a.m32890a(str);
            if (!z || shouldShowRequestPermissionRationale || !a2) {
                return false;
            }
            return true;
        } else if (!a.mo28236b(activity) || !C17747a.m32890a(str)) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public static void m32960b(Context context, String str) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        AbstractC17752a a = C17741a.m32880a(str);
        if (a != null) {
            Intent a2 = a.mo28233a(context);
            if (a2 == null) {
                a2 = m32958b(context);
            }
            m32959b(context, a2);
            return;
        }
        m32959b(context, m32958b(context));
    }

    /* renamed from: c */
    private static Object m32962c(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(225);
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
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(225);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
