package com.bytedance.android.livesdk.p441ah;

import android.app.AppOpsManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.p218f.p222c.C3930b;
import com.bytedance.android.livesdk.livesetting.watchlive.MtPipWatchLiveEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.PipModeBrandListSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.PipModeHandnaviEnableSetting;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.reflect.Field;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.ah.a */
public final class C6682a {

    /* renamed from: a */
    public static boolean f16578a;

    /* renamed from: b */
    public static boolean f16579b;

    /* renamed from: c */
    public static final C6682a f16580c = new C6682a();

    private C6682a() {
    }

    static {
        Covode.recordClassIndex(7420);
    }

    /* renamed from: b */
    public static boolean m14197b() {
        if (Build.VERSION.SDK_INT < 26 || !m14200d() || !m14199c() || !MtPipWatchLiveEnableSetting.INSTANCE.getValue() || f16579b) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m14199c() {
        if (f16578a) {
            return true;
        }
        if (!PipModeHandnaviEnableSetting.INSTANCE.getValue() || C89064i.m154489a(PipModeBrandListSetting.INSTANCE.getValue(), C3930b.m9570a())) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m14200d() {
        if (C3966y.m9669e() == null) {
            return false;
        }
        Context e = C3966y.m9669e();
        C89219l.m154716b(e, "");
        if (e.getPackageManager() == null) {
            return false;
        }
        Context e2 = C3966y.m9669e();
        C89219l.m154716b(e2, "");
        return e2.getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    /* renamed from: a */
    public static boolean m14195a() {
        StringBuilder append = new StringBuilder("isPipModeEnable(): ").append(m14197b()).append(", hasPipPermission(ResUtil.getContext()):");
        Context e = C3966y.m9669e();
        C89219l.m154716b(e, "");
        StringBuilder append2 = append.append(m14196a(e)).append("\n           LivePluginProperties.LIVE_PIP_SWITCHER_OPEN.value:");
        C6805b<Boolean> bVar = AbstractC6804a.f17043cq;
        C89219l.m154716b(bVar, "");
        C3854a.m9453a(4, "picture_in_picture", append2.append(bVar.mo13066a()).append("\n        ").toString());
        if (!m14197b()) {
            return false;
        }
        Context e2 = C3966y.m9669e();
        C89219l.m154716b(e2, "");
        if (!m14196a(e2)) {
            return false;
        }
        C6805b<Boolean> bVar2 = AbstractC6804a.f17043cq;
        C89219l.m154716b(bVar2, "");
        Boolean a = bVar2.mo13066a();
        C89219l.m154716b(a, "");
        if (a.booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m14198b(Context context) {
        if (context == null) {
            return false;
        }
        if (!m14196a(context)) {
            C6805b<Boolean> bVar = AbstractC6804a.f17043cq;
            C89219l.m154716b(bVar, "");
            C6806c.m14603a((C6800c) bVar, (Object) false);
            C3854a.m9453a(4, "picture_in_picture", " syncPipPermissionValue LIVE_PIP_SWITCHER_OPEN -> false");
        }
        StringBuilder sb = new StringBuilder("syncPipPermissionValue return ");
        C6805b<Boolean> bVar2 = AbstractC6804a.f17043cq;
        C89219l.m154716b(bVar2, "");
        C3854a.m9453a(4, "picture_in_picture", sb.append(bVar2.mo13066a()).toString());
        C6805b<Boolean> bVar3 = AbstractC6804a.f17043cq;
        C89219l.m154716b(bVar3, "");
        Boolean a = bVar3.mo13066a();
        C89219l.m154716b(a, "");
        return a.booleanValue();
    }

    /* renamed from: a */
    public static boolean m14196a(Context context) {
        C89219l.m154721d(context, "");
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        try {
            Object a = m14194a(context, "appops");
            if (a != null) {
                AppOpsManager appOpsManager = (AppOpsManager) a;
                int callingUid = Binder.getCallingUid();
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c) {
                    if (applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                }
                C89219l.m154716b(applicationContext, "");
                if (appOpsManager.checkOpNoThrow("android:picture_in_picture", callingUid, applicationContext.getPackageName()) == 0) {
                    return true;
                }
                return false;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.AppOpsManager");
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Object m14194a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9410);
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
                    MethodCollector.m26664o(9410);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
