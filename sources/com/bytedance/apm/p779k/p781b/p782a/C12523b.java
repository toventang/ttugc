package com.bytedance.apm.p779k.p781b.p782a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.apm.k.b.a.b */
public final class C12523b extends WeakReference<Object> {

    /* renamed from: a */
    public final String f30435a;

    /* renamed from: b */
    public final String f30436b;

    static {
        Covode.recordClassIndex(14339);
    }

    /* renamed from: a */
    private static <T> T m22516a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str + " must not be null");
    }

    public C12523b(Object obj, String str, String str2, ReferenceQueue<Object> referenceQueue) {
        super(m22516a(obj, "referent"), (ReferenceQueue) m22516a(referenceQueue, "referenceQueue"));
        this.f30435a = (String) m22516a(str, "key");
        this.f30436b = (String) m22516a(str2, StringSet.name);
    }
}
