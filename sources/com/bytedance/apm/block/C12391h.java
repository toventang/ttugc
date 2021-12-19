package com.bytedance.apm.block;

import android.os.Build;
import android.util.Pair;
import android.view.View;
import com.bytedance.apm.block.p766a.C12364f;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: com.bytedance.apm.block.h */
public final class C12391h {
    static {
        Covode.recordClassIndex(14198);
    }

    /* renamed from: a */
    public static void m22261a() {
        Class<?> cls;
        try {
            Class<?> cls2 = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls2.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls2.getDeclaredField("mRoots");
            declaredField.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField.get(invoke);
            Field declaredField2 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mView");
            declaredField2.setAccessible(true);
            Field declaredField3 = View.class.getDeclaredField("mRenderNode");
            declaredField3.setAccessible(true);
            if (Build.VERSION.SDK_INT > 28) {
                cls = Class.forName("android.graphics.RenderNode");
            } else {
                cls = Class.forName("android.view.RenderNode");
            }
            Method a = C12364f.m22205a((Class) cls, "output", (Class<?>[]) new Class[0]);
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = declaredField3.get(declaredField2.get(arrayList.get(i)));
                Object[] objArr = new Object[0];
                Pair<Boolean, Object> a2 = C15346a.m28238a(a, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_bytedance_apm_block_GFXInfo_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    Object obj2 = a2.second;
                } else {
                    C15346a.m28242a(a.invoke(obj, objArr), a, new Object[]{obj, objArr}, "com_bytedance_apm_block_GFXInfo_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
