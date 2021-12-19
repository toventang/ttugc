package com.lynx.component.svg.p2042a;

import android.graphics.Canvas;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.lynx.component.svg.a.b */
final class C28251b {

    /* renamed from: a */
    static final int f66221a = ((Integer) Canvas.class.getField("MATRIX_SAVE_FLAG").get(null)).intValue();

    /* renamed from: b */
    private static final Method f66222b = Canvas.class.getMethod("save", Integer.TYPE);

    static {
        Covode.recordClassIndex(34209);
    }

    /* renamed from: a */
    static void m56429a(Canvas canvas, int i) {
        Method method = f66222b;
        Object[] objArr = {Integer.valueOf(i)};
        Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{canvas, objArr}, 110000, "java.lang.Object", true, "com_lynx_component_svg_parser_CanvasLegacy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a.first).booleanValue()) {
            Object obj = a.second;
            return;
        }
        C15346a.m28242a(method.invoke(canvas, objArr), method, new Object[]{canvas, objArr}, "com_lynx_component_svg_parser_CanvasLegacy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
    }
}
