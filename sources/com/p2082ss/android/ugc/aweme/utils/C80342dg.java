package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.dg */
public final class C80342dg {

    /* renamed from: a */
    private static C27910f f179872a;

    static {
        Covode.recordClassIndex(93610);
    }

    /* renamed from: a */
    public static C27910f m139300a() {
        if (f179872a == null) {
            f179872a = new C27910f();
        }
        return f179872a;
    }

    /* renamed from: a */
    public static <T> T m139301a(String str, Class<T> cls) {
        return (T) m139300a().mo46670a(str, (Class) cls);
    }

    /* renamed from: b */
    public static <T> List<T> m139302b(String str, Class<T[]> cls) {
        Object[] objArr = (Object[]) m139300a().mo46670a(str, (Class) cls);
        if (objArr == null) {
            return new ArrayList();
        }
        return new ArrayList(Arrays.asList(objArr));
    }
}
