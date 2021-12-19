package com.p2082ss.android.ugc.aweme.search.p3696l;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.p2082ss.android.ugc.aweme.discover.api.SearchApiNew;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.search.l.d */
public class C67614d {

    /* renamed from: a */
    private static volatile boolean f151492a;

    static {
        Covode.recordClassIndex(79253);
    }

    /* renamed from: a */
    private static Object m119762a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_search_performance_SearchMixApiPreparation_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_search_performance_SearchMixApiPreparation_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    /* renamed from: a */
    public static void m119764a() {
        MethodCollector.m26663i(8222);
        if (!f151492a) {
            synchronized (C67614d.class) {
                try {
                    if (!f151492a) {
                        C1731i.m5640b(CallableC67615e.f151493a, C1731i.f5562a).mo5532a(C67616f.f151494a);
                        f151492a = true;
                    }
                } finally {
                    MethodCollector.m26664o(8222);
                }
            }
            return;
        }
        MethodCollector.m26664o(8222);
    }

    /* renamed from: b */
    static final /* synthetic */ Object m119765b() {
        try {
            AbstractC18099f fVar = SearchApiNew.f97599b;
            Object obj = m119766b(fVar.getClass(), "retrofit").get(fVar);
            Object a = m119762a(m119763a(obj.getClass(), "getRetrofit"), obj, new Object[0]);
            Method a2 = m119763a(SearchApiNew.RealApi.class, "searchMTMixFeedList");
            m119762a(m119763a(a.getClass(), "loadServiceMethod"), a, new Object[]{a2});
            return null;
        } catch (Exception e) {
            if (!"local_test".equals(C17867d.f42595s)) {
                return null;
            }
            throw e;
        }
    }

    /* renamed from: b */
    private static Field m119766b(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Method m119763a(Class cls, String str) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (str.equals(method.getName())) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }
}
