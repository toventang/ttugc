package com.bytedance.ies.powerpage.p1237c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.powerpage.c.a */
public final class C17739a {

    /* renamed from: a */
    public static final C17739a f42406a = new C17739a();

    private C17739a() {
    }

    static {
        Covode.recordClassIndex(20301);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static <T> T m32874a(String str, Class<T> cls) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(cls, "");
        return C89219l.m154714a(cls, Integer.class) ? (T) Integer.valueOf(Integer.parseInt(str)) : C89219l.m154714a(cls, Boolean.class) ? (T) Boolean.valueOf(Boolean.parseBoolean(str)) : C89219l.m154714a(cls, Short.class) ? (T) Short.valueOf(Short.parseShort(str)) : C89219l.m154714a(cls, Long.class) ? (T) Long.valueOf(Long.parseLong(str)) : C89219l.m154714a(cls, Float.class) ? (T) Float.valueOf(Float.parseFloat(str)) : C89219l.m154714a(cls, Double.class) ? (T) Double.valueOf(Double.parseDouble(str)) : C89219l.m154714a(cls, Byte.class) ? (T) Byte.valueOf(Byte.parseByte(str)) : C89219l.m154714a(cls, Character.class) ? (T) Character.valueOf(C89361p.m154825i((CharSequence) str)) : str;
    }
}
