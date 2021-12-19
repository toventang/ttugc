package com.p2082ss.android.ugc.tools.utils;

import com.bytedance.covode.number.Covode;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.utils.e */
final class C84893e<V> extends FutureTask<V> implements Comparable<Object> {

    /* renamed from: a */
    private final Comparable<?> f189729a;

    static {
        Covode.recordClassIndex(98887);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C89219l.m154721d(obj, "");
        if (obj instanceof C84893e) {
            obj = ((C84893e) obj).f189729a;
        }
        Comparable<?> comparable = this.f189729a;
        if (comparable == null || obj == null) {
            return 0;
        }
        Objects.requireNonNull(comparable, "null cannot be cast to non-null type kotlin.Comparable<kotlin.Any>");
        return comparable.compareTo(obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84893e(Callable<V> callable, Comparable<?> comparable) {
        super(callable);
        C89219l.m154721d(callable, "");
        this.f189729a = comparable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84893e(Runnable runnable, V v, Comparable<?> comparable) {
        super(runnable, v);
        C89219l.m154721d(runnable, "");
        this.f189729a = comparable;
    }
}
