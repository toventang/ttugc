package com.p2082ss.android.ugc.aweme.p2400bp;

import android.app.Activity;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.lighten.p1477a.C20761r;
import com.p2082ss.android.ugc.aweme.experiment.AbstractC46999gx;
import com.p2082ss.android.ugc.aweme.experiment.C47000gy;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import java.lang.reflect.Method;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4586g.AbstractC88922b;

/* renamed from: com.ss.android.ugc.aweme.bp.e */
public class C34902e {

    /* renamed from: a */
    public static String f82352a = "MemoryManager";

    /* renamed from: c */
    public static volatile boolean f82353c;

    /* renamed from: e */
    private static volatile C34902e f82354e;

    /* renamed from: b */
    AbstractC88922b<Long> f82355b = null;

    /* renamed from: d */
    private C88411a f82356d = new C88411a();

    static {
        Covode.recordClassIndex(41913);
    }

    private C34902e() {
    }

    /* renamed from: b */
    public final void mo61799b() {
        C47000gy gyVar = (C47000gy) C16048b.m29633a().mo25416a(true, "trim_memory_in_activity_settings", C47000gy.class, AbstractC46999gx.f109511a);
        if (gyVar != null && gyVar.f109512a) {
            m71285a(gyVar);
        }
    }

    /* renamed from: c */
    public final void mo61800c() {
        C81079v.m140776O().mo123907A();
        new Thread(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.p2400bp.C34902e.RunnableC349042 */

            static {
                Covode.recordClassIndex(41915);
            }

            public final void run() {
                C20761r.m39064b(80);
                try {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                    Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                    Object invoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                    Method method = (Method) declaredMethod.invoke(cls, "trimMemory", new Class[]{Integer.TYPE});
                    if (!(invoke == null || method == null)) {
                        Object[] objArr = {40};
                        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{invoke, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_memory_MemoryTrimManager$2_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                        if (((Boolean) a.first).booleanValue()) {
                            Object obj = a.second;
                        } else {
                            C15346a.m28242a(method.invoke(invoke, objArr), method, new Object[]{invoke, objArr}, "com_ss_android_ugc_aweme_memory_MemoryTrimManager$2_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                        }
                    }
                } catch (Throwable unused) {
                }
                C34902e.f82353c = true;
            }
        }).start();
    }

    /* renamed from: a */
    public static C34902e m71283a() {
        MethodCollector.m26663i(4840);
        if (f82354e == null) {
            synchronized (C34902e.class) {
                try {
                    f82354e = new C34902e();
                } catch (Throwable th) {
                    MethodCollector.m26664o(4840);
                    throw th;
                }
            }
        }
        C34902e eVar = f82354e;
        MethodCollector.m26664o(4840);
        return eVar;
    }

    /* renamed from: a */
    private void m71285a(C47000gy gyVar) {
        this.f82356d.mo142945a(m71284a(gyVar.f109516e).mo143289d(new C34905f(this, gyVar)));
    }

    /* renamed from: a */
    private static AbstractC88979t<Activity> m71284a(String str) {
        str.hashCode();
        switch (str.hashCode()) {
            case -1352294148:
                if (!str.equals("create")) {
                    return null;
                }
                break;
            case -934426579:
                if (!str.equals("resume")) {
                    return null;
                }
                break;
            case 109757538:
                if (!str.equals("start")) {
                    return null;
                }
                return C17873f.m33094b();
            case 1557372922:
                if (!str.equals("destroy")) {
                    return null;
                }
                return C17873f.m33098f();
            default:
                return null;
        }
        return C17873f.m33095c();
    }
}
