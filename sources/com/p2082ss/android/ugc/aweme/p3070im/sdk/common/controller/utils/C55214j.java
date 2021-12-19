package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.gson.BooleanDefaultFalseAdapter;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.gson.IntegerDefaultZeroAdater;
import java.lang.reflect.Type;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j */
public final class C55214j {

    /* renamed from: a */
    public static final C55214j f126287a = new C55214j();

    /* renamed from: b */
    private static final C27910f f126288b;

    private C55214j() {
    }

    static {
        Covode.recordClassIndex(64961);
        C27910f b = new C27917g().mo46681a((Type) Boolean.TYPE, (Object) new BooleanDefaultFalseAdapter()).mo46681a((Type) Integer.TYPE, (Object) new IntegerDefaultZeroAdater()).mo46681a((Type) Boolean.TYPE, (Object) new BooleanDefaultFalseAdapter()).mo46682b();
        C89219l.m154716b(b, "");
        f126288b = b;
    }

    /* renamed from: a */
    public static final String m100958a(Object obj) {
        String b = f126288b.mo46674b(obj);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: a */
    public static final <T> T m100957a(String str, Class<T> cls) {
        C89219l.m154721d(cls, "");
        return (T) f126288b.mo46670a(str, (Class) cls);
    }
}
