package com.bytedance.ies.dmt.p1194ui.p1199e;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17233a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: com.bytedance.ies.dmt.ui.e.a */
public final class C17226a {

    /* renamed from: a */
    private int f41139a = 1;

    /* renamed from: b */
    private int f41140b;

    /* renamed from: c */
    private int f41141c;

    /* renamed from: d */
    private long f41142d;

    /* renamed from: e */
    private int f41143e;

    /* renamed from: f */
    private int f41144f;

    /* renamed from: g */
    private String f41145g;

    /* renamed from: h */
    private Context f41146h;

    static {
        Covode.recordClassIndex(19687);
    }

    /* renamed from: b */
    public static int m31792b() {
        if (C17233a.f41165a) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo27250a() {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ComponentName componentName;
        C51423a.m95784a(3, null, "start to show toast!");
        try {
            if (this.f41146h != null) {
                C51423a.m95784a(3, null, "context check!");
                if (!TextUtils.isEmpty(this.f41145g)) {
                    C51423a.m95784a(3, null, "content check!");
                    Context context = this.f41146h;
                    String packageName = context.getPackageName();
                    if (!C13627m.m24498a(packageName)) {
                        ActivityManager activityManager = (ActivityManager) m31791a(context, "activity");
                        if (Build.VERSION.SDK_INT < 21) {
                            Pair<Boolean, Object> a = C15346a.m28238a(activityManager, new Object[]{1}, 101301, "java.util.List", false, null);
                            if (((Boolean) a.first).booleanValue()) {
                                runningTasks = (List) a.second;
                            } else {
                                runningTasks = activityManager.getRunningTasks(1);
                                C15346a.m28240a(runningTasks, activityManager, new Object[]{1}, 101301, "com_bytedance_ies_dmt_ui_toast_DmtToast_android_app_ActivityManager_getRunningTasks(Landroid/app/ActivityManager;I)Ljava/util/List;");
                            }
                            if (runningTasks.isEmpty() || (componentName = runningTasks.get(0).topActivity) == null || !packageName.equals(componentName.getPackageName())) {
                                return;
                            }
                        } else {
                            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                            if (runningAppProcesses != null) {
                                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                    if (runningAppProcessInfo == null || runningAppProcessInfo.processName == null || !runningAppProcessInfo.processName.startsWith(packageName) || runningAppProcessInfo.importance != 100) {
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        C51423a.m95784a(3, null, "foreground check!");
                        C51423a.m95784a(3, null, "actually show toast in i18n!");
                        C17227b.m31794a(this.f41146h).mo27251a(this.f41145g, this.f41139a, this.f41140b, this.f41141c, this.f41143e, this.f41142d);
                    }
                }
            }
        } catch (Exception e) {
            C51423a.m95791b(3, null, "show toast fail " + e.getMessage());
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static Object m31791a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(12310);
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
                    MethodCollector.m26664o(12310);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public C17226a(Context context, String str, int i, int i2) {
        this.f41145g = str;
        this.f41144f = i;
        this.f41146h = context;
        this.f41140b = i2;
        this.f41141c = 0;
        this.f41143e = 2;
    }
}
