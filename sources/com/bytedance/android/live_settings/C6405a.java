package com.bytedance.android.live_settings;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.p423a.C6407b;
import com.bytedance.android.live_settings.p423a.C6408c;
import com.bytedance.android.live_settings.p423a.C6409d;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live_settings.a */
public final class C6405a {

    /* renamed from: a */
    private static boolean f15972a;

    static {
        Covode.recordClassIndex(7137);
    }

    /* renamed from: a */
    public static boolean m13777a(String str, boolean z) {
        if (f15972a && C6407b.f15975b.mo12549b(str)) {
            return C6407b.f15975b.mo12550b(str, z);
        }
        C89219l.m154719c(str, "");
        if (C6416h.m13810a()) {
            return z;
        }
        return C6409d.f15977b.mo12550b(str, z);
    }

    /* renamed from: a */
    public static String m13775a(String str, String str2) {
        if (f15972a && C6407b.f15975b.mo12549b(str)) {
            return C6407b.f15975b.mo12548b(str, str2);
        }
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        if (C6416h.m13810a()) {
            return str2;
        }
        String b = C6409d.f15977b.mo12548b(str, str2);
        C89219l.m154709a((Object) b, "");
        return b;
    }

    /* renamed from: a */
    public static String[] m13778a(String str, String[] strArr) {
        if (f15972a && C6407b.f15975b.mo12549b(str)) {
            return C6407b.f15975b.mo12551b(str, strArr);
        }
        C89219l.m154719c(str, "");
        C89219l.m154719c(strArr, "");
        if (C6416h.m13810a()) {
            return strArr;
        }
        String[] b = C6409d.f15977b.mo12551b(str, strArr);
        C89219l.m154709a((Object) b, "");
        return b;
    }

    /* renamed from: a */
    public static void m13776a(boolean z) {
        C6409d.f15977b.mo12552c();
        C6407b.f15975b.mo12552c();
        C6408c.f15976b.mo12552c();
        f15972a = z;
    }

    /* renamed from: b */
    public static Class m13779b(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        Field field = null;
        int i = 0;
        while (true) {
            if (i < length) {
                Field field2 = declaredFields[i];
                Group group = (Group) field2.getAnnotation(Group.class);
                if (group != null) {
                    if (group.isDefault()) {
                        field = field2;
                        break;
                    }
                    field = field2;
                }
                i++;
            } else if (field == null) {
                throw new RuntimeException("Can not find @Group in " + cls.getName());
            }
        }
        field.setAccessible(true);
        return field.getType();
    }

    /* renamed from: a */
    public static <T> T m13773a(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null) {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                Field field = null;
                for (Field field2 : declaredFields) {
                    Group group = (Group) field2.getAnnotation(Group.class);
                    if (group != null) {
                        arrayList.add(field2);
                        if (group.isDefault()) {
                            field = field2;
                        }
                    }
                }
                if (field == null && arrayList.size() == 1) {
                    field = (Field) arrayList.get(0);
                }
                if (field != null) {
                    field.setAccessible(true);
                    if ((field.getModifiers() & 8) == 8) {
                        z = true;
                    }
                    if (z) {
                        return (T) field.get(null);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            SettingsManager.monitor.mo12560a("getDefaultValue", "exception: " + th.getMessage() + " ,class name: " + cls.getSimpleName());
            return null;
        }
    }

    /* renamed from: a */
    public static double m13769a(String str, double d) {
        if (f15972a && C6407b.f15975b.mo12549b(str)) {
            return C6407b.f15975b.mo12543b(str, d);
        }
        C89219l.m154719c(str, "");
        if (C6416h.m13810a()) {
            return d;
        }
        return C6409d.f15977b.mo12543b(str, d);
    }

    /* renamed from: a */
    public static float m13770a(String str, float f) {
        if (f15972a && C6407b.f15975b.mo12549b(str)) {
            return C6407b.f15975b.mo12544b(str, f);
        }
        C89219l.m154719c(str, "");
        if (C6416h.m13810a()) {
            return f;
        }
        return C6409d.f15977b.mo12544b(str, f);
    }

    /* renamed from: a */
    public static int m13771a(String str, int i) {
        if (f15972a && C6407b.f15975b.mo12549b(str)) {
            return C6407b.f15975b.mo12545b(str, i);
        }
        C89219l.m154719c(str, "");
        if (C6416h.m13810a()) {
            return i;
        }
        return C6409d.f15977b.mo12545b(str, i);
    }

    /* renamed from: a */
    public static long m13772a(String str, long j) {
        if (f15972a && C6407b.f15975b.mo12549b(str)) {
            return C6407b.f15975b.mo12546b(str, j);
        }
        C89219l.m154719c(str, "");
        if (C6416h.m13810a()) {
            return j;
        }
        return C6409d.f15977b.mo12546b(str, j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> T m13774a(String str, Class cls, Object obj) {
        T t;
        if (f15972a && C6407b.f15975b.mo12549b(str)) {
            return (T) C6407b.f15975b.mo12534a(str, cls);
        }
        C89219l.m154719c(str, "");
        C89219l.m154719c(cls, "");
        return (!C6416h.m13810a() && (t = (T) C6409d.f15977b.mo12534a(str, cls)) != null) ? t : obj;
    }
}
