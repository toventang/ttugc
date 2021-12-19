package com.p2082ss.android.ugc.aweme.common.p2633e;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.e.h */
public class C39107h<T> {

    /* renamed from: a */
    public final List<T> f92300a;

    /* renamed from: b */
    public final int f92301b;

    /* renamed from: c */
    public final int f92302c;

    /* renamed from: d */
    public final boolean f92303d;

    static {
        Covode.recordClassIndex(46723);
    }

    /* renamed from: a */
    public static <T> C39107h<T> m79398a(T t, int i) {
        return new C39107h<>(Collections.singletonList(t), i, true, 1);
    }

    /* renamed from: a */
    public static <T> C39107h<T> m79399a(List<T> list, int i, int i2) {
        return new C39107h<>(list, i, true, i2);
    }

    protected C39107h(List<T> list, int i, boolean z, int i2) {
        this.f92300a = list;
        this.f92301b = i;
        this.f92303d = z;
        this.f92302c = i2;
    }
}
