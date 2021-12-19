package com.p2082ss.android.ugc.aweme.p2389bh;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.google.android.gms.common.ConnectionResult;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.bh.a */
public final class C34831a {

    /* renamed from: a */
    public static String f82285a;

    /* renamed from: com.ss.android.ugc.aweme.bh.a$a */
    public interface AbstractC34833a {

        /* renamed from: a */
        public static final String[] f82286a = null;

        static {
            Covode.recordClassIndex(41841);
        }
    }

    static {
        Covode.recordClassIndex(41839);
    }

    /* renamed from: com.ss.android.ugc.aweme.bh.a$b */
    public static class RunnableC34834b implements Runnable {

        /* renamed from: c */
        public static Method f82287c;

        /* renamed from: a */
        public final Object f82288a;

        /* renamed from: b */
        public final ConnectionResult f82289b;

        static {
            Covode.recordClassIndex(41842);
        }

        public final void run() {
            try {
                Method method = f82287c;
                if (method != null) {
                    Object obj = this.f82288a;
                    Object[] objArr = {this.f82289b};
                    Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_lacent_BaseGmsANRBoost$CustomRunnable_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a.first).booleanValue()) {
                        Object obj2 = a.second;
                        return;
                    }
                    C15346a.m28242a(method.invoke(obj, objArr), method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_lacent_BaseGmsANRBoost$CustomRunnable_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
            } catch (Throwable unused) {
            }
        }

        public RunnableC34834b(Object obj, ConnectionResult connectionResult) {
            this.f82288a = obj;
            this.f82289b = connectionResult;
            try {
                if (f82287c == null) {
                    Method declaredMethod = Class.forName("com.google.android.gms.common.internal.c$d").getDeclaredMethod("b", ConnectionResult.class);
                    f82287c = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
            } catch (Throwable unused) {
                f82287c = null;
            }
        }
    }
}
