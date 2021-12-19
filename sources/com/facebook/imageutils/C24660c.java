package com.facebook.imageutils;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import com.facebook.p1870h.C24314c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.facebook.imageutils.c */
public final class C24660c {

    /* renamed from: a */
    private static Class f58580a;

    /* renamed from: b */
    private static Class f58581b;

    /* renamed from: c */
    private static C24314c f58582c;

    /* renamed from: d */
    private static Method f58583d;

    static {
        Covode.recordClassIndex(28812);
        try {
            f58580a = Class.forName("com.ixigua.image.heif.Heif");
            f58581b = Class.forName("com.bytedance.fresco.heif.HeifDecoder");
        } catch (ClassNotFoundException e) {
            C24099a.m45658c("HeifFormatUtil", "Heif init ", e);
        }
    }

    /* renamed from: a */
    public static C24314c m47177a() {
        C24314c cVar = f58582c;
        if (cVar != null) {
            return cVar;
        }
        Class cls = f58581b;
        if (cls == null) {
            return null;
        }
        try {
            f58582c = (C24314c) cls.getDeclaredField("HEIF_FORMAT").get(null);
        } catch (NoSuchFieldException e) {
            C24099a.m45658c("HeifFormatUtil", "HeifFormat init ", e);
        } catch (IllegalAccessException e2) {
            C24099a.m45658c("HeifFormatUtil", "HeifFormat init ", e2);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return f58582c;
    }

    /* renamed from: a */
    public static int[] m47178a(byte[] bArr, int i) {
        Class cls = f58580a;
        if (cls == null) {
            return null;
        }
        try {
            if (f58583d == null) {
                f58583d = cls.getDeclaredMethod("parseMeta", byte[].class, Integer.TYPE);
            }
            Method method = f58583d;
            if (method != null) {
                method.setAccessible(true);
                return (int[]) f58583d.invoke(null, bArr, Integer.valueOf(i));
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return null;
    }
}
