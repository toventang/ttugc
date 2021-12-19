package com.p2082ss.android.ugc.aweme.compliance.api.p2640d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.d.a */
public final class C39239a {

    /* renamed from: a */
    public static final String f92672a = "new_kids_mode";

    /* renamed from: b */
    public static final String f92673b = "key_is_new_kids_mode";

    /* renamed from: c */
    public static final C39239a f92674c = new C39239a();

    /* renamed from: d */
    private static final int f92675d = 0;

    /* renamed from: e */
    private static final int f92676e = 1;

    /* renamed from: f */
    private static final int f92677f = 2;

    /* renamed from: g */
    private static String f92678g;

    /* renamed from: h */
    private static int f92679h = f92675d;

    private C39239a() {
    }

    static {
        Covode.recordClassIndex(46875);
    }

    /* renamed from: a */
    public static boolean m79626a() {
        if (f92678g == null) {
            f92678g = m79630d();
        }
        if (f92678g == null) {
            return false;
        }
        File file = new File(f92678g, "child");
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m79628b() {
        if (f92678g == null) {
            f92678g = m79630d();
        }
        if (f92678g == null) {
            return false;
        }
        File file = new File(f92678g, "child");
        if (!file.exists()) {
            return true;
        }
        try {
            return m79627a(file);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m79629c() {
        if (f92679h == f92675d) {
            if (f92678g == null) {
                f92678g = m79630d();
            }
            if (f92678g != null) {
                if (new File(f92678g, "child").exists()) {
                    f92679h = f92676e;
                } else {
                    f92679h = f92677f;
                }
            }
        }
        if (f92679h == f92676e) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static String m79630d() {
        String e = m79631e();
        if (e != null) {
            return e + "/files";
        }
        String f = m79632f();
        if (f != null) {
            return f + "/files";
        }
        String g = m79633g();
        if (g != null) {
            return g + "/files";
        }
        return null;
    }

    /* renamed from: e */
    private static String m79631e() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mBoundApplication");
            C89219l.m154716b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            Field declaredField2 = obj.getClass().getDeclaredField("info");
            C89219l.m154716b(declaredField2, "");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Field declaredField3 = obj2.getClass().getDeclaredField("mDataDir");
            C89219l.m154716b(declaredField3, "");
            declaredField3.setAccessible(true);
            Object obj3 = declaredField3.get(obj2);
            if (obj3 != null) {
                return (String) obj3;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    private static String m79632f() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mBoundApplication");
            C89219l.m154716b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            Field declaredField2 = obj.getClass().getDeclaredField("appInfo");
            C89219l.m154716b(declaredField2, "");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Field declaredField3 = obj2.getClass().getDeclaredField("dataDir");
            C89219l.m154716b(declaredField3, "");
            declaredField3.setAccessible(true);
            Object obj3 = declaredField3.get(obj2);
            if (obj3 != null) {
                return (String) obj3;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    private static String m79633g() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mPackages");
            C89219l.m154716b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            if (obj != null) {
                Iterator it = ((Map) obj).entrySet().iterator();
                if (!it.hasNext()) {
                    return null;
                }
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                WeakReference weakReference = (WeakReference) entry.getValue();
                if (weakReference == null) {
                    C89219l.m154715b();
                }
                Object obj2 = weakReference.get();
                if (obj2 == null) {
                    C89219l.m154715b();
                }
                Field declaredField2 = obj2.getClass().getDeclaredField("mDataDir");
                C89219l.m154716b(declaredField2, "");
                declaredField2.setAccessible(true);
                Object obj3 = declaredField2.get(obj2);
                if (obj3 != null) {
                    return (String) obj3;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m79627a(File file) {
        MethodCollector.m26663i(8621);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(8621);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(8621);
        return delete;
    }
}
