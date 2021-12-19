package com.p2082ss.android.ugc.aweme.p2431bz;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.bz.a */
public class C35332a {

    /* renamed from: a */
    private static final String f83356a = C35332a.class.getSimpleName();

    /* renamed from: b */
    private static Application f83357b;

    /* renamed from: a */
    private static Object m72314a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_nougat_NougatApplicationPatch_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_nougat_NougatApplicationPatch_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(42500);
    }

    /* renamed from: b */
    private static Context m72318b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: c */
    private static void m72319c(Context context) {
        try {
            f83357b = (Application) Class.forName(context.getApplicationInfo().className).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private static void m72320d(Context context) {
        Application application = f83357b;
        if (application != null) {
            try {
                m72313a(Application.class, application, "attach", new Class[]{Context.class}, new Object[]{context});
            } catch (Exception e) {
                e.printStackTrace();
            }
            f83357b.onCreate();
        }
    }

    /* renamed from: a */
    public static void m72316a(Context context) {
        if (C17879g.m33104a() == null && context != null && m72318b(context) != null && context.getApplicationInfo() != null && TextUtils.equals(Application.class.getName(), context.getApplicationInfo().className)) {
            Application application = (Application) m72318b(context);
            try {
                m72319c(context);
                m72317a(application, application, f83357b);
                m72320d(application.getBaseContext());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static Object m72312a(Context context, Class<?> cls) {
        if (cls == null) {
            try {
                cls = Class.forName("android.app.ActivityThread");
            } catch (Throwable unused) {
                return null;
            }
        }
        Method method = cls.getMethod("currentActivityThread", new Class[0]);
        method.setAccessible(true);
        Object invoke = method.invoke(null, new Object[0]);
        if (invoke != null || context == null) {
            return invoke;
        }
        Field field = context.getClass().getField("mLoadedApk");
        field.setAccessible(true);
        Object obj = field.get(context);
        Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* renamed from: a */
    private static void m72317a(Context context, Application application, Application application2) {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object a = m72312a(context, cls);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            Application application3 = (Application) declaredField.get(a);
            if (application2 != null) {
                if (application3 == application) {
                    declaredField.set(a, application2);
                }
                Field declaredField2 = cls.getDeclaredField("mAllApplications");
                declaredField2.setAccessible(true);
                List list = (List) declaredField2.get(a);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) == application) {
                        list.set(i, application2);
                    }
                }
            }
            m72315a(application, application2, cls, a);
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    /* renamed from: a */
    private static void m72315a(Application application, Application application2, Class<?> cls, Object obj) {
        Class<?> cls2;
        try {
            cls2 = Class.forName("android.app.LoadedApk");
        } catch (ClassNotFoundException unused) {
            cls2 = Class.forName("android.app.ActivityThread$PackageInfo");
        }
        Field declaredField = cls2.getDeclaredField("mApplication");
        declaredField.setAccessible(true);
        cls2.getDeclaredField("mResDir").setAccessible(true);
        Field field = null;
        try {
            field = Application.class.getDeclaredField("mLoadedApk");
        } catch (NoSuchFieldException unused2) {
        }
        String[] strArr = {"mPackages", "mResourcePackages"};
        int i = 0;
        do {
            Field declaredField2 = cls.getDeclaredField(strArr[i]);
            declaredField2.setAccessible(true);
            for (Map.Entry entry : ((Map) declaredField2.get(obj)).entrySet()) {
                Object obj2 = ((WeakReference) entry.getValue()).get();
                if (!(obj2 == null || declaredField.get(obj2) != application || application2 == null)) {
                    declaredField.set(obj2, application2);
                    if (field != null) {
                        field.set(application2, obj2);
                    }
                }
            }
            i++;
        } while (i < 2);
    }

    /* renamed from: a */
    private static Object m72313a(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        declaredMethod.setAccessible(true);
        return m72314a(declaredMethod, obj, objArr);
    }
}
