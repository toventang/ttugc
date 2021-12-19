package com.bytedance.sysoptimizer.java;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.SysOptimizer;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionUtils {
    private static boolean sIsInit;

    static {
        Covode.recordClassIndex(26606);
    }

    private static native boolean changeTargetSuperClassToSpecificClassOnDalvik(Class<?> cls, Class<?> cls2, String str);

    /* renamed from: com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m42864x7abc0422(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_sysoptimizer_java_ReflectionUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m42865x7abc0423(String str, String str2, Throwable th) {
        return 0;
    }

    private static native boolean setModifiersForDalvik(Class<?> cls, int i, int i2, int i3, String str);

    private ReflectionUtils() {
    }

    public static boolean isArt() {
        String property = System.getProperty("java.vm.version");
        if (property == null || !property.startsWith("2")) {
            return false;
        }
        return true;
    }

    private static String getSuperClassNameInDescriptor(Class<?> cls) {
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null) {
            return "";
        }
        return "L" + superclass.getName().replaceAll("[.]", "/") + ";";
    }

    public static void removeFinal(Field field) {
        if (field != null) {
            int modifiers = field.getModifiers();
            int i = Build.VERSION.SDK_INT;
            if (i == 19) {
                if (isArt()) {
                    changeAccessFlagsBelowLForArt(field, modifiers & -17);
                } else {
                    changeAccessFlagsBelowLForDalvik(field, modifiers);
                }
            } else if (i <= 22) {
                changeAccessFlagsBelowLForArt(field, modifiers & -17);
            } else {
                changeAccessFlagsAboveL(field, modifiers & -17);
            }
        }
    }

    private static void changeAccessFlagsAboveL(Field field, int i) {
        try {
            Field declaredField = Field.class.getDeclaredField("accessFlags");
            declaredField.setAccessible(true);
            declaredField.setInt(field, i);
            m42864x7abc0422("ReflectionUtils", "changeAccessFlagsAboveL succ");
        } catch (Throwable th) {
            m42865x7abc0423("ReflectionUtils", "changeAccessFlagsAboveL", th);
        }
    }

    private static void changeAccessFlagsBelowLForArt(Field field, int i) {
        try {
            Field declaredField = Field.class.getDeclaredField("artField");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(field);
            Field declaredField2 = obj.getClass().getDeclaredField("accessFlags");
            declaredField2.setAccessible(true);
            declaredField2.setInt(obj, i);
            m42864x7abc0422("ReflectionUtils", "changeAccessFlagsOnL succ");
        } catch (Throwable th) {
            m42865x7abc0423("ReflectionUtils", "changeAccessFlagBelowL error", th);
        }
    }

    public static void changeIfTableFrom(Object obj, Object obj2) {
        if (obj2 != null && obj != null) {
            try {
                Class<?> cls = obj2.getClass();
                Class<?> cls2 = obj.getClass();
                Field declaredField = Class.class.getDeclaredField("ifTable");
                declaredField.setAccessible(true);
                Object[] objArr = (Object[]) declaredField.get(cls);
                if (!Arrays.equals(objArr, (Object[]) declaredField.get(cls2))) {
                    declaredField.set(cls2, objArr);
                    m42864x7abc0422("ReflectionUtils", "change ifTable succ");
                }
            } catch (Throwable th) {
                m42865x7abc0423("ReflectionUtils", "changeIfTable", th);
            }
        }
    }

    private static void changeSuperClass(Class<?> cls, Class<?> cls2) {
        MethodCollector.m26663i(7211);
        if (Build.VERSION.SDK_INT > 19 || isArt()) {
            Field declaredField = Class.class.getDeclaredField("superClass");
            declaredField.setAccessible(true);
            declaredField.set(cls, cls2);
            MethodCollector.m26664o(7211);
            return;
        }
        changeTargetSuperClassToSpecificClassOnDalvik(cls, cls2, getSuperClassNameInDescriptor(cls));
        MethodCollector.m26664o(7211);
    }

    private static void changeAccessFlagsBelowLForDalvik(Field field, int i) {
        MethodCollector.m26663i(7348);
        if (!sIsInit) {
            sIsInit = SysOptimizer.loadOptimizerLibrary(null);
        }
        if (sIsInit) {
            try {
                Field declaredField = Field.class.getDeclaredField("slot");
                declaredField.setAccessible(true);
                int i2 = declaredField.getInt(field);
                Field declaredField2 = Field.class.getDeclaredField("declaringClass");
                declaredField2.setAccessible(true);
                Class cls = (Class) declaredField2.get(field);
                m42864x7abc0422("ReflectionUtils", "slot = " + i2 + ", accessFlags = " + i + ", modifiers = " + field.getModifiers());
                m42864x7abc0422("ReflectionUtils", "setModifiers succ = " + setModifiersForDalvik(cls, i2, i, field.getModifiers(), cls.getName()));
                MethodCollector.m26664o(7348);
                return;
            } catch (Throwable th) {
                m42865x7abc0423("ReflectionUtils", "slotField", th);
            }
        }
        MethodCollector.m26664o(7348);
    }

    public static void changeField2Target(Object obj, Field field, Object obj2, Object obj3) {
        if (field != null && obj != null && obj2 != null && obj3 != null) {
            try {
                Class<?> cls = obj3.getClass();
                Class<?> cls2 = obj2.getClass();
                if (!cls2.equals(cls)) {
                    changeSuperClass(cls, cls2);
                }
                field.set(obj, obj3);
                m42864x7abc0422("ReflectionUtils", "changeField2Target succ");
            } catch (Throwable th) {
                m42865x7abc0423("ReflectionUtils", "changeField2Target", th);
            }
        }
    }
}
