package com.google.android.datatransport;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.datatransport.c */
public abstract class AbstractC25069c<T> {
    static {
        Covode.recordClassIndex(30433);
    }

    /* renamed from: a */
    public abstract Integer mo40983a();

    /* renamed from: b */
    public abstract T mo40984b();

    /* renamed from: c */
    public abstract EnumC25111d mo40985c();

    /* renamed from: a */
    public static <T> AbstractC25069c<T> m48046a(T t) {
        return new C25067a(t, EnumC25111d.VERY_LOW);
    }
}
