package com.bytedance.scene.p1622d;

import android.content.Context;
import android.os.Bundle;
import androidx.p025c.C0497g;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/* renamed from: com.bytedance.scene.d.g */
public final class C22166g {

    /* renamed from: a */
    private static final C0497g<String, Class<?>> f52404a = new C0497g<>();

    static {
        Covode.recordClassIndex(25970);
    }

    /* renamed from: a */
    public static boolean m41651a(AbstractC22219j jVar) {
        Class<?> cls = jVar.getClass();
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return false;
        }
        int modifiers = cls.getModifiers();
        if (!Modifier.isPublic(modifiers)) {
            return false;
        }
        if (cls.isMemberClass() && !Modifier.isStatic(modifiers)) {
            return false;
        }
        for (Constructor<?> constructor : cls.getConstructors()) {
            if (constructor.getParameterTypes().length > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: com.bytedance.scene.d.g$a */
    public static class C22167a extends RuntimeException {
        static {
            Covode.recordClassIndex(25971);
        }

        C22167a(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: a */
    public static AbstractC22219j m41650a(Class<?> cls, Bundle bundle) {
        try {
            AbstractC22219j jVar = (AbstractC22219j) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(jVar.getClass().getClassLoader());
                jVar.f52554r = bundle;
            }
            return jVar;
        } catch (InstantiationException e) {
            throw new C22167a("Unable to instantiate scene " + cls + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C22167a("Unable to instantiate scene " + cls + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C22167a("Unable to instantiate scene " + cls + ": could not find Scene constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C22167a("Unable to instantiate scene " + cls + ": calling Scene constructor caused an exception", e4);
        }
    }

    /* renamed from: a */
    public static AbstractC22219j m41649a(Context context, String str, Bundle bundle) {
        C0497g<String, Class<?>> gVar = f52404a;
        Class<?> cls = gVar.get(str);
        if (cls == null) {
            try {
                cls = context.getClassLoader().loadClass(str);
                gVar.put(str, cls);
            } catch (ClassNotFoundException e) {
                throw new C22167a("Unable to instantiate scene " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
            }
        }
        return m41650a(cls, bundle);
    }
}
