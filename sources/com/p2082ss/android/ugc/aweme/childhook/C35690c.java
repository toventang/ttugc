package com.p2082ss.android.ugc.aweme.childhook;

import com.bytedance.covode.number.Covode;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.childhook.p2457a.p2459b.AbstractC35684c;
import com.p2082ss.android.ugc.aweme.childhook.p2457a.p2459b.C35682a;
import com.p2082ss.android.ugc.aweme.childhook.p2457a.p2459b.C35683b;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.childhook.c */
public final class C35690c {

    /* renamed from: a */
    public static final C35690c f84182a = new C35690c();

    private C35690c() {
    }

    static {
        Covode.recordClassIndex(42920);
    }

    /* renamed from: a */
    public static void m72854a() {
        Class<?> cls;
        Field field;
        try {
            Class<?> cls2 = Class.forName("android.app.ActivityThread");
            Method method = cls2.getMethod("currentActivityThread", new Class[0]);
            C89219l.m154716b(method, "");
            method.setAccessible(true);
            Object invoke = method.invoke(cls2, new Object[0]);
            Field declaredField = invoke.getClass().getDeclaredField("mBoundApplication");
            C89219l.m154716b(declaredField, "");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(invoke);
            Field declaredField2 = obj.getClass().getDeclaredField("providers");
            C89219l.m154716b(declaredField2, "");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    Object obj4 = null;
                    if (!(obj3 == null || (cls = obj3.getClass()) == null || (field = cls.getField(StringSet.name)) == null)) {
                        obj4 = field.get(obj3);
                    }
                    String str = (String) obj4;
                    if (str == null) {
                        str = "";
                    }
                    if (m72855a(str) && obj3 != null) {
                        arrayList.add(obj3);
                    }
                }
                declaredField2.set(obj, arrayList);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
        } catch (Exception e) {
            e.printStackTrace();
            C13468b.m24211a(e, "ChildContentProviderHook.startHook");
        }
    }

    /* renamed from: a */
    private static boolean m72855a(String str) {
        C89219l.m154721d(str, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C35682a());
        arrayList.add(new C35683b());
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((AbstractC35684c) arrayList.get(i)).mo62727a(str)) {
                    return ((AbstractC35684c) arrayList.get(i)).mo62728b(str);
                }
            }
        }
        return true;
    }
}
