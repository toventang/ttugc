package com.lynx.tasm.p2062ui.image.p2064b;

import android.graphics.Bitmap;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.fresco.animation.p1869d.AbstractC24298b;
import com.facebook.fresco.animation.p1869d.C24297a;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.lynx.tasm.base.LLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.lynx.tasm.ui.image.b.b */
public final class C28884b {

    /* renamed from: a */
    private static Method f68249a;

    /* renamed from: b */
    private static Method f68250b;

    /* renamed from: a */
    private static Object m57861a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_lynx_tasm_ui_image_helper_ByteDanceFrescoUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            return a.second;
        }
        Object invoke = method.invoke(obj, objArr);
        C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_lynx_tasm_ui_image_helper_ByteDanceFrescoUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(35007);
        try {
            f68249a = ImageDecodeOptionsBuilder.class.getDeclaredMethod("a", Integer.TYPE);
        } catch (Throwable th) {
            LLog.m56856a(6, "Fresco", Log.getStackTraceString(th));
        }
        try {
            f68250b = C24290a.class.getDeclaredMethod("setPrivateFrameScheduler", AbstractC24298b.class);
        } catch (Throwable th2) {
            LLog.m56856a(6, "Fresco", Log.getStackTraceString(th2));
        }
    }

    /* renamed from: a */
    public static C24639c m57860a(C24639c cVar) {
        ImageDecodeOptionsBuilder bitmapConfig = new ImageDecodeOptionsBuilder().setBitmapConfig(Bitmap.Config.ARGB_8888);
        Method method = f68249a;
        if (method != null) {
            try {
                m57861a(method, bitmapConfig, new Object[]{0});
            } catch (IllegalAccessException e) {
                LLog.m56856a(6, "Fresco", Log.getStackTraceString(e));
            } catch (InvocationTargetException e2) {
                LLog.m56856a(6, "Fresco", Log.getStackTraceString(e2));
            }
        }
        cVar.f58555f = bitmapConfig.mo40154a();
        return cVar;
    }

    /* renamed from: a */
    public static void m57862a(C24290a aVar) {
        if (f68250b != null) {
            C24297a aVar2 = new C24297a(aVar.f57588d);
            try {
                m57861a(f68250b, aVar, new Object[]{aVar2});
            } catch (IllegalAccessException e) {
                LLog.m56856a(6, "Fresco", Log.getStackTraceString(e));
            } catch (InvocationTargetException e2) {
                LLog.m56856a(6, "Fresco", Log.getStackTraceString(e2));
            }
        }
    }
}
