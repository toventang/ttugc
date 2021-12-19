package com.bytedance.helios.api.p1090c;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.C15320o;
import java.lang.Thread;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.c.a */
public final class C15325a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public static final C15325a f37401a = new C15325a();

    private C15325a() {
    }

    static {
        Covode.recordClassIndex(17555);
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C89219l.m154719c(thread, "");
        C89219l.m154719c(th, "");
        C15320o.m28230a(new C15326b(thread, th, "DefaultUncaughtExceptionHandler", null, 8));
    }
}
