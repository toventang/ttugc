package com.bytedance.android.livesdk.container.p512i;

import android.net.Uri;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.i.c */
public final class C8252c {

    /* renamed from: a */
    public static final C8252c f20483a = new C8252c();

    /* renamed from: b */
    private static final ConcurrentHashMap<Class<?>, AbstractC8251b<?>> f20484b;

    private C8252c() {
    }

    static {
        Covode.recordClassIndex(9087);
        ConcurrentHashMap<Class<?>, AbstractC8251b<?>> concurrentHashMap = new ConcurrentHashMap<>();
        f20484b = concurrentHashMap;
        concurrentHashMap.put(Integer.TYPE, C82531.f20485a);
        concurrentHashMap.put(String.class, C82542.f20486a);
        concurrentHashMap.put(Boolean.TYPE, C82553.f20487a);
        concurrentHashMap.put(HColor.class, C82564.f20488a);
        concurrentHashMap.put(JSONArray.class, C82575.f20489a);
    }

    /* renamed from: a */
    public static Object m16397a(Uri uri, String str, String str2, Class<?> cls) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(cls, "");
        AbstractC8251b<?> bVar = f20484b.get(cls);
        if (bVar != null) {
            Object a = bVar.mo14600a(uri, str, str2);
            C89219l.m154716b(a, "");
            return a;
        }
        throw new IllegalStateException("unsupported type parse");
    }
}
