package com.p2082ss.android.ugc.awemepushlib.p4251f;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.f.a */
public final class C81832a {
    static {
        Covode.recordClassIndex(95245);
    }

    /* renamed from: a */
    private static boolean m141717a(int i) {
        return i == 1 || i == 4;
    }

    /* renamed from: b */
    public static boolean m141721b() {
        try {
            return true ^ "Hisense".equalsIgnoreCase(Build.BRAND);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m141716a() {
        if (C17873f.m33102j() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m141722c() {
        try {
            if (!C29843f.m60137d() && Build.VERSION.SDK_INT <= 20) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static void m141715a(Runnable runnable) {
        if (C13628n.m24517a()) {
            RunnableC13596e.m24423a(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static boolean m141719a(Map map) {
        if (map == null || map.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static Object m141714a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10908);
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
                    MethodCollector.m26664o(10908);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    private static boolean m141718a(int i, Context context, Intent intent) {
        if (i == 0) {
            try {
                C84349a.m145093a(intent, context);
                context.startActivity(intent);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m141720a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject.isNull(str)) {
            return z;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt > 0) {
            return true;
        }
        if (optInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, z);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:195:0x00cc */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.core.app.i$g] */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.core.app.i$f] */
    /* JADX WARN: Type inference failed for: r8v5, types: [androidx.core.app.i$c] */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.media.a.a$a] */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.core.app.i$h] */
    /* JADX WARN: Type inference failed for: r8v13, types: [androidx.core.app.i$b] */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0362, code lost:
        if (r0 == false) goto L_0x0377;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x035e A[Catch:{ Exception -> 0x0474 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x035f A[Catch:{ Exception -> 0x0474 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x03e5 A[LOOP:1: B:188:0x03e3->B:189:0x03e5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e5  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Notification m141713a(android.content.Context r14, com.p2082ss.android.ugc.awemepushlib.p4247c.C81823b r15, android.graphics.Bitmap r16, android.graphics.Bitmap r17, android.content.Intent r18) {
        /*
        // Method dump skipped, instructions count: 1149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.awemepushlib.p4251f.C81832a.m141713a(android.content.Context, com.ss.android.ugc.awemepushlib.c.b, android.graphics.Bitmap, android.graphics.Bitmap, android.content.Intent):android.app.Notification");
    }
}
