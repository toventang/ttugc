package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.WebViewPreInitTask */
public class WebViewPreInitTask implements AbstractC58264w {

    /* renamed from: com.ss.android.ugc.aweme.utils.WebViewPreInitTask$a */
    static class C80179a {

        /* renamed from: a */
        static volatile boolean f179627a;

        static {
            Covode.recordClassIndex(93445);
        }
    }

    static {
        Covode.recordClassIndex(93444);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        if (!C80179a.f179627a) {
            try {
                Long.valueOf(SystemClock.elapsedRealtime());
                Class<?> cls = Class.forName("android.webkit.WebViewFactory");
                Method[] declaredMethods = cls.getDeclaredMethods();
                Method method = null;
                int length = declaredMethods.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Method method2 = declaredMethods[i];
                    if (TextUtils.equals(method2.getName(), "getProvider")) {
                        method = method2;
                        break;
                    }
                    i++;
                }
                method.setAccessible(true);
                Object[] objArr = new Object[0];
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{cls, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_utils_WebViewPreInitTask$WebViewInitHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    Object obj = a.second;
                    return;
                }
                C15346a.m28242a(method.invoke(cls, objArr), method, new Object[]{cls, objArr}, "com_ss_android_ugc_aweme_utils_WebViewPreInitTask$WebViewInitHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            } catch (Throwable unused) {
            }
        }
    }
}
