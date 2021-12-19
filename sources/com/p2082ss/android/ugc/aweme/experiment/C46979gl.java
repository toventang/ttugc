package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.experiment.gl */
public final class C46979gl {

    /* renamed from: a */
    public static final boolean f109475a = true;

    /* renamed from: b */
    public static final C46979gl f109476b = new C46979gl();

    private C46979gl() {
    }

    static {
        Covode.recordClassIndex(55580);
    }

    /* renamed from: a */
    public static boolean m90259a() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Object invoke = cls.getDeclaredMethod("get", String.class).invoke(cls, "ro.miui.ui.version.name");
            if (invoke != null) {
                String str = (String) invoke;
                if (str != null) {
                    String substring = str.substring(1);
                    C89219l.m154716b(substring, "");
                    if (Integer.parseInt(substring) >= 12) {
                        return true;
                    }
                    return false;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
            return false;
        }
    }
}
