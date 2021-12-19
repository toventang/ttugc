package com.p2082ss.android.ugc.aweme.tools.beauty.impl.view;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.g */
public final class C78012g {

    /* renamed from: a */
    private HashMap<Class<?>, Object> f175006a = new HashMap<>();

    static {
        Covode.recordClassIndex(91102);
    }

    /* renamed from: a */
    public final <T> T mo121716a(Class<T> cls) {
        C89219l.m154721d(cls, "");
        T t = (T) this.f175006a.get(cls);
        if (t != null) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo121717a(Class<?> cls, Object obj) {
        C89219l.m154721d(cls, "");
        C89219l.m154721d(obj, "");
        this.f175006a.put(cls, obj);
    }
}
