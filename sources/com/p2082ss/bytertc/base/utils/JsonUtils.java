package com.p2082ss.bytertc.base.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.C27917g;

/* renamed from: com.ss.bytertc.base.utils.JsonUtils */
public class JsonUtils {
    private static final C27910f sGson = new C27917g().mo46682b();

    static {
        Covode.recordClassIndex(100860);
    }

    public static String toJson(Object obj) {
        return sGson.mo46674b(obj);
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        return (T) sGson.mo46670a(str, (Class) cls);
    }

    public static <T> T convert(Object obj, Class<T> cls) {
        C27910f fVar = sGson;
        return (T) fVar.mo46670a(fVar.mo46674b(obj), (Class) cls);
    }
}
