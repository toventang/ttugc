package com.p2082ss.texturerender.p4404a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.texturerender.C86202k;
import com.p2082ss.texturerender.C86203l;
import java.lang.reflect.Method;

/* renamed from: com.ss.texturerender.a.c */
public final class C86173c {

    /* renamed from: a */
    Object f192192a;

    /* renamed from: b */
    Method f192193b;

    /* renamed from: c */
    Method f192194c;

    /* renamed from: d */
    Method f192195d;

    /* renamed from: e */
    Method f192196e;

    /* renamed from: f */
    private Method f192197f;

    static {
        Covode.recordClassIndex(101316);
    }

    /* renamed from: a */
    public final void mo136479a() {
        Method method;
        Object obj = this.f192192a;
        if (!(obj == null || (method = this.f192197f) == null)) {
            m148017a(method, obj, new Object[0]);
            C86203l.m148116a("TR_AdaptiveSharpenWrapper", "ReleaseAdaptiveSharpen");
        }
        this.f192192a = null;
    }

    public C86173c() {
        C86203l.m148116a("TR_AdaptiveSharpenWrapper", "new AdaptiveSharpenWrapper");
        try {
            Class<?> a = C86202k.m148115a("com.ss.lens.algorithm.AdaptiveSharpen");
            if (a != null) {
                this.f192193b = a.getDeclaredMethod("InitAdaptiveSharpen", Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                this.f192194c = a.getDeclaredMethod("AdaptiveSharpenProcess", Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE);
                this.f192195d = a.getDeclaredMethod("AdaptiveSharpenOesProcess", Integer.TYPE, Integer.TYPE, Integer.TYPE, float[].class, Boolean.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE);
                this.f192196e = a.getDeclaredMethod("GetAdaptiveSharpenOutput", new Class[0]);
                this.f192197f = a.getDeclaredMethod("ReleaseAdaptiveSharpen", new Class[0]);
                this.f192192a = a.newInstance();
            }
        } catch (Exception e) {
            C86203l.m148116a("TR_AdaptiveSharpenWrapper", "AdaptiveSharpen get fail:" + e.toString());
            this.f192192a = null;
            this.f192193b = null;
            this.f192194c = null;
            this.f192196e = null;
            this.f192197f = null;
        }
    }

    /* renamed from: a */
    static Object m148017a(Method method, Object obj, Object... objArr) {
        if (method == null || obj == null) {
            return null;
        }
        try {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_texturerender_effect_AdaptiveSharpenWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(obj, objArr);
            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_texturerender_effect_AdaptiveSharpenWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        } catch (Exception e) {
            C86203l.m148116a("TR_AdaptiveSharpenWrapper", e.toString());
            return null;
        }
    }
}
