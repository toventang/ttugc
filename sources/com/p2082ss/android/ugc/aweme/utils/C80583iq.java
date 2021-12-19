package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ttve.nativePort.C30731d;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.utils.iq */
public final class C80583iq {

    /* renamed from: a */
    static String[] f180199a;

    /* renamed from: b */
    public static final C80583iq f180200b = new C80583iq();

    /* renamed from: c */
    private static final Keva f180201c = Keva.getRepo("repo_ve_hook");

    private C80583iq() {
    }

    /* renamed from: b */
    public static void m139715b() {
        C30731d.f73584d = C80584a.f180202a;
    }

    static {
        Covode.recordClassIndex(93856);
    }

    /* renamed from: a */
    public static boolean m139714a() {
        return f180201c.getBoolean("key_ve_hook_switch", false);
    }

    /* renamed from: c */
    public static void m139717c() {
        Method declaredMethod;
        String[] strArr = f180199a;
        if (strArr != null) {
            try {
                Class<?> cls = Class.forName("com.ss.android.VEHook");
                if (cls != null && (declaredMethod = cls.getDeclaredMethod("hook", String[].class, Integer.TYPE)) != null) {
                    declaredMethod.invoke(cls, strArr, 0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.utils.iq$a */
    public static final class C80584a implements C30731d.AbstractC30734c {

        /* renamed from: a */
        public static final C80584a f180202a = new C80584a();

        static {
            Covode.recordClassIndex(93857);
        }

        C80584a() {
        }

        @Override // com.p2082ss.android.ttve.nativePort.C30731d.AbstractC30734c
        /* renamed from: a */
        public final void mo55457a(String[] strArr) {
            C80583iq.f180199a = strArr;
            if (C80583iq.m139714a()) {
                C80583iq.m139717c();
            }
        }
    }

    /* renamed from: a */
    public static void m139713a(boolean z) {
        m139716b(z);
        if (z) {
            m139717c();
        }
    }

    /* renamed from: b */
    private static void m139716b(boolean z) {
        f180201c.storeBoolean("key_ve_hook_switch", z);
    }
}
